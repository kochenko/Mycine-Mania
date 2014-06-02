
package MyCineMania;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class Banco {
    
       private static final String jdbcDriver = "org.hsqldb.jdbc.JDBCDriver";
       private static final String jdbcUrl =  "jdbc:hsqldb:file:mycinemania";
       private static final String jdbcUser = "SA";
       private static final String jdbcPasswd =  "";
       private Connection con;
       private boolean funcionando;
       
       public boolean conectaBanco(){
                boolean sucesso = false;
                try {
			Class.forName(this.jdbcDriver);
	                this.con = DriverManager.getConnection(this.jdbcUrl, this.jdbcUser, this.jdbcPasswd);
                        sucesso = true;
                        this.funcionando=true;
                    } 
                catch (ClassNotFoundException excecao1) {
                    sucesso = false;
		} 
                catch (SQLException e) {
                    sucesso = false;
		}
                finally {                      
                    return sucesso;
                    }
	}

    public boolean isFuncionando() {
        return funcionando;
    }
       
       public Connection pegaConexao(){
           return this.con;
       }
       
       public boolean fechaBanco(){
           boolean sucesso = false;
           try{
                this.con.close();
                this.funcionando=false;
                sucesso = true;
           }catch(SQLException excecao) {
               sucesso = false;
           }finally{
               return sucesso;
           }
           
       }
     
    public Banco() {
        this.con = null;
        this.funcionando=false;
    }
    
}

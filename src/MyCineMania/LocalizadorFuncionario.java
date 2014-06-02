package MyCineMania;


import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Enumeration;

public class LocalizadorFuncionario {
   
    
    private Connection con;
    
    
    public void setConnection(Connection con1) {
         this.con = con1;
    }
    
   
    public boolean insereFuncionario(Funcionario funcionario){
        boolean sucesso = false;
        try{
            int codigo = funcionario.getCod();
            String nome = funcionario.getNome();
            String email = funcionario.getEmail();
            String senha = funcionario.getSenha();
            String cpf = funcionario.getCpf();           
            

                Statement stmt = con.createStatement();
                
                stmt.executeUpdate(" insert into FUNCIONARIO (CODIGO, NOME, EMAIL, SENHA, CPF) values (' " +codigo+ " ',' " +nome+ " ',' " +email+ " ',' " +senha+ " ',' " +cpf +" ' ) " );
                sucesso = true;
                stmt.close();
            }
            catch( SQLException e){
                sucesso = false;
            }finally{
                return sucesso;
            }

        }
    
    public boolean apagaFuncionario(int cod){
        boolean sucesso = false;
        try{ 
            Statement stmt= con.createStatement();
            int aux = stmt.executeUpdate("delete from FUNCIONARIO where CODIGO=' " +cod+ " ' ");
            stmt.close();
            if(aux == 1)
                sucesso = true;
        }
        catch(SQLException e){ 
            sucesso = false;
        }finally{
            return sucesso;            
        }
    }
    
    public boolean alteraFuncionario(Funcionario funcionario){
        boolean aux = false;
        try{
            int codigo = funcionario.getCod();
            String nome = funcionario.getNome();
            String email = funcionario.getEmail();
            String senha = funcionario.getSenha();
            String cpf = funcionario.getCpf();           
            
            
            Statement stmt= this.con.createStatement();
            
            int aux1 = stmt.executeUpdate("update FUNCIONARIO set NOME=' " +nome+ " ', EMAIL='"+email+ " ', SENHA='"+senha+ " ', CPF='"+cpf+ " 'where CODIGO=' " + codigo + " ' ");
            if (aux1 != 0){
                aux = true;
            }else{
                aux = false;
            }    
            stmt.close();
            } 
            catch(SQLException e){
                aux = false;
            }finally{
                return aux;
            }
        }
    
    public Funcionario buscaFuncionario(int cod){
  		try {   Funcionario func = null;                       
			Statement stmt= this.con.createStatement();
			//String aa = "select * from PUBLIC.FUNCIONARIOS where  NOME='Daniel'";
                        ResultSet rs = stmt.executeQuery("select * from PUBLIC.FUNCIONARIO where CODIGO='"+Integer.toString(cod)+"'");
                        //ResultSet rs = stmt.executeQuery(aa);
			while (rs.next()) {
                                func = new Funcionario();
                                func.setCod(cod);
                                func.setNome(rs.getString(2));
                                func.setEmail(rs.getString(3));
                                func.setSenha(rs.getString(4));
                                func.setCpf(rs.getString(5));                                
			}
			rs.close();
		        stmt.close();
                        return func;

		}                 
		catch (SQLException e) {
			return null;
		} 
    }
    
    
        public ArrayList<Funcionario> buscaListaFuncionarios(){
  		try {                       
                    
                    ArrayList<Funcionario> funcionarios = new  ArrayList<Funcionario>();                       
			Statement stmt= this.con.createStatement();
			//String aa = "select * from PUBLIC.FUNCIONARIOS where  NOME='Daniel'";
                        ResultSet rs = stmt.executeQuery("select * from PUBLIC.FUNCIONARIO ");
                        //ResultSet rs = stmt.executeQuery(aa);
			while (rs.next()) {
                                Funcionario func = new Funcionario();
                                func.setCod(rs.getInt(1));
                                func.setNome(rs.getString(2));
                                func.setEmail(rs.getString(3));
                                func.setSenha(rs.getString(4));
                                func.setCpf(rs.getString(5));   
                                funcionarios.add(func);
			}
			rs.close();
		        stmt.close();
                        return funcionarios;

		}                 
		catch (SQLException e) {
			return null;
		} 
    }
    
     
     public int codLivre(){
                try{
                Statement stmt= this.con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from PUBLIC.FUNCIONARIO");
                int max = 1;
                int cont = 0;
                while (rs.next()) {
                        cont = rs.getInt(1);
                        if(cont > max)
                            max = cont;
               }
                        rs.close();
		        stmt.close();
                        return max+1;
                        
                }                     
		catch (SQLException e) {
			return 0;
		}
        
    }
        
        
 }
    
    
    
    


    


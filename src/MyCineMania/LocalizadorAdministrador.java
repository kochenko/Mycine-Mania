/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyCineMania;

/**
 *
 * @author Daniel
 */

import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;

public class LocalizadorAdministrador {
    private Connection con;
    
    
    public void setConnection(Connection con1) {
         this.con = con1;
    }
    
   
    public boolean insereAdministrador(Administrador administrador){
        boolean sucesso = false;
        try{
            int codigo = administrador.getCod();
            String nome = administrador.getNome();
            String email = administrador.getEmail();
            String senha = administrador.getSenha();
            String cpf = administrador.getCpf();      
            double valor_adesao= administrador.getValor_adesao();


            Statement stmt = con.createStatement();

            stmt.executeUpdate(" insert into ADMINISTRADOR (CODIGO, NOME, EMAIL, SENHA, CPF, VALOR_ADESAO) values (' " +codigo+ " ',' " +nome+ " ',' " +email+ " ',' " +senha+ " ',' " +cpf +" ',' "+ valor_adesao+" ' ) " );
            sucesso = true;
            stmt.close();
            }
            catch( SQLException e){
                sucesso = false;
            }finally{
                return sucesso;
            }

        }
    
    public boolean apagaAdministrador(int cod){
        boolean sucesso = false;
        try{ 
            Statement stmt= con.createStatement();
            int aux = stmt.executeUpdate("delete from ADMINISTRADOR where CODIGO=' " +cod+ " ' ");
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
    
    public boolean alteraAdministrador(Administrador administrador){
        boolean aux = false;
        try{
            int codigo = administrador.getCod();
            String nome = administrador.getNome();
            String email = administrador.getEmail();
            String senha = administrador.getSenha();
            String cpf = administrador.getCpf(); 
            double valor_adesao= administrador.getValor_adesao();               
            
            Statement stmt= this.con.createStatement();
            
            int aux1 = stmt.executeUpdate("update ADMINISTRADOR set NOME=' " +nome+ " ', EMAIL='"+email+ " ', SENHA='"+senha+ " ', CPF='"+cpf+ " ', VALOR_ADESAO='"+valor_adesao+ " 'where CODIGO=' " + codigo + " ' ");
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
    
    public Administrador buscaAdministrador(int cod){
  		try {   Administrador adm = null;                       
			Statement stmt= this.con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from PUBLIC.ADMINISTRADOR where CODIGO='"+Integer.toString(cod)+"'");
                        while (rs.next()) {
                                adm = new Administrador();
                                adm.setCod(cod);
                                adm.setNome(rs.getString(2));
                                adm.setEmail(rs.getString(3));
                                adm.setSenha(rs.getString(4));
                                adm.setCpf(rs.getString(5));   
                                adm.setValor_adesao(rs.getDouble(6));
			}
			rs.close();
		        stmt.close();
                        return adm;

		}                 
		catch (SQLException e) {
			return null;
		} 
    }
    
        public ArrayList<Administrador> buscaListaAdministradores(){
        try {                       

            ArrayList<Administrador> administradores = new  ArrayList<Administrador>();                       
                Statement stmt= this.con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from PUBLIC.ADMINISTRADOR ");
                while (rs.next()) {
                        Administrador adm = new Administrador();
                        adm.setCod(rs.getInt(1));
                        adm.setNome(rs.getString(2));
                        adm.setEmail(rs.getString(3));
                        adm.setSenha(rs.getString(4));
                        adm.setCpf(rs.getString(5));
                        adm.setValor_adesao(rs.getDouble(6));
                        administradores.add(adm);
                }
                rs.close();
                stmt.close();
                return administradores;

        }                 
        catch (SQLException e) {
                return null;
        } 
    }
     
     public int codLivre(){
                try{
                Statement stmt= this.con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from PUBLIC.ADMINISTRADOR");
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

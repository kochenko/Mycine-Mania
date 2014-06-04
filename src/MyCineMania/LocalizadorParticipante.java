/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyCineMania;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class LocalizadorParticipante {
    private Connection con;
    
    
    public void setConnection(Connection con1) {
         this.con = con1;
    }
    
   
    public boolean insereParticipante(Participante participante){
        boolean sucesso = false;
        try{
            int codigo = participante.getCod();
            String nome = participante.getNome();
            String email = participante.getEmail();
            String senha = participante.getSenha();
            String cpf = participante.getCpf();           
            String validado = "FALSE";
            if(participante.isValidado()){
                validado = "TRUE";
            } 
            
            Statement stmt = con.createStatement();
            
            stmt.executeUpdate(" insert into PARTICIPANTE (CODIGO, NOME, EMAIL, SENHA, CPF, VALIDADO) values ('" +codigo+ "','" +nome+ "','" +email+ "','" +senha+ "','" +cpf +"','"+ validado+"')" );
            sucesso = true;
            stmt.close();
            }
            catch( SQLException e){
                sucesso = false;
            }finally{
                return sucesso;
            }

        }
    
    public boolean apagaParticipante(int cod){
        boolean sucesso = false;
        try{ 
            Statement stmt= con.createStatement();
            int aux = stmt.executeUpdate("delete from PARTICIPANTE where CODIGO='" +cod+ "'");
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
    
    public boolean alteraParticipante(Participante participante){
        boolean aux = false;
        try{
            int codigo = participante.getCod();
            String email = participante.getEmail();
            String senha = participante.getSenha();
            String validado = "FALSE";
            if(participante.isValidado()){
                validado = "TRUE";
            }                 
            
            Statement stmt= this.con.createStatement();
            
            int aux1 = stmt.executeUpdate("update PARTICIPANTE set EMAIL='"+email+ "', SENHA='"+senha+ "', VALIDADO='"+validado+ "'where CODIGO='" + codigo + "'");
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
    
    public Participante buscaParticipante(int cod){
  		try {   Participante part = null;                       
			Statement stmt= this.con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from PUBLIC.PARTICIPANTE where CODIGO='"+Integer.toString(cod)+"'");
                        while (rs.next()) {
                                part = new Participante();
                                part.setCod(cod);
                                part.setNome(rs.getString(2));
                                part.setEmail(rs.getString(3));
                                part.setSenha(rs.getString(4));
                                part.setCpf(rs.getString(5));   
                                part.setValidado(rs.getBoolean(6));
			}
			rs.close();
		        stmt.close();
                        return part;

		}                 
		catch (SQLException e) {
			return null;
		} 
    }
    
    public ArrayList<Participante> buscaListaParticipantes(){
        try {                       

            ArrayList<Participante> participantes = new  ArrayList<Participante>();                       
                Statement stmt= this.con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from PUBLIC.PARTICIPANTE ");
                while (rs.next()) {
                        Participante part = new Participante();
                        part.setCod(rs.getInt(1));
                        part.setNome(rs.getString(2));
                        part.setEmail(rs.getString(3));
                        part.setSenha(rs.getString(4));
                        part.setCpf(rs.getString(5));
                        part.setValidado(rs.getBoolean(6));
                        participantes.add(part);
                }
                rs.close();
                stmt.close();
                return participantes;

        }                 
        catch (SQLException e) {
                return null;
        } 
    }
    
     
     public int codLivre(){
                try{
                Statement stmt= this.con.createStatement();
                ResultSet rs = stmt.executeQuery(" select * from PUBLIC.PARTICIPANTE ");
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
     
          public boolean CPFjaCadastrado(String cpf){
                try{
                Statement stmt= this.con.createStatement();
                ResultSet rs = stmt.executeQuery(" select * from PUBLIC.PARTICIPANTE ");
                String cpf_cadastrado;
                int cont = 0;
                while (rs.next()) {
                        cpf_cadastrado = rs.getString(5);                        
                        if(cpf_cadastrado.equals(cpf))
                           return true;
               }
                        rs.close();
		        stmt.close();
                        return false;
                        
                }                     
		catch (SQLException e) {
			return true;
		}
        
    }
     
     
}

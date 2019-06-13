/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import model.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class LoginDAO {

    public LoginDAO() {
    }
    
    Connection con;
    
    PreparedStatement pst;
    
    Statement st;
    
    ResultSet rs;
    String banco = "HEALTHBOOK";
    
    
    
    String url = "jdbc:mysql://127.0.0.1:3306/" +banco+ "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    String usuario = "root";
    String senha = "root";
    
    
    
    boolean sucesso = false;
    public void conectarnoBanco() {
        try {           
            con = DriverManager.getConnection(url, usuario, senha);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro de conexão: " + ex.getMessage());
            
        }
    }
    
    public boolean inserirLogin(Login login) {
        
        conectarnoBanco();

        String sql = "INSERT INTO LOGIN (senha,login) values (?,?)";
        try {        
            pst = con.prepareStatement(sql);
            pst.setInt(1, login.getSenha());
            pst.setString(2, login.getLogin()); 
            pst.execute();

            sucesso = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir login: "+ ex.getMessage());
            sucesso = false;
        } finally {
            try {

                if (con != null && pst != null) {
                    con.close();
                    pst.close();
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao fechar o BD" +ex.getMessage());
            }

        }

        return sucesso;
    }
    public ArrayList<Login> buscarLogin() {

        ArrayList<Login> listaLogins = new ArrayList<>();

        conectarnoBanco();

        String sql = "SELECT * FROM LOGIN";

        try (PreparedStatement stmt = con.
                prepareStatement("SELECT * FROM LOGIN");
                ResultSet rs = stmt.executeQuery()){
            while (rs.next()) {

                Login login = new Login();
                login.setSenha(rs.getInt("senha"));
                login.setLogin(rs.getString("login"));
                listaLogins.add(login);
                sucesso = true;
            }

       return listaLogins;
        }catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    
}

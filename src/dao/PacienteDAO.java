/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Paciente;

public class PacienteDAO {
    Connection con;
    
    PreparedStatement pst;
    
    Statement st;
    
    ResultSet rs;
    
    String banco = "Healthbook";
    
    String url = "jdbc:mysql://localhost:3306/" + banco + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
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

        public boolean inserirPaciente(Paciente novoPaciente) {

        conectarnoBanco();

        String sql = "INSERT INTO PACIENTE (nome,telefone,dataNascimento,cpf,endereco) values (?,?,?,?,?)";
        

        try {
            pst = con.prepareStatement(sql);

            pst.setString(1, novoPaciente.getNome());
            pst.setInt(2, novoPaciente.getTelefone());
            pst.setString(3, novoPaciente.getNascimento());
            pst.setInt(4, novoPaciente.getCpf());
            pst.setString(5,novoPaciente.getEndereco());
            
            
            
            pst.execute();

            sucesso = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir paciente: "+ ex.getMessage());
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
        
        
      

    public ArrayList<Paciente> buscarPaciente() {
        
        ArrayList<Paciente> listaPacientes = new ArrayList<>();

        conectarnoBanco();

        String sql = "SELECT * FROM PACIENTE";

        try (PreparedStatement stmt = con.
                prepareStatement("select * from PACIENTE");
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setNome(rs.getString("nome"));
                paciente.setTelefone(rs.getInt("telefone"));
                paciente.setNascimento(rs.getString("dataNascimento"));
                paciente.setCpf(rs.getInt("cpf"));
                paciente.setEndereco(rs.getString("endereco"));   
                
                listaPacientes.add(paciente);
            }
            return listaPacientes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }

        }

        
  

    public boolean editarPacientePeloCpf(Paciente paciente, int cpf) {

        conectarnoBanco();

        String sql = "UPDATE PACIENTE SET nome = ?,telefone=?,dataNascimento=?,cpf=?,endereco=? WHERE cpf = ?";

        try {
            pst = con.prepareStatement(sql);

            pst.setString(1, paciente.getNome());
            pst.setInt(2, paciente.getTelefone());
            pst.setString(3, paciente.getNascimento());
            pst.setInt(4, paciente.getCpf());
            pst.setString(5, paciente.getEndereco());
            pst.setInt(6, cpf);
            pst.execute();

            sucesso = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao editar o Paciente" +ex.getMessage());
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

    public boolean deleteUsuarioPeloCpf(Paciente paciente) {

        conectarnoBanco();

        String sql = "DELETE FROM PACIENTE WHERE cpf = ?";

        try (PreparedStatement stmt = con.
                prepareStatement("DELETE FROM PACIENTE WHERE cpf=?")){
            stmt.setInt(1, paciente.getCpf());
            stmt.execute();
            sucesso = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar paciente" +ex.getMessage());
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
    
}

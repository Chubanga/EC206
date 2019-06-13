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
import model.Medico;

/**
 *
 * @author Usuario
 */
public class MedicoDAO {
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

        public boolean inserirMedico(Medico novoMedico) 
        {

        conectarnoBanco();

        String sql = "INSERT INTO MEDICO (nome,crm,especializacao,telefone) values (?,?,?,?)";
        

        try {
            pst = con.prepareStatement(sql);

            pst.setString(1, novoMedico.getNome());
            pst.setInt(2, novoMedico.getCrm());
            pst.setString(3, novoMedico.getEspecializacao());
            pst.setInt(4,novoMedico.getTelefone());
     
            pst.execute();

            sucesso = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir medico: "+ ex.getMessage());
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
      

    public ArrayList<Medico> buscarMedico() {
        ArrayList<Medico> listaMedicos = new ArrayList<>();
        
        conectarnoBanco();
        
        String sql = "SELECT * FROM MEDICO";
        
        try (PreparedStatement stmt = con.
                prepareStatement("SELECT * FROM MEDICO");
                ResultSet rs = stmt.executeQuery()){

            while (rs.next()) {

                Medico medico = new Medico();
                medico.setNome(rs.getString("nome"));
                medico.setCrm(rs.getInt("crm"));
                medico.setEspecializacao(rs.getString("especializacao"));
                medico.setTelefone(rs.getInt("telefone"));
                
                

                listaMedicos.add(medico);
                
            }
            return listaMedicos;

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


    public boolean editarMedicoPeloCrm(int crm,Medico medico) {

        conectarnoBanco();

        String sql = "UPDATE MEDICO SET nome = ?,crm=?,especializacao=?,telefone=? WHERE crm = ?";

        try {
            pst = con.prepareStatement(sql);

            pst.setString(1, medico.getNome());
            pst.setInt(2, medico.getCrm());
            pst.setString(3, medico.getEspecializacao());
            pst.setInt(4, medico.getTelefone());
            pst.setInt(5, crm);
            pst.execute();

            sucesso = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao editar o Medico" +ex.getMessage());
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

    public boolean deleteMedicoPeloCrm(int crm) {

        conectarnoBanco();

        String sql = "DELETE FROM MEDICO WHERE crm = ?";

        try {
            pst = con.prepareStatement(sql);

            pst.setInt(1, crm);
            pst.execute();

            sucesso = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar medico" +ex.getMessage());
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

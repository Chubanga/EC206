/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import model.Consulta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ConsultaDAO {
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

        public boolean inserirConsulta(Consulta novaConsulta) {

        conectarnoBanco();

        String sql = "INSERT INTO CONSULTA (dataConsulta,horario,crm,convenio,cpf) values (?,?,?,?,?)";
        

        try {
            pst = con.prepareStatement(sql);

            pst.setString(1, novaConsulta.getDataConsulta());
            pst.setInt(2, novaConsulta.getHorario());
            pst.setInt(3, novaConsulta.getCrm());
            pst.setString(4, novaConsulta.getConvenio());
            pst.setInt(5, novaConsulta.getCpf());
            
            
            
            pst.execute();

            sucesso = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir consulta: "+ ex.getMessage());
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
      

    public ArrayList<Consulta> buscarConsulta() {  
        ArrayList<Consulta> listaConsultas = new ArrayList<>();

        conectarnoBanco();
       

        String sql = "SELECT * FROM CONSULTA";

        try (PreparedStatement stmt = con.
                prepareStatement("SELECT * FROM CONSULTA");
                ResultSet rs = stmt.executeQuery()){

            while (rs.next()) {
                Consulta consulta = new Consulta();
                consulta.setDataConsulta(rs.getString("dataConsulta"));
                consulta.setHorario(rs.getInt("horario"));   
                consulta.setCrm(rs.getInt("crm"));
                consulta.setConvenio(rs.getString("convenio"));
                consulta.setCpf(rs.getInt("cpf"));
                
                listaConsultas.add(consulta);

               
            }
        return listaConsultas;
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

    public boolean editarConsultaPeloCpf(int cpf, Consulta consulta) {

        conectarnoBanco();

        String sql = "UPDATE CONSULTA SET dataConsulta=?, horario=?,medico=?,convenio=?,cpf=? WHERE cpf = ?";

        try {
            pst = con.prepareStatement(sql);
            
            pst.setString(1, consulta.getDataConsulta());
            pst.setInt(2, consulta.getHorario());
            pst.setInt(3, consulta.getCrm());
            pst.setString(4, consulta.getConvenio());
            pst.setInt(5, consulta.getCpf());
            pst.setInt(6, cpf);

            pst.execute();

            sucesso = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao editar a consulta" +ex.getMessage());
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

    public boolean deleteConsultaPeloCpf(int cpf) {

        conectarnoBanco();

        String sql = "DELETE FROM CONSULTA WHERE cpf = ?";

        try {
            pst = con.prepareStatement(sql);

            pst.setInt(1, cpf);
            pst.execute();

            sucesso = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar consulta" +ex.getMessage());
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

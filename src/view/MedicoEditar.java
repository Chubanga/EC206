/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ManipuladorMedicos;
import exception.ErroCadastroException;
import exception.ValorInvalidoException;
import model.Medico;
import javax.swing.JOptionPane;

public class MedicoEditar extends javax.swing.JFrame {
    
    MedicoBuscarEditar telaMedicoEditarBuscar;
    
    private final Medico medicoEdit;
    
   public MedicoEditar(MedicoBuscarEditar telaMedicoBuscarEditar, Medico medicoEdit) {
        initComponents();
        
        this.telaMedicoEditarBuscar = telaMedicoBuscarEditar;
        this.medicoEdit = medicoEdit;
        
        
    }
    
  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textMedicoEditarCRM = new javax.swing.JTextField();
        textMedicoEditarNome = new javax.swing.JTextField();
        textMedicoEditarEspecializacao = new javax.swing.JTextField();
        textMedicoEditarTelefone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btMedicoEditarVoltar = new javax.swing.JButton();
        btMedicoEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textMedicoEditarCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMedicoEditarCRMActionPerformed(evt);
            }
        });

        jLabel1.setText("MÉDICO");

        btMedicoEditarVoltar.setText("VOLTAR");
        btMedicoEditarVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedicoEditarVoltarActionPerformed(evt);
            }
        });

        btMedicoEditar.setText("EDITAR");
        btMedicoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedicoEditarActionPerformed(evt);
            }
        });

        jLabel2.setText("NOME");

        jLabel3.setText("CRM");

        jLabel4.setText("ESPECIALIZAÇÃO");

        jLabel5.setText("TELEFONE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btMedicoEditarVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btMedicoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textMedicoEditarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMedicoEditarEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMedicoEditarCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMedicoEditarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMedicoEditarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMedicoEditarCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMedicoEditarEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMedicoEditarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMedicoEditar)
                    .addComponent(btMedicoEditarVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textMedicoEditarCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMedicoEditarCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMedicoEditarCRMActionPerformed

    private void btMedicoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedicoEditarActionPerformed
        if (passouNaPreValidacao()) {
            try {
                editaMedico();
                JOptionPane.showMessageDialog(rootPane, "Alterações salvas "
                        + "com sucesso!", "Edição",
                        JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                dispose();
            } catch (ValorInvalidoException | ErroCadastroException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        
        this.setVisible(false); 
    }//GEN-LAST:event_btMedicoEditarActionPerformed

    private void btMedicoEditarVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedicoEditarVoltarActionPerformed
        this.setVisible(false); 
        limpaCampos();
        telaMedicoEditarBuscar.setLocationRelativeTo(null);
        telaMedicoEditarBuscar.setVisible(true);
    }//GEN-LAST:event_btMedicoEditarVoltarActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicoEditar(new MedicoBuscarEditar(), new Medico()).setVisible(true);
            }
        });
    }
    private boolean passouNaPreValidacao() {
        String nome = textMedicoEditarNome.getText();
        String crm = textMedicoEditarCRM.getText();
        String especializacao = textMedicoEditarEspecializacao.getText();
        String telefone = textMedicoEditarTelefone.getText();
        

        if (nome.isEmpty() || crm.isEmpty() || telefone.isEmpty()|| especializacao.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nem todos os campos foram "
                    + "preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
        private void editaMedico() throws ValorInvalidoException, ErroCadastroException {
        String nome = textMedicoEditarNome.getText();
        String crm = textMedicoEditarCRM.getText();
        String especializacao =textMedicoEditarEspecializacao.getText();
        String telefone = textMedicoEditarTelefone.getText();  
           
        Medico medicoE = new Medico();
       
        medicoE.setNome(nome);
        medicoE.setCrm(Integer.parseInt(crm));
        medicoE.setEspecializacao(especializacao);
        medicoE.setTelefone(Integer.parseInt(telefone));
        new ManipuladorMedicos().edita(medicoEdit.getCrm(), medicoE);
    }
    private void limpaCampos() {
        textMedicoEditarNome.setText("");
        textMedicoEditarCRM.setText("");
        textMedicoEditarEspecializacao.setText("");
        textMedicoEditarTelefone.setText("");
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMedicoEditar;
    private javax.swing.JButton btMedicoEditarVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textMedicoEditarCRM;
    private javax.swing.JTextField textMedicoEditarEspecializacao;
    private javax.swing.JTextField textMedicoEditarNome;
    private javax.swing.JTextField textMedicoEditarTelefone;
    // End of variables declaration//GEN-END:variables
}

package view;

import control.ManipuladorConsultas;
import control.ManipuladorMedicos;
import control.ManipuladorPacientes;
import javax.swing.JOptionPane;
import model.Consulta;
import model.Paciente;
import exception.ErroCadastroException;
import model.Medico;

public class ConsultaRemover extends javax.swing.JFrame {
    private Consulta consultaEncontrada;
    private Paciente pacienteEncontrado;
    private Medico medicoEncontrado;
    public ConsultaRemover() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btConsultaRemoverOK = new javax.swing.JButton();
        btConsultaRemoverLimpar = new javax.swing.JButton();
        textConsultaRemoverCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textConsultaRemover = new javax.swing.JTextArea();
        btConsultaRemoverVoltar = new javax.swing.JButton();
        btConsultaRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btConsultaRemoverOK.setText("BUSCAR");
        btConsultaRemoverOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaRemoverOKActionPerformed(evt);
            }
        });

        btConsultaRemoverLimpar.setText("LIMPAR");
        btConsultaRemoverLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaRemoverLimparActionPerformed(evt);
            }
        });

        textConsultaRemoverCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConsultaRemoverCPFActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textConsultaRemoverCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(btConsultaRemoverOK, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btConsultaRemoverLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textConsultaRemoverCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultaRemoverOK)
                    .addComponent(btConsultaRemoverLimpar))
                .addContainerGap())
        );

        jLabel1.setText("REMOVER CONSULTA");

        jLabel2.setText("INFORMAÇÕES DA CONSULTA");

        textConsultaRemover.setColumns(20);
        textConsultaRemover.setRows(5);
        jScrollPane1.setViewportView(textConsultaRemover);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btConsultaRemoverVoltar.setText("VOLTAR");
        btConsultaRemoverVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaRemoverVoltarActionPerformed(evt);
            }
        });

        btConsultaRemover.setText("REMOVER");
        btConsultaRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(btConsultaRemoverVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btConsultaRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultaRemoverVoltar)
                    .addComponent(btConsultaRemover))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textConsultaRemoverCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConsultaRemoverCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConsultaRemoverCPFActionPerformed

    private void btConsultaRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaRemoverActionPerformed
        try {
            if (consultaEncontrada != null) {
                new ManipuladorConsultas().remove(consultaEncontrada.getCpf(), consultaEncontrada); 
            } else {
                throw new RuntimeException();
            }
            verificaRemoverNovamente();
        } catch (ErroCadastroException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btConsultaRemoverActionPerformed

    private void btConsultaRemoverVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaRemoverVoltarActionPerformed
        textConsultaRemoverCPF.setText(""); 
        textConsultaRemover.setText("");
        this.setVisible(false); 
                
                
    }//GEN-LAST:event_btConsultaRemoverVoltarActionPerformed

    private void btConsultaRemoverLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaRemoverLimparActionPerformed
        textConsultaRemoverCPF.setText("");
        textConsultaRemover.setText("");
    }//GEN-LAST:event_btConsultaRemoverLimparActionPerformed

    private void btConsultaRemoverOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaRemoverOKActionPerformed
        Consulta consulta;
        Paciente paciente;
        Medico medico;
        
        String cpf = textConsultaRemoverCPF.getText();
        ManipuladorConsultas manipConsulta = new ManipuladorConsultas();
        ManipuladorPacientes manipPacientes = new ManipuladorPacientes();
        ManipuladorMedicos manipMedicos = new ManipuladorMedicos();
        
        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Digite um cpf.",
                    "Busca", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            consulta = manipConsulta.buscaPorCpf(Integer.parseInt(cpf));
            paciente = manipPacientes.buscaPorCpf(Integer.parseInt(cpf));

            if (consulta != null ) {
                consultaEncontrada = consulta;
                pacienteEncontrado = paciente;
                medico = manipMedicos.buscaPorCrm(consulta.getCrm());
                medicoEncontrado = medico;
                mostraDados();          
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não encontrado!",
                        "Busca", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btConsultaRemoverOKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaRemover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaRemover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaRemover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaRemover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaRemover().setVisible(true);
            }
        });
    }
    private void limpaCampos() {
        textConsultaRemover.setText("");
        textConsultaRemoverCPF.setText("");
        
}
    private void mostraDados() {        
            textConsultaRemover.setText("DATA DA CONSULTA: "+ consultaEncontrada.getDataConsulta()+"\n" +
            "HORARIO: "  + consultaEncontrada.getHorario()+ "\n" +
            "PACIENTE: " + pacienteEncontrado.getNome() + "\n" +
            "CPF: "+ consultaEncontrada.getCpf()+ "\n" +
            "MEDICO: " + medicoEncontrado.getNome() + "\n" +        
            "CONVENIO: "+consultaEncontrada.getConvenio());   
    }
    private void verificaRemoverNovamente() {
        int respUsuario = JOptionPane.showConfirmDialog(rootPane,
                "Remoção realizada com sucesso! Deseja remover outro "
                + "médico?", "Sucesso!", JOptionPane.YES_NO_OPTION);
        switch (respUsuario) {
            case JOptionPane.YES_OPTION:
                btConsultaRemoverLimpar.doClick();
                break;
            case JOptionPane.NO_OPTION:
                btConsultaRemoverVoltar.doClick();
                break;
            default:
                btConsultaRemoverVoltar.doClick();
                break;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultaRemover;
    private javax.swing.JButton btConsultaRemoverLimpar;
    private javax.swing.JButton btConsultaRemoverOK;
    private javax.swing.JButton btConsultaRemoverVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textConsultaRemover;
    private javax.swing.JTextField textConsultaRemoverCPF;
    // End of variables declaration//GEN-END:variables
}

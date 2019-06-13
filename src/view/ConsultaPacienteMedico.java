package view;

import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class ConsultaPacienteMedico extends javax.swing.JFrame {
    
    ConsultaAdicionar telaConsultaAdicionar;
    ConsultaBuscar telaConsultaBuscar;
    ConsultaRemover telaConsultaRemover;
    ConsultaBuscarEditar telaConsultaBuscarEditar;
    
    MedicoAdicionar telaMedicoAdicionar;
    MedicoBuscar telaMedicoBuscar;
    MedicoRemover telaMedicoRemover;
    MedicoBuscarEditar telaMedicoBuscarEditar;
    
    PacienteAdicionar telaPacienteAdicionar;
    PacienteBuscar telaPacienteBuscar;
    PacienteRemover telaPacienteRemover;
    PacienteBuscarEditar telaPacienteBuscarEditar;
    
    
    /**
     * Creates new form ConsultaPacienteMedico
     */
    public ConsultaPacienteMedico() {
        initComponents();
        
        telaConsultaAdicionar = new ConsultaAdicionar();
        telaConsultaBuscar = new ConsultaBuscar();
        telaConsultaRemover = new ConsultaRemover();
        telaConsultaBuscarEditar = new ConsultaBuscarEditar();
        
        telaMedicoAdicionar = new MedicoAdicionar();
        telaMedicoBuscar = new MedicoBuscar();
        telaMedicoRemover = new MedicoRemover();
        telaMedicoBuscarEditar = new MedicoBuscarEditar();
        
        telaPacienteAdicionar = new PacienteAdicionar();
        telaPacienteBuscar = new PacienteBuscar();
        telaPacienteRemover = new PacienteRemover();
        telaPacienteBuscarEditar = new PacienteBuscarEditar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btAdicionarConsulta = new javax.swing.JButton();
        btRemoverConsulta = new javax.swing.JButton();
        btEditarConsulta = new javax.swing.JButton();
        btBuscarConsulta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btAdicionarPaciente = new javax.swing.JButton();
        btRemoverPaciente = new javax.swing.JButton();
        btEditarPaciente = new javax.swing.JButton();
        btBuscarPaciente = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btAdicionarMedico = new javax.swing.JButton();
        btBuscarMedico = new javax.swing.JButton();
        btRemoverMedico = new javax.swing.JButton();
        btEditarMedico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setToolTipText("");

        jLabel1.setText("CONSULTAS");

        btAdicionarConsulta.setText("ADICIONAR");
        btAdicionarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarConsultaActionPerformed(evt);
            }
        });

        btRemoverConsulta.setText("REMOVER");
        btRemoverConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverConsultaActionPerformed(evt);
            }
        });

        btEditarConsulta.setText("EDITAR");
        btEditarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarConsultaActionPerformed(evt);
            }
        });

        btBuscarConsulta.setText("BUSCAR");
        btBuscarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btAdicionarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(btEditarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btRemoverConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(btBuscarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(134, 134, 134))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionarConsulta)
                    .addComponent(btRemoverConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditarConsulta)
                    .addComponent(btBuscarConsulta))
                .addGap(23, 23, 23))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setName(""); // NOI18N

        jLabel2.setText("PACIENTES");

        btAdicionarPaciente.setText("ADICIONAR");
        btAdicionarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarPacienteActionPerformed(evt);
            }
        });

        btRemoverPaciente.setText("REMOVER");
        btRemoverPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverPacienteActionPerformed(evt);
            }
        });

        btEditarPaciente.setText("EDITAR");
        btEditarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarPacienteActionPerformed(evt);
            }
        });

        btBuscarPaciente.setText("BUSCAR");
        btBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btAdicionarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(btEditarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btRemoverPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionarPaciente)
                    .addComponent(btRemoverPaciente))
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditarPaciente)
                    .addComponent(btBuscarPaciente))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("  MÉDICOS");

        btAdicionarMedico.setText("ADICIONAR");
        btAdicionarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarMedicoActionPerformed(evt);
            }
        });

        btBuscarMedico.setText("BUSCAR");
        btBuscarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarMedicoActionPerformed(evt);
            }
        });

        btRemoverMedico.setText("REMOVER");
        btRemoverMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverMedicoActionPerformed(evt);
            }
        });

        btEditarMedico.setText("EDITAR");
        btEditarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAdicionarMedico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarMedico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemoverMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionarMedico)
                    .addComponent(btRemoverMedico))
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditarMedico)
                    .addComponent(btBuscarMedico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarConsultaActionPerformed
        telaConsultaAdicionar.setLocationRelativeTo(null);
        telaConsultaAdicionar.setVisible(true);
    }//GEN-LAST:event_btAdicionarConsultaActionPerformed

    private void btRemoverConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverConsultaActionPerformed
        telaConsultaRemover.setLocationRelativeTo(null);
        telaConsultaRemover.setVisible(true);
    }//GEN-LAST:event_btRemoverConsultaActionPerformed

    private void btAdicionarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarPacienteActionPerformed
        telaPacienteAdicionar.setLocationRelativeTo(null);
        telaPacienteAdicionar.setVisible(true);
    }//GEN-LAST:event_btAdicionarPacienteActionPerformed

    private void btRemoverPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverPacienteActionPerformed
        telaPacienteRemover.setLocationRelativeTo(null);
        telaPacienteRemover.setVisible(true);
    }//GEN-LAST:event_btRemoverPacienteActionPerformed

    private void btAdicionarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarMedicoActionPerformed
        telaMedicoAdicionar.setLocationRelativeTo(null);
        telaMedicoAdicionar.setVisible(true);
    }//GEN-LAST:event_btAdicionarMedicoActionPerformed

    private void btRemoverMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverMedicoActionPerformed
        telaMedicoRemover.setLocationRelativeTo(null);
        telaMedicoRemover.setVisible(true);
    }//GEN-LAST:event_btRemoverMedicoActionPerformed

    private void btEditarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarConsultaActionPerformed
        telaConsultaBuscarEditar.setLocationRelativeTo(null);
        telaConsultaBuscarEditar.setVisible(true);
    }//GEN-LAST:event_btEditarConsultaActionPerformed

    private void btBuscarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarConsultaActionPerformed
        telaConsultaBuscar.setLocationRelativeTo(null);
        telaConsultaBuscar.setVisible(true);
    }//GEN-LAST:event_btBuscarConsultaActionPerformed

    private void btBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarPacienteActionPerformed
        telaPacienteBuscar.setLocationRelativeTo(null);
        telaPacienteBuscar.setVisible(true);
    }//GEN-LAST:event_btBuscarPacienteActionPerformed

    private void btEditarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarPacienteActionPerformed
        telaPacienteBuscarEditar.setLocationRelativeTo(null);
        telaPacienteBuscarEditar.setVisible(true);
    }//GEN-LAST:event_btEditarPacienteActionPerformed

    private void btBuscarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarMedicoActionPerformed
        telaMedicoBuscar.setLocationRelativeTo(null);
        telaMedicoBuscar.setVisible(true);
    }//GEN-LAST:event_btBuscarMedicoActionPerformed

    private void btEditarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarMedicoActionPerformed
        telaMedicoBuscarEditar.setLocationRelativeTo(null);
        telaMedicoBuscarEditar.setVisible(true);
    }//GEN-LAST:event_btEditarMedicoActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaPacienteMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaPacienteMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaPacienteMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaPacienteMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaPacienteMedico().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarConsulta;
    private javax.swing.JButton btAdicionarMedico;
    private javax.swing.JButton btAdicionarPaciente;
    private javax.swing.JButton btBuscarConsulta;
    private javax.swing.JButton btBuscarMedico;
    private javax.swing.JButton btBuscarPaciente;
    private javax.swing.JButton btEditarConsulta;
    private javax.swing.JButton btEditarMedico;
    private javax.swing.JButton btEditarPaciente;
    private javax.swing.JButton btRemoverConsulta;
    private javax.swing.JButton btRemoverMedico;
    private javax.swing.JButton btRemoverPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}

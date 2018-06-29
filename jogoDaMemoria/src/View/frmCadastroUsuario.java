/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.JogadorDAO;
import Model.Jogador;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Heitor Augusto
 */
public class frmCadastroUsuario extends javax.swing.JFrame {
    public frmCadastroUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtUsuario1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPTxtSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPTxtSenhaConfirmacao = new javax.swing.JPasswordField();
        jTxtUsuario = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jFTxtDataNascimento = new javax.swing.JFormattedTextField();

        jTxtUsuario1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Usuário");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Usuário");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Senha");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Data  Nascimento");

        jPTxtSenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPTxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPTxtSenhaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Confirme sua senha");

        jPTxtSenhaConfirmacao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPTxtSenhaConfirmacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPTxtSenhaConfirmacaoActionPerformed(evt);
            }
        });

        jTxtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtUsuarioActionPerformed(evt);
            }
        });

        jBCadastrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBCancelar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        try {
            jFTxtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTxtDataNascimento.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jBCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(jBCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPTxtSenhaConfirmacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFTxtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jPTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTxtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPTxtSenhaConfirmacao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBCancelar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPTxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPTxtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPTxtSenhaActionPerformed

    private void jPTxtSenhaConfirmacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPTxtSenhaConfirmacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPTxtSenhaConfirmacaoActionPerformed

    private void jTxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtUsuarioActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
   
        Jogador jogador = null;
        JogadorDAO jog = null;          
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                
        if(jTxtUsuario.getText().isEmpty()){
             JOptionPane.showMessageDialog(null,"Campo de usuário não pode ser vazio!"
             + "","ERRO",JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(jPTxtSenhaConfirmacao.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Campo de senha não pode ser vazio!"
                + "","ERRO",JOptionPane.ERROR_MESSAGE);
            }
            else{
                    if(!jPTxtSenhaConfirmacao.getText().equals(jPTxtSenha.getText())){
                    JOptionPane.showMessageDialog(null,"Senha e confirmação estão diferentes!"
                    + "","ERRO",JOptionPane.ERROR_MESSAGE); 
                    }
                    else{
                     
                        try {
                            jog = new JogadorDAO();
                        } 
                        catch (SQLException ex) {
                            Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        Date dataC = null;
                        String data = jFTxtDataNascimento.getText();
                        try {
                             dataC = formato.parse(data);
                        } 
                        catch (ParseException ex) {
                            Logger.getLogger(frmCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            jogador = new Jogador();
                            jogador.setUsuario(jTxtUsuario.getText());
                            jogador.setSenha(jPTxtSenhaConfirmacao.getText());                          
                            jogador.setDataNascimento(dataC);
                            
                        try {
                            if(jog.verificarJogador(jogador.getUsuario()) == false ){
                                jog.cadastrarJogador(jogador);
                                JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");

                                jPTxtSenhaConfirmacao.setText("");
                                jPTxtSenha.setText("");
                                jTxtUsuario.setText("");
                                jFTxtDataNascimento.setValue(null);
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Já existe um usuário com esse nome"
                                        + "","ERRO",JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(frmCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }                 
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(frmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JFormattedTextField jFTxtDataNascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPTxtSenha;
    private javax.swing.JPasswordField jPTxtSenhaConfirmacao;
    private javax.swing.JTextField jTxtUsuario;
    private javax.swing.JTextField jTxtUsuario1;
    // End of variables declaration//GEN-END:variables
}

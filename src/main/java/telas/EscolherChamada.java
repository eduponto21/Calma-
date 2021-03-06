/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import entidades.Usuario;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RandomSource
 */
public class EscolherChamada extends javax.swing.JFrame {

    Usuario user;

    /**
     * Creates new form EscolherChamada
     */
    public EscolherChamada() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonChamada = new javax.swing.JButton();
        jButtonMensagem = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabelMensagemUm = new javax.swing.JLabel();
        jButtonMensagemUm = new javax.swing.JButton();
        jLabelMensagemDois = new javax.swing.JLabel();
        jButtonMensagemDois = new javax.swing.JButton();
        jLabelMensagemTres = new javax.swing.JLabel();
        jButtonMensagemTres = new javax.swing.JButton();
        jLabelMensagemQuatro = new javax.swing.JLabel();
        jButtonMensagemQuatro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calma! - Escolher Chamada");
        setResizable(false);

        jButtonChamada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonChamada.setText("Chamada Telefônica");

        jButtonMensagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonMensagem.setText("Mensagem Pré-Programada");
        jButtonMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMensagemActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabelMensagemUm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelMensagemUm.setText("Mensagem um");

        jButtonMensagemUm.setText("-->");

        jLabelMensagemDois.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelMensagemDois.setText("Mensagem dois");

        jButtonMensagemDois.setText("-->");

        jLabelMensagemTres.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelMensagemTres.setText("Mensagem três");

        jButtonMensagemTres.setText("-->");

        jLabelMensagemQuatro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelMensagemQuatro.setText("Mensagem quatro");

        jButtonMensagemQuatro.setText("-->");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonVoltar)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonChamada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelMensagemQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabelMensagemTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMensagemUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMensagemDois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMensagemDois, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonMensagemUm, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonMensagemTres, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonMensagemQuatro, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButtonChamada, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMensagemUm)
                    .addComponent(jButtonMensagemUm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMensagemDois)
                    .addComponent(jButtonMensagemDois, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMensagemTres)
                    .addComponent(jButtonMensagemTres, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMensagemQuatro)
                    .addComponent(jButtonMensagemQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButtonVoltar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        Menu meni = new Menu();
        try {
            meni.iniciar(user);
        } catch (IOException ex) {
            Logger.getLogger(EscolherChamada.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMensagemActionPerformed
        // TODO add your handling code here:
        if (jLabelMensagemUm.isVisible()) {
            jLabelMensagemUm.setVisible(false);
            jButtonMensagemUm.setVisible(false);
            jLabelMensagemDois.setVisible(false);
            jButtonMensagemDois.setVisible(false);
            jLabelMensagemTres.setVisible(false);
            jButtonMensagemTres.setVisible(false);
            jLabelMensagemQuatro.setVisible(false);
            jButtonMensagemQuatro.setVisible(false);
        } else {
            jLabelMensagemUm.setVisible(true);
            jButtonMensagemUm.setVisible(true);
            jLabelMensagemDois.setVisible(true);
            jButtonMensagemDois.setVisible(true);
            jLabelMensagemTres.setVisible(true);
            jButtonMensagemTres.setVisible(true);
            jLabelMensagemQuatro.setVisible(true);
            jButtonMensagemQuatro.setVisible(true);
        }
    }//GEN-LAST:event_jButtonMensagemActionPerformed

    public void iniciar(Usuario user) {
        this.setVisible(true);
        this.user = user;
        jLabelMensagemUm.setVisible(false);
        jButtonMensagemUm.setVisible(false);
        jLabelMensagemDois.setVisible(false);
        jButtonMensagemDois.setVisible(false);
        jLabelMensagemTres.setVisible(false);
        jButtonMensagemTres.setVisible(false);
        jLabelMensagemQuatro.setVisible(false);
        jButtonMensagemQuatro.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChamada;
    private javax.swing.JButton jButtonMensagem;
    private javax.swing.JButton jButtonMensagemDois;
    private javax.swing.JButton jButtonMensagemQuatro;
    private javax.swing.JButton jButtonMensagemTres;
    private javax.swing.JButton jButtonMensagemUm;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelMensagemDois;
    private javax.swing.JLabel jLabelMensagemQuatro;
    private javax.swing.JLabel jLabelMensagemTres;
    private javax.swing.JLabel jLabelMensagemUm;
    // End of variables declaration//GEN-END:variables
}

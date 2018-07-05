/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import entidades.Usuario;

/**
 *
 * @author atom
 */
public class ChamarContato extends javax.swing.JFrame {
    
    Usuario user;

    /**
     * Creates new form ChamarContato
     */
    public ChamarContato() {
        initComponents();
        user = new Usuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelContatoUm = new javax.swing.JLabel();
        jLabelContatoDois = new javax.swing.JLabel();
        jLabelContatoTres = new javax.swing.JLabel();
        jLabelContatoQuatro = new javax.swing.JLabel();
        jButtonContatoUm = new javax.swing.JButton();
        jButtonContatoDois = new javax.swing.JButton();
        jButtonContatoTres = new javax.swing.JButton();
        jButtonContatoQuatro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelContatoUm.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelContatoUm.setText("Contato um");

        jLabelContatoDois.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelContatoDois.setText("Contato dois");

        jLabelContatoTres.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelContatoTres.setText("Contato tres");

        jLabelContatoQuatro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelContatoQuatro.setText("Contato quatro");

        jButtonContatoUm.setText("-->");
        jButtonContatoUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContatoUmActionPerformed(evt);
            }
        });

        jButtonContatoDois.setText("-->");
        jButtonContatoDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContatoDoisActionPerformed(evt);
            }
        });

        jButtonContatoTres.setText("-->");
        jButtonContatoTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContatoTresActionPerformed(evt);
            }
        });

        jButtonContatoQuatro.setText("-->");
        jButtonContatoQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContatoQuatroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelContatoQuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(jLabelContatoTres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelContatoDois, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelContatoUm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonContatoUm, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonContatoDois, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonContatoTres, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonContatoQuatro, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContatoUm)
                    .addComponent(jButtonContatoUm))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContatoDois)
                    .addComponent(jButtonContatoDois))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContatoTres)
                    .addComponent(jButtonContatoTres))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContatoQuatro)
                    .addComponent(jButtonContatoQuatro))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonContatoUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContatoUmActionPerformed
        // TODO add your handling code here:
        EscolherChamada ec = new EscolherChamada();
        ec.iniciar(user);
        this.dispose();
    }//GEN-LAST:event_jButtonContatoUmActionPerformed

    private void jButtonContatoDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContatoDoisActionPerformed
        // TODO add your handling code here:
        EscolherChamada ec = new EscolherChamada();
        ec.iniciar(user);
        this.dispose();
    }//GEN-LAST:event_jButtonContatoDoisActionPerformed

    private void jButtonContatoTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContatoTresActionPerformed
        // TODO add your handling code here:
        EscolherChamada ec = new EscolherChamada();
        ec.iniciar(user);
        this.dispose();
    }//GEN-LAST:event_jButtonContatoTresActionPerformed

    private void jButtonContatoQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContatoQuatroActionPerformed
        // TODO add your handling code here:
        EscolherChamada ec = new EscolherChamada();
        ec.iniciar(user);
        this.dispose();
    }//GEN-LAST:event_jButtonContatoQuatroActionPerformed

    public void iniciar(Usuario user){
        this.user = user;
        this.setVisible(true);
//        System.out.println("telas.ChamarContato.iniciar()\n" 
//                + this.user.getContato_um().getNome());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContatoDois;
    private javax.swing.JButton jButtonContatoQuatro;
    private javax.swing.JButton jButtonContatoTres;
    private javax.swing.JButton jButtonContatoUm;
    private javax.swing.JLabel jLabelContatoDois;
    private javax.swing.JLabel jLabelContatoQuatro;
    private javax.swing.JLabel jLabelContatoTres;
    private javax.swing.JLabel jLabelContatoUm;
    // End of variables declaration//GEN-END:variables
}

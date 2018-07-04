/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import entidades.Pessoa;
import entidades.Usuario;
import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import processos.Data;

/**
 *
 * @author atom
 */
public class ContatosEmergencia extends javax.swing.JFrame {

    Usuario user;
    int controle;

    /**
     * Creates new form ContatosEmergencia
     */
    public ContatosEmergencia() {
        initComponents();
        this.user = new Usuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldContatoUm = new javax.swing.JTextField();
        jButtonContatoUm = new javax.swing.JButton();
        jTextFieldContatoDois = new javax.swing.JTextField();
        jButtonContatoDois = new javax.swing.JButton();
        jTextFieldContatoTres = new javax.swing.JTextField();
        jButtonContatoTres = new javax.swing.JButton();
        jTextFieldContatoQuatro = new javax.swing.JTextField();
        jButtonContatoQuatro = new javax.swing.JButton();
        jLabelCadastro = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jButtonSalvar = new javax.swing.JButton();
        jLabelContato = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonContatoUm.setText("Editar");
        jButtonContatoUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContatoUmActionPerformed(evt);
            }
        });

        jButtonContatoDois.setText("Editar");
        jButtonContatoDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContatoDoisActionPerformed(evt);
            }
        });

        jButtonContatoTres.setText("Editar");
        jButtonContatoTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContatoTresActionPerformed(evt);
            }
        });

        jButtonContatoQuatro.setText("Editar");
        jButtonContatoQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContatoQuatroActionPerformed(evt);
            }
        });

        jLabelCadastro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCadastro.setText("Contatos de Emergencia");

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome:");

        jLabelTelefone.setText("Telefone:");

        jTextFieldNome.setToolTipText("");

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabelContato.setText("Contato um");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonVoltar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldContatoUm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonContatoUm))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldContatoDois, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonContatoDois))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldContatoTres, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonContatoTres))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldContatoQuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonContatoQuatro))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTelefone)
                            .addComponent(jLabelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome)
                            .addComponent(jFormattedTextFieldTelefone)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelContato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldContatoUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonContatoUm))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldContatoDois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonContatoDois))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldContatoTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonContatoTres))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldContatoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonContatoQuatro))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar)
                    .addComponent(jLabelContato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButtonVoltar))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonContatoUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContatoUmActionPerformed
        // TODO add your handling code here:
        jLabelNome.setVisible(true);
        jLabelTelefone.setVisible(true);
        jTextFieldNome.setVisible(true);
        jFormattedTextFieldTelefone.setVisible(true);
        jButtonSalvar.setVisible(true);
        jLabelContato.setVisible(true);
        jLabelContato.setText("Contato um");
        jTextFieldNome.setText(this.user.getContato_um().getNome());
        jFormattedTextFieldTelefone.setText(this.user.getContato_um().getTelefone());
        controle = 1;
    }//GEN-LAST:event_jButtonContatoUmActionPerformed

    private void jButtonContatoDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContatoDoisActionPerformed
        // TODO add your handling code here:
        jLabelNome.setVisible(true);
        jLabelTelefone.setVisible(true);
        jTextFieldNome.setVisible(true);
        jFormattedTextFieldTelefone.setVisible(true);
        jButtonSalvar.setVisible(true);
        jLabelContato.setVisible(true);
        jLabelContato.setText("Contato dois");
        jTextFieldNome.setText(this.user.getContato_dois().getNome());
        jFormattedTextFieldTelefone.setText(this.user.getContato_dois().getTelefone());
        controle = 2;
    }//GEN-LAST:event_jButtonContatoDoisActionPerformed

    private void jButtonContatoTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContatoTresActionPerformed
        // TODO add your handling code here:
        jLabelNome.setVisible(true);
        jLabelTelefone.setVisible(true);
        jTextFieldNome.setVisible(true);
        jFormattedTextFieldTelefone.setVisible(true);
        jButtonSalvar.setVisible(true);
        jLabelContato.setVisible(true);
        jLabelContato.setText("Contato tres");
        jTextFieldNome.setText(this.user.getContato_tres().getNome());
        jFormattedTextFieldTelefone.setText(this.user.getContato_tres().getTelefone());
        controle = 3;
    }//GEN-LAST:event_jButtonContatoTresActionPerformed

    private void jButtonContatoQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContatoQuatroActionPerformed
        // TODO add your handling code here:
        jLabelNome.setVisible(true);
        jLabelTelefone.setVisible(true);
        jTextFieldNome.setVisible(true);
        jFormattedTextFieldTelefone.setVisible(true);
        jButtonSalvar.setVisible(true);
        jLabelContato.setVisible(true);
        jLabelContato.setText("Contato quatro");
        jTextFieldNome.setText(this.user.getContato_quatro().getNome());
        jFormattedTextFieldTelefone.setText(this.user.getContato_quatro().getTelefone());
        controle = 4;
    }//GEN-LAST:event_jButtonContatoQuatroActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        String nome = jTextFieldNome.getText();
        if(nome.equals(""))
            nome = "Null";
        String telefone = jFormattedTextFieldTelefone.getText();
        String linha = null;
        try {
            linha = Data.buscar_linha(user.getCpf(), "ce.txt");
        } catch (IOException ex) {
            Logger.getLogger(ContatosEmergencia.class.getName()).log(Level.SEVERE, null, ex);
        }

        StringTokenizer st = new StringTokenizer(linha, "|*|");
        String cpf, nome_novo, telefone_novo, linha_nova;
        cpf = st.nextToken();
        linha_nova = "|*|" + cpf + "|*|";
        for(int i = 1; i <= this.controle; i++){
            nome_novo = st.nextToken();
            telefone_novo = st.nextToken();
            if(i != this.controle)
                linha_nova += nome_novo + "|*|" + telefone_novo + "|*|";
            else
                linha_nova += nome + "|*|" + telefone + "|*|";
        }
        int faltante = 4 - this.controle;
        for(int i = 1; i <= faltante; i++){
            nome_novo = st.nextToken();
            telefone_novo = st.nextToken();
            linha_nova += nome_novo + "|*|" + telefone_novo + "|*|";
        }
        //Agora tenho nova linha, entao
        Data.replaceLinha(new File("ce.txt"), linha, linha_nova);
        //Salvo, so fazer tratamentos
        this.iniciar(this.user);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    public void iniciar(Usuario user) {
        this.user = user;
        this.setVisible(true);
        jLabelNome.setVisible(false);
        jLabelTelefone.setVisible(false);
        jTextFieldNome.setVisible(false);
        jFormattedTextFieldTelefone.setVisible(false);
        jButtonSalvar.setVisible(false);
        jLabelContato.setVisible(false);
        
        //Atualizar os contatos de emergencia
        String linha = null;
        try {
            linha = Data.buscar_linha(user.getCpf(), "ce.txt");
        } catch (IOException ex) {
            Logger.getLogger(ContatosEmergencia.class.getName()).log(Level.SEVERE, null, ex);
        }

        StringTokenizer st = new StringTokenizer(linha, "|*|");
        String cpf = st.nextToken();
        
        Pessoa contato1 = new Pessoa();
        contato1.setNome(st.nextToken());
        contato1.setTelefone(st.nextToken());
        this.user.setContato_um(contato1);
        
        Pessoa contato2 = new Pessoa();
        contato2.setNome(st.nextToken());
        contato2.setTelefone(st.nextToken());
        this.user.setContato_dois(contato2);
        
        Pessoa contato3 = new Pessoa();
        contato3.setNome(st.nextToken());
        contato3.setTelefone(st.nextToken());
        this.user.setContato_tres(contato3);
        
        Pessoa contato4 = new Pessoa();
        contato4.setNome(st.nextToken());
        contato4.setTelefone(st.nextToken());
        this.user.setContato_quatro(contato4);
        //
        jTextFieldContatoUm.setText(this.user.getContato_um().getNome());
        jTextFieldContatoDois.setText(this.user.getContato_dois().getNome());
        jTextFieldContatoTres.setText(this.user.getContato_tres().getNome());
        jTextFieldContatoQuatro.setText(this.user.getContato_quatro().getNome());
    }

    /**
     * @param args the command line arguments //
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ContatosEmergencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ContatosEmergencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ContatosEmergencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ContatosEmergencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ContatosEmergencia().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContatoDois;
    private javax.swing.JButton jButtonContatoQuatro;
    private javax.swing.JButton jButtonContatoTres;
    private javax.swing.JButton jButtonContatoUm;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JLabel jLabelContato;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JTextField jTextFieldContatoDois;
    private javax.swing.JTextField jTextFieldContatoQuatro;
    private javax.swing.JTextField jTextFieldContatoTres;
    private javax.swing.JTextField jTextFieldContatoUm;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}

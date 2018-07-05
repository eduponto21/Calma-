/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.io.IOException;
import processos.Data;
import entidades.Usuario;

/**
 *
 * @author atom
 */
public class Menu extends javax.swing.JFrame {
    
    Usuario user;
    ChamarContato cc;

    /**
     * Creates new form Inicio
     */
    public Menu() {
        initComponents();
        this.user = new Usuario();
        this.cc = new ChamarContato();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButtonChamarContato = new javax.swing.JToggleButton();
        jToggleButtonChamarSAMU = new javax.swing.JToggleButton();
        jToggleButtonChamarBombeiro = new javax.swing.JToggleButton();
        jToggleButtonChamarPolicia = new javax.swing.JToggleButton();
        jMenuBarConfiguracoes = new javax.swing.JMenuBar();
        jMenuConfiguracoes = new javax.swing.JMenu();
        jMenuItemEditarPerfil = new javax.swing.JMenuItem();
        jMenuItemContatosDeEmergencia = new javax.swing.JMenuItem();
        jMenuItemMensagensPreProgramadas = new javax.swing.JMenuItem();
        jMenuItemSuporte = new javax.swing.JMenuItem();
        jMenuItemDesconectar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calma! - Menu");
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jToggleButtonChamarContato.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jToggleButtonChamarContato.setText("Contato de Emergencia");
        jToggleButtonChamarContato.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jToggleButtonChamarContato.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jToggleButtonChamarContato.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButtonChamarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonChamarContatoActionPerformed(evt);
            }
        });

        jToggleButtonChamarSAMU.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jToggleButtonChamarSAMU.setText("SAMU");
        jToggleButtonChamarSAMU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonChamarSAMUActionPerformed(evt);
            }
        });

        jToggleButtonChamarBombeiro.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jToggleButtonChamarBombeiro.setText("Bombeiro");
        jToggleButtonChamarBombeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonChamarBombeiroActionPerformed(evt);
            }
        });

        jToggleButtonChamarPolicia.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jToggleButtonChamarPolicia.setText("Policia");
        jToggleButtonChamarPolicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonChamarPoliciaActionPerformed(evt);
            }
        });

        jMenuConfiguracoes.setText("Configurações");

        jMenuItemEditarPerfil.setText("Editar Perfil");
        jMenuItemEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarPerfilActionPerformed(evt);
            }
        });
        jMenuConfiguracoes.add(jMenuItemEditarPerfil);

        jMenuItemContatosDeEmergencia.setText("Contatos de Emergência");
        jMenuItemContatosDeEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemContatosDeEmergenciaActionPerformed(evt);
            }
        });
        jMenuConfiguracoes.add(jMenuItemContatosDeEmergencia);

        jMenuItemMensagensPreProgramadas.setText("Mensagens Pré-Programadas");
        jMenuConfiguracoes.add(jMenuItemMensagensPreProgramadas);

        jMenuItemSuporte.setText("Suporte");
        jMenuConfiguracoes.add(jMenuItemSuporte);

        jMenuItemDesconectar.setText("Desconectar");
        jMenuItemDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDesconectarActionPerformed(evt);
            }
        });
        jMenuConfiguracoes.add(jMenuItemDesconectar);

        jMenuBarConfiguracoes.add(jMenuConfiguracoes);

        setJMenuBar(jMenuBarConfiguracoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jToggleButtonChamarContato, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jToggleButtonChamarSAMU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonChamarPolicia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonChamarBombeiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jToggleButtonChamarPolicia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButtonChamarBombeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButtonChamarSAMU, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButtonChamarContato, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarPerfilActionPerformed
        // TODO add your handling code here:
        Perfil perf = new Perfil();
        perf.iniciar(this.user);
        this.dispose();
    }//GEN-LAST:event_jMenuItemEditarPerfilActionPerformed

    private void jMenuItemContatosDeEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemContatosDeEmergenciaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ContatosEmergencia ce = new ContatosEmergencia();
        ce.iniciar(this.user);        
    }//GEN-LAST:event_jMenuItemContatosDeEmergenciaActionPerformed

    private void jMenuItemDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDesconectarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        String a[] = {};
        Login.main(a);
    }//GEN-LAST:event_jMenuItemDesconectarActionPerformed

    private void jToggleButtonChamarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonChamarContatoActionPerformed
        // TODO add your handling code here:
        if(jToggleButtonChamarContato.isSelected()){
            cc.iniciar(user, this);
        }else{
            cc.dispose();
        }
    }//GEN-LAST:event_jToggleButtonChamarContatoActionPerformed

    private void jToggleButtonChamarPoliciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonChamarPoliciaActionPerformed
        // TODO add your handling code here:
        EscolherChamada ec = new EscolherChamada();
        ec.iniciar(user);
        this.dispose();
    }//GEN-LAST:event_jToggleButtonChamarPoliciaActionPerformed

    private void jToggleButtonChamarBombeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonChamarBombeiroActionPerformed
        // TODO add your handling code here:
        EscolherChamada ec = new EscolherChamada();
        ec.iniciar(user);
        this.dispose();
    }//GEN-LAST:event_jToggleButtonChamarBombeiroActionPerformed

    private void jToggleButtonChamarSAMUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonChamarSAMUActionPerformed
        // TODO add your handling code here:
        EscolherChamada ec = new EscolherChamada();
        ec.iniciar(user);
        this.dispose();
    }//GEN-LAST:event_jToggleButtonChamarSAMUActionPerformed

    public void iniciar(Usuario user) throws IOException{
        this.user = Data.buscar_usuario(user.getCpf());
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBarConfiguracoes;
    private javax.swing.JMenu jMenuConfiguracoes;
    private javax.swing.JMenuItem jMenuItemContatosDeEmergencia;
    private javax.swing.JMenuItem jMenuItemDesconectar;
    private javax.swing.JMenuItem jMenuItemEditarPerfil;
    private javax.swing.JMenuItem jMenuItemMensagensPreProgramadas;
    private javax.swing.JMenuItem jMenuItemSuporte;
    private javax.swing.JToggleButton jToggleButtonChamarBombeiro;
    private javax.swing.JToggleButton jToggleButtonChamarContato;
    private javax.swing.JToggleButton jToggleButtonChamarPolicia;
    private javax.swing.JToggleButton jToggleButtonChamarSAMU;
    // End of variables declaration//GEN-END:variables
}

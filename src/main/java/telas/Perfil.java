/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import processos.Data;
import utfpr.analiseprojetosistemas.calma.entidades.Usuario;

/**
 *
 * @author atom
 */
public class Perfil extends javax.swing.JFrame {

    Usuario user;
    Menu meni;

    /**
     * Creates new form Cadastro
     */
    public Perfil() {
        initComponents();
        this.user = new Usuario();
        this.meni = new Menu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPaneAvisos = new javax.swing.JOptionPane();
        jLabelCadastro = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldMedicacoes = new javax.swing.JTextField();
        jTextFieldCondicoesEspeciais = new javax.swing.JTextField();
        jTextFieldConvenio = new javax.swing.JTextField();
        jTextFieldCodigoConvenio = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldConfirmar = new javax.swing.JPasswordField();
        jButtonSalvar = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jFormattedTextFieldIdade = new javax.swing.JFormattedTextField();
        jFormattedTextFieldRG = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jComboBoxTipoSanguineo = new javax.swing.JComboBox<>();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelCadastro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCadastro.setText("Perfil");

        jLabelNome.setText("Nome:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("Idade:");

        jLabel5.setText("RG:");

        jLabel6.setText("CPF:");

        jLabel7.setText("Tipo Sanguíneo:");

        jLabel8.setText("Medicações:");

        jLabel9.setText("Condições especiais:");

        jLabel10.setText("Convênio:");

        jLabel11.setText("Código do convênio:");

        jLabel12.setText("Senha:");

        jLabel13.setText("Confirmar:");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.setToolTipText("");

        try {
            jFormattedTextFieldIdade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-# ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jComboBoxTipoSanguineo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCondicoesEspeciais))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldConvenio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigoConvenio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMedicacoes))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldSenha)
                            .addComponent(jPasswordFieldConfirmar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCadastro)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxTipoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldCPF))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jFormattedTextFieldRG)))
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 131, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButtonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCadastro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxTipoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldMedicacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldCondicoesEspeciais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldCodigoConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jPasswordFieldConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonVoltar)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        int idade;
        String nome, rg, tipo_sanguineo, medicacoes, condicoes_especiais, convenio, codigo, senha, confirmar, cpf, telefone;

        //Coletar dados e testar validade
        //Nome
        if (!jTextFieldNome.getText().equals("")) {
            nome = jTextFieldNome.getText();
        } else {
            jOptionPaneAvisos.showMessageDialog(this, "Insira um nome!", "Incompleto!", jOptionPaneAvisos.WARNING_MESSAGE);
            return;
        }
        //Telefone
        if (!jFormattedTextFieldTelefone.getText().equals("(  )    -     ")) {
            telefone = jFormattedTextFieldTelefone.getText();
        } else {
            jOptionPaneAvisos.showMessageDialog(this, "Insira um telefone!", "Incompleto!", jOptionPaneAvisos.WARNING_MESSAGE);
            return;
        }
        //Idade
        if (!jFormattedTextFieldIdade.getText().equals("")) {
            idade = Integer.parseInt(jFormattedTextFieldIdade.getText());
        } else if (Integer.parseInt(jFormattedTextFieldIdade.getText()) < 12) {
            jOptionPaneAvisos.showMessageDialog(this, "Idade insuficiente!", "Incapaz!", jOptionPaneAvisos.WARNING_MESSAGE);
            return;
        } else {
            jOptionPaneAvisos.showMessageDialog(this, "Insira uma idade!", "Incompleto!", jOptionPaneAvisos.WARNING_MESSAGE);
            return;
        }
        //RG
        if (jFormattedTextFieldRG.getText().equals(".   .   -") || jFormattedTextFieldRG.getText().startsWith(".")) {
            rg = null;
        } else {
            rg = jFormattedTextFieldRG.getText().trim();
        }
        //CPF
        if (!jFormattedTextFieldCPF.getText().equals(".   .   -")) {
            cpf = jFormattedTextFieldCPF.getText();
        } else {
            jOptionPaneAvisos.showMessageDialog(this, "Insira um CPF!", "Incompleto!", jOptionPaneAvisos.WARNING_MESSAGE);
            return;
        }
        //Tipo Sanguíneo
        if (!jComboBoxTipoSanguineo.getSelectedItem().toString().equals("Selecionar")) {
            tipo_sanguineo = jComboBoxTipoSanguineo.getSelectedItem().toString();
        } else {
            jOptionPaneAvisos.showMessageDialog(this, "Selecione um tipo sanguíneo!", "Incompleto!", jOptionPaneAvisos.WARNING_MESSAGE);
            return;
        }
        //Restante
        medicacoes = jTextFieldMedicacoes.getText();
        if (medicacoes.equals("")) {
            medicacoes = "null";
        }
        condicoes_especiais = jTextFieldCondicoesEspeciais.getText();
        if (condicoes_especiais.equals("")) {
            condicoes_especiais = "null";
        }
        convenio = jTextFieldConvenio.getText();
        if (convenio.equals("")) {
            convenio = "null";
        }
        codigo = jTextFieldCodigoConvenio.getText();
        if (codigo.equals("")) {
            codigo = "null";
        }
        //Senha
        senha = new String(jPasswordFieldSenha.getPassword());
        confirmar = new String(jPasswordFieldConfirmar.getPassword());
        if (senha.length() < 6) {
            jOptionPaneAvisos.showMessageDialog(this, "Insira uma senha com\n no mínimo 6 caracteres!", "Muito simples!", jOptionPaneAvisos.WARNING_MESSAGE);
            return;
        } else if (!confirmar.equals(senha)) {
            jOptionPaneAvisos.showMessageDialog(this, "Senhas não coincidem!", "Erro!", jOptionPaneAvisos.WARNING_MESSAGE);
            return;
        }
        //Criar usuário
        Usuario user = new Usuario(nome, telefone, idade, cpf, rg, condicoes_especiais, medicacoes, tipo_sanguineo, senha, convenio, codigo);

        try {
            //Sobreescrever o usuario
            //Para isso, primeiro descobrir sua string inteira
            String linha = Data.buscar_linha_usuario(user.getCpf());

            //Trocar linha pelo novo usuario
            Data.replaceLinha(linha, new String(), user);
        } catch (IOException ex) {
            Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }

        jOptionPaneAvisos.showMessageDialog(this, "Alteraçao realizada com sucesso!", "Completo!", jOptionPaneAvisos.INFORMATION_MESSAGE);
        
        this.dispose();
        try {
            meni.refresh_user();
        } catch (IOException ex) {
            Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    public void iniciar(Usuario user, Menu meni) {
        this.user = user;
        this.meni = meni;
        this.setVisible(true);
        jTextFieldNome.setText(user.getNome());
        jFormattedTextFieldTelefone.setText(user.getTelefone());
        jFormattedTextFieldIdade.setText(String.valueOf(user.getIdade()));
        jFormattedTextFieldRG.setText(user.getRg());
        jFormattedTextFieldCPF.setText(user.getCpf());

        String sangue[][] = new String[8][2];
        sangue[0][0] = "A+";
        sangue[1][0] = "A-";
        sangue[2][0] = "B+";
        sangue[3][0] = "B-";
        sangue[4][0] = "AB+";
        sangue[5][0] = "AB-";
        sangue[6][0] = "O+";
        sangue[7][0] = "O-";
        sangue[0][1] = "1";
        sangue[1][1] = "2";
        sangue[2][1] = "3";
        sangue[3][1] = "4";
        sangue[4][1] = "5";
        sangue[5][1] = "6";
        sangue[6][1] = "7";
        sangue[7][1] = "8";

        int i = 0;
        while (true) {
            if (user.getTipo_sanguineo().compareTo(sangue[i][0]) == 0) {
                break;
            } else {
                i++;
            }
        }
        jComboBoxTipoSanguineo.setSelectedIndex(Integer.parseInt(sangue[i][1]));
        jTextFieldMedicacoes.setText(user.getMedicacoes_uso_continuo());
        jTextFieldCondicoesEspeciais.setText(user.getCondicoes_especiais());
        jTextFieldConvenio.setText(user.getConvenio_Medico());
        jTextFieldCodigoConvenio.setText(user.getCodigo_Convenio());
        jPasswordFieldSenha.setText(user.getSenha());
        jPasswordFieldConfirmar.setText(user.getSenha());
    }

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxTipoSanguineo;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldIdade;
    private javax.swing.JFormattedTextField jFormattedTextFieldRG;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JOptionPane jOptionPaneAvisos;
    private javax.swing.JPasswordField jPasswordFieldConfirmar;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldCodigoConvenio;
    private javax.swing.JTextField jTextFieldCondicoesEspeciais;
    private javax.swing.JTextField jTextFieldConvenio;
    private javax.swing.JTextField jTextFieldMedicacoes;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}

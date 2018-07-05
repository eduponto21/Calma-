/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import processos.Data;
import entidades.Usuario;

/**
 *
 * @author atom
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
    }

    boolean termos_de_uso = false;

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
        jButtonTermosUso = new javax.swing.JButton();
        jTextFieldMedicacoes = new javax.swing.JTextField();
        jTextFieldCondicoesEspeciais = new javax.swing.JTextField();
        jTextFieldConvenio = new javax.swing.JTextField();
        jTextFieldCodigoConvenio = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldConfirmar = new javax.swing.JPasswordField();
        jButtonCadastrar = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jCheckBoxTermosUso = new javax.swing.JCheckBox();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jFormattedTextFieldIdade = new javax.swing.JFormattedTextField();
        jFormattedTextFieldRG = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jComboBoxTipoSanguineo = new javax.swing.JComboBox<>();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabelCadastro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCadastro.setText("Cadastro");

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

        jButtonTermosUso.setText("Ver termos de uso");
        jButtonTermosUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTermosUsoActionPerformed(evt);
            }
        });

        jButtonCadastrar.setText("Cadastrar!");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jCheckBoxTermosUso.setText("Confirmar");
        jCheckBoxTermosUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTermosUsoActionPerformed(evt);
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
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButtonTermosUso)
                                .addGap(13, 13, 13)
                                .addComponent(jCheckBoxTermosUso))
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
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButtonVoltar)
                .addGap(144, 144, 144)
                .addComponent(jButtonCadastrar))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTermosUso)
                    .addComponent(jCheckBoxTermosUso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonVoltar)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTermosUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTermosUsoActionPerformed
        // TODO add your handling code here:
        jOptionPaneAvisos.showMessageDialog(this,
                "O usuário permitirá acesso a:\n discagem,\n gps,\n rede,\n contatos e\n"
                + " dados fornecidos no cadastro.\n Se está de acordo, marque a checkbox.",
                "Termos de Uso:",
                jOptionPaneAvisos.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonTermosUsoActionPerformed

    private void jCheckBoxTermosUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTermosUsoActionPerformed
        // TODO add your handling code here:
        termos_de_uso = jCheckBoxTermosUso.isSelected();
    }//GEN-LAST:event_jCheckBoxTermosUsoActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
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
        if (!jFormattedTextFieldIdade.getText().equals("") && Integer.parseInt(jFormattedTextFieldIdade.getText()) >=12) {
            idade = Integer.parseInt(jFormattedTextFieldIdade.getText());
        } else if (Integer.parseInt(jFormattedTextFieldIdade.getText()) < 12) {
            jOptionPaneAvisos.showMessageDialog(this, "Idade insuficiente!", "Incapaz!", jOptionPaneAvisos.WARNING_MESSAGE);
            return;
        } else {
            jOptionPaneAvisos.showMessageDialog(this, "Insira uma idade!", "Incompleto!", jOptionPaneAvisos.WARNING_MESSAGE);
            return;
        }
        //RG
        if(jFormattedTextFieldRG.getText().equals(".   .   -") || jFormattedTextFieldRG.getText().startsWith("."))
            rg = null;
        else
            rg = jFormattedTextFieldRG.getText().trim();
        //CPF
        if (!jFormattedTextFieldCPF.getText().trim().equals(".   .   -")) {
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
        if(medicacoes.equals(""))
            medicacoes = "null";
        condicoes_especiais = jTextFieldCondicoesEspeciais.getText();
        if(condicoes_especiais.equals(""))
            condicoes_especiais = "null";
        convenio = jTextFieldConvenio.getText();
        if(convenio.equals(""))
            convenio = "null";
        codigo = jTextFieldCodigoConvenio.getText();
        if(codigo.equals(""))
            codigo = "null";
        //Senha
        senha = new String(jPasswordFieldSenha.getPassword());
        confirmar = new String(jPasswordFieldConfirmar.getPassword());
        if(senha.length() < 6){
            jOptionPaneAvisos.showMessageDialog(this, "Insira uma senha com\n no mínimo 6 caracteres!", "Muito simples!", jOptionPaneAvisos.WARNING_MESSAGE);
            return;
        }else if(!confirmar.equals(senha)){
            jOptionPaneAvisos.showMessageDialog(this, "Senhas não coincidem!", "Erro!", jOptionPaneAvisos.WARNING_MESSAGE);
            return;
        }
        //Termos de Uso
        if(!termos_de_uso){
            jOptionPaneAvisos.showMessageDialog(this, "Aceite os termos de uso!", "Incompleto!", jOptionPaneAvisos.WARNING_MESSAGE);
            return;
        }
        //Criar usuário
        Usuario user = new Usuario(nome, telefone, idade, cpf, rg, condicoes_especiais, medicacoes, tipo_sanguineo, senha, convenio, codigo);
        //Se usuário já existir, erro
        try {
            Usuario teste = Data.buscar_usuario(cpf);
            if(teste.getCpf() != null){
                jOptionPaneAvisos.showMessageDialog(this, "CPF já registrado!", "Conflito!", jOptionPaneAvisos.WARNING_MESSAGE);
                jFormattedTextFieldCPF.setText("");
                return;
            }
        } catch (IOException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        //Se usuário não exisitir, cadastrá-lo 
        try {
            Data.inserir_usuario(user);
        } catch (IOException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jOptionPaneAvisos.showMessageDialog(this, "Cadastro realizado com sucesso!", "Completo!", jOptionPaneAvisos.INFORMATION_MESSAGE);
        this.dispose();
        String a[] = {""};
        Login.main(a);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        String a[] = {""};
        Login.main(a);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    public void iniciar(){
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonTermosUso;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JCheckBox jCheckBoxTermosUso;
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

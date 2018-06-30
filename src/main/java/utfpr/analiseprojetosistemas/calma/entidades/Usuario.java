/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.analiseprojetosistemas.calma.entidades;

/**
 *
 * @author atom
 */
public class Usuario extends Pessoa {
    
    private int idade;
    private long cpf;
    private long rg;
    private String condicoes_especiais;
    private String medicacoes_uso_continuo;
    private String tipo_sanguineo;
    private String senha;
    private boolean termos_de_uso;
    private Convenio_Medico convenio_medico;
    //contato de emerg
    
    public Usuario() {
    }
    
    public Usuario(String nome) {
        super(nome);
    }
    
    public Usuario(String nome, String telefone) {
        super(nome, telefone);
    }
    
    public Usuario(String nome, String telefone, int idade, long cpf, long rg, 
            String condicoes_especiais, String medicacoes_uso_continuo, 
            String tipo_sanguineo, String senha, Convenio_Medico convenio_medico) {
        super(nome, telefone);
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
        this.condicoes_especiais = condicoes_especiais;
        this.medicacoes_uso_continuo = medicacoes_uso_continuo;
        this.tipo_sanguineo = tipo_sanguineo;
        this.senha = senha;
        this.convenio_medico = convenio_medico;
    }

    public int getIdade() {
        return idade;
    }

    public long getCpf() {
        return cpf;
    }

    public long getRg() {
        return rg;
    }

    public String getCondicoes_especiais() {
        return condicoes_especiais;
    }

    public String getMedicacoes_uso_continuo() {
        return medicacoes_uso_continuo;
    }

    public String getTipo_sanguineo() {
        return tipo_sanguineo;
    }

    public boolean isTermos_de_uso() {
        return termos_de_uso;
    }

    public void setTermos_de_uso(boolean termos_de_uso) {
        this.termos_de_uso = termos_de_uso;
    }
    
    
    
    
}

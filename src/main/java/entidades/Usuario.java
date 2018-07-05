/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author atom
 */
public class Usuario extends Pessoa {

    private int idade;
    private String cpf;
    private String rg;
    private String condicoes_especiais;
    private String medicacoes_uso_continuo;
    private String tipo_sanguineo;
    private String senha;
    private String convenio_medico;
    private String codigo_convenio;
    private Pessoa contato_um;
    private Pessoa contato_dois;
    private Pessoa contato_tres;
    private Pessoa contato_quatro;

    public Usuario() {
    }

    public Usuario(String nome) {
        super(nome);
    }

    public Usuario(String nome, String telefone) {
        super(nome, telefone);
    }

    public Usuario(String nome, String telefone, int idade, String cpf, String rg,
            String condicoes_especiais, String medicacoes_uso_continuo,
            String tipo_sanguineo, String senha, String convenio_medico, String codigo) {
        super(nome, telefone);
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
        this.condicoes_especiais = condicoes_especiais;
        this.medicacoes_uso_continuo = medicacoes_uso_continuo;
        this.tipo_sanguineo = tipo_sanguineo;
        this.senha = senha;
        this.convenio_medico = convenio_medico;
        this.codigo_convenio = codigo;
        this.contato_um = new Pessoa();
        this.contato_dois = new Pessoa();
        this.contato_tres = new Pessoa();
        this.contato_quatro = new Pessoa();
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
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

    public String getSenha() {
        return this.senha;
    }

    public String getConvenio_Medico() {
        return this.convenio_medico;
    }

    public String getCodigo_Convenio() {
        return this.codigo_convenio;
    }

    public Pessoa getContato_um() {
        return contato_um;
    }

    public void setContato_um(Pessoa contato_um) {
        this.contato_um = contato_um;
    }

    public Pessoa getContato_dois() {
        return contato_dois;
    }

    public void setContato_dois(Pessoa contato_dois) {
        this.contato_dois = contato_dois;
    }

    public Pessoa getContato_tres() {
        return contato_tres;
    }

    public void setContato_tres(Pessoa contato_tres) {
        this.contato_tres = contato_tres;
    }

    public Pessoa getContato_quatro() {
        return contato_quatro;
    }

    public void setContato_quatro(Pessoa contato_quatro) {
        this.contato_quatro = contato_quatro;
    }
}

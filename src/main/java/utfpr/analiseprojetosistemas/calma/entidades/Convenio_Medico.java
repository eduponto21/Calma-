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
public class Convenio_Medico {
    
    private String nome;
    private long codigo;
    private String informacoes_adicionais;
    
    public Convenio_Medico() {
    }
    
    public Convenio_Medico(String nome, long codigo, String infomacoes_adicionais) {
        this.nome = nome;
        this.codigo = codigo;
        this.informacoes_adicionais = infomacoes_adicionais;
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getInformacoes_adicionais() {
        return informacoes_adicionais;
    }
    
    
    
    
}

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
public class Pessoa {
    
    protected String nome;
    protected long telefone;
    
    public Pessoa() {
    }
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public Pessoa(String nome, long telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
}

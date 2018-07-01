/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import utfpr.analiseprojetosistemas.calma.entidades.Usuario;

/**
 *
 * @author atom
 */
public class Data {
    
    public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
 
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
 
    public static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }
    
    public static void inserir_usuario(Usuario user) throws IOException{        
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("users.txt", true));
        String linha = user.getCpf() + "|*|" + user.getSenha() + "|*|" + user.getNome() + "|*|" 
                + user.getTelefone() + "|*|" + user.getIdade() + "|*|" + user.getRg() + "|*|"
                + user.getCondicoes_especiais() + "|*|" + user.getMedicacoes_uso_continuo() + "|*|"
                + user.getTipo_sanguineo() + "|*|" + user.getConvenio_Medico()
                + "|*|" + user.getCodigo_Convenio() + "|*|\n";
        buffWrite.append(linha);
        buffWrite.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import utfpr.analiseprojetosistemas.calma.entidades.Usuario;

/**
 *
 * @author atom
 */
public class Data {

    public static void inserir_usuario(Usuario user) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("users.txt", true));
        String linha = user.getCpf() + "|*|" + user.getSenha() + "|*|" + user.getNome() + "|*|"
                + user.getTelefone() + "|*|" + user.getIdade() + "|*|" + user.getRg() + "|*|"
                + user.getCondicoes_especiais() + "|*|" + user.getMedicacoes_uso_continuo() + "|*|"
                + user.getTipo_sanguineo() + "|*|" + user.getConvenio_Medico()
                + "|*|" + user.getCodigo_Convenio() + "|*|\n";
        buffWrite.append(linha);
        buffWrite.close();
    }

    public static Usuario buscar_usuario(long cpf) throws IOException {
        Usuario user = new Usuario();
        String cepeefe = String.valueOf(cpf);
        boolean flag = false;

        BufferedReader buffRead = new BufferedReader(new FileReader("users.txt"));
        String linha = "";
        while (linha != null) {
            flag = false;
            //Se for diferente, a flag acende
            for (int i = 0; i < 11; i++) {
                if (!(linha.charAt(i) == cepeefe.charAt(i))) {
                    flag = true;
                }
            }
            //
            if (!flag) {
                //achei
                long telefone;//cpf
                int idade;
                String nome, rg, tipo_sanguineo, medicacoes, condicoes_especiais, convenio, codigo, senha;
                StringTokenizer st = new StringTokenizer(linha, "|*|");
                cpf = Long.parseLong(st.nextToken());
                senha = st.nextToken();
                nome = st.nextToken();
                telefone = Long.parseLong(st.nextToken());
                idade = Integer.parseInt(st.nextToken());
                rg = st.nextToken();
                condicoes_especiais = st.nextToken();
                medicacoes = st.nextToken();
                tipo_sanguineo = st.nextToken();
                convenio = st.nextToken();
                codigo = st.nextToken();
                user = new Usuario(nome, telefone, idade, cpf, rg, condicoes_especiais, medicacoes, tipo_sanguineo, senha, convenio, codigo);
                break;
            } else {
                linha = buffRead.readLine();
            }
        }
        buffRead.close();
        return user;
    }

    public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);

            } else {
                break;
            }
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

}

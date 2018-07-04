/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import entidades.Usuario;

/**
 *
 * @author atom
 */
public class Data {
    
    public static void inserir_usuario(Usuario user) throws IOException {
        //Escrever usuario
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("users.txt", true));
        String linha = "|*|" + user.getCpf() + "|*|" + user.getSenha() + "|*|" + user.getNome() + "|*|"
                + user.getTelefone() + "|*|" + user.getIdade() + "|*|" + user.getTipo_sanguineo() + "|*|";

        if (user.getRg() == null) {
            linha += "|*|";
        } else {
            linha += user.getRg() + "|*|";
        }

        linha += user.getCondicoes_especiais() + "|*|" + user.getMedicacoes_uso_continuo() + "|*|"
                + user.getConvenio_Medico() + "|*|" + user.getCodigo_Convenio() + "|*|\n";
        buffWrite.append(linha);
        buffWrite.close();
        
        //Escrever contatos
        buffWrite = new BufferedWriter(new FileWriter("ce.txt", true));
        linha = "|*|" + user.getCpf() + "|*|Null|*|Null|*|Null|*|Null|*|Null|*|Null|*|Null|*|Null|*|\n";
        buffWrite.append(linha);
        buffWrite.close();
    }

    public static Usuario buscar_usuario(String cpf) throws IOException {
        Usuario user = new Usuario();
        String cepeefe = cpf;
        boolean flag = false;

        BufferedReader buffRead = new BufferedReader(new FileReader("users.txt"));
        String linha = "";
        int idade;
        String nome, rg, tipo_sanguineo, medicacoes, condicoes_especiais, convenio, codigo, senha, telefone;
        while (linha != null) {
            StringTokenizer st = new StringTokenizer(linha, "|*|");
            if (!st.hasMoreTokens()) {
                linha = buffRead.readLine();
                continue;
            }

            cepeefe = st.nextToken();
            if (!cpf.equals(cepeefe)) {
                linha = buffRead.readLine();
            } else {
                //achei
                senha = st.nextToken();
                nome = st.nextToken();
                telefone = st.nextToken();
                idade = Integer.parseInt(st.nextToken());
                tipo_sanguineo = st.nextToken();
                rg = st.nextToken();
                condicoes_especiais = st.nextToken();
                medicacoes = st.nextToken();
                convenio = st.nextToken();
                codigo = st.nextToken();
                user = new Usuario(nome, telefone, idade, cpf, rg, condicoes_especiais, medicacoes, tipo_sanguineo, senha, convenio, codigo);
                break;
            }
        }
        buffRead.close();
        return user;
    }

    public static String buscar_linha(String cpf, String arquivo) throws IOException {
        Usuario user = new Usuario();
        String cepeefe = cpf;
        boolean flag = false;

        BufferedReader buffRead = new BufferedReader(new FileReader(arquivo));
        String linha = "";
        while (linha != null) {
            StringTokenizer st = new StringTokenizer(linha, "|*|");
            if (!st.hasMoreTokens()) {
                linha = buffRead.readLine();
                continue;
            }
            cepeefe = st.nextToken();
            if (!cpf.equals(cepeefe)) {
                linha = buffRead.readLine();
            } else {
                //achei
                break;
            }
        }
        buffRead.close();
        return linha;
    }
    
    public static void replaceLinha(File f, String linhaAlterar, String linhaAlterada) {
        File nf = new File("temporario.tmp");
        FileWriter fw = null;
        Scanner s = null;
        try {
            fw = new FileWriter(nf);
            s = new Scanner(f);

            while (s.hasNextLine()) {
                String linha = s.nextLine();

                linha = linha.replace(linhaAlterar, linhaAlterada);

                try {
                    fw.write(linha + System.getProperty("line.separator"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        f.delete();
        nf.renameTo(f);
    }

    

//    public static void leitor(String path) throws IOException {
//        BufferedReader buffRead = new BufferedReader(new FileReader(path));
//        String linha = "";
//        while (true) {
//            if (linha != null) {
//                System.out.println(linha);
//
//            } else {
//                break;
//            }
//            linha = buffRead.readLine();
//        }
//        buffRead.close();
//    }
//
//    public static void escritor(String path) throws IOException {
//        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
//        String linha = "";
//        Scanner in = new Scanner(System.in);
//        System.out.println("Escreva algo: ");
//        linha = in.nextLine();
//        buffWrite.append(linha + "\n");
//        buffWrite.close();
//    }

}

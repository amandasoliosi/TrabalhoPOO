/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.model.dao;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import trabalhopoo.model.pojo.Aluno;

/**
 *
 * @author Amanda
 */
public class AlunoDaoImp{
    
    private File arquivo = new File("ListaAluno.txt");
	private ArrayList<Aluno> lista = new ArrayList<Aluno>();
	private String nome;
	private String cpf;
	private Aluno aluno;
		
	private FileWriter fw;
	private BufferedWriter bw;
	private FileReader fr;
	private BufferedReader br;
	Iterator<Aluno> it;
        
        public ArrayList<Aluno> ler() throws IOException{
		if(arquivo.exists() == false){
			arquivo.createNewFile();
			return lista;//vai retornar lista de alunos
		}
		fr = new FileReader (arquivo);
		br = new BufferedReader (fr);//joga os dados na memória, ler do arquivo
		while (br.ready()){
			nome = br.readLine();
			cpf = br.readLine();
			inserir(nome, cpf);
		}
		br.close();
		fr.close();
		return lista; 
	}
        //Salva um aluno no arquivo ListaAluno.
        public boolean salvar(Aluno aluno) throws IOException{
		if (aluno == null) return false;
		fw = new FileWriter(arquivo, true);
		bw = new BufferedWriter (fw);
		bw.write(aluno.getNome());
		bw.newLine();
		bw.write(aluno.getCpf());
		bw.newLine();
		bw.close();
		fw.close();
		return true;
	}
        
        public ArrayList<Aluno> getLista() {
		return lista;
        
        }
        
        public Aluno verificar (String cpf){//verifica se o cpf ta salvo na lista de alunos
		if (lista.isEmpty() == true) return null;
		it = lista.iterator(); 
		while (it.hasNext()) {  
                    Aluno aux = it.next();  
		    if (aux.getCpf().equals(cpf)){  
		        return aux;
		   }  
		}
		return null;
	}
        
        public void inserir (String nome, String cpf){//inserir os professores na lista em execução
            aluno = new Aluno(nome, cpf);
            lista.add(aluno);
        }
        
        public boolean salvar(Aluno aluno) throws IOException{
        if (aluno == null) return false;
	fw = new FileWriter(arquivo, true);
	bw = new BufferedWriter (fw);
	bw.write(aluno.getNome());
	bw.newLine();
	bw.write(aluno.getCpf());
	bw.newLine();
	bw.close();
	fw.close();
	return true;
    }
    
        public boolean salvar(ArrayList<Aluno> lista) throws IOException{//Pega os alunos da lista e vai salvando no arquivo
		if (lista.isEmpty() == true) return false;
		fw = new FileWriter(arquivo);
		it = lista.iterator();
		while (it.hasNext()){
			salvar(it.next());
		}
	return true;
        }
                
}
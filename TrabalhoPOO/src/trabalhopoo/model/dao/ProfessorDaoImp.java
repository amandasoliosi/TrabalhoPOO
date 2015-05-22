/////////////////*
 /* To change this license header, choose License Headers in Project Properties.
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
import trabalhopoo.model.pojo.Professor;
import trabalhopoo.model.pojo.Disciplina;

/**
 *
 * @author Amanda
 */
public class ProfessorDaoImp {
    
    private File arquivo = new File("ListaProfessor.txt");
    private ArrayList<Professor> lista = new ArrayList<Professor>();
    private String nome;
    private String cpf;
    private String departamento;
    private Professor professor;
    private Disciplina disciplina;

    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader fr;
    private BufferedReader br;
    Iterator<Professor> it;
    
    public ArrayList<Professor> ler() throws IOException{
		if(arquivo.exists() == false){
			arquivo.createNewFile();
			return lista;//vai retornar lista de professores
		}
		fr = new FileReader (arquivo);
		br = new BufferedReader (fr);//joga os dados na memória, ler do arquivo
		while (br.ready()){
			nome = br.readLine();
			cpf = br.readLine();
                        departamento = br.readLine();
		
		}
		br.close();
		fr.close();
		return lista; 
    }
    
    public ArrayList<Professor> getLista() {
		return lista;
    }
        
    public Professor verificar (String cpf){//verifica se o cpf ta salvo na lista de professores
        if (lista.isEmpty() == true) return null;
        it = lista.iterator(); 
	while (it.hasNext()) {  
            Professor aux = it.next();  
            if (aux.getCpf().equals(cpf)){  
                return aux;
            }  
	}
	return null;
    }
    public void inserir (String nome, String cpf, String departamento){//inserir os professores na lista em execução
	professor = new Professor(nome, cpf, departamento);
	lista.add(professor);
    }
        
        
        //Salva um professor no arquivo ListaProfessor.
    public boolean salvar(Professor professor) throws IOException{
        if (professor == null) return false;
	fw = new FileWriter(arquivo, true);
	bw = new BufferedWriter (fw);
	bw.write(professor.getNome());
	bw.newLine();
	bw.write(professor.getCpf());
	bw.newLine();
        bw.write(professor.getDepartamento());
        bw.newLine();
	bw.close();
	fw.close();
	return true;
    }
        
    public boolean salvar(ArrayList<Professor> lista) throws IOException{//Pega os professores da lista e vai salvando no arquivo
	if (lista.isEmpty() == true) return false;
	fw = new FileWriter(arquivo);
	it = lista.iterator();
	while (it.hasNext()){
		salvar(it.next());
	}
	return true;
    }
      public Professor pesquisarProfessor (Professor professorPes)
    {
        for(Professor professor : lista){
            if(professorPes.getCpf().equals(professor.getCpf())){
                return professor;
            }
        }
    return professorPes;
    }
}
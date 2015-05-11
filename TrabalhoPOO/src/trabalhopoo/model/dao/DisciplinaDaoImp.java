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
import trabalhopoo.model.pojo.Disciplina;
import trabalhopoo.model.pojo.Professor;

/**
 *
 * @author Amanda
 */
public class DisciplinaDaoImp {
    private File arquivo = new File("ListaDisciplina.txt");
    private ArrayList<Disciplina> lista = new ArrayList<Disciplina>();
    private String nome;
    private String ementa;
    private String cargaHoraria;
    private Disciplina disciplina;
    
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader fr;
    private BufferedReader br;
    Iterator<Disciplina> it;
    
    public ArrayList<Disciplina> ler() throws IOException{
		if(arquivo.exists() == false){
			arquivo.createNewFile();
			return lista;//vai retornar lista de professores
		}
		fr = new FileReader (arquivo);
		br = new BufferedReader (fr);//joga os dados na memória, ler do arquivo
		while (br.ready()){
			nome = br.readLine();
			ementa = br.readLine();
                        cargaHoraria = br.readLine();
			inserir(nome, ementa, cargaHoraria);
		}
		br.close();
		fr.close();
		return lista; 
    }
    public ArrayList<Disciplina> getLista() {
		return lista;
    }
     public Disciplina verificar (String nome){//verifica se o nome da disciplina ja ta salvo na lista de disciplinas
        if (lista.isEmpty() == true) return null;
        it = lista.iterator(); 
	while (it.hasNext()) {  
            Disciplina aux = it.next();  
            if (aux.getNome().equals(nome)){  
                return aux;
            }  
	}
	return null;
    }
     
     public void inserir(String nome, String ementa, String cargaHoraria){
         disciplina = new Disciplina(nome, ementa, cargaHoraria);
         lista.add(disciplina);
     }
     public boolean salvar(Disciplina disciplina) throws IOException{
		if (disciplina == null) return false;
		fw = new FileWriter(arquivo, true);
		bw = new BufferedWriter (fw);
		bw.write(disciplina.getNome());
		bw.newLine();
		bw.write(disciplina.getEmenta());
		bw.newLine();
                bw.write(disciplina.getCargaHoraria());
                bw.newLine();
		bw.close();
		fw.close();
		return true;
	}
     public boolean salvar(ArrayList<Disciplina> lista) throws IOException{//Pega as disciplinas da lista e vai salvando no arquivo
		if (lista.isEmpty() == true) return false;
		fw = new FileWriter(arquivo);
		it = lista.iterator();
		while (it.hasNext()){
			salvar(it.next());
		}
		return true;
	}
}

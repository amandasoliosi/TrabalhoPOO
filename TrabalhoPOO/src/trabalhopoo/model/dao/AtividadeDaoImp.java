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
import trabalhopoo.model.pojo.Atividade;
/**
 *
 * @author Thiago
 */

public class AtividadeDaoImp{
    private File arquivo = new File("ListaAtividade.txt");
    private ArrayList<Atividade> lista = new ArrayList<Atividade>();
    private String nome;
    private String tipo;
    private String data;
    private float valor;
    private Atividade atividade;
		
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader fr;
    private BufferedReader br;
    Iterator<Atividade> it;
        
    public ArrayList<Atividade> ler() throws IOException{
	if(arquivo.exists() == false){
		arquivo.createNewFile();
		return lista;//vai retornar lista de alunos
	}
	fr = new FileReader (arquivo);
	br = new BufferedReader (fr);//joga os dados na memória, ler do arquivo
	while (br.ready()){
		nome = br.readLine();
		tipo = br.readLine();
                data = br.readLine();
                valor = br.read();
		inserir(nome, tipo, data, valor);
	}
	br.close();
	fr.close();
	return lista; 
    }
        //Salva um aluno no arquivo ListaAluno.
    public boolean salvar(Atividade atividade) throws IOException{
	if (atividade == null) return false;
	fw = new FileWriter(arquivo, true);
	bw = new BufferedWriter (fw);
	bw.write(atividade.getNome());
	bw.newLine();
	bw.write(atividade.getTipo());
	bw.newLine();
        bw.write(atividade.getData());
	bw.newLine();
        bw.write((int)atividade.getValor());
	bw.newLine();
	bw.close();
	fw.close();
	return true;
    }
        
    public ArrayList<Atividade> getLista() {
	return lista;
        
    }
        
    public Atividade verificar (String tipo){
	if (lista.isEmpty() == true) return null;
	it = lista.iterator(); 
	while (it.hasNext()) {  
                Atividade aux = it.next();  
		if (aux.getTipo().equals(tipo)){  
                    return aux;
		}  
	}
	return null;
    }
        
    public void inserir (String nome, String tipo, String data, float valor){
        atividade = new Atividade(nome, tipo, data, valor);
        lista.add(atividade);
    }
        
    public boolean salvar(ArrayList<Atividade> lista) throws IOException{//Pega os alunos da lista e vai salvando no arquivo
        if (lista.isEmpty() == true) return false;
	fw = new FileWriter(arquivo);
	it = lista.iterator();
	while (it.hasNext()){
            salvar(it.next());
	}
	return true;
    }
            
}  


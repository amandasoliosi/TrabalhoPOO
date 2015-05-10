/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author Amanda
 */
import trabalhopoo.model.dao.*;
import trabalhopoo.model.pojo.Disciplina;
import trabalhopoo.model.pojo.Professor;
import trabalhopoo.model.pojo.Item;

public class DisciplinaView {
    private static Scanner entrada = new Scanner(System.in);
    private DisciplinaDao disciplinaDao;
	
    public DisciplinaView (DisciplinaDao disciplinaDao){
	this.disciplinaDao = disciplinaDao;
    }
	
    public static Scanner getEntrada() {
           return entrada;
    }

    public static void setEntrada(Scanner entrada) {
	DisciplinaView.entrada = entrada;
    }
	
    public long cadastrarDisciplina() throws IOException{
		//Verificacoes
		Verificacoes verificacoes = new Verificacoes();
		System.out.println("Digite o nome da Disciplina: ");
		String nome = entrada.nextLine();
		while (verificacoes.verificarStringVazia(nome)){
			System.out.println("Nome da disciplina nao aceita, digite novamente o nome da Disciplina: ");
			nome = entrada.nextLine();
		}	
		if (disciplinaDao.verificar(nome) != null){
			System.out.println("Disciplina ja esta cadastrada!");
			return(disciplinaDao.verificar(nome).getCodigo());
		}
		System.out.println("Digite a ementa da Disciplina: ");
		String ementa = entrada.nextLine();
		while (verificacoes.verificarStringVazia(ementa)){
			System.out.println("Ementa nao aceita, digite novamente: ");
			ementa = entrada.nextLine();
		}
		System.out.println("Digite a carga horária da Disciplina: ");
		int cargaHoraria = entrada.nextLine();
		while (verificacoes.verificarStringSoNumeros(telefone)){
			System.out.println("Numero de telefone nao aceito, digite novamente: ");
			telefone = entrada.nextLine();
		}
		
		long codigo = fornecedorDao.gerarCodigo();
		fornecedorDao.inserir(nome, codigo, endereco, telefone);
		System.out.println("Fornecedor cadastrado com sucesso!");
		return codigo;		
	}
	public void listarFornecedor(){
		Iterator<Fornecedor> it;
		ArrayList<Fornecedor>listar = fornecedorDao.getLista();
		if (listar.isEmpty() == true) return;
		it = listar.iterator();
		while (it.hasNext()) {  
			Fornecedor aux = it.next();  
			System.out.println("Nome:"+aux.getNome());
			System.out.println("Codigo:"+aux.getCodigo());
			System.out.println("Endereco:"+aux.getEndereco());
			System.out.println("Telefone:"+aux.getTelefone());
		}
		return;
		
	}
}
	

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.view;

import java.util.Scanner;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Iterator;
import trabalhopoo.model.dao.*;
import trabalhopoo.model.pojo.Aluno;
=======
>>>>>>> parent of 431350f... ParteAmanda3


/**
 *
 * @author Amanda
 */
public class AlunoView {
    private static Scanner entrada = new Scanner(System.in);
<<<<<<< HEAD
    private AlunoDaoImp alunoDaoImp;
	
    public AlunoView (AlunoDaoImp alunoDaoImp){
        this.alunoDaoImp = alunoDaoImp;
    }
=======
	private AlunoDao alunoDao;
	
	public AlunoView (AlunoDao alunoDao){
		this.alunoDao = alunoDao;
	}
>>>>>>> parent of 431350f... ParteAmanda3
	
    public static Scanner getEntrada() {
        return entrada;
    }

<<<<<<< HEAD
    public static void setEntrada(Scanner entrada) {
	AlunoView.entrada = entrada;
    }
    

    public void cadastrarAluno(){
        Verificacao verificacao = new Verificacao();
        System.out.println("Cadastro de alunos");
        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();
	while (verificacao.verificarStringVazia(nome) || verificacao.verificarStringSoNumeros(nome)){
=======
	public static void setEntrada(Scanner entrada) {
		AlunoView.entrada = entrada;
	}
    
   /* Dao<Aluno> dao;
    public AlunoView(Dao,dao){
        this.dao = dao;*/
    }
     
 
    public void cadastrar(){
        System.out.println("Cadastro de alunos");
        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();
	while (verificacoes.verificarStringVazia(nome) || verificacoes.verificarStringSoNumeros(nome)){
>>>>>>> parent of 431350f... ParteAmanda3
		System.out.println("Nome do aluno nao aceito, digite o nome do aluno novamente: ");
		nome = entrada.nextLine();
	}
        System.out.println("Digite o CPF: ");
	String cpf = entrada.nextLine();
	while (verificacoes.verificarCpf(cpf) == false){
            System.out.println("CPF invalido, digite o CPF novamente: ");
		cpf = entrada.nextLine();
	}
<<<<<<< HEAD
	if (AlunoDaoImp.verificar(cpf) != null){
		System.out.println("Aluno ja estava cadastrado!");
		return;
	}
        alunoDaoImp.inserir(nome, cpf);
	return;	
        dao.salvar(alunoDaoImp);
=======
	if (AlunoDao.verificar(cpf) != null){
		System.out.println("Aluno ja estava cadastrado!");
		return;
	}
        String cpf = scan.nextLine();
        Aluno aluno = new Aluno(nome,cpf);
        scan.close();
   
        dao.salvar(aluno);
>>>>>>> parent of 431350f... ParteAmanda3
    }
    
    public void listar(){

        List<Aluno> listaAluno = dao.obterTodos();
        
        for(Aluno aluno : listaAluno){
            System.out.println(aluno.getNome()+ " " + aluno.getCpf());
        }
        
    }
    public void pesquisar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o cpf:");
        
    }
}

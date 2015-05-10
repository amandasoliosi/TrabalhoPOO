/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.view;

import java.util.Scanner;

/**
 *
 * @author Amanda
 */
public class AlunoView {
    private static Scanner entrada = new Scanner(System.in);
	private AlunoDao alunoDao;
	
	public AlunoView (AlunoDao alunoDao){
		this.alunoDao = alunoDao;
	}
	
	public static Scanner getEntrada() {
		return entrada;
	}

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
		System.out.println("Nome do aluno nao aceito, digite o nome do aluno novamente: ");
		nome = entrada.nextLine();
	}
        System.out.println("Digite o CPF: ");
	String cpf = entrada.nextLine();
	while (verificacoes.verificarCpf(cpf) == false){
            System.out.println("CPF invalido, digite o CPF novamente: ");
		cpf = entrada.nextLine();
	}
	if (AlunoDao.verificar(cpf) != null){
		System.out.println("Aluno ja estava cadastrado!");
		return;
	}
        String cpf = scan.nextLine();
        Aluno aluno = new Aluno(nome,cpf);
        scan.close();
   
        dao.salvar(aluno);
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

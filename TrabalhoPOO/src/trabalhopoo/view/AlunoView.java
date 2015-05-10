/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.view;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import trabalhopoo.model.dao.*;
import trabalhopoo.model.pojo.Aluno;


/**
 *
 * @author Amanda
 */
public class AlunoView {
    private static Scanner entrada = new Scanner(System.in);
    private AlunoDaoImp alunoDaoImp;
	
    public AlunoView (AlunoDaoImp alunoDaoImp){
        this.alunoDaoImp = alunoDaoImp;
    }
	
    public static Scanner getEntrada() {
        return entrada;
    }

    public static void setEntrada(Scanner entrada) {
	AlunoView.entrada = entrada;
    }
    

    public void cadastrarAluno(){
        Verificacao verificacao = new Verificacao();
        System.out.println("Cadastro de alunos");
        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();
	while (verificacao.verificarStringVazia(nome) || verificacao.verificarStringSoNumeros(nome)){
		System.out.println("Nome do aluno nao aceito, digite o nome do aluno novamente: ");
		nome = entrada.nextLine();
	}
        System.out.println("Digite o CPF: ");
	String cpf = entrada.nextLine();
	while (verificacao.verificarCpf(cpf) == false){
            System.out.println("CPF invalido, digite o CPF novamente: ");
		cpf = entrada.nextLine();
	}
	if (AlunoDaoImp.verificar(cpf) != null){
		System.out.println("Aluno ja estava cadastrado!");
		return;
	}
        alunoDaoImp.inserir(nome, cpf);
	return;	
        dao.salvar(alunoDaoImp);
    }
    
    public void listarAluno() {
		Iterator<Aluno> it;
		ArrayList<Aluno>listar = alunoDaoImp.getLista(); 
		if (listar.isEmpty() == true) return;
		it = listar.iterator();
		while (it.hasNext()) {  
			Aluno aux = it.next();  
			System.out.println("Nome:"+aux.getNome());
			System.out.println("CPF:"+aux.getCpf());
		}
		return;
    }
    
    public void pesquisar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o cpf:");
        
    }
}

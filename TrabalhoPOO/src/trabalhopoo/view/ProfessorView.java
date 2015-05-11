/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.view;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import trabalhopoo.model.dao.ProfessorDaoImp;
import trabalhopoo.model.dao.Verificacao;
import trabalhopoo.model.pojo.Professor;
/**
 *
 * @author Amanda
 */
public class ProfessorView {
    
    private static Scanner entrada = new Scanner(System.in);
    private ProfessorDaoImp professorDaoImp;
	
    public ProfessorView (ProfessorDaoImp professorDaoImp){
        this.professorDaoImp = professorDaoImp;
    }
	
    public static Scanner getEntrada() {
        return entrada;
    }

    public static void setEntrada(Scanner entrada) {
	ProfessorView.entrada = entrada;
    }
    

    public String cadastrarProfessor(){
        Verificacao verificacao = new Verificacao();
        System.out.println("Cadastro de professores");
        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();
	while (verificacao.verificarStringVazia(nome) || verificacao.verificarStringSoNumeros(nome)){
		System.out.println("Nome do professor nao aceito, digite o nome do professor novamente: ");
		nome = entrada.nextLine();
	}
        System.out.println("Digite o CPF: ");
	String cpf = entrada.nextLine();
	while (verificacao.verificarCpf(cpf) == false){
            System.out.println("CPF invalido, digite o CPF novamente: ");
		cpf = entrada.nextLine();
	}
	if (professorDaoImp.verificar(cpf) != null){
            System.out.println("Professor ja cadastrado!");
            return;
	}
        System.out.println("Digite o departamento do professor: ");
            String departamento = entrada.nextLine();
            while (verificacao.verificarStringVazia(departamento)){
		System.out.println("Departamento não aceito, digite novamente.");
		departamento = entrada.nextLine();
            }
        professorDaoImp.inserir(nome, cpf, departamento);
        System.out.println("Professor casdrado com sucesso!");
	return;	
    }
       
    public void listarAluno() {
		Iterator<Professor> it;
		ArrayList<Professor>listar = professorDaoImp.getLista(); 
		if (listar.isEmpty() == true) return;
		it = listar.iterator();
		while (it.hasNext()) {  
			Professor aux = it.next();  
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

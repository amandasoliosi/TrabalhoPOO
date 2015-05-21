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
import trabalhopoo.model.dao.VerificacaoDaoImp;
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
	
    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
	ProfessorView.entrada = entrada;
    }
    

    public String cadastrarProfessor(){
        VerificacaoDaoImp verificacao = new VerificacaoDaoImp();
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
	}
        System.out.println("Digite o departamento do professor: ");
            String departamento = entrada.nextLine();
            while (verificacao.verificarStringVazia(departamento)){
		System.out.println("Departamento não aceito, digite novamente.");
		departamento = entrada.nextLine();
            }
        professorDaoImp.inserir(nome, cpf, departamento);
        System.out.println("Professor casdrado com sucesso!");
        return null;

    }
       
    public void listarProfessor() {
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
    public boolean cosultarProfessor(Professor professor){
        Professor professorPes = professorDaoImp.pesquisarProfessor(new Professor (null, professor.getCpf(), null));
        if(professorPes.getNome() == null)
        {
            return false;
        }
       return true;
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.view;
import java.io.IOException;
import java.util.Scanner;
import trabalhopoo.model.dao.AlunoDaoImp;
import trabalhopoo.model.dao.AtividadeDaoImp;
import trabalhopoo.model.dao.DisciplinaDaoImp;
import trabalhopoo.model.dao.TurmaDaoImp;
import trabalhopoo.model.dao.ProfessorDaoImp;
import trabalhopoo.view.AlunoView;
import trabalhopoo.view.AtividadeView;
import trabalhopoo.view.DisciplinaView;
import trabalhopoo.view.TurmaView;
import trabalhopoo.view.ProfessorView;
import trabalhopoo.view.NotaView;
import trabalhopoo.view.FaltaView;

/**
 *
 * @author Amanda
 */

public class MenuPrincipal {
    
    private static Scanner entrada = new Scanner(System.in);
    
    static AlunoDaoImp alunoDaoImp = new AlunoDaoImp();
    static AtividadeDaoImp atividadeDaoImp = new AtividadeDaoImp();
    static DisciplinaDaoImp disciplinaDaoImp = new DisciplinaDaoImp();
    static ProfessorDaoImp professorDaoImp = new ProfessorDaoImp();
    static TurmaDaoImp turmaDaoImp = new TurmaDaoImp();
	
    static AlunoView alunoView = new AlunoView(alunoDaoImp);
    static ProfessorView professorView = new ProfessorView(professorDaoImp);
    static AtividadeView atividadeView = new AtividadeView(atividadeDaoImp);
    static DisciplinaView disciplinaView = new DisciplinaView(disciplinaDaoImp);
    static TurmaView turmaView = new TurmaView(turmaDaoImp);
    
	public static Scanner getEntrada() {
		return entrada;
	}

	public static void setEntrada(Scanner entrada) {
		MenuPrincipal.entrada = entrada;
	}
	
	public static void main(String[] args) throws IOException{
		int opcao = 0;
		alunoDaoImp.ler();
		atividadeDaoImp.ler();
		professorDaoImp.ler();
		disciplinaDaoImp.ler();
                turmaDaoImp.ler();
		
		do{
			System.out.println("Escolha a opcao desejada:");
			System.out.println("1- Cadastrar aluno");
			System.out.println("2- Cadastrar professor");
			System.out.println("3- Cadastrar atividade");
			System.out.println("4- Cadastrar turma");
			System.out.println("5- Cadastrar disciplina");
			System.out.println("6- Lançar notas");
			System.out.println("7- Lançar faltas");
			System.out.println("8- Consultar turmas");
			System.out.println("9- Consultar situação do aluno em uma determinada disciplina");
			System.out.println("10- Consultar numero de turmas ja oferecidas para uma determinada disciplina");
			System.out.println("11- Consultar o numero de disciplina ja lecionadas por um determinado professor");
			System.out.println("13- Listar Alunos");
                        System.out.println("14- Listar Disciplinas");
                        System.out.println("15- Listar Professor");
                        System.out.println("16- Sair");
			
			opcao = entrada.nextInt();
			verificarOpcao(opcao);
		
		}while(opcao<=16);
	}
	
	private static void verificarOpcao(int opcao) throws IOException{
		switch(opcao){
		case 1: 
			alunoView.cadastrarAluno();
			break;
		
		case 2:
			professorView.cadastrarProfessor();
			break;
		
		case 3:
			atividadeView.cadastrarAtividade();
			break;

		case 4:
			turmaView.cadastrarTurma();
			break;
                    
                case 5:
                        disciplinaView.cadastrarDisciplina();
                        break;
                }
		/*case 6:
			
			
			break;
			
		case 7:
			
			break;
		
		case 8:
			
			break;
			
		case 9:
			
			break;
			
		case 10:
		
			break;
			
		case 11:
			
			break;
                case 12:
			
			break;
                        
                case 13:
			alunoView.listarAluno();
			break;
                case 14:
			disciplinaView.listarDisciplina();
			break;    
                case 15:
			professorView.listarProfessor();
			break;	
		case 16:
			System.out.println("Saindo...");
			alunoDaoImp.salvar(alunoDaoImp.getLista());
			professorDaoImp.salvar(professorDaoImp.getLista());
			disciplinaDaoImp.salvar(disciplinaDaoImp.getLista());
			turmaDaoImp.salvar(turmaDaoImp.getLista());
                        atividadeDaoImp.salvar(atividadeDaoImp.getLista());
			System.exit(0);
			break;
			*/
		}
        }
    
   


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.view;

import java.io.IOException;
import java.util.Scanner;
import trabalhopoo.model.dao.*;


/**
 *
 * @author Amanda
 */

public class MenuPrincipal {
    private static Scanner entrada = new Scanner(System.in);
    
    static AlunoDaoImp alunoDaoImp = new AlunoDaoImp();
    static AtividadeDaoImp atividadeDaoImp = new AtividadeDaoImp();
    static DisciplinaDaoImp disciplinaDaoImp = new DisciplinaDaoImp(fornecedorDao);
    static ProfessorDaoImp professorDaoImp = new ProfessorDaoImp();
    static TurmaDaoImp turmaDaoImp = new TurmaDaoImp();
	
    static AlunoView alunoView = new AlunoView(alunoDaoImp);
    static ProfessorView professorView = new ProfessorView(professorDaoImp);
    static AtividadeView atividadeView = new AtividadeView(itemDao, fornecedorDao);
    static DisciplinaView disciplinaView = new DisiciplinaView(clienteDao, pedidoDao, itemDao, fornecedorDao);
    static TurmaView turmaView = new TurmaView();
    
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
			System.out.println("12- Sair");
			
			opcao = entrada.nextInt();
			verificarOpcao(opcao);
		
		}while(opcao<=12);
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
	
		/*case 6:
			System.out.println("Digite o codigo do Item: ");
			long codigo2 = entrada.nextLong();
			Item aux2 = itemDao.verificar(codigo2);
			if(aux2 == null){
				System.out.println("Item nao cadastrado!");
			}
			else{
				System.out.println("Preco: "+ ((aux2.getPrecoCusto()+aux2.getPrecoCusto())*aux2.getMargemLucro()));
			}
			
			break;
			
		case 7:
			clienteView.listarCliente();
			break;
		
		case 8:
			fornecedorView.listarFornecedor();
			break;
			
		case 9:
			pedidoView.listarPedido();
			break;
			
		case 10:
			System.out.println("Digite o codigo do Item: ");
			long codigo1 = entrada.nextLong();
			Item aux1 = itemDao.verificar(codigo1);
			if(aux1 == null){
				System.out.println("Item nao cadastrado!");
			}
			System.out.println("Item: "+aux1.getNome());
			System.out.println("Quantidade: "+aux1.getQuantEstoque());
			break;
			
		case 11:
			itemView.listarItem();
			break;
			
		case 12:
			System.out.println("Saindo...");
			clienteDao.salvar(clienteDao.getLista());
			fornecedorDao.salvar(fornecedorDao.getLista());
			itemDao.salvar(itemDao.getLista());
			//pedidoDao.salvar(pedidoDao.getLista());
			System.exit(0);
			break;
			
		}
	}
    
    public static void main(String[] args){
        Dao<Aluno>dao = new AlunoDaoImp();
        AlunoView alunoView = new AlunoView(daoAluno);
        System.out.println("Sistema");
        alunoView.cadastrar();
        
        alunoView.cadastrar();
        alunoView.pesquisar();
        alunoView.listar();
     
    }*/
}

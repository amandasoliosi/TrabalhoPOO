/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.view;

import java.io.IOException;
import java.util.Scanner;

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
	
    static ClienteView clienteView = new ClienteView(clienteDao);
    static FornecedorView fornecedorView = new FornecedorView(fornecedorDao);
    static ItemView itemView = new ItemView (itemDao, fornecedorDao);
    static PedidoView pedidoView = new PedidoView(clienteDao, pedidoDao, itemDao, fornecedorDao);
	
	public static Scanner getEntrada() {
		return entrada;
	}

	public static void setEntrada(Scanner entrada) {
		Main.entrada = entrada;
	}
	
	public static void main(String[] args) throws IOException{
		int opcao = 0;
		clienteDao.ler();
		fornecedorDao.ler();
		itemDao.ler();
		pedidoDao.ler();
		
		do{
			System.out.println("Escolha a opcao desejada:");
			System.out.println("1- Cadastrar cliente");
			System.out.println("2- Cadastrar fornecedor");
			System.out.println("3- Cadastrar itens");
			System.out.println("4- Cadastrar pedido");
			System.out.println("5- Consultar dados de um item pelo nome");
			System.out.println("6- Consultar preco de um item pelo codigo");
			System.out.println("7- Listar clientes");
			System.out.println("8- Listar fornecedores");
			System.out.println("9- Listar pedidos em aberto");
			System.out.println("10- Situacao estoque produto");
			System.out.println("11- Resumo do estoque");
			System.out.println("12- Sair");
			
			opcao = entrada.nextInt();
			verificarOpcao(opcao);
		
		}while(opcao<=12);
	}
	
	private static void verificarOpcao(int opcao) throws IOException{
		switch(opcao){
		case 1: 
			clienteView.cadastrarCliente();
			break;
		
		case 2:
			fornecedorView.cadastrarFornecedor();
			break;
		
		case 3:
			itemView.cadastrarItem();
			break;

		case 4:
			pedidoView.cadastrarPedido();
			break;

		case 5:
			System.out.println("Digite o codigo do Item: ");
			long codigo = entrada.nextLong();
			Item aux = itemDao.verificar(codigo);
			if(aux == null){
				System.out.println("Item nao cadastrado!");
			}
			else{
				System.out.println("Nome: "+ aux.getNome());
				System.out.println("Margem de Lucro: "+aux.getMargemLucro());
				System.out.println("Preco de Custo: "+aux.getPrecoCusto());
				System.out.println("Quantidade no Estoque: "+aux.getQuantEstoque());
				System.out.println("Fornecedor: "+aux.getFornecedor().get(0).getNome());
			}
			break;
	
		case 6:
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
     
    }
    
    private static void verificarOpcao(int opcao) throws IOException{
		switch(opcao){
		case 1: 
                    alunoView.cadastrarAluno();
                    break;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhopoo.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import trabalhopoo.model.dao.AtividadeDaoImp;
import trabalhopoo.model.dao.VerificacaoDaoImp;
import trabalhopoo.model.pojo.Atividade;

/**
 *
 * @author Thiago
 */
public class AtividadeView {
    private Scanner entrada = new Scanner(System.in);
	private AtividadeDaoImp atividadeDaoImp;
	
	public AtividadeView (AtividadeDaoImp atividadeDaoImp){
		this.atividadeDaoImp = atividadeDaoImp;
	}
	
	public Scanner getEntrada() {
		return entrada;
	}

	public static void setEntrada(Scanner entrada) {
		AtividadeView.entrada = entrada;
	}
        
        public void cadastrarAtividade(){
        VerificacaoDaoImp verificacao = new VerificacaoDaoImp();
        System.out.println("Cadastro de atividades");
        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();
        while (verificacao.verificarStringVazia(nome) || verificacao.verificarStringSoNumeros(nome)){
		System.out.println("Nome de atividade nao aceito, digite o nome da atividade novamente: ");
		nome = entrada.nextLine();
	}
        System.out.println("Informe o tipo: "); 
        String tipo = entrada.nextLine();
        while (verificacao.verificarStringVazia(tipo)|| verificacao.verificarStringSoNumeros(tipo)){
		System.out.println("Tipo de atividade nao aceito, digite o tipo da atividade novamente: ");
		tipo = entrada.nextLine();
	}
        System.out.println("Informe a data: "); 
        String data = entrada.nextLine();
        while (verificacao.verificarStringVazia(data)){
		System.out.println("Data não aceite, digite novamente ");
		data = entrada.nextLine();
	}
        System.out.println("Informe o valor: "); 
        float valor = entrada.nextFloat();
  /*      while (  ){              Implementar verificador
		System.out.println("Valor de atividade inválido, digite o valor da atividade novamente: ");
		valor = entrada.nextFloat();
	}*/
        atividadeDaoImp.inserir(nome,tipo, data, valor);
        System.out.println("Atividade cadastrado com sucesso!");
        return;	
   
     
    }
    
    public void listarAtividades() {
		Iterator<Atividade> it;
		ArrayList<Atividade>listar = atividadeDaoImp.getLista(); 
		if (listar.isEmpty() == true) return;
		it = listar.iterator();
		while (it.hasNext()) {  
			Atividade aux = it.next();  
			System.out.println("Nome:"+aux.getNome());
			System.out.println("Tipo:"+aux.getTipo());
                        System.out.println("Data:"+aux.getData());
                        System.out.println("Valor:"+aux.getValor());
		}
		return;
    }
    
    public void pesquisar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tipo:");
        
    }
    
    
   
}

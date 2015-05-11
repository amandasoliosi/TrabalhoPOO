/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.view;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import trabalhopoo.model.dao.TurmaDaoImp;
import trabalhopoo.model.pojo.Turma;
/**
 *
 * @author Klaus
 */

public class TurmaView {
    private static Scanner entrada = new Scanner(System.in);
    private TurmaDaoImp turmaDaoImp;
	
    public TurmaView (TurmaDaoImp turmaDaoImp){
        this.turmaDaoImp = turmaDaoImp;
    }
	
    public static Scanner getEntrada() {
        return entrada;
    }

    public static void setEntrada(Scanner entrada) {
	TurmaView.entrada = entrada;
    }
    
 
    public void cadastrarTurma(){
        System.out.println("Cadastro de turmas");
        System.out.println("Informe o ano: ");
        int ano = entrada.nextInt();
/*	while (){                             Implemetar verificação
		System.out.println("Ano de turma não aceito, digite o ano da 
                                    turma novamente: ");
		ano = entrada.nextInt();
	}*/
        System.out.println("Digite o periodo: ");
	int periodo = entrada.nextInt();
/*	while (){                             Implemetar verificação
            System.out.println("Período inválido, digite-o novamente: ");
		periodo = entrada.nextInt();
	}*/
        System.out.println("Digite o local: ");
        String local = entrada.nextLine();
/*      while(){
                System.out.println("Local inválido, digite-o novamente: ");
		local = entrada.nextLine();
        */    
        System.out.println("Digite o horário: ");
        String horario = entrada.nextLine();
/*      while(){
                System.out.println("Horario de turma não aceito, digite o 
                                    horario novamente: ");
		horario = entrada.nextLine();
        */
        System.out.println("Digite o numero de vagas disponíveis: ");
        int numero_de_vagas = entrada.nextInt();
/*      while(){
                System.out.println("Quandtidade de número de vagas incorreta, 
                                    digite mais uma vez: ");
		numero_de_vagas = entrada.nexInt();
        */     
        turmaDaoImp.inserir(ano, periodo, local, horario, numero_de_vagas);
	return;	
        dao.salvar(turmaDaoImp);
    }
    
    public void listar(){

        List<Turma> listaTurma = dao.obterTodos();
        
        for(Turma turma : listaTurma){
            System.out.println(turma.getAno()+ " " + turma.getPeriodo()+ " " + turma.getLocal()+ " " 
                                + turma.getHorario()+ " " + turma.getNumero_de_vagas());
        }
        
    }
}

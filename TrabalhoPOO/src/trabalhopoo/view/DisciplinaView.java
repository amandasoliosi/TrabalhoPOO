/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import trabalhopoo.model.dao.*;
import trabalhopoo.model.pojo.Disciplina;

public class DisciplinaView {
    private static Scanner entrada = new Scanner(System.in);
    private DisciplinaDaoImp disciplinaDaoImp;
        
	
    public DisciplinaView (DisciplinaDaoImp disciplinaDaoImp){
	this.disciplinaDaoImp = disciplinaDaoImp;
    }
	
    public static Scanner getEntrada() {
           return entrada;
    }

    public static void setEntrada(Scanner entrada) {
	DisciplinaView.entrada = entrada;
    }
	
    public long cadastrarDisciplina() throws IOException{
		//Verificacoes
		Verificacoes verificacoes = new Verificacoes();
		System.out.println("Digite o nome da Disciplina: ");
		String nome = entrada.nextLine();
		while (verificacoes.verificarStringVazia(nome)){
			System.out.println("Nome da disciplina nao aceita, digite novamente o nome da Disciplina: ");
			nome = entrada.nextLine();
		}	
		if (disciplinaDaoImp.verificar(nome) != null){
			System.out.println("Disciplina ja esta cadastrada!");
			return(disciplinaDaoImp.verificar(nome));
		}
		System.out.println("Digite a ementa da Disciplina: ");
		String ementa = entrada.nextLine();
		while (verificacoes.verificarStringVazia(ementa)){
			System.out.println("Ementa nao aceita, digite novamente: ");
			ementa = entrada.nextLine();
		}
		System.out.println("Digite a carga horária da Disciplina: ");
		String cargaHoraria = entrada.nextLine();
                while (verificacoes.verificarStringVazia(cargaHoraria)){
			System.out.println("Carga horaria nao aceita, digite novamente: ");
			cargaHoraria = entrada.nextLine();
		}
	
	}

}
	

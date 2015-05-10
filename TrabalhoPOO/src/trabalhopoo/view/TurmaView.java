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
    
 
    //Fazer o cadastrar Turma
    
    public void listar(){

        List<Turma> listaTurma = dao.obterTodos();
        
        for(Turma turma : listaTurma){
            System.out.println(turma.getAno()+ " " + turma.getPeriodo()+ " " + turma.getLocal()+ " " 
                                + turma.getHorario()+ " " + turma.getNumero_de_vagas());
        }
        
    }
}

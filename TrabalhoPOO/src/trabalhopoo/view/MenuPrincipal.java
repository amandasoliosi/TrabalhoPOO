/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.view;

/**
 *
 * @author Amanda
 */

public class MenuPrincipal {
    
    public static void main(String[] args){
        Dao<Aluno> dao = new AlunoDaoImp();
        AlunoView alunoView = new AlunoView(daoAluno);
        System.out.println("Sistema");
        alunoView.cadastrar();
        
        alunoView.cadastrar();
        alunoView.pesquisar();
        alunoView.listar();
     
    }
}

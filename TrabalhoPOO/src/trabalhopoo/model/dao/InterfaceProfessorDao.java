/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.model.dao;
import java.io.IOException;
import java.util.ArrayList;
import trabalhopoo.model.pojo.Professor;


/**
 *
 * @author Amanda
 */


public interface InterfaceProfessorDaoImp {
    
    ArrayList<Professor> ler() throws IOException;
    Professor verificar (String cpf);
    void inserir (String nome, String cpf, String departamento);  
    boolean salvar(Professor professor) throws IOException; // salva no arquivo
    boolean salvar(ArrayList<Professor> lista) throws IOException; // salva no vetor
    
}

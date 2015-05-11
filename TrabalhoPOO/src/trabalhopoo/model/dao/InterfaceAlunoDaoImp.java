/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.model.dao;
import java.io.IOException;
import java.util.ArrayList;
import trabalhopoo.model.pojo.Aluno;
/**
 *
 * @author Amanda
 */
public interface InterfaceAlunoDaoImp extends Dao<Aluno> {
    
   ArrayList<Aluno> ler() throws IOException;
   Aluno verificar (String cpf);
   void inserir (String nome, String cpf);
   boolean salvar(Aluno aluno) throws IOException; // salva no arquivo
   boolean salvar(ArrayList<Aluno> lista) throws IOException; // salva no vetor
    
}

//Fazer interface genérica(dao) usar InterfaceAlunoDaoImp ou só o Dao

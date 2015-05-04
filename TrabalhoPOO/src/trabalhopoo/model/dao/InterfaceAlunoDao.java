/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.model.dao;

import java.util.List;
/**
 *
 * @author Amanda
 */
public interface InterfaceAlunoDao extends Dao<Aluno> {
    
    void pesquisarDisciplinaAluno;
    
}

//Fazer interface genérica(dao) usar InterfaceAlunoDao ou só o Dao

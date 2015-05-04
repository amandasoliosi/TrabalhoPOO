/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.model.dao;
import java.util.ArrayList;

/**
 *
 * @author Amanda
 */
public class AlunoDaoImp implements InterfaceAlunoDao{
    
    private List<Aluno> listaAluno;
    
    public AlunoDaoImp(){
        this.listaAluno = new ArrayList<Aluno>();
        
    }
   
    @Override
    public void salvar(Aluno aluno) {
        this.listaAluno.add(aluno);
    }

    public List<Aluno> obterTodos() {
        return this.listaAluno;
    }
    
    @Override
    public Aluno pesquisar(Aluno aluno) {
        return this.listaAluno.get(this.listaAluno.index0f(aluno));
    }
    
    
    
}

//método pra tratar arquivo deve ser privado
//ordenar collections.sor(listaAluno());
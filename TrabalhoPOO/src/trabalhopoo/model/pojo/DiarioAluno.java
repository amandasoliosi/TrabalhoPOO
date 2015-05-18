/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.model.pojo;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author thamires
 */
public class DiarioAluno {
    private int presenca;
    private float nota;
    private Aluno aluno;
    private List<Atividade> atividade; 
    
    public DiarioAluno(int presenca, float nota, Aluno aluno){
        this.presenca = presenca;
        this.nota = nota;
        this.aluno = aluno;
        this.atividade = new ArrayList<>();
    }
    
}

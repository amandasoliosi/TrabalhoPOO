/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.model.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Klaus
 */

public class Turma {
    
    private int ano;
    private int periodo;
    private String local;
    private String horario;
    private int numero_de_vagas;
    private Professor professor;
    private Disciplina disciplina;
    private List<Atividade> listAtividade;
   // private List<DiarioAluno> listDiario;
    private ArrayList<Falta> faltas;
    private ArrayList<Aluno> alunos;

    public Turma(int ano, int periodo, String local, String horario, int numero_de_vagas,
        Professor professor, Disciplina disciplina, List<Atividade> listAtividade) {
        this.ano = ano;
        this.periodo = periodo;
        this.local = local;
        this.horario = horario;
        this.numero_de_vagas = numero_de_vagas;
        this.professor = professor;
        this.disciplina = disciplina;
        this.listAtividade = listAtividade;
    }

    public Turma(int ano, int periodo, String local, String horario, int numero_de_vagas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void insereAluno(Aluno novo){
        if(novo != null){
            Falta aux;
            aux = new Falta(0,novo.getCpf());
            this.faltas.add(aux);
            this.alunos.add(novo);
        }
    }
    
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getPeriodo(){
        return periodo;
    }
    public void setPeriodo(int periodo){
        this.periodo = periodo;
    }
    public String getLocal(){
        return local;
    }
    public void setLocal(String local){
        this.local = local;
    }
    public String getHorario(){
        return horario;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }
    public int getNumero_de_vagas(){
        return numero_de_vagas;
    }
    public void setNumero_de_vagas(int numero_de_vagas){
        this.numero_de_vagas = numero_de_vagas;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public List<Atividade> getListAtividade() {
        return listAtividade;
    }

    public void addAlunoDiario(DiarioAluno DiarioAluno) {
        listDiario.add(DiarioAluno);
    }
   
}

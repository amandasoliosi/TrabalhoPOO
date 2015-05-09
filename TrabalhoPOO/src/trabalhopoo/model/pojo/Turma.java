/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.model.pojo;

/**
 *
 * @author Klaus
 */
public class Turma {
    
}


public class Aluno {
    
    private int ano;
    private int periodo;
    private String local;
    private String horario;
    private int numero_de_vagas;
    
    //Construtores
    public Aluno(int ano, int periodo, String local, String horario, int numero_de_vagas){
        this.ano = ano;
        this.periodo = periodo;
        this.local = local;
        this.horario = horario;
        this.numero_de_vagas = numero_de_vagas;
    }
    
    //Getters e Setters
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
    
}

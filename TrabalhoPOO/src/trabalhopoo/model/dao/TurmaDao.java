/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.model.dao;

import java.io.IOException;
import java.util.ArrayList;

import trabalhopoo.model.pojo.Turma;
/**
 *
 * @author Klaus
 */
interface InterfaceTurmaDaoImp {
    ArrayList<Turma> ler() throws IOException;
    void inserir (int ano, int periodo, String local, 
                String horario, int numero_de_vagas);
    boolean salvar(Turma turma) throws IOException; // salva no arquivo
    boolean salvar(ArrayList<Turma> lista) throws IOException; // salva no vetor	
}

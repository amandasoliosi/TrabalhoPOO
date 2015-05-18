/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.model.dao;

import java.io.IOException;
import java.util.ArrayList;
import trabalhopoo.model.pojo.Disciplina;
/**
 *
 * @author Amanda
 */
public interface DisciplinaDao{
    ArrayList<Disciplina> ler() throws IOException;
    Disciplina verificar (String nome);
    void inserir (String nome, String ementa, int cargaHoraria);
    boolean salvar(Disciplina dsciplina) throws IOException; // salva no arquivo
    boolean salvar(ArrayList<Disciplina> lista) throws IOException; // salva no vetor	
}


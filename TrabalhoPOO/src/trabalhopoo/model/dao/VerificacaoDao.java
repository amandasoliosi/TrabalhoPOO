/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.model.dao;

/**
 *
 * @author thamires
 */
public interface VerificacaoDao {
    public boolean verificarStringVazia(String string);
    public boolean verificarStringSoNumeros(String string);
    public boolean verificarCpf(String strCpf);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.model.pojo;

/**
 *
 * @author Amanda
 */
public class Disciplina {
    private String nome;
    private String ementa;
    private String codigo;
    private String cargaHoraria;

    public Disciplina(String nome, String ementa, String codigo, String cargaHoraria) {
        this.nome = nome;
        this.ementa = ementa;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ementa
     */
    public String getEmenta() {
        return ementa;
    }

    /**
     * @param ementa the ementa to set
     */
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
     /**
     * @return the ementa
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param ementa the ementa to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the cargaHoraria
     */
    public String getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}

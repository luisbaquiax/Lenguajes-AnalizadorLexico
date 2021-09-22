/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baquiax.analizadorlexico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis
 */
public class Token {

    private String tipo;
    private String valor;
    private int filaPosicion;
    private int columnaPosicion;

    private List<String> historial;

    private int veces;

    public Token() {
        this.historial = new ArrayList<>();
    }

    /**
     * Para la creación de un TOKEN
     *
     * @param tipo
     * @param valor
     * @param filaPosicion
     * @param columnaPosicion
     */
    public Token(String tipo, String valor, int filaPosicion, int columnaPosicion) {
        this.tipo = tipo;
        this.valor = valor;
        this.filaPosicion = filaPosicion;
        this.columnaPosicion = columnaPosicion;
        this.historial = new ArrayList<>();
    }

    public void agregarHistorial(int actual, int siguiente, char caracter) {
        String informacion = "Me moví del estado " + actual + " al estado " + siguiente + " con el caracter: " + caracter;
        this.getHistorial().add(informacion);
    }

    @Override
    public String toString() {
        return "Token{" + "tipo=" + getTipo() + ", valor=" + getValor() + ", \nfilaPosicion=" + getFilaPosicion() + ", columnaPosicion=" + getColumnaPosicion() + "}\n";
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the filaPosicion
     */
    public int getFilaPosicion() {
        return filaPosicion;
    }

    /**
     * @param filaPosicion the filaPosicion to set
     */
    public void setFilaPosicion(int filaPosicion) {
        this.filaPosicion = filaPosicion;
    }

    /**
     * @return the columnaPosicion
     */
    public int getColumnaPosicion() {
        return columnaPosicion;
    }

    /**
     * @param columnaPosicion the columnaPosicion to set
     */
    public void setColumnaPosicion(int columnaPosicion) {
        this.columnaPosicion = columnaPosicion;
    }

    /**
     * @return the historial
     */
    public List<String> getHistorial() {
        return historial;
    }

    /**
     * @param historial the historial to set
     */
    public void setHistorial(List<String> historial) {
        this.historial = historial;
    }

    /**
     * @return the veces
     */
    public int getVeces() {
        return veces;
    }

    /**
     * @param veces the veces to set
     */
    public void setVeces(int veces) {
        this.veces = veces;
    }

}

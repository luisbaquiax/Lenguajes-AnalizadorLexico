/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baquiax.analizadorlexico;

/**
 *
 * @author luis
 */
public class CadenaError {

    private String valorError;
    private int fila;
    private int columan;
    private String descripcion;

    public CadenaError() {
    }

    public CadenaError(String valorError, int fila, int columan) {
        this.valorError = valorError;
        this.fila = fila;
        this.columan = columan;
        this.descripcion = "";
    }

    @Override
    public String toString() {
        return "CadenaError{" + "valorError=" + valorError + ", fila=" + fila + ", columan=" + columan + ", descripcion=" + descripcion + '}';
    }

    /**
     * @return the valorError
     */
    public String getValorError() {
        return valorError;
    }

    /**
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @return the columan
     */
    public int getColuman() {
        return columan;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}

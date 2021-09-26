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

    public CadenaError() {
    }

    public CadenaError(String valorError, int fila, int columan) {
        this.valorError = valorError;
        this.fila = fila;
        this.columan = columan;
    }

    @Override
    public String toString() {
        return "CadenaError{" + "valorError=" + valorError + ", fila=" + fila + ", columan=" + columan + '}';
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

}

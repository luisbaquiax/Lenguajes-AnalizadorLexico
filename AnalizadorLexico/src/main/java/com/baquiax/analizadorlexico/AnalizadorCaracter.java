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
public class AnalizadorCaracter {

    public AnalizadorCaracter() {
    }

    public int getPosicionCaracter(char caracter) {
        int posicion = -1;

        if (esLetra(caracter)) {
            posicion = 0;
        }
        if (esDigito(caracter)) {
            posicion = 1;
        }
        if (caracter == '.') {
            posicion = 2;
        }
        if (caracter == ',') {
            posicion = 3;
        }
        if (caracter == ';') {
            posicion = 4;
        }
        if (caracter == ':') {
            posicion = 5;
        }
        if (caracter == '+') {
            posicion = 6;
        }
        if (caracter == '-') {
            posicion = 7;
        }
        if (caracter == '*') {
            posicion = 8;
        }
        if (caracter == '/') {
            posicion = 9;
        }
        if (caracter == '%') {
            posicion = 10;
        }
        if (caracter == '(') {
            posicion = 11;
        }
        if (caracter == ')') {
            posicion = 12;
        }
        if (caracter == '{') {
            posicion = 13;
        }
        if (caracter == '}') {
            posicion = 14;
        }
        if (caracter == '[') {
            posicion = 15;
        }
        if (caracter == ']') {
            posicion = 16;
        }
        return posicion;
    }

    /**
     * Verifica se el caraceter es una letra
     *
     * @param caracter
     * @return
     */
    public boolean esLetra(char caracter) {
        for (char letra : AFD.LETRAS.toCharArray()) {
            if (String.valueOf(letra).equalsIgnoreCase(String.valueOf(caracter))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si el caraceter es un signo de agrupación
     *
     * @param caracter
     * @return
     */
    public boolean esSignoAgrupacion(String caracter) {
        for (char letra : AFD.SIGNOS_AGRUPACION.toCharArray()) {
            if (String.valueOf(letra).equalsIgnoreCase(caracter)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si el caraceter es un signo de puntuación
     *
     * @param caracter
     * @return
     */
    public boolean esSignoPuntuacion(String caracter) {
        for (char letra : AFD.SIGINOS_PUNTUACION.toCharArray()) {
            if (String.valueOf(letra).equalsIgnoreCase(caracter)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si el caraceter es un signo de puntuación
     *
     * @param caracter
     * @return
     */
    public boolean esOperador(String caracter) {
        for (char letra : AFD.OPERADORES.toCharArray()) {
            if (String.valueOf(letra).equalsIgnoreCase(caracter)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si el caraceter es un digito
     *
     * @param caracter
     * @return
     */
    public boolean esDigito(char caracter) {
        return (Character.isDigit(caracter));
    }

    /**
     * Verifica si el caraceter está definido en el alfabeto
     *
     * @param caracter
     * @return
     */
    public boolean caracterPermitido(char caracter) {
        for (char c : AFD.ALFABETO.toCharArray()) {
            if (String.valueOf(c).equalsIgnoreCase(String.valueOf(caracter))) {
                return true;
            }
        }
        return false;
    }
}

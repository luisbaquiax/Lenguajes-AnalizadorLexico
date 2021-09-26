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

    public boolean esLetra(char caracter) {
        for (char letra : AFD.ALFABETO.toCharArray()) {
            if (String.valueOf(letra).equalsIgnoreCase(String.valueOf(caracter))) {
                return true;
            }
        }
        return false;
    }

    public boolean esDigito(char caracter) {
        return (Character.isDigit(caracter));
    }

    public boolean caracterPermitido(char caracter) {
        for (char c : AFD.ALFABETO.toCharArray()) {
            if (String.valueOf(c).equalsIgnoreCase(String.valueOf(caracter))) {
                return true;
            }
        }
        return false;
    }
}

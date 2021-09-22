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
public class AFD {

    public static final String LETRAS = "abcdefghijklmnopqrstuvwxyz";
    public static final String DIGITOS = "0123456789";
    public static final String SIGNOS_AGRUPACION = "(){}[]";
    public static final String SIGINOS_PUNTUACION = ".,;:";
    public static final String OPERADORES = "+-*/%";
    public static final String ALFABETO = "abcdefghijklmnopqrstuvwxyz0123456789(){}[].,;:+-*/%;";
    public static final int[] ESTADOS = new int[]{0, 1, 2, 3, 4, 5};
    public static final int[] ESTADOS_ACEPTACION = new int[]{1, 2, 3, 5};
    public static final int ESTADO_ERROR = -1;
    public static final int S0 = 0;
    public static final int S1 = 1;
    public static final int S2 = 2;
    public static final int S3 = 3;
    public static final int S4 = 4;
    public static final int S5 = 5;

    public int[][] matrizTransicion;

    public AFD() {
        inicializarMatrizTransicion();
    }

    private void inicializarMatrizTransicion() {
        //filas representan el alfabeto
        //columnas representa lo estados
        this.matrizTransicion = new int[][]{
            {1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
            {1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, 2, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
            {-1, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}
        };
    }

    public int[][] getMatrizTransicion() {
        return this.matrizTransicion;
    }

}

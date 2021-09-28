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
public class AnalizadorLexico {

    private AFD automata;
    private List<Token> tokens;
    private AnalizadorCaracter analizadorCaracter;
    private AnalizaEstados analizaEstados;
    private int estadoActual;
    private int posicion;
    private int fila;
    private int columna;
    private List<CadenaError> listCadenaErrors;

    public AnalizadorLexico() {
        this.automata = new AFD();
        this.analizadorCaracter = new AnalizadorCaracter();
        this.analizaEstados = new AnalizaEstados();
        this.tokens = new ArrayList<>();
        this.listCadenaErrors = new ArrayList<>();
        this.fila = 1;
        this.columna = 1;
    }

    public void analizarTexto(String cadena) {

        System.out.println("Cadena " + cadena);
        while (posicion < cadena.length()) {
            getToken(cadena);
        }
    }

    public void getToken(String palabra) {
        estadoActual = 0;
        boolean continuar = true;
        char tmp;
        String token = "";
        Token nuevoToken = new Token();

        while ((continuar) && (posicion < palabra.length())) {
            if ((palabra.charAt(posicion) == '\n')) {
                this.fila++;
                this.columna = 0;
            }
            if (Character.isSpaceChar(tmp = palabra.charAt(posicion)) || (palabra.charAt(posicion) == '\n') || (estadoActual == AFD.ESTADO_ERROR)) {
                continuar = false;
            } else {
                if (estadoActual >= 0) {
                    if (estadoActual == AFD.S3) {
                        break;
                    } else {
                        int estadoTemporal = siguienteEstado(estadoActual, tmp);
                        nuevoToken.agregarHistorial(estadoActual, estadoTemporal, tmp);
                        token += tmp;
                        estadoActual = estadoTemporal;
                    }
                } else {
                    estadoActual = 0;
                }
            }
            this.columna++;
            posicion++;
        }
        if (analizaEstados.estadoAceptado(estadoActual)) {
            agregarNuevoToken(nuevoToken, token);
//            System.out.println("*********Termino en el estado " + this.analizaEstados.tipoTokenSegunEstado(estadoActual) + " token actual : " + token);
        } else if (estadoActual == AFD.ESTADO_ERROR) {
            posicion--;
            CadenaError cadenaError = new CadenaError(token, fila, columna - 1);
            this.listCadenaErrors.add(cadenaError);
        }
    }

    private void agregarNuevoToken(Token nuevoToken, String token) {
        nuevoToken.setTipo(this.analizaEstados.tipoTokenSegunEstado(estadoActual));
        nuevoToken.setValor(token);
        nuevoToken.setFilaPosicion(fila);
        nuevoToken.setColumnaPosicion(columna);
        this.tokens.add(nuevoToken);
    }

    private int siguienteEstado(int estadoActual, char caracter) {
        int estadoSiguiente = -1;
        if (analizadorCaracter.getPosicionCaracter(caracter) >= 0
                && (analizadorCaracter.getPosicionCaracter(caracter) < automata.getMatrizTransicion()[0].length)) {
            estadoSiguiente = this.automata.getMatrizTransicion()[estadoActual][this.analizadorCaracter.getPosicionCaracter(caracter)];
        }
        return estadoSiguiente;
    }

    /**
     * Verifica si el identificador tiene dos LL o dos ÑÑ o dos RR seguidas en
     * la cadena que se le envía por parámetro
     *
     * @param identificador
     * @return
     */
    public boolean tieneDosLoRoUnaÑSeguidas(String identificador) {
        for (int i = 0; i < (identificador.length() - 1); i++) {
            if (((String.valueOf(identificador.charAt(i)).equalsIgnoreCase("l")) && ((String.valueOf(identificador.charAt(i + 1)).equalsIgnoreCase("l"))))
                    || (contieneEñe(identificador))
                    || ((String.valueOf(identificador.charAt(i)).equalsIgnoreCase("r")) && ((String.valueOf(identificador.charAt(i + 1)).equalsIgnoreCase("r"))))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si el identificador tiene eñe
     *
     * @param identificador
     * @return
     */
    public boolean contieneEñe(String identificador) {
        for (char caracter : identificador.toCharArray()) {
            if (String.valueOf(caracter).equalsIgnoreCase("ñ")) {
                return true;
            }
        }
        return false;
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public List<CadenaError> getListCadenaErrors() {
        return listCadenaErrors;
    }
}

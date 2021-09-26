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
public class AnalizaEstados {

    private String[] estados;

    public AnalizaEstados() {
        this.estados = new String[]{
            "ERROR",
            "IDENTIFICADOR",
            "NUMERO ENTERO",
            "SIMBOLO",
            "ERROR",
            "NUMERO DECIMAL"
        };
    }

    public boolean estadoAceptado(int estadoActual) {
        for (int estado : AFD.ESTADOS_ACEPTACION) {
            if (estado == estadoActual) {
                return true;
            }
        }
        return false;
    }
    
    public String tipoTokenSegunEstado(int estadoActual) {
        String tipo = "";
        switch (estadoActual) {
            case -1:
                tipo = "NO EXISTE TRANSICIÓN";
                break;
            case 0:
                tipo = this.estados[0];
                break;
            case 1:
                tipo = this.estados[1];
                break;
            case 2:
                tipo = this.estados[2];
                break;
            case 3:
                tipo = this.estados[3];
                break;
            case 4:
                tipo = this.estados[4];
                break;
            case 5:
                tipo = this.estados[5];
                break;
            default:
        }
        return tipo;
    }
}

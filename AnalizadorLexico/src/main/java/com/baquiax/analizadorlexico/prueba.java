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
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnalizadorLexico a = new AnalizadorLexico();
        a.analizarTexto("22 33.abacc .  [][][][]{}{}  3. a}   .....  3a 3.a}           a ann 3.3\nque tal 1.0 0.2 0..");
    }
}

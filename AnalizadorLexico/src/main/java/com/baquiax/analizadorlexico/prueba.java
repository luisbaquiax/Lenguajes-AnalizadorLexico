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
        a.analizarTexto("holañ 12 . 32.0 \n"
                + "12. 3.0 [][[] }}}}[]{} a} a . } \n"
                + "hol qu etal 3.0 0.0 0 21.  a");
    }
    
}

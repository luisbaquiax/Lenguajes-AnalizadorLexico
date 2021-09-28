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
public class ManejadorReportes {

    private AnalizadorLexico analizadorLexico;

    public ManejadorReportes(AnalizadorLexico analizadorLexico) {
        this.analizadorLexico = analizadorLexico;
    }

    public List<Token> listConteoLexemas() {
        reinicarRepeticion();
        List<Token> listLexemas = new ArrayList<>();
        for (Token tokenAux : this.analizadorLexico.getTokens()) {
            if (!existeLexema(tokenAux, listLexemas)) {
                listLexemas.add(tokenAux);
            }
        }

        for (Token token1 : listLexemas) {
            for (Token token : this.analizadorLexico.getTokens()) {
                if (token.getValor().equals(token1.getValor())) {
                    token1.setVeces(1);
                }
            }
        }
        return listLexemas;
    }

    public List<Token> listConteoTipoTokens() {
        reinicarRepeticion();
        List<Token> listLexemas = new ArrayList<>();
        this.analizadorLexico.getTokens().stream().filter(tokenAux -> (!existeTipoToken(tokenAux, listLexemas))).forEachOrdered(tokenAux -> {
            listLexemas.add(tokenAux);
        });

        listLexemas.forEach(token1 -> {
            for (Token token : this.analizadorLexico.getTokens()) {
                if (token.getTipo().equals(token1.getTipo())) {
                    token1.setVeces(1);
                }
            }
        });
        return listLexemas;
    }

    private boolean existeLexema(Token lexema, List<Token> tokens) {
        for (Token a : tokens) {
            if ((a.getValor().equals(lexema.getValor()))) {
                return true;
            }
        }
        return false;
    }

    private boolean existeTipoToken(Token lexema, List<Token> tokens) {
        for (Token a : tokens) {
            if ((a.getTipo().equals(lexema.getTipo()))) {
                return true;
            }
        }
        return false;
    }

    private void reinicarRepeticion() {
        for (Token s : this.analizadorLexico.getTokens()) {
            s.reinicarVeces(0);
        }
    }
}

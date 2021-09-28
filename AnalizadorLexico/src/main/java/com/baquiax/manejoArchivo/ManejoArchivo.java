/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baquiax.manejoArchivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class ManejoArchivo {

    private JFileChooser choser;
    public static final String FILTRO = ".txt";

    public ManejoArchivo() {
    }

    /**
     * Obtiene el path absoluto donde se guardará un nuevo archivo de texto
     *
     * @return
     */
    public String pathChoserSave() {
        choser = new JFileChooser();
        choser.setAcceptAllFileFilterUsed(false);
        int seleccionado = choser.showSaveDialog(null);
        if (seleccionado == APPROVE_OPTION) {
            return (choser.getSelectedFile().getAbsolutePath());
        }
        return null;
    }

    /**
     * Obtiene el path absoluto un archivo de texto
     *
     * @return
     */
    public String pathChoserOpen() {
        choser = new JFileChooser();
        choser.setAcceptAllFileFilterUsed(false);
        int seleccionado = choser.showOpenDialog(null);
        if (seleccionado == APPROVE_OPTION) {
            return (choser.getSelectedFile().getAbsolutePath());
        }
        return null;
    }

    /**
     * Escribe un archivo de texto en la ruta especificada
     *
     * @param ruta
     * @param contenido
     */
    public void escribirArchivodeTexto(String ruta, String contenido) {
        try {
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter escribeArchivo = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(escribeArchivo);
            bw.write(contenido);
            bw.close();
            JOptionPane.showMessageDialog(null, "Guardado con éxito!!");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo");
        }
    }

    /**
     * Devuelve la información contenida en el archivo de texto
     *
     * @param path
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public String leerArchivo(String path) throws FileNotFoundException, IOException {
        File archivo = new File(path);
        FileReader leerArchivo = new FileReader(archivo.getAbsoluteFile());
        BufferedReader leyendo = new BufferedReader(leerArchivo);//para leer linea por linea
        String linea = "";
        String inf = "";
        while (leyendo.ready()) {
            linea = leyendo.readLine();
            inf += linea + "\n";
        }
        return inf;
    }
}

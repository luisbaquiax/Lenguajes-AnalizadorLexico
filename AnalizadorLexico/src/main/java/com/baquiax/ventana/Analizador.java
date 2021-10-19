/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baquiax.ventana;

import com.baquiax.analizadorlexico.AnalizadorLexico;
import com.baquiax.manejoArchivo.ManejoArchivo;
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;

/**
 *
 * @author luis
 */
public class Analizador extends javax.swing.JFrame {

    private AnalizadorLexico analizadorLexico;
    private ManejoArchivo manejoArchivo;
    private String path;

    //lineas
    private PanelLinea panelLinea;

    /**
     * Creates new form Analizador
     */
    public Analizador() {
        initComponents();
        //ponerFilaColumanCursor();
        this.manejoArchivo = new ManejoArchivo();
        this.path = "";
        jPanel1.setLayout(new BorderLayout());
        panelLinea = new PanelLinea(labelFilaColumna);
        jPanel1.add(panelLinea, BorderLayout.WEST);
        jPanel1.add(panelLinea.scrollPane, BorderLayout.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelContenedor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelFilaColumna = new javax.swing.JLabel();
        jTabbedEditor = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        txtAnalizar = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuAbrirArchivo = new javax.swing.JMenuItem();
        menuGuardarComo = new javax.swing.JMenuItem();
        menuGuardarCambios = new javax.swing.JMenu();
        menuReportes = new javax.swing.JMenu();
        menuReporteErrores = new javax.swing.JMenuItem();
        menuReporteTokens = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelFilaColumna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFilaColumna.setText("Fila-columna");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1415, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jTabbedEditor.addTab("Edición", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedEditor)
                .addContainerGap())
            .addComponent(labelFilaColumna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedEditor, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(labelFilaColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jToolBar1.setRollover(true);
        jToolBar1.add(txtBuscar);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBuscar);

        jToolBar2.setRollover(true);

        txtAnalizar.setText("Analizar texto");
        txtAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnalizarActionPerformed(evt);
            }
        });
        jToolBar2.add(txtAnalizar);

        jToolBar3.setRollover(true);

        javax.swing.GroupLayout jpanelContenedorLayout = new javax.swing.GroupLayout(jpanelContenedor);
        jpanelContenedor.setLayout(jpanelContenedorLayout);
        jpanelContenedorLayout.setHorizontalGroup(
            jpanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelContenedorLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelContenedorLayout.setVerticalGroup(
            jpanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelContenedorLayout.createSequentialGroup()
                .addGroup(jpanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        menuFile.setText("File");

        menuAbrirArchivo.setText("Abrir archivo");
        menuAbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirArchivoActionPerformed(evt);
            }
        });
        menuFile.add(menuAbrirArchivo);

        menuGuardarComo.setText("Guardar como");
        menuGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarComoActionPerformed(evt);
            }
        });
        menuFile.add(menuGuardarComo);

        jMenuBar1.add(menuFile);

        menuGuardarCambios.setText("Guardar cambios");
        menuGuardarCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuGuardarCambiosMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuGuardarCambios);

        menuReportes.setText("Reportes");

        menuReporteErrores.setText("Reporte de errores");
        menuReporteErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReporteErroresActionPerformed(evt);
            }
        });
        menuReportes.add(menuReporteErrores);

        menuReporteTokens.setText("Reporte tokens");
        menuReporteTokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReporteTokensActionPerformed(evt);
            }
        });
        menuReportes.add(menuReporteTokens);

        jMenuBar1.add(menuReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        //PalabrasFiltradas p = new PalabrasFiltradas(this.txtBuscar.getText(), this.txtTexto);
        // p.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void menuReporteErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReporteErroresActionPerformed
        // TODO add your handling code here:
        this.analizadorLexico.analizarTexto(this.panelLinea.pane.getText());
        ReporteErrores re = new ReporteErrores(this.analizadorLexico, this);
        re.setVisible(true);
        super.setVisible(false);
    }//GEN-LAST:event_menuReporteErroresActionPerformed

    private void menuReporteTokensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReporteTokensActionPerformed
        // TODO add your handling code here:
        if (analizadorLexico.getListCadenaErrors().isEmpty()) {
            this.analizadorLexico.analizarTexto(this.panelLinea.pane.getText());
            ReporteTokens to = new ReporteTokens(this.analizadorLexico, this);
            to.setVisible(true);
            super.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Debes corregir los errores y luego analizar nuevamente el texto.");
        }

    }//GEN-LAST:event_menuReporteTokensActionPerformed

    private void txtAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnalizarActionPerformed
        // TODO add your handling code here:
        this.analizadorLexico = new AnalizadorLexico();
        this.analizadorLexico.analizarTexto(this.panelLinea.pane.getText());

    }//GEN-LAST:event_txtAnalizarActionPerformed

    private void menuAbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirArchivoActionPerformed
        try {
            // TODO add your handling code here:
            this.path = this.manejoArchivo.pathChoserOpen();
            this.panelLinea.pane.setText(manejoArchivo.leerArchivo(path));
            jTabbedEditor.setTitleAt(0, this.path);
        } catch (IOException ex) {
            System.out.println("No se pudo abrir el archivo" + ex.getMessage());
        }
    }//GEN-LAST:event_menuAbrirArchivoActionPerformed

    private void menuGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarComoActionPerformed
        // TODO add your handling code here:
        String ruta = this.manejoArchivo.pathChoserSave();
        this.manejoArchivo.escribirArchivodeTexto(ruta, this.panelLinea.pane.getText());
    }//GEN-LAST:event_menuGuardarComoActionPerformed

    private void menuGuardarCambiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGuardarCambiosMouseClicked
        // TODO add your handling code here:
        guardarComo();
    }//GEN-LAST:event_menuGuardarCambiosMouseClicked

    private void guardarComo() {
        if ("".equals(path)) {
            String ruta = this.manejoArchivo.pathChoserSave();
            this.manejoArchivo.escribirArchivodeTexto(ruta, panelLinea.pane.getText());
        } else {
            this.manejoArchivo.escribirArchivodeTexto(path, panelLinea.pane.getText());
        }

    }

    /**
     * Pone la fila y columna en el que se encuentra el cursor
     */
//    private void ponerFilaColumanCursor() {
//        txtTexto.addCaretListener(new CaretListener() {
//            @Override
//            public void caretUpdate(CaretEvent e) {
//                //Devuelve la ubicación actual del símbolo de intercalación. 
//                int pos = e.getDot();
//                try {
//                    //se obtiene el numero de fila donde se encuentra el cursor
//                    int fila = txtTexto.getLineOfOffset(pos) + 1;
//                    //se obtiene la columna donde se encuentra el cursor
//                    int col = pos - txtTexto.getLineStartOffset(fila - 1) + 1;
//                    labelFilaColumna.setText("Fila: " + fila + " Columna: " + col);
//                } catch (BadLocationException exc) {
//                    System.out.println(exc);
//                }
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedEditor;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JPanel jpanelContenedor;
    private javax.swing.JLabel labelFilaColumna;
    private javax.swing.JMenuItem menuAbrirArchivo;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuGuardarCambios;
    private javax.swing.JMenuItem menuGuardarComo;
    private javax.swing.JMenuItem menuReporteErrores;
    private javax.swing.JMenuItem menuReporteTokens;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JButton txtAnalizar;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}

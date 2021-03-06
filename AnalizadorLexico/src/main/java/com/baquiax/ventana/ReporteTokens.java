/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baquiax.ventana;

import com.baquiax.analizadorlexico.AnalizadorLexico;
import com.baquiax.analizadorlexico.CadenaError;
import com.baquiax.analizadorlexico.Token;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luis
 */
public class ReporteTokens extends javax.swing.JFrame {

    private AnalizadorLexico analizadorLexico;
    private Analizador analizador;
    private DefaultTableModel model;
    private RecuentoTokens rt;
    private RecuentoLexeamas re;

    /**
     *
     * @param analizadorLexico
     * @param analizador
     */
    public ReporteTokens(AnalizadorLexico analizadorLexico, Analizador analizador) {
        initComponents();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.model = (DefaultTableModel) tablaTokens.getModel();
        this.analizadorLexico = analizadorLexico;
        this.analizador = analizador;
        llenarTabla();
        this.rt = new RecuentoTokens(analizadorLexico, this);
        this.re = new RecuentoLexeamas(analizadorLexico, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTokens = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        btnRecuentoLexemas = new javax.swing.JButton();
        btnRecuentoToknes = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Lexama-valor", "Fila-columna"
            }
        ));
        tablaTokens.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaTokens);

        btnRegresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnRecuentoLexemas.setText("Recuento de lexemas");
        btnRecuentoLexemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuentoLexemasActionPerformed(evt);
            }
        });

        btnRecuentoToknes.setText("Recuento de tokens");
        btnRecuentoToknes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuentoToknesActionPerformed(evt);
            }
        });

        btnHistorial.setText("Ver historial del token");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRecuentoLexemas)
                .addGap(18, 18, 18)
                .addComponent(btnRecuentoToknes)
                .addGap(181, 181, 181)
                .addComponent(btnHistorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecuentoLexemas)
                    .addComponent(btnRegresar)
                    .addComponent(btnRecuentoToknes)
                    .addComponent(btnHistorial))
                .addContainerGap())
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de tokens:");

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1252, Short.MAX_VALUE)
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.analizador.setVisible(true);
        super.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRecuentoLexemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuentoLexemasActionPerformed
        // TODO add your handling code here:
        this.re.setVisible(true);
        super.setVisible(false);
    }//GEN-LAST:event_btnRecuentoLexemasActionPerformed

    private void btnRecuentoToknesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuentoToknesActionPerformed
        // TODO add your handling code here:
        this.rt.setVisible(true);
        super.setVisible(false);
    }//GEN-LAST:event_btnRecuentoToknesActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        // TODO add your handling code here:
        int fila = this.tablaTokens.getSelectedRow();
        if (fila >= 0) {
            System.out.println(fila);
            String lexemaValor = String.valueOf(this.model.getValueAt(fila, 1));

            HistorialToken hi = new HistorialToken(buscarToken(lexemaValor), this);
            hi.setVisible(true);
            super.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar o clickear sobre la fila para ver el historial del token");
        }
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void llenarTabla() {
        for (Token token : this.analizadorLexico.getTokens()) {
            String[] datos = {
                token.getTipo(),
                token.getValor() + "",
                token.getFilaPosicion() + "-" + token.getColumnaPosicion()
            };
            model.addRow(datos);
        }
    }

    private Token buscarToken(String valor) {
        for (Token t : this.analizadorLexico.getTokens()) {
            if (t.getValor().equals(valor)) {
                return t;
            }
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnRecuentoLexemas;
    private javax.swing.JButton btnRecuentoToknes;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTokens;
    // End of variables declaration//GEN-END:variables
}

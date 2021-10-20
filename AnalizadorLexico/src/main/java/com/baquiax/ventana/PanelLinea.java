package com.baquiax.ventana;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.Document;

/**
 *
 * @author luis
 */
public class PanelLinea extends JPanel {

    private JTextPane pane;
    private JScrollPane scrollPane;

    public PanelLinea() {
        super();
        setMinimumSize(new Dimension(30, 30));
        setPreferredSize(new Dimension(30, 30));
        setMinimumSize(new Dimension(30, 30));

        pane = new JTextPane() { // se necesita pintar las lineas en el panel 
            public void paint(Graphics g) {
                super.paint(g);
                PanelLinea.this.repaint();
            }
        };
        scrollPane = new JScrollPane(pane);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int incio
                = pane.viewToModel(scrollPane.getViewport().getViewPosition());
        int fin
                = pane.viewToModel(new Point(scrollPane.getViewport().getViewPosition().x
                        + pane.getWidth(),
                        scrollPane.getViewport().getViewPosition().y
                        + pane.getHeight()));
        Document doc = pane.getDocument();
        int startline = doc.getDefaultRootElement().getElementIndex(incio);
        int endline = doc.getDefaultRootElement().getElementIndex(fin) + 1; //pinta la linea numero 1
        int fontHeight = g.getFontMetrics(pane.getFont()).getHeight();	// fuente
        for (int line = startline, y = 0; line <= endline; line++, y += fontHeight) {
            g.drawString(Integer.toString(line), 0, y);
        }
    }

    public JTextPane getPane() {
        return pane;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

}

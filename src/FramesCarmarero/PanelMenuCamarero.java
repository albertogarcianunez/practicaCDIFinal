/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesCarmarero;

import java.awt.BorderLayout;

/**
 *
 * @author Manu
 */
public class PanelMenuCamarero extends javax.swing.JPanel {

    /**
     * Creates new form PanelMenuCamarero
     */
    public PanelMenuCamarero() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonEstadoRestaurante = new javax.swing.JButton();
        botonModificarCarta = new javax.swing.JButton();
        imagenEditarCarta = new javax.swing.JLabel();
        imagenEstadoRestaurante = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1080, 72067));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setLayout(null);

        botonEstadoRestaurante.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonEstadoRestaurante.setText("Estado del Restaurante");
        botonEstadoRestaurante.setMaximumSize(new java.awt.Dimension(550, 150));
        botonEstadoRestaurante.setMinimumSize(new java.awt.Dimension(550, 150));
        botonEstadoRestaurante.setPreferredSize(new java.awt.Dimension(550, 150));
        botonEstadoRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstadoRestauranteActionPerformed(evt);
            }
        });
        add(botonEstadoRestaurante);
        botonEstadoRestaurante.setBounds(333, 170, 550, 150);

        botonModificarCarta.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonModificarCarta.setText("Modificar Carta");
        botonModificarCarta.setMaximumSize(new java.awt.Dimension(550, 150));
        botonModificarCarta.setMinimumSize(new java.awt.Dimension(550, 150));
        botonModificarCarta.setPreferredSize(new java.awt.Dimension(550, 150));
        botonModificarCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarCartaActionPerformed(evt);
            }
        });
        add(botonModificarCarta);
        botonModificarCarta.setBounds(333, 391, 550, 150);

        imagenEditarCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesCarmarero/imagenes/imagenEditarCarta.png"))); // NOI18N
        add(imagenEditarCarta);
        imagenEditarCarta.setBounds(171, 391, 125, 146);

        imagenEstadoRestaurante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesCarmarero/imagenes/imagenEstadoRestaurante.png"))); // NOI18N
        add(imagenEstadoRestaurante);
        imagenEstadoRestaurante.setBounds(182, 198, 100, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesCarmarero/imagenes/fondoCamareros 2.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1130, 710);
    }// </editor-fold>//GEN-END:initComponents

    private void botonEstadoRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstadoRestauranteActionPerformed
        // TODO add your handling code here:
        PanelEstadoRestaurante p = new PanelEstadoRestaurante();
	p.setSize(1080, 720);
	p.setLocation(0, 0);
		
	this.removeAll();
	this.add(p, BorderLayout.CENTER);
	this.revalidate();
	this.repaint();
    }//GEN-LAST:event_botonEstadoRestauranteActionPerformed

    private void botonModificarCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarCartaActionPerformed
        // TODO add imagenEstadoRestaurantendling code here:
        PanelModificarCarta p = new PanelModificarCarta();
	p.setSize(1080, 720);
	p.setLocation(0, 0);
		
	this.removeAll();
	this.add(p, BorderLayout.CENTER);
	this.revalidate();
	this.repaint();
    }//GEN-LAST:event_botonModificarCartaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEstadoRestaurante;
    private javax.swing.JButton botonModificarCarta;
    private javax.swing.JLabel imagenEditarCarta;
    private javax.swing.JLabel imagenEstadoRestaurante;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

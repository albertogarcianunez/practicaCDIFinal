/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesCliente;

import java.awt.BorderLayout;

/**
 *
 * @author Alber
 */
public class PanelInicio extends javax.swing.JPanel {

    /**
     * Creates new form panelInicio
     */
    public PanelInicio() {
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

        hacerPedido = new javax.swing.JButton();
        configMesa = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1080, 720));

        hacerPedido.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        hacerPedido.setText("Hacer Pedido");
        hacerPedido.setMaximumSize(new java.awt.Dimension(550, 150));
        hacerPedido.setMinimumSize(new java.awt.Dimension(550, 150));
        hacerPedido.setPreferredSize(new java.awt.Dimension(550, 150));
        hacerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hacerPedidoActionPerformed(evt);
            }
        });

        configMesa.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        configMesa.setText("Configurar Mesa");
        configMesa.setMaximumSize(new java.awt.Dimension(550, 150));
        configMesa.setMinimumSize(new java.awt.Dimension(550, 150));
        configMesa.setPreferredSize(new java.awt.Dimension(550, 150));
        configMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                configMesaMouseClicked(evt);
            }
        });
        configMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configMesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(configMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hacerPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(hacerPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(configMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void configMesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configMesaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_configMesaMouseClicked

    private void configMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configMesaActionPerformed
        // TODO add your handling code here:
        PanelMesa p = new PanelMesa();
        p.setSize(1080, 720);
        p.setLocation(0, 0);

        this.removeAll();
        this.add(p, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_configMesaActionPerformed

    private void hacerPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hacerPedidoActionPerformed
        // TODO add your handling code here:
		PanelPedido p = new PanelPedido();
        p.setSize(1080, 720);
        p.setLocation(0, 0);

        this.removeAll();
        this.add(p, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_hacerPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton configMesa;
    private javax.swing.JButton hacerPedido;
    // End of variables declaration//GEN-END:variables
}

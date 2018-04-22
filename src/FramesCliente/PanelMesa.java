/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesCliente;

import java.awt.BorderLayout;
import javax.swing.JLabel;

/**
 *
 * @author Alber
 */
public class PanelMesa extends javax.swing.JPanel {

    /**
     * Creates new form PanelMesa
     */
    private int altura = 60;
    private int temperatura = 15;
    private int plato = 0;
    
    public PanelMesa() {
        initComponents();
        if (FramePrincipal.getPlato() == 0){
            botonCambioPlato.setEnabled(false);
        }
        else if (FramePrincipal.getPlato() == 1){
            botonCambioPlato.setEnabled(true);
            botonCambioPlato.setText("Pasar al segundo plato");
        }
        else if (FramePrincipal.getPlato() == 2){
            botonCambioPlato.setEnabled(true);
            botonCambioPlato.setText("Pasar al postre");
        }
        else if (FramePrincipal.getPlato() == 3){
            botonCambioPlato.setEnabled(true);
            botonCambioPlato.setText("Fin Comida");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        subirAltura = new javax.swing.JButton();
        bajarAltura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numAltura = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        botonInformacion = new javax.swing.JButton();
        botonCubiertos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        botonCambioPlato = new javax.swing.JButton();
        panelTemperatura = new javax.swing.JPanel();
        labelTemperatura = new javax.swing.JLabel();
        labelControlartemperatura = new javax.swing.JLabel();
        labelGrados = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        botonPedirBebida = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        botonCambioVaso = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(100, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 400));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 400));

        subirAltura.setBackground(new java.awt.Color(204, 255, 255));
        subirAltura.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        subirAltura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesCliente/imagenes/configuracionMesa/imagenFlechaArriba.png"))); // NOI18N
        subirAltura.setMaximumSize(new java.awt.Dimension(95, 95));
        subirAltura.setMinimumSize(new java.awt.Dimension(95, 95));
        subirAltura.setOpaque(false);
        subirAltura.setPreferredSize(new java.awt.Dimension(95, 95));
        subirAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirAlturaActionPerformed(evt);
            }
        });

        bajarAltura.setBackground(new java.awt.Color(204, 255, 255));
        bajarAltura.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bajarAltura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesCliente/imagenes/configuracionMesa/imagenFlechaAbajo.png"))); // NOI18N
        bajarAltura.setBorderPainted(false);
        bajarAltura.setMaximumSize(new java.awt.Dimension(95, 95));
        bajarAltura.setMinimumSize(new java.awt.Dimension(95, 95));
        bajarAltura.setOpaque(false);
        bajarAltura.setPreferredSize(new java.awt.Dimension(95, 95));
        bajarAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajarAlturaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Altura");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        numAltura.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        numAltura.setText("60");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("cm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bajarAltura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(subirAltura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numAltura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(subirAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numAltura)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addComponent(bajarAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1);
        jPanel1.setBounds(30, 170, 100, 400);

        botonVolver.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesCliente/imagenes/Volver.png"))); // NOI18N
        botonVolver.setMaximumSize(new java.awt.Dimension(100, 75));
        botonVolver.setMinimumSize(new java.awt.Dimension(100, 75));
        botonVolver.setPreferredSize(new java.awt.Dimension(100, 75));
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        add(botonVolver);
        botonVolver.setBounds(30, 600, 100, 70);

        botonInformacion.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesCliente/imagenes/configuracionMesa/imagenInformacion.png"))); // NOI18N
        botonInformacion.setMaximumSize(new java.awt.Dimension(100, 100));
        botonInformacion.setMinimumSize(new java.awt.Dimension(100, 100));
        botonInformacion.setPreferredSize(new java.awt.Dimension(100, 100));
        botonInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInformacionActionPerformed(evt);
            }
        });
        add(botonInformacion);
        botonInformacion.setBounds(30, 30, 100, 100);

        botonCubiertos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonCubiertos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesCliente/imagenes/Cubierto.png"))); // NOI18N
        botonCubiertos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.black));
        botonCubiertos.setContentAreaFilled(false);
        botonCubiertos.setMaximumSize(new java.awt.Dimension(150, 456));
        botonCubiertos.setMinimumSize(new java.awt.Dimension(150, 456));
        botonCubiertos.setPreferredSize(new java.awt.Dimension(150, 456));
        botonCubiertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCubiertosActionPerformed(evt);
            }
        });
        add(botonCubiertos);
        botonCubiertos.setBounds(878, 234, 150, 456);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cambiar cubiertos");
        add(jLabel5);
        jLabel5.setBounds(880, 690, 150, 14);

        botonCambioPlato.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        botonCambioPlato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.black));
        botonCambioPlato.setContentAreaFilled(false);
        botonCambioPlato.setLabel("Pasar al siguiente plato");
        botonCambioPlato.setMaximumSize(new java.awt.Dimension(490, 225));
        botonCambioPlato.setMinimumSize(new java.awt.Dimension(490, 225));
        botonCambioPlato.setPreferredSize(new java.awt.Dimension(490, 225));
        botonCambioPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambioPlatoActionPerformed(evt);
            }
        });
        add(botonCambioPlato);
        botonCambioPlato.setBounds(260, 230, 490, 225);

        panelTemperatura.setMaximumSize(new java.awt.Dimension(490, 225));
        panelTemperatura.setMinimumSize(new java.awt.Dimension(490, 225));
        panelTemperatura.setOpaque(false);
        panelTemperatura.setPreferredSize(new java.awt.Dimension(490, 225));
        panelTemperatura.setLayout(null);

        labelTemperatura.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelTemperatura.setText("15");
        panelTemperatura.add(labelTemperatura);
        labelTemperatura.setBounds(237, 151, 14, 17);

        labelControlartemperatura.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelControlartemperatura.setText("Regular temperatura del plato");
        panelTemperatura.add(labelControlartemperatura);
        labelControlartemperatura.setBounds(96, 29, 313, 28);

        labelGrados.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelGrados.setText("º");
        panelTemperatura.add(labelGrados);
        labelGrados.setBounds(257, 151, 5, 17);

        jSlider1.setMaximum(35);
        jSlider1.setMinimum(15);
        jSlider1.setValue(15);
        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSlider1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jSlider1MouseDragged(evt);
            }
        });
        jSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSlider1MouseClicked(evt);
            }
        });
        panelTemperatura.add(jSlider1);
        jSlider1.setBounds(96, 86, 313, 47);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesCliente/imagenes/Plato Inferior.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(490, 225));
        jLabel4.setMinimumSize(new java.awt.Dimension(490, 225));
        jLabel4.setPreferredSize(new java.awt.Dimension(490, 225));
        panelTemperatura.add(jLabel4);
        jLabel4.setBounds(0, -10, 490, 230);

        add(panelTemperatura);
        panelTemperatura.setBounds(260, 460, 490, 225);

        botonPedirBebida.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        botonPedirBebida.setText("Pedir Bebida");
        botonPedirBebida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.black));
        botonPedirBebida.setContentAreaFilled(false);
        botonPedirBebida.setMaximumSize(new java.awt.Dimension(185, 90));
        botonPedirBebida.setMinimumSize(new java.awt.Dimension(185, 90));
        botonPedirBebida.setPreferredSize(new java.awt.Dimension(185, 90));
        botonPedirBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPedirBebidaActionPerformed(evt);
            }
        });
        add(botonPedirBebida);
        botonPedirBebida.setBounds(700, 30, 185, 90);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesCliente/imagenes/Plato superior.png"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(260, 240, 490, 220);

        botonCambioVaso.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        botonCambioVaso.setText("Solicitar Cambio de Vaso");
        botonCambioVaso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.black));
        botonCambioVaso.setContentAreaFilled(false);
        botonCambioVaso.setMaximumSize(new java.awt.Dimension(185, 90));
        botonCambioVaso.setMinimumSize(new java.awt.Dimension(185, 90));
        botonCambioVaso.setPreferredSize(new java.awt.Dimension(185, 90));
        botonCambioVaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambioVasoActionPerformed(evt);
            }
        });
        add(botonCambioVaso);
        botonCambioVaso.setBounds(700, 120, 185, 90);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesCliente/imagenes/Bebida.png"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(700, 30, 180, 181);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FramesCliente/imagenes/fondo azul_1.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1080, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void bajarAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajarAlturaActionPerformed
        // TODO add your handling code here:
        altura= altura - 1;
        String cadena = Integer.toString(altura);
        numAltura.setText(cadena);
          if(!subirAltura.isEnabled())
            subirAltura.setEnabled(true);
        if(altura<=50)
            bajarAltura.setEnabled(false);
        else
            bajarAltura.setEnabled(true);
    }//GEN-LAST:event_bajarAlturaActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
        PanelInicio p = new PanelInicio();
	p.setSize(1080, 720);
	p.setLocation(0, 0);
		
	this.removeAll();
	this.add(p, BorderLayout.CENTER);
	this.revalidate();
	this.repaint();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void subirAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirAlturaActionPerformed
        // TODO add your handling code here:
        altura= altura + 1;
        String cadena = Integer.toString(altura);
        numAltura.setText(cadena);
        if(!bajarAltura.isEnabled())
            bajarAltura.setEnabled(true);
        if(altura>=100)
            subirAltura.setEnabled(false);
        else
            subirAltura.setEnabled(true);
        
    }//GEN-LAST:event_subirAlturaActionPerformed

    private void botonInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInformacionActionPerformed
        // TODO add your handling code here:
        FrameInformacion f = new FrameInformacion();
        f.setSize(700, 360);
        f.setLocation(175, 100);
        f.setVisible(true);
    }//GEN-LAST:event_botonInformacionActionPerformed

    private void botonCambioVasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambioVasoActionPerformed
        // TODO add your handling code here:
        FrameCambiarVaso f = new FrameCambiarVaso();
        f.setSize(450, 200);
        f.setLocation(345, 200);
        f.setVisible(true);
    }//GEN-LAST:event_botonCambioVasoActionPerformed

    private void jSlider1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseClicked
        // TODO add your handling code here:
        temperatura = jSlider1.getValue();
        String cadena = Integer.toString(temperatura);
        labelTemperatura.setText(cadena);
    }//GEN-LAST:event_jSlider1MouseClicked

    private void jSlider1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseDragged
        // TODO add your handling code here:
        temperatura = jSlider1.getValue();
        String cadena = Integer.toString(temperatura);
        labelTemperatura.setText(cadena);
    }//GEN-LAST:event_jSlider1MouseDragged

    private void botonCambioPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambioPlatoActionPerformed
        // TODO add your handling code here:
        if (FramePrincipal.getPlato() == 1){
            FramePrincipal.setPlato(2);
            botonCambioPlato.setText("Pasar al postre");
        }
        else if (FramePrincipal.getPlato() == 2){
            FramePrincipal.setPlato(3);
            botonCambioPlato.setText("Fin Comida");
        }
        else if (FramePrincipal.getPlato() == 3){
            botonCambioPlato.setEnabled(true);
            PanelSobremesa p = new PanelSobremesa();
            p.setSize(1080, 720);
            p.setLocation(0, 0);
		
            this.removeAll();
            this.add(p, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
        }
    }//GEN-LAST:event_botonCambioPlatoActionPerformed

//<<<<<<< HEAD
    private void botonCubiertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCubiertosActionPerformed
        // TODO add your handling code here:
        FrameCambiarCubiertos f = new FrameCambiarCubiertos();
        f.setSize(375, 200);
        f.setLocation(345, 200);
        f.setVisible(true);
    }//GEN-LAST:event_botonCubiertosActionPerformed

//=======
    private void botonPedirBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPedirBebidaActionPerformed
        // TODO add your handling code here:
        FramePrincipal.setBebida(true);
//>>>>>>> refs/remotes/origin/master
    }//GEN-LAST:event_botonPedirBebidaActionPerformed

    public void activarBotonCambioPlato(){
        botonCambioPlato.setEnabled(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bajarAltura;
    private javax.swing.JButton botonCambioPlato;
    private javax.swing.JButton botonCambioVaso;
    private javax.swing.JButton botonCubiertos;
    private javax.swing.JButton botonInformacion;
    private javax.swing.JButton botonPedirBebida;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel labelControlartemperatura;
    private javax.swing.JLabel labelGrados;
    private javax.swing.JLabel labelTemperatura;
    private javax.swing.JLabel numAltura;
    private javax.swing.JPanel panelTemperatura;
    private javax.swing.JButton subirAltura;
    // End of variables declaration//GEN-END:variables
}

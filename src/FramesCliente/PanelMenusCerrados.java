/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FramesCliente;

import java.awt.BorderLayout;

/**
 *
 * @author bm0547
 */
public class PanelMenusCerrados extends javax.swing.JPanel {

	/**
	 * Creates new form PanelManusCerrados
	 */
        descripMenu des = new descripMenu();
         
	public PanelMenusCerrados() {
		initComponents();
                this.add(des, BorderLayout.CENTER);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesMenuCerrado = new javax.swing.ButtonGroup();
        primeroVegeta = new javax.swing.ButtonGroup();
        segundoVegeta = new javax.swing.ButtonGroup();
        postreVegeta = new javax.swing.ButtonGroup();
        primeroVegano = new javax.swing.ButtonGroup();
        segundoVegano = new javax.swing.ButtonGroup();
        postreVegano = new javax.swing.ButtonGroup();
        primeroGluten = new javax.swing.ButtonGroup();
        segundoGluten = new javax.swing.ButtonGroup();
        postreGluten = new javax.swing.ButtonGroup();
        botonVolver = new javax.swing.JButton();
        panelMenu1 = new javax.swing.JPanel();
        botonVegeta = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        bebida1 = new javax.swing.JCheckBox();
        panelMenu2 = new javax.swing.JPanel();
        botonVegano = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        bebida2 = new javax.swing.JCheckBox();
        panelMenu3 = new javax.swing.JPanel();
        botonGluten = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        bebida3 = new javax.swing.JCheckBox();
        botonConfirmarPedido = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        botonLimpiar = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));

        botonVolver.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        botonVolver.setText("Volver");
        botonVolver.setMaximumSize(new java.awt.Dimension(100, 75));
        botonVolver.setMinimumSize(new java.awt.Dimension(100, 75));
        botonVolver.setPreferredSize(new java.awt.Dimension(100, 75));
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        panelMenu1.setBackground(new java.awt.Color(204, 204, 255));
        panelMenu1.setMaximumSize(new java.awt.Dimension(280, 490));
        panelMenu1.setMinimumSize(new java.awt.Dimension(280, 490));
        panelMenu1.setPreferredSize(new java.awt.Dimension(280, 490));

        botonesMenuCerrado.add(botonVegeta);
        botonVegeta.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        botonVegeta.setText("        Vegetariano");
        botonVegeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVegetaActionPerformed(evt);
            }
        });

        jLabel1.setText("Primer plato:");

        primeroVegeta.add(jRadioButton4);
        jRadioButton4.setText("Tacos de lentejas");
		jRadioButton4.setActionCommand("Tacos de lentejas");
        jRadioButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton4.setOpaque(false);

        primeroVegeta.add(jRadioButton5);
        jRadioButton5.setText("Buñuelos de calabacín");
		jRadioButton5.setActionCommand("Buñuelos de calabacín");
        jRadioButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel2.setText("Segundo plato:");

        segundoVegeta.add(jRadioButton6);
        jRadioButton6.setText("Filetes de coliflor");
		jRadioButton6.setActionCommand("Filetes de coliflor");
        jRadioButton6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        segundoVegeta.add(jRadioButton7);
        jRadioButton7.setText("Pizza de queso de cabra");
		jRadioButton7.setActionCommand("Pizza de queso de cabra");
        jRadioButton7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel3.setText("Postres:");

        postreVegeta.add(jRadioButton8);
        jRadioButton8.setText("Helado de yogur de mora");
		jRadioButton8.setActionCommand("Helado de yogur de mora");
        jRadioButton8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        postreVegeta.add(jRadioButton9);
        jRadioButton9.setText("Brownie a la taza");
		jRadioButton9.setActionCommand("Brownie a la taza");
        jRadioButton9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        bebida1.setText("Bebida");

        javax.swing.GroupLayout panelMenu1Layout = new javax.swing.GroupLayout(panelMenu1);
        panelMenu1.setLayout(panelMenu1Layout);
        panelMenu1Layout.setHorizontalGroup(
            panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu1Layout.createSequentialGroup()
                .addGroup(panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenu1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonVegeta, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                    .addGroup(panelMenu1Layout.createSequentialGroup()
                        .addGroup(panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenu1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(bebida1)))
                            .addGroup(panelMenu1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton8)
                                    .addComponent(jRadioButton5)
                                    .addComponent(jRadioButton9))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelMenu1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenu1Layout.setVerticalGroup(
            panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonVegeta)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton9)
                .addGap(34, 34, 34)
                .addComponent(bebida1)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        panelMenu2.setBackground(new java.awt.Color(204, 204, 255));
        panelMenu2.setMaximumSize(new java.awt.Dimension(280, 490));
        panelMenu2.setMinimumSize(new java.awt.Dimension(280, 490));
        panelMenu2.setPreferredSize(new java.awt.Dimension(280, 490));

        botonesMenuCerrado.add(botonVegano);
        botonVegano.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        botonVegano.setText("             Vegano");
        botonVegano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVeganoActionPerformed(evt);
            }
        });

        jLabel4.setText("Primer plato:");

        primeroVegano.add(jRadioButton10);
        jRadioButton10.setText("Crema de verduras");
		jRadioButton10.setActionCommand("Crema de Verduras");
        jRadioButton10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton10.setOpaque(false);

        primeroVegano.add(jRadioButton11);
        jRadioButton11.setText("Ensalada de mijo");
		jRadioButton11.setActionCommand("Ensalada de mijo");
        jRadioButton11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel5.setText("Segundo plato:");

        segundoVegano.add(jRadioButton12);
        jRadioButton12.setText("Rollo de verduras");
		jRadioButton12.setActionCommand("Rollo de verduras");
        jRadioButton12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        segundoVegano.add(jRadioButton13);
        jRadioButton13.setText("Hamburguesa de quinoa y lentejas");
		jRadioButton13.setActionCommand("Hamburguesa de quinoa y lentejas");
        jRadioButton13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel6.setText("Postres:");

        postreVegano.add(jRadioButton14);
        jRadioButton14.setText("Napolitana salada");
		jRadioButton14.setActionCommand("Napolitana salada");
        jRadioButton14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        postreVegano.add(jRadioButton15);
        jRadioButton15.setText("Flan de chocolate vegano");
		jRadioButton15.setActionCommand("Flan de chocolate vegano");
        jRadioButton15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        bebida2.setText("Bebida");

        javax.swing.GroupLayout panelMenu2Layout = new javax.swing.GroupLayout(panelMenu2);
        panelMenu2.setLayout(panelMenu2Layout);
        panelMenu2Layout.setHorizontalGroup(
            panelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu2Layout.createSequentialGroup()
                .addGroup(panelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenu2Layout.createSequentialGroup()
                        .addGroup(panelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenu2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(panelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton13)
                                    .addComponent(jRadioButton12, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(panelMenu2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(panelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(bebida2))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelMenu2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonVegano, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addGroup(panelMenu2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(panelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton15)
                                    .addComponent(jRadioButton14))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(panelMenu2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenu2Layout.setVerticalGroup(
            panelMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonVegano)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton11)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton12)
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton15)
                .addGap(34, 34, 34)
                .addComponent(bebida2)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        panelMenu3.setBackground(new java.awt.Color(204, 204, 255));
        panelMenu3.setMaximumSize(new java.awt.Dimension(280, 490));
        panelMenu3.setMinimumSize(new java.awt.Dimension(280, 490));
        panelMenu3.setPreferredSize(new java.awt.Dimension(280, 490));

        botonesMenuCerrado.add(botonGluten);
        botonGluten.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        botonGluten.setText("           Sin gluten");
        botonGluten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGlutenActionPerformed(evt);
            }
        });

        jLabel7.setText("Primer plato:");

        segundoGluten.add(jRadioButton16);
        jRadioButton16.setText("Pizza marinera");
		jRadioButton16.setActionCommand("Pizza marinera");
        jRadioButton16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton16.setOpaque(false);

        primeroGluten.add(jRadioButton17);
        jRadioButton17.setText("Salmorejo");
		jRadioButton17.setActionCommand("Salmorejo");
        jRadioButton17.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton17.setOpaque(false);

        jLabel8.setText("Segundo plato:");

        primeroGluten.add(jRadioButton18);
        jRadioButton18.setText("Sopa castellana");
		jRadioButton18.setActionCommand("Sopa castellana");
        jRadioButton18.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton18.setOpaque(false);

        segundoGluten.add(jRadioButton19);
        jRadioButton19.setText("Pimientos rellenos de carne");
		jRadioButton19.setActionCommand("Pimientos rellenos de carne");
        jRadioButton19.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton19.setOpaque(false);

        jLabel9.setText("Postres:");

        postreGluten.add(jRadioButton20);
        jRadioButton20.setText("Tarta de fresas");
		jRadioButton20.setActionCommand("Tarta de fresa");
        jRadioButton20.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton20.setOpaque(false);
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });

        postreGluten.add(jRadioButton21);
        jRadioButton21.setText("Rosquillas del santo");
		jRadioButton21.setActionCommand("Rosquillas del santo");
        jRadioButton21.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRadioButton21.setOpaque(false);

        bebida3.setText("Bebida");

        javax.swing.GroupLayout panelMenu3Layout = new javax.swing.GroupLayout(panelMenu3);
        panelMenu3.setLayout(panelMenu3Layout);
        panelMenu3Layout.setHorizontalGroup(
            panelMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu3Layout.createSequentialGroup()
                .addGroup(panelMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenu3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonGluten, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                    .addGroup(panelMenu3Layout.createSequentialGroup()
                        .addGroup(panelMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenu3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(panelMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(bebida3)))
                            .addGroup(panelMenu3Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(panelMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton19)
                                    .addComponent(jRadioButton20, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton16, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton21, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelMenu3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(panelMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton18)
                    .addComponent(jRadioButton17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenu3Layout.setVerticalGroup(
            panelMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonGluten)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton18)
                .addGap(10, 10, 10)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jRadioButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton19)
                .addGap(7, 7, 7)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton21)
                .addGap(37, 37, 37)
                .addComponent(bebida3)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        botonConfirmarPedido.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonConfirmarPedido.setText("Confirmar Pedido");
        botonConfirmarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarPedidoActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        labelTitulo.setText("Menús Cerrados");

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(panelMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(panelMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(panelMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(botonConfirmarPedido)
                                .addGap(135, 135, 135)
                                .addComponent(botonLimpiar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(labelTitulo)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConfirmarPedido)
                    .addComponent(botonLimpiar))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
		// TODO add your handling code here:
		PanelPedido p = new PanelPedido();
		p.setSize(1080, 720);
		p.setLocation(0, 0);
		
		this.removeAll();
		this.add(p, BorderLayout.CENTER);
		this.revalidate();
		this.repaint();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonVegetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVegetaActionPerformed
        // TODO add your handling code here:
        des.setSize(500,300);
        des.setLocation(400,95);
        
        panelMenu2.setVisible(false);
        panelMenu3.setVisible(false);
        
        this.setLayout(null);
        botonLimpiar.setVisible(true);
        des.cambiarTexto("<html><body>descripcion platos 1<br>descripcion platos 2<br>descripcion postres</body></html>");
        if(!des.isVisible())
            des.setVisible(true);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_botonVegetaActionPerformed

    private void botonVeganoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVeganoActionPerformed
        // TODO add your handling code here:
        des.setSize(500,300);
        des.setLocation(400,95);
             
        panelMenu1.setVisible(false);
        panelMenu3.setVisible(false);
        botonLimpiar.setVisible(true);
        
        this.setLayout(null);
        panelMenu2.setLocation(60,95);
        
        
        des.cambiarTexto("descripcion platos 3\ndescripcion platos 4\ndescripcion postres");
        if(!des.isVisible())
            des.setVisible(true);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_botonVeganoActionPerformed

    private void botonGlutenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGlutenActionPerformed
        // TODO add your handling code here:
        des.setSize(500,300);
        des.setLocation(400,95);
       
        panelMenu1.setVisible(false);
        panelMenu2.setVisible(false);
       
        this.setLayout(null);
        //panelMenu1.setLocation(400,100);
        panelMenu3.setLocation(60,95);
        
        botonLimpiar.setVisible(true);
        des.cambiarTexto("descripcion platos 5\ndescripcion platos 6\ndescripcion postres");
        if(!des.isVisible())
            des.setVisible(true);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_botonGlutenActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        // TODO add your handling code here:
        
        des.setVisible(false);
        botonLimpiar.setVisible(false);
        if(!panelMenu1.isVisible()){
            panelMenu1.setVisible(true);
            panelMenu2.setLocation(400,95);
            panelMenu3.setLocation(740,95);
        }  
        if(!panelMenu2.isVisible())
            panelMenu2.setVisible(true);
        if(!panelMenu3.isVisible())
            panelMenu3.setVisible(true);         
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonConfirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarPedidoActionPerformed
        // TODO add your handling code here:
        FramePrincipal.setPrimero(obtenerPrimero());
        FramePrincipal.setSegundo(obtenerSegundo());
        FramePrincipal.setPostre(obtenerPostre());
        FramePrincipal.setMenu(true);
        if(bebida1.isSelected() || bebida2.isSelected() || bebida3.isSelected())
            FramePrincipal.setBebida(true);
        else
            FramePrincipal.setBebida(false);
        FramePrincipal.setPlato(1);
        PanelMesa p = new PanelMesa();
        p.setSize(1080, 720);
        p.setLocation(0, 0);

        this.removeAll();
        this.add(p, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_botonConfirmarPedidoActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton20ActionPerformed
    
    private String obtenerPrimero(){
       String primero;
       if(botonVegeta.isSelected()){
           primero = primeroVegeta.getSelection().getActionCommand();
       }
       else if(botonVegano.isSelected()){
           primero = primeroVegano.getSelection().getActionCommand();
       }else
           primero = primeroGluten.getSelection().getActionCommand();
        return primero;
    }
    
    private String obtenerSegundo(){
       String segundo;
       if(botonVegeta.isSelected()){
           segundo = segundoVegeta.getSelection().getActionCommand();
       }
       else if(botonVegano.isSelected()){
           segundo = segundoVegano.getSelection().getActionCommand();
       }else
           segundo = segundoGluten.getSelection().getActionCommand();
        return segundo;
    }
    
    private String obtenerPostre(){
       String postre;
       if(botonVegeta.isSelected()){
           postre = postreVegeta.getSelection().getActionCommand();
       }
       else if(botonVegano.isSelected()){
           postre = postreVegano.getSelection().getActionCommand();
       }else
           postre = postreGluten.getSelection().getActionCommand();
        return postre;
    }

    
    public class descripMenu extends javax.swing.JPanel {

        public descripMenu() {
            initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            descripcion = new javax.swing.JLabel();
            

            setBackground(new java.awt.Color(255, 255, 204));

            descripcion.setText("jLabel1");
            descripcion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            descripcion.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
            descripcion.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

            
            

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)                   
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(38, Short.MAX_VALUE)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                
            );
        }// </editor-fold>                        
 
        
        private void cambiarTexto(String texto){
            descripcion.setText(texto);
        }


        // Variables declaration - do not modify                     
        private javax.swing.JLabel descripcion;
        // End of variables declaration                   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bebida1;
    private javax.swing.JCheckBox bebida2;
    private javax.swing.JCheckBox bebida3;
    private javax.swing.JButton botonConfirmarPedido;
    private javax.swing.JRadioButton botonGluten;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JRadioButton botonVegano;
    private javax.swing.JRadioButton botonVegeta;
    private javax.swing.JButton botonVolver;
    private javax.swing.ButtonGroup botonesMenuCerrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelMenu1;
    private javax.swing.JPanel panelMenu2;
    private javax.swing.JPanel panelMenu3;
    private javax.swing.ButtonGroup postreGluten;
    private javax.swing.ButtonGroup postreVegano;
    private javax.swing.ButtonGroup postreVegeta;
    private javax.swing.ButtonGroup primeroGluten;
    private javax.swing.ButtonGroup primeroVegano;
    private javax.swing.ButtonGroup primeroVegeta;
    private javax.swing.ButtonGroup segundoGluten;
    private javax.swing.ButtonGroup segundoVegano;
    private javax.swing.ButtonGroup segundoVegeta;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalizacion_grafica;

import ficheros.Lectura;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author estudios
 */
public class Cliente extends javax.swing.JFrame {
    Sesion ObxetoSesion= new Sesion();
    /**
     * Creates new form panel2
     */
    public Cliente() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreTxt1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tipoTxt = new javax.swing.JTextField();
        consolaTxt = new javax.swing.JTextField();
        dlcTxt = new javax.swing.JTextField();
        precioTxt = new javax.swing.JTextField();
        estadoTxt = new javax.swing.JTextField();
        unidadesTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        nombreTxt = new javax.swing.JTextField();
        tipoTxt1 = new javax.swing.JTextField();
        consolaTxt1 = new javax.swing.JTextField();
        consolaTxt2 = new javax.swing.JTextField();
        estadoTxt1 = new javax.swing.JTextField();
        unidadesTxt1 = new javax.swing.JTextField();
        unidadesTxt2 = new javax.swing.JTextField();
        nombreTxt2 = new javax.swing.JTextField();
        tipoTxt2 = new javax.swing.JTextField();
        estadoTxt2 = new javax.swing.JTextField();
        precioTxt1 = new javax.swing.JTextField();
        precioTxt2 = new javax.swing.JTextField();
        dlcTxt1 = new javax.swing.JTextField();
        dlcTxt2 = new javax.swing.JTextField();
        BVolverInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido a nuestra web");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("nombre");

        nombreTxt1.setEditable(false);
        nombreTxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxt1ActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("tipo");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Consola");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DLC");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Precio");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Estado");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Unidades");

        tipoTxt.setEditable(false);
        tipoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tipoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoTxtActionPerformed(evt);
            }
        });

        consolaTxt.setEditable(false);
        consolaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dlcTxt.setEditable(false);
        dlcTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dlcTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlcTxtActionPerformed(evt);
            }
        });

        precioTxt.setEditable(false);
        precioTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioTxtActionPerformed(evt);
            }
        });

        estadoTxt.setEditable(false);
        estadoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        estadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoTxtActionPerformed(evt);
            }
        });

        unidadesTxt.setEditable(false);
        unidadesTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unidadesTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadesTxtActionPerformed(evt);
            }
        });

        jButton1.setText("Busqueda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nombreTxt.setEditable(false);
        nombreTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });

        tipoTxt1.setEditable(false);
        tipoTxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tipoTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoTxt1ActionPerformed(evt);
            }
        });

        consolaTxt1.setEditable(false);
        consolaTxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        consolaTxt2.setEditable(false);
        consolaTxt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        consolaTxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consolaTxt2ActionPerformed(evt);
            }
        });

        estadoTxt1.setEditable(false);
        estadoTxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        estadoTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoTxt1ActionPerformed(evt);
            }
        });

        unidadesTxt1.setEditable(false);
        unidadesTxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unidadesTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadesTxt1ActionPerformed(evt);
            }
        });

        unidadesTxt2.setEditable(false);
        unidadesTxt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unidadesTxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadesTxt2ActionPerformed(evt);
            }
        });

        nombreTxt2.setEditable(false);
        nombreTxt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreTxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxt2ActionPerformed(evt);
            }
        });

        tipoTxt2.setEditable(false);
        tipoTxt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        estadoTxt2.setEditable(false);
        estadoTxt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        estadoTxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoTxt2ActionPerformed(evt);
            }
        });

        precioTxt1.setEditable(false);
        precioTxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precioTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioTxt1ActionPerformed(evt);
            }
        });

        precioTxt2.setEditable(false);
        precioTxt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precioTxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioTxt2ActionPerformed(evt);
            }
        });

        dlcTxt1.setEditable(false);
        dlcTxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dlcTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlcTxt1ActionPerformed(evt);
            }
        });

        dlcTxt2.setEditable(false);
        dlcTxt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dlcTxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlcTxt2ActionPerformed(evt);
            }
        });

        BVolverInicio.setText("Volver al Inicio");
        BVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVolverInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombreTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tipoTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombreTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tipoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(consolaTxt1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(consolaTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(consolaTxt2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dlcTxt)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dlcTxt1)
                    .addComponent(dlcTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioTxt2)
                            .addComponent(precioTxt1))
                        .addGap(18, 18, 18)
                        .addComponent(estadoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(precioTxt))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(estadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(unidadesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(BVolverInicio)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(estadoTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(unidadesTxt2)
                                                    .addComponent(unidadesTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))))))))))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estadoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unidadesTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(381, 381, 381))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dlcTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(precioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(unidadesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(estadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(precioTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dlcTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(precioTxt2)
                                        .addComponent(estadoTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(unidadesTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dlcTxt2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(consolaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(consolaTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tipoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(consolaTxt2)
                                    .addComponent(tipoTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(BVolverInicio))
                        .addGap(72, 72, 72))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxt1ActionPerformed
        nombreJuego();
    }//GEN-LAST:event_nombreTxt1ActionPerformed

    private void dlcTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlcTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dlcTxtActionPerformed

    private void precioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioTxtActionPerformed

    private void estadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        busqueda();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void consolaTxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consolaTxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consolaTxt2ActionPerformed

    private void estadoTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoTxt1ActionPerformed

    private void nombreTxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxt2ActionPerformed

    private void unidadesTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadesTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadesTxtActionPerformed

    private void unidadesTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadesTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadesTxt1ActionPerformed

    private void unidadesTxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadesTxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadesTxt2ActionPerformed

    private void estadoTxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoTxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoTxt2ActionPerformed

    private void precioTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioTxt1ActionPerformed

    private void precioTxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioTxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioTxt2ActionPerformed

    private void dlcTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlcTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dlcTxt1ActionPerformed

    private void dlcTxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlcTxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dlcTxt2ActionPerformed

    private void tipoTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoTxt1ActionPerformed

    private void tipoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoTxtActionPerformed

    private void BVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVolverInicioActionPerformed
        inicio();
    }//GEN-LAST:event_BVolverInicioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BVolverInicio;
    private javax.swing.JTextField consolaTxt;
    private javax.swing.JTextField consolaTxt1;
    private javax.swing.JTextField consolaTxt2;
    private javax.swing.JTextField dlcTxt;
    private javax.swing.JTextField dlcTxt1;
    private javax.swing.JTextField dlcTxt2;
    private javax.swing.JTextField estadoTxt;
    private javax.swing.JTextField estadoTxt1;
    private javax.swing.JTextField estadoTxt2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTextField nombreTxt1;
    private javax.swing.JTextField nombreTxt2;
    private javax.swing.JTextField precioTxt;
    private javax.swing.JTextField precioTxt1;
    private javax.swing.JTextField precioTxt2;
    private javax.swing.JTextField tipoTxt;
    private javax.swing.JTextField tipoTxt1;
    private javax.swing.JTextField tipoTxt2;
    private javax.swing.JTextField unidadesTxt;
    private javax.swing.JTextField unidadesTxt1;
    private javax.swing.JTextField unidadesTxt2;
    // End of variables declaration//GEN-END:variables

    private void nombreJuego() {

    }

    private void busqueda() {
        String line = "";
        String[] sep, sep2;
        sep = new String[7];
        sep2 = new String[2];
        try {
            final BufferedReader reader;

            try {
                reader = new BufferedReader(new FileReader("Juegos.txt"));
                int contador = 0;
                while ((line = reader.readLine()) != null) {

                    

                    if (contador == 0) {
                        for (int i = 0; i < sep.length; i++) {

                            sep = line.split(",");
                            sep2 = sep[i].split("\\s*:");
                            if (i == 0) {
                                this.nombreTxt.setText(sep2[1]);
                            }
                            if (i == 1) {
                                this.tipoTxt.setText(sep2[1]);
                            }
                            if (i == 2) {
                                this.consolaTxt.setText(sep2[1]);
                            }
                            if (i == 3) {
                                this.dlcTxt.setText(sep2[1]);
                            }
                            if (i == 4) {
                                this.precioTxt.setText(sep2[1]);
                            }
                            if (i == 5) {
                                this.estadoTxt.setText(sep2[1]);
                            }
                            if (i == 6) {
                                this.unidadesTxt.setText(sep2[1]);
                            }
                        }
                    } else if (contador == 1) {
                        
                        for (int y = 0; y < sep.length; y++) {

                            sep = line.split(",");
                            sep2 = sep[y].split("\\s*:");

                            if (y == 0) {
                                this.nombreTxt1.setText(sep2[1]);
                            }
                            if (y == 1) {
                                this.tipoTxt1.setText(sep2[1]);
                            }
                            if (y == 2) {
                                this.consolaTxt1.setText(sep2[1]);
                            }
                            if (y == 3) {
                                this.dlcTxt1.setText(sep2[1]);
                            }
                            if (y == 4) {
                                this.precioTxt1.setText(sep2[1]);
                            }
                            if (y == 5) {
                                this.estadoTxt1.setText(sep2[1]);
                            }
                            if (y == 6) {
                                this.unidadesTxt1.setText(sep2[1]);
                            }
                        }
                    } else {
                        for (int a = 0; a < sep.length; a++) {

                            sep = line.split(",");
                            sep2 = sep[a].split("\\s*:");

                            sep = line.split(",");
                            sep2 = sep[a].split("\\s*:");
                            if (a == 0) {
                                this.nombreTxt2.setText(sep2[1]);
                            }
                            if (a == 1) {
                                this.tipoTxt2.setText(sep2[1]);
                            }
                            if (a == 2) {
                                this.consolaTxt2.setText(sep2[1]);
                            }
                            if (a == 3) {
                                this.dlcTxt2.setText(sep2[1]);
                            }
                            if (a == 4) {
                                this.precioTxt2.setText(sep2[1]);
                            }
                            if (a == 5) {
                                this.estadoTxt2.setText(sep2[1]);
                            }
                            if (a == 6) {
                                this.unidadesTxt2.setText(sep2[1]);
                            }
                        }

                    }
                    contador++;
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void inicio() {
        this.setVisible(false);
        this.ObxetoSesion.setVisible(true);
    }

}
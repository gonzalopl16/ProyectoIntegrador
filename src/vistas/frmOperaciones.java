/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import clases.Matriz;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Gonzalo <https://github.com/gonzalopl16>
 */
public class frmOperaciones extends javax.swing.JFrame {

    Matriz m = new Matriz();
    String tamañoMatriz;
    int index;
    double matriz1[][];
    double matriz2[][];

    public frmOperaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        desabilitar();
    }

    void operación(String op) {
        tamañoMatriz = (String) cboDimension.getSelectedItem();
        index = cboDimension.getSelectedIndex();
        switch (op) {
            case "suma":
                txtArea.append(m.sumaGlobalProcedimiento(matriz1, matriz2, index+2));;
                break;
            case "resta":
                txtArea.append(m.restaGlobal(matriz1, matriz2, index+2));
                break;
            case "multiplicacion":
                txtArea.append(m.multiplicacionProcedimiento(matriz1, matriz2, index + 2));
                break;
            case "division":
                txtArea.append(m.reduccionProcedimiento(matriz2, index+2));
                double [][] matrizInversa = m.reduccion(matriz2, index+2);
                String resultado = m.multiplicacionProcedimiento(matriz1, matrizInversa, index + 2);
                txtArea.append("\n"
                        + "Con la matriz inversa se procederá a multiplicar las matrices 1 y inversa"
                        + resultado);
                break;
        }
    }
    

    void desabilitar() {
        M1_0_0.setEnabled(false);
        M1_0_1.setEnabled(false);
        M1_0_2.setEnabled(false);
        M1_0_3.setEnabled(false);
        M1_1_0.setEnabled(false);
        M1_1_1.setEnabled(false);
        M1_1_2.setEnabled(false);
        M1_1_3.setEnabled(false);
        M1_2_0.setEnabled(false);
        M1_2_1.setEnabled(false);
        M1_2_2.setEnabled(false);
        M1_2_3.setEnabled(false);
        M1_3_0.setEnabled(false);
        M1_3_1.setEnabled(false);
        M1_3_2.setEnabled(false);
        M1_3_3.setEnabled(false);
        M2_0_0.setEnabled(false);
        M2_0_1.setEnabled(false);
        M2_0_2.setEnabled(false);
        M2_0_3.setEnabled(false);
        M2_1_0.setEnabled(false);
        M2_1_1.setEnabled(false);
        M2_1_2.setEnabled(false);
        M2_1_3.setEnabled(false);
        M2_2_0.setEnabled(false);
        M2_2_1.setEnabled(false);
        M2_2_2.setEnabled(false);
        M2_2_3.setEnabled(false);
        M2_3_0.setEnabled(false);
        M2_3_1.setEnabled(false);
        M2_3_2.setEnabled(false);
        M2_3_3.setEnabled(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnSumar = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        cboDimension = new javax.swing.JComboBox<>();
        M1_0_0 = new javax.swing.JTextField();
        M1_1_0 = new javax.swing.JTextField();
        M1_3_1 = new javax.swing.JTextField();
        M1_0_1 = new javax.swing.JTextField();
        M1_2_1 = new javax.swing.JTextField();
        M1_0_2 = new javax.swing.JTextField();
        M1_0_3 = new javax.swing.JTextField();
        M1_1_2 = new javax.swing.JTextField();
        M1_2_2 = new javax.swing.JTextField();
        M1_1_3 = new javax.swing.JTextField();
        M1_2_3 = new javax.swing.JTextField();
        M1_3_2 = new javax.swing.JTextField();
        M1_3_0 = new javax.swing.JTextField();
        M1_2_0 = new javax.swing.JTextField();
        M1_3_3 = new javax.swing.JTextField();
        M2_0_0 = new javax.swing.JTextField();
        M2_0_1 = new javax.swing.JTextField();
        M2_2_3 = new javax.swing.JTextField();
        M2_0_3 = new javax.swing.JTextField();
        M2_1_0 = new javax.swing.JTextField();
        M2_1_1 = new javax.swing.JTextField();
        M2_1_2 = new javax.swing.JTextField();
        M2_2_0 = new javax.swing.JTextField();
        M2_3_0 = new javax.swing.JTextField();
        M2_2_1 = new javax.swing.JTextField();
        M2_3_1 = new javax.swing.JTextField();
        M2_3_2 = new javax.swing.JTextField();
        M1_1_1 = new javax.swing.JTextField();
        M2_0_2 = new javax.swing.JTextField();
        M2_3_3 = new javax.swing.JTextField();
        M2_2_2 = new javax.swing.JTextField();
        M2_1_3 = new javax.swing.JTextField();
        btnInsertar2 = new javax.swing.JButton();
        btnInsertar1 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnFormulas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Borrar.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 120, 40));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 710, 310));

        btnSumar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Sumar.png"))); // NOI18N
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 710, 120, 40));

        btnMultiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Multiplicar.png"))); // NOI18N
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 710, 120, 40));

        btnRestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Restar.png"))); // NOI18N
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 710, 120, 40));

        btnDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Dividir.png"))); // NOI18N
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });
        getContentPane().add(btnDividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 710, 120, 40));

        cboDimension.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2x2", "3x3", "4x4" }));
        cboDimension.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDimensionItemStateChanged(evt);
            }
        });
        cboDimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDimensionActionPerformed(evt);
            }
        });
        getContentPane().add(cboDimension, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        M1_0_0.setBackground(new java.awt.Color(200, 200, 200));
        getContentPane().add(M1_0_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 103, 30, 30));

        M1_1_0.setBackground(new java.awt.Color(200, 200, 200));
        getContentPane().add(M1_1_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 142, 30, 30));

        M1_3_1.setBackground(new java.awt.Color(200, 200, 200));
        M1_3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1_3_1ActionPerformed(evt);
            }
        });
        getContentPane().add(M1_3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 220, 30, 30));

        M1_0_1.setBackground(new java.awt.Color(200, 200, 200));
        M1_0_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1_0_1ActionPerformed(evt);
            }
        });
        getContentPane().add(M1_0_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 103, 30, 30));

        M1_2_1.setBackground(new java.awt.Color(200, 200, 200));
        M1_2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1_2_1ActionPerformed(evt);
            }
        });
        getContentPane().add(M1_2_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 180, 30, 30));

        M1_0_2.setBackground(new java.awt.Color(200, 200, 200));
        M1_0_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1_0_2ActionPerformed(evt);
            }
        });
        getContentPane().add(M1_0_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 103, 30, 30));

        M1_0_3.setBackground(new java.awt.Color(200, 200, 200));
        M1_0_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1_0_3ActionPerformed(evt);
            }
        });
        getContentPane().add(M1_0_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 103, 30, 30));

        M1_1_2.setBackground(new java.awt.Color(200, 200, 200));
        M1_1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1_1_2ActionPerformed(evt);
            }
        });
        getContentPane().add(M1_1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 142, 30, 30));

        M1_2_2.setBackground(new java.awt.Color(200, 200, 200));
        M1_2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1_2_2ActionPerformed(evt);
            }
        });
        getContentPane().add(M1_2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 180, 30, 30));

        M1_1_3.setBackground(new java.awt.Color(200, 200, 200));
        M1_1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1_1_3ActionPerformed(evt);
            }
        });
        getContentPane().add(M1_1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 30, 30));

        M1_2_3.setBackground(new java.awt.Color(200, 200, 200));
        M1_2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1_2_3ActionPerformed(evt);
            }
        });
        getContentPane().add(M1_2_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 30, 30));

        M1_3_2.setBackground(new java.awt.Color(200, 200, 200));
        M1_3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1_3_2ActionPerformed(evt);
            }
        });
        getContentPane().add(M1_3_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 220, 30, 30));

        M1_3_0.setBackground(new java.awt.Color(200, 200, 200));
        M1_3_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1_3_0ActionPerformed(evt);
            }
        });
        getContentPane().add(M1_3_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 30, 30));

        M1_2_0.setBackground(new java.awt.Color(200, 200, 200));
        M1_2_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1_2_0ActionPerformed(evt);
            }
        });
        getContentPane().add(M1_2_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 30, 30));

        M1_3_3.setBackground(new java.awt.Color(200, 200, 200));
        M1_3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1_3_3ActionPerformed(evt);
            }
        });
        getContentPane().add(M1_3_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 30, 30));

        M2_0_0.setBackground(new java.awt.Color(200, 200, 200));
        M2_0_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2_0_0ActionPerformed(evt);
            }
        });
        getContentPane().add(M2_0_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 103, 30, 30));

        M2_0_1.setBackground(new java.awt.Color(200, 200, 200));
        M2_0_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2_0_1ActionPerformed(evt);
            }
        });
        getContentPane().add(M2_0_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 103, 30, 30));

        M2_2_3.setBackground(new java.awt.Color(200, 200, 200));
        M2_2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2_2_3ActionPerformed(evt);
            }
        });
        getContentPane().add(M2_2_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 180, 30, 30));

        M2_0_3.setBackground(new java.awt.Color(200, 200, 200));
        M2_0_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2_0_3ActionPerformed(evt);
            }
        });
        getContentPane().add(M2_0_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 103, 30, 30));

        M2_1_0.setBackground(new java.awt.Color(200, 200, 200));
        M2_1_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2_1_0ActionPerformed(evt);
            }
        });
        getContentPane().add(M2_1_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 142, 30, 30));

        M2_1_1.setBackground(new java.awt.Color(200, 200, 200));
        M2_1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2_1_1ActionPerformed(evt);
            }
        });
        getContentPane().add(M2_1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 142, 30, 30));

        M2_1_2.setBackground(new java.awt.Color(200, 200, 200));
        M2_1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2_1_2ActionPerformed(evt);
            }
        });
        getContentPane().add(M2_1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 142, 30, 30));

        M2_2_0.setBackground(new java.awt.Color(200, 200, 200));
        M2_2_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2_2_0ActionPerformed(evt);
            }
        });
        getContentPane().add(M2_2_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 30, 30));

        M2_3_0.setBackground(new java.awt.Color(200, 200, 200));
        M2_3_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2_3_0ActionPerformed(evt);
            }
        });
        getContentPane().add(M2_3_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 30, 30));

        M2_2_1.setBackground(new java.awt.Color(200, 200, 200));
        M2_2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2_2_1ActionPerformed(evt);
            }
        });
        getContentPane().add(M2_2_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 180, 30, 30));

        M2_3_1.setBackground(new java.awt.Color(200, 200, 200));
        M2_3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2_3_1ActionPerformed(evt);
            }
        });
        getContentPane().add(M2_3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 220, 30, 30));

        M2_3_2.setBackground(new java.awt.Color(200, 200, 200));
        M2_3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2_3_2ActionPerformed(evt);
            }
        });
        getContentPane().add(M2_3_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 220, 30, 30));

        M1_1_1.setBackground(new java.awt.Color(200, 200, 200));
        M1_1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1_1_1ActionPerformed(evt);
            }
        });
        getContentPane().add(M1_1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 142, 30, 30));

        M2_0_2.setBackground(new java.awt.Color(200, 200, 200));
        M2_0_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2_0_2ActionPerformed(evt);
            }
        });
        getContentPane().add(M2_0_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 103, 30, 30));

        M2_3_3.setBackground(new java.awt.Color(200, 200, 200));
        M2_3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2_3_3ActionPerformed(evt);
            }
        });
        getContentPane().add(M2_3_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 220, 30, 30));

        M2_2_2.setBackground(new java.awt.Color(200, 200, 200));
        M2_2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2_2_2ActionPerformed(evt);
            }
        });
        getContentPane().add(M2_2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 180, 30, 30));

        M2_1_3.setBackground(new java.awt.Color(200, 200, 200));
        M2_1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2_1_3ActionPerformed(evt);
            }
        });
        getContentPane().add(M2_1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 141, 30, 30));

        btnInsertar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Matriz 1.png"))); // NOI18N
        btnInsertar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 120, 40));

        btnInsertar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Matriz 2.png"))); // NOI18N
        btnInsertar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 120, 40));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton Salir.png"))); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 740, 40, 40));

        btnFormulas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icon Formulas.png"))); // NOI18N
        btnFormulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormulasActionPerformed(evt);
            }
        });
        getContentPane().add(btnFormulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ventana 1 Integrador (900 × 800 px).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void M1_3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1_3_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1_3_1ActionPerformed

    private void M1_0_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1_0_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1_0_1ActionPerformed

    private void M1_2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1_2_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1_2_1ActionPerformed

    private void M1_0_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1_0_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1_0_2ActionPerformed

    private void M1_0_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1_0_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1_0_3ActionPerformed

    private void M1_1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1_1_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1_1_2ActionPerformed

    private void M1_2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1_2_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1_2_2ActionPerformed

    private void M1_1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1_1_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1_1_3ActionPerformed

    private void M1_2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1_2_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1_2_3ActionPerformed

    private void M1_3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1_3_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1_3_2ActionPerformed

    private void M1_3_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1_3_0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1_3_0ActionPerformed

    private void M1_2_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1_2_0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1_2_0ActionPerformed

    private void M1_3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1_3_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1_3_3ActionPerformed

    private void M2_0_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2_0_0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2_0_0ActionPerformed

    private void M2_0_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2_0_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2_0_1ActionPerformed

    private void M2_2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2_2_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2_2_3ActionPerformed

    private void M2_0_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2_0_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2_0_3ActionPerformed

    private void M2_1_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2_1_0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2_1_0ActionPerformed

    private void M2_1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2_1_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2_1_1ActionPerformed

    private void M2_1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2_1_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2_1_2ActionPerformed

    private void M2_2_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2_2_0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2_2_0ActionPerformed

    private void M2_3_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2_3_0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2_3_0ActionPerformed

    private void M2_2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2_2_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2_2_1ActionPerformed

    private void M2_3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2_3_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2_3_1ActionPerformed

    private void M2_3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2_3_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2_3_2ActionPerformed

    private void M1_1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1_1_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1_1_1ActionPerformed

    private void M2_0_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2_0_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2_0_2ActionPerformed

    private void M2_3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2_3_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2_3_3ActionPerformed

    private void M2_2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2_2_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2_2_2ActionPerformed

    private void M2_1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2_1_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2_1_3ActionPerformed

    private void cboDimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDimensionActionPerformed

    }//GEN-LAST:event_cboDimensionActionPerformed

    private void cboDimensionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDimensionItemStateChanged
        tamañoMatriz = (String) cboDimension.getSelectedItem();
        switch (tamañoMatriz) {
            case "2x2":
                desabilitar();
                M1_0_0.setEnabled(true);
                M1_0_1.setEnabled(true);
                M1_1_0.setEnabled(true);
                M1_1_1.setEnabled(true);
                M2_0_0.setEnabled(true);
                M2_0_1.setEnabled(true);
                M2_1_0.setEnabled(true);
                M2_1_1.setEnabled(true);
                break;
            case "3x3":
                desabilitar();
                M1_0_0.setEnabled(true);
                M1_0_1.setEnabled(true);
                M1_0_2.setEnabled(true);
                M1_1_0.setEnabled(true);
                M1_1_1.setEnabled(true);
                M1_1_2.setEnabled(true);
                M1_2_0.setEnabled(true);
                M1_2_1.setEnabled(true);
                M1_2_2.setEnabled(true);
                M2_0_0.setEnabled(true);
                M2_0_1.setEnabled(true);
                M2_0_2.setEnabled(true);
                M2_1_0.setEnabled(true);
                M2_1_1.setEnabled(true);
                M2_1_2.setEnabled(true);
                M2_2_0.setEnabled(true);
                M2_2_1.setEnabled(true);
                M2_2_2.setEnabled(true);
                break;
            case "4x4":
                desabilitar();
                M1_0_0.setEnabled(true);
                M1_0_1.setEnabled(true);
                M1_0_2.setEnabled(true);
                M1_0_3.setEnabled(true);
                M1_1_0.setEnabled(true);
                M1_1_1.setEnabled(true);
                M1_1_2.setEnabled(true);
                M1_1_3.setEnabled(true);
                M1_2_0.setEnabled(true);
                M1_2_1.setEnabled(true);
                M1_2_2.setEnabled(true);
                M1_2_3.setEnabled(true);
                M1_3_0.setEnabled(true);
                M1_3_1.setEnabled(true);
                M1_3_2.setEnabled(true);
                M1_3_3.setEnabled(true);
                M2_0_0.setEnabled(true);
                M2_0_1.setEnabled(true);
                M2_0_2.setEnabled(true);
                M2_0_3.setEnabled(true);
                M2_1_0.setEnabled(true);
                M2_1_1.setEnabled(true);
                M2_1_2.setEnabled(true);
                M2_1_3.setEnabled(true);
                M2_2_0.setEnabled(true);
                M2_2_1.setEnabled(true);
                M2_2_2.setEnabled(true);
                M2_2_3.setEnabled(true);
                M2_3_0.setEnabled(true);
                M2_3_1.setEnabled(true);
                M2_3_2.setEnabled(true);
                M2_3_3.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_cboDimensionItemStateChanged

    private void btnInsertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertar1ActionPerformed
        tamañoMatriz = (String) cboDimension.getSelectedItem();
        switch (tamañoMatriz) {
            case "2x2":
                matriz1 = new double[2][2];
                matriz1[0][0] = Integer.parseInt(M1_0_0.getText());
                matriz1[0][1] = Integer.parseInt(M1_0_1.getText());
                matriz1[1][0] = Integer.parseInt(M1_1_0.getText());
                matriz1[1][1] = Integer.parseInt(M1_1_1.getText());
                break;
            case "3x3":
                matriz1 = new double[3][3];
                matriz1[0][0] = Integer.parseInt(M1_0_0.getText());
                matriz1[0][1] = Integer.parseInt(M1_0_1.getText());
                matriz1[0][2] = Integer.parseInt(M1_0_2.getText());
                matriz1[1][0] = Integer.parseInt(M1_1_0.getText());
                matriz1[1][1] = Integer.parseInt(M1_1_1.getText());
                matriz1[1][2] = Integer.parseInt(M1_1_2.getText());
                matriz1[2][0] = Integer.parseInt(M1_2_0.getText());
                matriz1[2][1] = Integer.parseInt(M1_2_1.getText());
                matriz1[2][2] = Integer.parseInt(M1_2_2.getText());
                break;
            case "4x4":
                matriz1 = new double[4][4];
                matriz1[0][0] = Integer.parseInt(M1_0_0.getText());
                matriz1[0][1] = Integer.parseInt(M1_0_1.getText());
                matriz1[0][2] = Integer.parseInt(M1_0_2.getText());
                matriz1[0][3] = Integer.parseInt(M1_0_3.getText());
                matriz1[1][0] = Integer.parseInt(M1_1_0.getText());
                matriz1[1][1] = Integer.parseInt(M1_1_1.getText());
                matriz1[1][2] = Integer.parseInt(M1_1_2.getText());
                matriz1[1][3] = Integer.parseInt(M1_1_3.getText());
                matriz1[2][0] = Integer.parseInt(M1_2_0.getText());
                matriz1[2][1] = Integer.parseInt(M1_2_1.getText());
                matriz1[2][2] = Integer.parseInt(M1_2_2.getText());
                matriz1[2][3] = Integer.parseInt(M1_2_3.getText());
                matriz1[3][0] = Integer.parseInt(M1_3_0.getText());
                matriz1[3][1] = Integer.parseInt(M1_3_1.getText());
                matriz1[3][2] = Integer.parseInt(M1_3_2.getText());
                matriz1[3][3] = Integer.parseInt(M1_3_3.getText());
                break;
        }
        txtArea.append("Matriz 1: \n" + m.imprimirMatriz(matriz1));
    }//GEN-LAST:event_btnInsertar1ActionPerformed

    private void btnInsertar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertar2ActionPerformed
        tamañoMatriz = (String) cboDimension.getSelectedItem();
        switch (tamañoMatriz) {
            case "2x2":
                matriz2 = new double[2][2];
                matriz2[0][0] = Integer.parseInt(M2_0_0.getText());
                matriz2[0][1] = Integer.parseInt(M2_0_1.getText());
                matriz2[1][0] = Integer.parseInt(M2_1_0.getText());
                matriz2[1][1] = Integer.parseInt(M2_1_1.getText());
                break;
            case "3x3":
                matriz2 = new double[3][3];
                matriz2[0][0] = Integer.parseInt(M2_0_0.getText());
                matriz2[0][1] = Integer.parseInt(M2_0_1.getText());
                matriz2[0][2] = Integer.parseInt(M2_0_2.getText());
                matriz2[1][0] = Integer.parseInt(M2_1_0.getText());
                matriz2[1][1] = Integer.parseInt(M2_1_1.getText());
                matriz2[1][2] = Integer.parseInt(M2_1_2.getText());
                matriz2[2][0] = Integer.parseInt(M2_2_0.getText());
                matriz2[2][1] = Integer.parseInt(M2_2_1.getText());
                matriz2[2][2] = Integer.parseInt(M2_2_2.getText());
                break;
            case "4x4":
                matriz2 = new double[4][4];
                matriz2[0][0] = Integer.parseInt(M2_0_0.getText());
                matriz2[0][1] = Integer.parseInt(M2_0_1.getText());
                matriz2[0][2] = Integer.parseInt(M2_0_2.getText());
                matriz2[0][3] = Integer.parseInt(M2_0_3.getText());
                matriz2[1][0] = Integer.parseInt(M2_1_0.getText());
                matriz2[1][1] = Integer.parseInt(M2_1_1.getText());
                matriz2[1][2] = Integer.parseInt(M2_1_2.getText());
                matriz2[1][3] = Integer.parseInt(M2_1_3.getText());
                matriz2[2][0] = Integer.parseInt(M2_2_0.getText());
                matriz2[2][1] = Integer.parseInt(M2_2_1.getText());
                matriz2[2][2] = Integer.parseInt(M2_2_2.getText());
                matriz2[2][3] = Integer.parseInt(M2_2_3.getText());
                matriz2[3][0] = Integer.parseInt(M2_3_0.getText());
                matriz2[3][1] = Integer.parseInt(M2_3_1.getText());
                matriz2[3][2] = Integer.parseInt(M2_3_2.getText());
                matriz2[3][3] = Integer.parseInt(M2_3_3.getText());
                break;
        }
        txtArea.append("Matriz 2: \n" + m.imprimirMatriz(matriz2));
    }//GEN-LAST:event_btnInsertar2ActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        operación("suma");
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtArea.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        operación("resta");
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        operación("multiplicacion");
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        operación("division");
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        frmLogin salir = new frmLogin();
        salir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnFormulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormulasActionPerformed
        frmFormulas newframe = new frmFormulas();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFormulasActionPerformed

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
            java.util.logging.Logger.getLogger(frmOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmOperaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField M1_0_0;
    private javax.swing.JTextField M1_0_1;
    private javax.swing.JTextField M1_0_2;
    private javax.swing.JTextField M1_0_3;
    private javax.swing.JTextField M1_1_0;
    private javax.swing.JTextField M1_1_1;
    private javax.swing.JTextField M1_1_2;
    private javax.swing.JTextField M1_1_3;
    private javax.swing.JTextField M1_2_0;
    private javax.swing.JTextField M1_2_1;
    private javax.swing.JTextField M1_2_2;
    private javax.swing.JTextField M1_2_3;
    private javax.swing.JTextField M1_3_0;
    private javax.swing.JTextField M1_3_1;
    private javax.swing.JTextField M1_3_2;
    private javax.swing.JTextField M1_3_3;
    private javax.swing.JTextField M2_0_0;
    private javax.swing.JTextField M2_0_1;
    private javax.swing.JTextField M2_0_2;
    private javax.swing.JTextField M2_0_3;
    private javax.swing.JTextField M2_1_0;
    private javax.swing.JTextField M2_1_1;
    private javax.swing.JTextField M2_1_2;
    private javax.swing.JTextField M2_1_3;
    private javax.swing.JTextField M2_2_0;
    private javax.swing.JTextField M2_2_1;
    private javax.swing.JTextField M2_2_2;
    private javax.swing.JTextField M2_2_3;
    private javax.swing.JTextField M2_3_0;
    private javax.swing.JTextField M2_3_1;
    private javax.swing.JTextField M2_3_2;
    private javax.swing.JTextField M2_3_3;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnFormulas;
    private javax.swing.JButton btnInsertar1;
    private javax.swing.JButton btnInsertar2;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSumar;
    private javax.swing.JComboBox<String> cboDimension;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}

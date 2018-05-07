/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marianaortc
 */
public class Jacobi extends javax.swing.JFrame {
    double [][] matriz;
    int n;
       int var;
    public Jacobi() {
        initComponents();
        
        grupo_opciones.add(opt3);
        grupo_opciones.add(opt4);
        grupo_opciones.add(opt5);
        grupo_opciones.add(opt6);
        grupo_opciones.add(opt7);
        grupo_opciones.add(opt8);
        grupo_opciones.add(opt9);
        grupo_opciones.add(opt10);
    }
public void tabla(int n)
    {  
        DefaultTableModel tabla = (DefaultTableModel) tblMatriz.getModel();
        
        for (int i = 0; i < tblMatriz.getRowCount(); i++) 
        {
            tabla.removeRow(i);
            i-=1;
        }
        
        tabla.setRowCount(n);
        tabla.setColumnCount(n+1);
        tblMatriz.setModel(tabla);
    }
public void tablaRes(int n)
    {  
        DefaultTableModel tabla = (DefaultTableModel) tblResultados.getModel();
        
        for (int i = 0; i < tblResultados.getRowCount(); i++) 
        {
            tabla.removeRow(i);
            i-=1;
        }
        
        tabla.setRowCount(n);
        tabla.setColumnCount(2*n+n+1);
        tblResultados.setModel(tabla);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_opciones = new javax.swing.ButtonGroup();
        opt3 = new javax.swing.JRadioButton();
        opt4 = new javax.swing.JRadioButton();
        opt5 = new javax.swing.JRadioButton();
        opt6 = new javax.swing.JRadioButton();
        opt7 = new javax.swing.JRadioButton();
        opt8 = new javax.swing.JRadioButton();
        opt9 = new javax.swing.JRadioButton();
        opt10 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatriz = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        opt3.setText("3x3");
        opt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt3ActionPerformed(evt);
            }
        });

        opt4.setText("4x4");
        opt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt4ActionPerformed(evt);
            }
        });

        opt5.setText("5x5");
        opt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt5ActionPerformed(evt);
            }
        });

        opt6.setText("6x6");
        opt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt6ActionPerformed(evt);
            }
        });

        opt7.setText("7x7");
        opt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt7ActionPerformed(evt);
            }
        });

        opt8.setText("8x8");
        opt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt8ActionPerformed(evt);
            }
        });

        opt9.setText("9x9");
        opt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt9ActionPerformed(evt);
            }
        });

        opt10.setText("10x10");
        opt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt10ActionPerformed(evt);
            }
        });

        tblMatriz= new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int CellIndex)
            {
                return true;
            }
        };
        tblMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMatriz);

        tblResultados= new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int CellIndex)
            {
                return true;
            }
        };
        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblResultados);

        jButton1.setText("CALCULAR");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(opt3)
                                .addGap(18, 18, 18)
                                .addComponent(opt4)
                                .addGap(27, 27, 27)
                                .addComponent(opt5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(opt6)
                                .addGap(18, 18, 18)
                                .addComponent(opt7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opt8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(opt9)
                                .addGap(18, 18, 18)
                                .addComponent(opt10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opt3)
                            .addComponent(opt4)
                            .addComponent(opt5))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(opt6)
                            .addComponent(opt7)
                            .addComponent(opt8))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opt10)
                            .addComponent(opt9)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt3ActionPerformed
       n=3;
     
       var = n;
       matriz = new double[n][n+1];
       
       tabla(n);
       tablaRes(n);
    }//GEN-LAST:event_opt3ActionPerformed

    private void opt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt4ActionPerformed
        n=4;
     
       var = n;
       matriz = new double[n][n+1];
       
       tabla(n);  
    }//GEN-LAST:event_opt4ActionPerformed

    private void opt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt5ActionPerformed
       n=5;
     
       var = n;
       matriz = new double[n][n+1];
       
       tabla(n);  
    }//GEN-LAST:event_opt5ActionPerformed

    private void opt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt6ActionPerformed
        n=6;
     
       var = n;
       matriz = new double[n][n+1];
       
       tabla(n);  
    }//GEN-LAST:event_opt6ActionPerformed

    private void opt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt7ActionPerformed
         n=7;
     
       var = n;
       matriz = new double[n][n+1];
       
       tabla(n);  
    }//GEN-LAST:event_opt7ActionPerformed

    private void opt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt8ActionPerformed
         n=8;
     
       var = n;
       matriz = new double[n][n+1];
       
       tabla(n);  
    }//GEN-LAST:event_opt8ActionPerformed

    private void opt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt9ActionPerformed
        n=9;
     
       var = n;
       matriz = new double[n][n+1];
       
       tabla(n);  
    }//GEN-LAST:event_opt9ActionPerformed

    private void opt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt10ActionPerformed
         n=10;
     
       var = n;
       matriz = new double[n][n+1];
       
       tabla(n);  
    }//GEN-LAST:event_opt10ActionPerformed

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
            java.util.logging.Logger.getLogger(Jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jacobi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupo_opciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton opt10;
    private javax.swing.JRadioButton opt3;
    private javax.swing.JRadioButton opt4;
    private javax.swing.JRadioButton opt5;
    private javax.swing.JRadioButton opt6;
    private javax.swing.JRadioButton opt7;
    private javax.swing.JRadioButton opt8;
    private javax.swing.JRadioButton opt9;
    private javax.swing.JTable tblMatriz;
    private javax.swing.JTable tblResultados;
    // End of variables declaration//GEN-END:variables
}
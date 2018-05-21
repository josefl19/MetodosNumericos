/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Algoritmos.RegresionMinimosCuadrados;
import Algoritmos.RegresionPolinomial;
import com.sun.istack.internal.logging.Logger;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marianaortc
 */
public class PanelRegresionPolinomial extends javax.swing.JPanel {
DecimalFormat df = new DecimalFormat("#.######");
   RegresionPolinomial rp= new RegresionPolinomial();
   double [][] matriz;
    public PanelRegresionPolinomial() {
        initComponents();
    }
 public void tabla(int n)
    {  
        DefaultTableModel tabla = (DefaultTableModel) tblxy.getModel();
        
        for (int i = 0; i < tblxy.getRowCount(); i++) 
        {
            tabla.removeRow(i);
            i-=1;
        }
        
        
        tabla.setRowCount(n);
        tblxy.setModel(tabla);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatriz = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtn = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblxy = new javax.swing.JTable();
        btnCalcular = new javax.swing.JButton();
        btnok = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtgrado = new javax.swing.JTextField();

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
                "x", "y"
            }
        ));
        jScrollPane1.setViewportView(tblMatriz);

        jLabel1.setText("Valor de n: ");

        txtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnActionPerformed(evt);
            }
        });

        tblxy= new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int CellIndex)
            {
                return true;
            }
        };
        tblxy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "x1", "y"
            }
        ));
        jScrollPane2.setViewportView(tblxy);

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "x", "y", "x^m", "x^m+1", "x^+2", "xy", "x^m*y", "(ymed-yi)^2", "(y-a0-a1x-a2x^m)^2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblResultados);
        if (tblResultados.getColumnModel().getColumnCount() > 0) {
            tblResultados.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel2.setText("Grado mayor de variable:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtgrado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnok)
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnok)
                    .addComponent(jLabel2)
                    .addComponent(txtgrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(131, 131, 131))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnActionPerformed
        
    }//GEN-LAST:event_txtnActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int grado;
        grado=Integer.parseInt(txtgrado.getText());
       double[][] tablemat;
        int fila = tblxy.getRowCount();
        DefaultTableModel tabla1 = (DefaultTableModel) tblResultados.getModel();
        Object [] filaob= new Object[9];
        
        for (int i = 0; i < tblResultados.getRowCount(); i++) 
        {
            tabla1.removeRow(i);
            i-=1;
        }

        
        for(int i = 0; i < fila; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                String valor = tblxy.getValueAt(i, j).toString();
                matriz[i][j] = Float.parseFloat(valor);
            }
        }
        tablemat=new double[fila][9];
         
        tablemat=rp.tabla(matriz, fila, grado, rp.promedioy(matriz, fila));
        for(int e=0; e<fila+2;e++)
        {
            
                filaob[0]=df.format(tablemat[e][0]);
                filaob[1]=df.format(tablemat[e][1]);
                filaob[2]=df.format(tablemat[e][2]);
                filaob[3]=df.format(tablemat[e][3]);
                filaob[4]=df.format(tablemat[e][4]);
                filaob[5]=df.format(tablemat[e][5]);
                filaob[6]=df.format(tablemat[e][6]);
                filaob[7]=df.format(tablemat[e][7]);
            tabla1.addRow(filaob);
            
         }
        
    /*for(int i = 0; i < fila+1; i++)
        {
            for(int j = 0; j < 6; j++)
            {
                tblResultados.setValueAt(tablemat[i][j], fila, j);
            }
        }*/
    
       
        rp.coeficiente(fila);
        tblResultados.setModel(tabla1);
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:
        int n;
        n=Integer.parseInt(txtn.getText());
        tabla(n);
        matriz=new double[n][2];
    }//GEN-LAST:event_btnokActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblMatriz;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTable tblxy;
    private javax.swing.JTextField txtgrado;
    private javax.swing.JTextField txtn;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Algoritmos.RegresionMinimosCuadrados;
import Algoritmos.RegresionMultiple;
import com.sun.istack.internal.logging.Logger;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marianaortc
 */
public class RegresionMultiplePanel extends javax.swing.JPanel {
DecimalFormat df = new DecimalFormat("#.######");
   RegresionMultiple rm= new RegresionMultiple();
   double [][] matriz;
    public RegresionMultiplePanel() {
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
        LabelCorrelacion = new javax.swing.JLabel();
        Labely = new javax.swing.JLabel();

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
                "x1", "x2", "y"
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
                "x1", "x2", "y", "x1*y", "x1^2", "x2^2", "x1*x2", "x2*y", "(ymed-yi)^2", "(ymed-a0-a1xi)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, true, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblResultados);
        if (tblResultados.getColumnModel().getColumnCount() > 0) {
            tblResultados.getColumnModel().getColumn(8).setResizable(false);
            tblResultados.getColumnModel().getColumn(9).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnok)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCalcular)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(LabelCorrelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Labely, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(Labely, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnok)
                            .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnCalcular))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelCorrelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(160, 160, 160))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnActionPerformed
        
    }//GEN-LAST:event_txtnActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
    
       double[][] tablemat;
        int fila = tblxy.getRowCount();
        DefaultTableModel tabla1 = (DefaultTableModel) tblResultados.getModel();
        Object [] filaob= new Object[10];
        
        for (int i = 0; i < tblResultados.getRowCount(); i++) 
        {
            tabla1.removeRow(i);
            i-=1;
        }
        matriz=new double[fila][10];
        
        for(int i = 0; i < fila; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                String valor = tblxy.getValueAt(i, j).toString();
                matriz[i][j] = Float.parseFloat(valor);
            }
        }
        tablemat=new double[fila][10];
         
        tablemat=rm.table(matriz, fila, rm.promedioy(matriz, fila));
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
                filaob[8]=df.format(tablemat[e][8]);
                filaob[9]=df.format(tablemat[e][9]);
            tabla1.addRow(filaob);
            
         }
         Labely.setText(rm.resultado(tablemat, fila));
         LabelCorrelacion.setText(rm.coeficiente(fila));
    /*for(int i = 0; i < fila+1; i++)
        {
            for(int j = 0; j < 6; j++)
            {
                tblResultados.setValueAt(tablemat[i][j], fila, j);
            }
        }*/
    
       
        rm.coeficiente(fila);
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
    private javax.swing.JLabel LabelCorrelacion;
    private javax.swing.JLabel Labely;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblMatriz;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTable tblxy;
    private javax.swing.JTextField txtn;
    // End of variables declaration//GEN-END:variables
}

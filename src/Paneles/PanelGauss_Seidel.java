package Paneles;

import Algoritmos.GaussSeidel;
import Algoritmos.txtResultados;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PanelGauss_Seidel extends javax.swing.JPanel 
{
    GaussSeidel gs = new GaussSeidel();
    double error = 0.001;
    double [][] matriz;
    int n, limite = 100;
    int var, piv;
    boolean vf;
    txtResultados txtR =  new txtResultados();
    JOptionPane info = new JOptionPane();

    public PanelGauss_Seidel() {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_opciones = new javax.swing.ButtonGroup();
        opt3 = new javax.swing.JRadioButton();
        opt6 = new javax.swing.JRadioButton();
        opt10 = new javax.swing.JRadioButton();
        opt9 = new javax.swing.JRadioButton();
        opt5 = new javax.swing.JRadioButton();
        opt7 = new javax.swing.JRadioButton();
        opt8 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatriz = new javax.swing.JTable();
        btnCalcular = new javax.swing.JButton();
        opt4 = new javax.swing.JRadioButton();
        lblGauss = new javax.swing.JLabel();

        opt3.setText("3 x 3");
        opt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt3ActionPerformed(evt);
            }
        });

        opt6.setText("6 x 6");
        opt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt6ActionPerformed(evt);
            }
        });

        opt10.setText("10 x 10");
        opt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt10ActionPerformed(evt);
            }
        });

        opt9.setText("9 x 9");
        opt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt9ActionPerformed(evt);
            }
        });

        opt5.setText("5 x 5");
        opt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt5ActionPerformed(evt);
            }
        });

        opt7.setText("7 x 7");
        opt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt7ActionPerformed(evt);
            }
        });

        opt8.setText("8 x 8");
        opt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt8ActionPerformed(evt);
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

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        opt4.setText("4 x 4");
        opt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt4ActionPerformed(evt);
            }
        });

        lblGauss.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGauss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGauss.setText("SOLUCIÓN POR GAUSS-SEIDEL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opt3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opt9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opt5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opt6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opt8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opt10)
                    .addComponent(opt4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opt7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                    .addComponent(lblGauss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(opt3)
                        .addGap(18, 18, 18)
                        .addComponent(opt4)
                        .addGap(18, 18, 18)
                        .addComponent(opt5)
                        .addGap(18, 18, 18)
                        .addComponent(opt6)
                        .addGap(18, 18, 18)
                        .addComponent(opt7)
                        .addGap(18, 18, 18)
                        .addComponent(opt8)
                        .addGap(18, 18, 18)
                        .addComponent(opt9)
                        .addGap(18, 18, 18)
                        .addComponent(opt10))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGauss, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void opt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt3ActionPerformed
     n=3;
       piv = 0;
       var = n;
       matriz = new double[n][n+1];
       
       tabla(n);
    }//GEN-LAST:event_opt3ActionPerformed

    private void opt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt7ActionPerformed
       n=7;
       piv = 0;
       var = n;
       matriz = new double[n][n+1];
       
       tabla(n);
    }//GEN-LAST:event_opt7ActionPerformed

    private void opt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt5ActionPerformed
        n=5;
       piv = 0;
       var = n;
       matriz = new double[n][n+1];
       
       tabla(n);
    }//GEN-LAST:event_opt5ActionPerformed

    private void opt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt6ActionPerformed
        n=6;
       piv = 0;
       var = n;
       matriz = new double[n][n+1];
       
       tabla(n);
    }//GEN-LAST:event_opt6ActionPerformed

    private void opt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt9ActionPerformed
        n=9;
       piv = 0;
       var = n;
       matriz = new double[n][n+1];
       
       tabla(n);
    }//GEN-LAST:event_opt9ActionPerformed

    private void opt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt10ActionPerformed
       n=10;
       piv = 0;
       var = n;
       matriz = new double[n][n+1];
       
       tabla(n);
    }//GEN-LAST:event_opt10ActionPerformed

    private void opt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt8ActionPerformed
        n=8;
       piv = 0;
       var = n;
       matriz = new double[n][n+1];
       
       tabla(n);
    }//GEN-LAST:event_opt8ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int filas = tblMatriz.getRowCount();
        int columna = tblMatriz.getColumnCount();
        
        for(int i = 0; i < filas; i++)
        {
            for(int j = 0; j < columna; j++)
            {
                String valor = tblMatriz.getValueAt(i, j).toString();
                matriz[i][j] = Float.parseFloat(valor);
            }
        }

        txtR.txtResultados(gs.evaluar(matriz, error, limite));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void opt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt4ActionPerformed
        // TODO add your handling code here:
       n=4;
       piv = 0;
       var = n;
       matriz = new double[n][n+1];
       
       tabla(n);
    }//GEN-LAST:event_opt4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup grupo_opciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGauss;
    private javax.swing.JRadioButton opt10;
    private javax.swing.JRadioButton opt3;
    private javax.swing.JRadioButton opt4;
    private javax.swing.JRadioButton opt5;
    private javax.swing.JRadioButton opt6;
    private javax.swing.JRadioButton opt7;
    private javax.swing.JRadioButton opt8;
    private javax.swing.JRadioButton opt9;
    private javax.swing.JTable tblMatriz;
    // End of variables declaration//GEN-END:variables
}

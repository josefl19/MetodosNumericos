package Paneles;

import Algoritmos.Grafico;
import Algoritmos.Biseccion;
import Algoritmos.Secante;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class PanelSecante extends javax.swing.JPanel {
    
    int iteracion = 1;
    double errorPermitido = 0.01, error=1;
    double xi1, XrAnt;
    double fxi1, fximinus, xi;
    String funcion;
    
    Grafico g = new Grafico();
    
    public PanelSecante() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtxminus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtxi = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MÉTODO DE LA SECANTE");

        jLabel2.setText("f(x)=");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X i-1:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X i:");

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Xi-1", "Xi", "f(Xi)", "f(Xi-1)", "X i+1", "Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResultados);

        jLabel6.setText("Escribir todos los operadores que existan en la función explícitamente.");

        jLabel7.setText("Ejemplo: 2x^4-3x  escribirlo como 2*x^4-3*x");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtxminus)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtxi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnCalcular)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtxminus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtxi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        Secante S = new Secante();
        
        funcion = txtFuncion.getText();
        double ximinus = Double.parseDouble(txtxminus.getText());
        double xi = Double.parseDouble(txtxi.getText());
        
        Grafico g = new Grafico();
                
        DefaultTableModel tabla = (DefaultTableModel) tblResultados.getModel();
        
        for (int i = 0; i < tblResultados.getRowCount(); i++) 
        {
            tabla.removeRow(i);
            i-=1;
        }
        
        Object[] fila = new Object[8];
        
        iteracion = 1;
        error=1;
        
        do
        {
            fila[0] = iteracion; // Iteracion
            fila[1] = ximinus; // Limite de a
            fila[2] = xi; // Limite de b
            
            try {
                fila[3] = S.fxiSec(funcion, xi); // f(a)
            } catch (Exception ex) {
                Logger.getLogger(PanelBiseccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                fila[4] = S.fximinusSec(funcion, ximinus); // f(b)
            } catch (Exception ex) {
                Logger.getLogger(PanelBiseccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        try {
            fxi1=Double.parseDouble(S.fxiSec(funcion, xi));
        } catch (Exception ex) {
            Logger.getLogger(PanelSecante.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fximinus=Double.parseDouble(S.fximinusSec(funcion, ximinus));
        } catch (Exception ex) {
            Logger.getLogger(PanelSecante.class.getName()).log(Level.SEVERE, null, ex);
        }
            xi1=Double.parseDouble(S.xiplus1(xi, fxi1, fximinus, ximinus));
            fila[5] = xi1;// Xr

            if(iteracion != 1)
            {
                error = Double.parseDouble(S.error(XrAnt, xi1));
                fila[6] = error; // Error
            }
            else
                fila[6] = ""; // Error
            
            tabla.addRow(fila);
            
            XrAnt = xi1;
            iteracion++;
            ximinus=xi;
            xi=xi1;
        } while(error > errorPermitido);

        tblResultados.setModel(tabla);
        g.grafica(funcion, (ximinus-xi)/2);
    }//GEN-LAST:event_btnCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtxi;
    private javax.swing.JTextField txtxminus;
    // End of variables declaration//GEN-END:variables
}

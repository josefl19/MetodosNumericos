package Paneles;
import Algoritmos.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class PanelNewtonRaphson extends javax.swing.JPanel 
{
    String funcion1, funcion2, derivadaf1x, derivadaf1y, derivadaf2x, derivadaf2y;
    double x, y, xi, yi, Xant, Yant;
    double errorPermitido = 0.001;
    double f1, f2, df1x, df1y, df2x, df2y;
    double deltaX, deltaY, errorX, errorY;
    int iteracion;
    public PanelNewtonRaphson() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_f1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_f2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_df1x = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_df1y = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_df2x = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_df2y = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtX = new javax.swing.JTextField();
        txtY = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        btnCalcular = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ECUACIONES NO LIENALES POR NEWTON-RAPHSON MULTIVARIABLE");

        jLabel2.setText("f1(x,y):");

        txt_f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_f1ActionPerformed(evt);
            }
        });

        jLabel3.setText("f2(x,y):");

        jLabel4.setText("Derivadas parciales:");

        jLabel5.setText("df1/dx:");

        txt_df1x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_df1xActionPerformed(evt);
            }
        });

        jLabel6.setText("df1/dy:");

        jLabel7.setText("df2/dx:");

        jLabel8.setText("df2/dy:");

        jLabel9.setText("x:");

        jLabel10.setText("y:");

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "x", "y", "f1", "f2", "df1/dx", "df1/dy", "df2/dx", "df2/dy", "DeltX", "DeltY", "Ep x", "Ep y"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResultados);

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_f1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_df1x, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_df1y)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_f2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_df2x, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_df2y, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_f1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_f2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_df1x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_df1y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_df2x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_df2y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_df1xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_df1xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_df1xActionPerformed

    private void txt_f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_f1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_f1ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        NewtonRaphsonMulti nrm = new NewtonRaphsonMulti();
        DefaultTableModel tabla = (DefaultTableModel) tblResultados.getModel();
        
        iteracion = 1;
        errorX = 1;
        errorY = 1;
        funcion1 = txt_f1.getText();
        funcion2 = txt_f2.getText();
        derivadaf1x = txt_df1x.getText();
        derivadaf1y = txt_df1y.getText();
        derivadaf2x = txt_df2x.getText();
        derivadaf2y = txt_df2y.getText();
        x = Double.parseDouble(txtX.getText());
        y = Double.parseDouble(txtY.getText());
        
        Object[] fila = new Object[13];
        
        do
        {
            fila[0] = iteracion; // Iteracion
            fila[1] = x; // Limite de a
            fila[2] = y; // Limite de b
            
            try {
                fila[3] = nrm.evaluar(funcion1, x, y);
            } catch (Exception ex) {
                Logger.getLogger(PanelNewtonRaphson.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                fila[4] = nrm.evaluar(funcion2, x, y);
            } catch (Exception ex) {
                Logger.getLogger(PanelNewtonRaphson.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                fila[5] = nrm.evaluar(derivadaf1x, x, y);
            } catch (Exception ex) {
                Logger.getLogger(PanelNewtonRaphson.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                fila[6] = nrm.evaluar(derivadaf1y, x, y);
            } catch (Exception ex) {
                Logger.getLogger(PanelNewtonRaphson.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                fila[7] = nrm.evaluar(derivadaf2x, x, y);
            } catch (Exception ex) {
                Logger.getLogger(PanelNewtonRaphson.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                fila[8] = nrm.evaluar(derivadaf2y, x, y);
            } catch (Exception ex) {
                Logger.getLogger(PanelNewtonRaphson.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                f1 = Double.parseDouble(nrm.evaluar(funcion1, x, y));
            } catch (Exception ex) {
                Logger.getLogger(PanelNewtonRaphson.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                f2 = Double.parseDouble(nrm.evaluar(funcion2, x, y));
            } catch (Exception ex) {
                Logger.getLogger(PanelNewtonRaphson.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                df1x = Double.parseDouble(nrm.evaluar(derivadaf1x, x, y));
            } catch (Exception ex) {
                Logger.getLogger(PanelNewtonRaphson.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                df1y = Double.parseDouble(nrm.evaluar(derivadaf1y, x, y));
            } catch (Exception ex) {
                Logger.getLogger(PanelNewtonRaphson.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                df2x = Double.parseDouble(nrm.evaluar(derivadaf2x, x, y));
            } catch (Exception ex) {
                Logger.getLogger(PanelNewtonRaphson.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                df2y = Double.parseDouble(nrm.evaluar(derivadaf2y, x, y));
            } catch (Exception ex) {
                Logger.getLogger(PanelNewtonRaphson.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            deltaX = ((-f1*df2y)+(f2*df1y))/((df1x*df2y)-(df2x*df1y));
            deltaY = ((-f2*df1x)+(f1*df2x))/((df1x*df2y)-(df2x*df1y));
            
            fila[9] = deltaX;
            fila[10] = deltaY;
            
            xi = deltaX+x;
            yi = deltaY+y;
            Xant = x;
            x = xi;
            y = yi;
            
            if(iteracion != 1)
            {
                errorX = Double.parseDouble(nrm.error(Xant, xi));
                errorY = Double.parseDouble(nrm.error(Yant, yi));
                fila[11] = errorX; // Error
                fila[12] = errorY; // Error
            }
            else
            {
                fila[11] = ""; // Error
                fila[12] = "";
            }
            
            tabla.addRow(fila);
            
        }while(errorX > errorPermitido && errorY > errorPermitido);
        
        tblResultados.setModel(tabla);
    }//GEN-LAST:event_btnCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txtX;
    private javax.swing.JTextField txtY;
    private javax.swing.JTextField txt_df1x;
    private javax.swing.JTextField txt_df1y;
    private javax.swing.JTextField txt_df2x;
    private javax.swing.JTextField txt_df2y;
    private javax.swing.JTextField txt_f1;
    private javax.swing.JTextField txt_f2;
    // End of variables declaration//GEN-END:variables
}

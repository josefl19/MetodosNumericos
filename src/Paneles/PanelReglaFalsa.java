package Paneles;
import Algoritmos.Grafico;
import Algoritmos.ReglaFalsa;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class PanelReglaFalsa extends javax.swing.JPanel 
{
    int iteracion = 1;
    double errorPermitido = 0.01, error=1;
    double Xr, XrAnt;
    double fA, fB, fXr;
    String funcion, vacio = " ";
    
    Grafico g = new Grafico();
    
    public PanelReglaFalsa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLimiteA = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLimiteB = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("f(x):");

        txtFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuncionActionPerformed(evt);
            }
        });

        jLabel2.setText("a:");

        txtLimiteA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimiteAActionPerformed(evt);
            }
        });

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO.", "a", "b", "f(a)", "f(b)", "Xr", "f(Xr)", "Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResultados);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MÉTODO DE LA REGLA FALSA");

        jLabel4.setText("b:");

        txtLimiteB.setPreferredSize(new java.awt.Dimension(65, 20));

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel5.setText("Escribir todos los operadores que existan en la función explícitamente.");

        jLabel6.setText("Ejemplo: 2x^4-3x  escribirlo como 2*x^4-3*x");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLimiteA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLimiteB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLimiteB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLimiteA, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCalcular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFuncionActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        ReglaFalsa rf = new ReglaFalsa();
        
        funcion = txtFuncion.getText();
        double limiteA = Double.parseDouble(txtLimiteA.getText());
        double limiteB = Double.parseDouble(txtLimiteB.getText());
                
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
            fila[1] = limiteA; // Limite de a
            fila[2] = limiteB; // Limite de b
            
            try {
                fA = Double.parseDouble(rf.fa(funcion, limiteA));
            } catch (Exception ex) {
                Logger.getLogger(PanelBiseccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                fB =Double.parseDouble( rf.fb(funcion, limiteB));
            } catch (Exception ex) {
                Logger.getLogger(PanelBiseccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                fila[3] = fA; // f(a)
            } catch (Exception ex) {
                Logger.getLogger(PanelBiseccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                fila[4] = fB; // f(b)
            } catch (Exception ex) {
                Logger.getLogger(PanelBiseccion.class.getName()).log(Level.SEVERE, null, ex);
            }
               
            try {
                Xr = Double.parseDouble(rf.Xr(limiteA, limiteB, fA, fB));
            } catch (Exception ex) {
                Logger.getLogger(PanelBiseccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                fila[5] = Xr; // Xr
            } catch (Exception ex) {
                Logger.getLogger(PanelReglaFalsa.class.getName()).log(Level.SEVERE, null, ex);
            }   
            
            try {
                fXr = Double.parseDouble(rf.fxr(funcion, Xr));
            } catch (Exception ex) {
                Logger.getLogger(PanelBiseccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                fila[6] = fXr; // f(Xr)
            } catch (Exception ex) {
                Logger.getLogger(PanelBiseccion.class.getName()).log(Level.SEVERE, null, ex);
            }

            if(fA*fXr > 0)
                limiteA = Xr;
            else
            {
                if(fA*Xr < 0)
                    limiteB = Xr;
            }
            
            if(iteracion != 1)
            {
                error = Double.parseDouble(rf.error(XrAnt, Xr));
                fila[7] = error; // Error
            }
            else
                fila[7] = ""; // Error
            
            tabla.addRow(fila);
            
            XrAnt = Xr;
            iteracion++;
        } while(error > errorPermitido || (fA*fXr)==0);

        tblResultados.setModel(tabla);
        g.grafica(funcion, (limiteA-limiteB)/2);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtLimiteAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimiteAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLimiteAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtLimiteA;
    private javax.swing.JTextField txtLimiteB;
    // End of variables declaration//GEN-END:variables
}

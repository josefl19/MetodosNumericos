
import Algoritmos.ReglaFalsa;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class PanelPuntoFijo extends javax.swing.JPanel 
{
    String funcion;
    double x0, x1;
    int iteracion=1;
    double error, errorPermitido = 0.0001;
    
    public PanelPuntoFijo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLimiteA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLimiteB = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(685, 293));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MÉTODO DEL PUNTO FIJO");

        jLabel2.setText("a:");

        jLabel3.setText("f(x):");

        txtLimiteA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimiteAActionPerformed(evt);
            }
        });

        jLabel4.setText("b:");

        txtLimiteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimiteBActionPerformed(evt);
            }
        });

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
                "No.", "X0", "X", "f(x)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLimiteA, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLimiteB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(btnCalcular))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 72, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFuncion)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLimiteB)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLimiteA)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLimiteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimiteBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLimiteBActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        ReglaFalsa rf = new ReglaFalsa();
        
        funcion = txtFuncion.getText();
        double limiteA = Double.parseDouble(txtLimiteA.getText());
        double limiteB = Double.parseDouble(txtLimiteB.getText());
                
        DefaultTableModel tabla = (DefaultTableModel) tblResultados.getModel();
        Object[] fila = new Object[8];
        
        do
        {
            fila[0] = iteracion; // Iteracion
            fila[1] = limiteA; // Limite de a
            fila[2] = limiteB; // Limite de b
            
            try {
                fA = rf.fa(funcion, limiteA);
            } catch (Exception ex) {
                Logger.getLogger(PanelBiseccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                fB = rf.fb(funcion, limiteB);
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
                Xr = rf.Xr(limiteA, limiteB, fA, fB);
            } catch (Exception ex) {
                Logger.getLogger(PanelBiseccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                fila[5] = Xr; // Xr
            } catch (Exception ex) {
                Logger.getLogger(PanelReglaFalsa.class.getName()).log(Level.SEVERE, null, ex);
            }   
            
            try {
                fXr = rf.fxr(funcion, Xr);
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
                error = Math.abs(((Xr-XrAnt)/Xr)*100);
                fila[7] = error; // Error
            }
            else
                fila[7] = Double.parseDouble(decimales.format(error)); // Error
            
            tabla.addRow(fila);
            
            XrAnt = Xr;
            iteracion++;
        } while(error > errorPermitido || (fA*fXr)==0);

        tblResultados.setModel(tabla);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtLimiteA;
    private javax.swing.JTextField txtLimiteB;
    // End of variables declaration//GEN-END:variables
}

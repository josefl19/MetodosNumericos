package Paneles;
import Algoritmos.Grafico;
import Algoritmos.NewtonRaphson;
import Algoritmos.Secante;
import Paneles.PanelSecante;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class PanelNewton extends javax.swing.JPanel 
{
    int iteracion = 1;
    double errorPermitido = 0.01, error=1;
    double xi1, XrAnt;
    double fxi1, fxiderivada, xi;
    String funcion,derivada;
    Grafico g = new Grafico();

    public PanelNewton() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        txtDerivada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtXi = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MÉTODO NEWTON-RAPHSON");

        jLabel2.setText("f(x)=");

        jLabel3.setText("f '(x)=");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("xi:");

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
                "No.", "Xi", "f(Xi)", "f´(Xi)", "Xi+1", "Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResultados);

        jLabel5.setText("Escribir todos los operadores que existan en la función explícitamente.");

        jLabel6.setText("Ejemplo: 2x^4-3x  escribirlo como 2*x^4-3*x");

        jLabel7.setText("Ejemplo: 2x^4-3x escribirlo como 2*x^4-3*x");

        jLabel8.setText("Ejemplo: 2x^4-3x  escribirlo como 2*x^4-3*x");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFuncion)
                            .addComponent(txtDerivada, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(btnCalcular)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(280, 280, 280))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(192, 192, 192)
                    .addComponent(jLabel6)
                    .addContainerGap(193, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(202, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(183, 183, 183)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtXi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDerivada, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(83, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(289, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(73, 73, 73)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        NewtonRaphson N = new NewtonRaphson();
        
        funcion = txtFuncion.getText();
        derivada= txtDerivada.getText();
       
        double xi = Double.parseDouble(txtXi.getText());
                
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
            fila[1] = xi; // Limite de a

            try {
                fila[2] = N.fxiNR(funcion, xi); // f(a)
            } catch (Exception ex) {
                Logger.getLogger(PanelBiseccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                fila[3] = N.dfxiNR(derivada, xi); // f(b)
            } catch (Exception ex) {
                Logger.getLogger(PanelBiseccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        try {
            
            fxi1=Double.parseDouble(N.fxiNR(funcion, xi));
            
        } catch (Exception ex) {
            Logger.getLogger(PanelSecante.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fxiderivada=Double.parseDouble(N.dfxiNR(derivada, xi));
        } catch (Exception ex) {
            Logger.getLogger(PanelSecante.class.getName()).log(Level.SEVERE, null, ex);
        }
            xi1=Double.parseDouble(N.xiplus1(xi, fxi1,fxiderivada));
            fila[4] = xi1;// Xr

            if(iteracion != 1)
            {
                error =Double.parseDouble( N.error(XrAnt,xi1));
                fila[5] = error; // Error
            }
            else
                fila[5] = ""; // Error
            
            tabla.addRow(fila);
            
            XrAnt = xi1;
            iteracion++;
            xi=xi1;
            
        } while(error > errorPermitido);

        tblResultados.setModel(tabla);
        g.grafica(funcion, xi);

    }//GEN-LAST:event_btnCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txtDerivada;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtXi;
    // End of variables declaration//GEN-END:variables
}

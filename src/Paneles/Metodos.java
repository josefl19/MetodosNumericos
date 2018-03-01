public class Metodos extends javax.swing.JFrame 
{
    public Metodos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuSalir = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBiseccion = new javax.swing.JMenuItem();
        jMenuReglaFalsa = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuPuntoFijo = new javax.swing.JMenuItem();
        jMenuNewton = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("GRAFICO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        jMenu1.setText("Inicio");

        jMenuSalir.setText("Salir");
        jMenu1.add(jMenuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Unidad 1");

        jMenuBiseccion.setText("Método de Bisección");
        jMenuBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBiseccionActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuBiseccion);

        jMenuReglaFalsa.setText("Método de la Regla Falsa");
        jMenuReglaFalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuReglaFalsaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuReglaFalsa);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Unidad 2");

        jMenuPuntoFijo.setText("Método Punto Fijo");
        jMenuPuntoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPuntoFijoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuPuntoFijo);

        jMenuNewton.setText("Método Newton-Raphson");
        jMenuNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNewtonActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuNewton);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Unidad 3");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Unidad 4");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBiseccionActionPerformed
        PanelBiseccion pb = new PanelBiseccion();
        pb.setSize(685,293);
        panelPrincipal.removeAll();
        panelPrincipal.add(pb);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jMenuBiseccionActionPerformed

    private void jMenuReglaFalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuReglaFalsaActionPerformed
        PanelReglaFalsa prf = new PanelReglaFalsa();
        prf.setSize(685,293);
        panelPrincipal.removeAll();
        panelPrincipal.add(prf);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jMenuReglaFalsaActionPerformed

    private void jMenuPuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPuntoFijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuPuntoFijoActionPerformed

    private void jMenuNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNewtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuNewtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception 
    {
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
            java.util.logging.Logger.getLogger(Metodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Metodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Metodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Metodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Metodos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuBiseccion;
    private javax.swing.JMenuItem jMenuNewton;
    private javax.swing.JMenuItem jMenuPuntoFijo;
    private javax.swing.JMenuItem jMenuReglaFalsa;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}

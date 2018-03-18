package Paneles;

//import Paneles.*;
import javax.swing.JPanel;

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
        panelGrafico = new javax.swing.JPanel();
        jMenuPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuSalir = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBiseccion = new javax.swing.JMenuItem();
        jMenuReglaFalsa = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuPuntoFijo = new javax.swing.JMenuItem();
        jMenuNewton = new javax.swing.JMenuItem();
        jMenuSecante = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuGauss = new javax.swing.JMenuItem();
        jMenuGaussJordan = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setPreferredSize(new java.awt.Dimension(685, 293));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jMenu1.setText("Inicio");

        jMenuSalir.setText("Salir");
        jMenu1.add(jMenuSalir);

        jMenuPrincipal.add(jMenu1);

        jMenu2.setText("Unidad 1");

        jMenuBiseccion.setText("Método Bisección");
        jMenuBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBiseccionActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuBiseccion);

        jMenuReglaFalsa.setText("Método Regla Falsa");
        jMenuReglaFalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuReglaFalsaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuReglaFalsa);

        jMenuPrincipal.add(jMenu2);

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

        jMenuSecante.setText("Método Secante");
        jMenuSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSecanteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuSecante);

        jMenuPrincipal.add(jMenu3);

        jMenu4.setText("Unidad 3");

        jMenu6.setText("Solución de Ecuaciones");

        jMenuGauss.setText("Gauss");
        jMenuGauss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGaussActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuGauss);

        jMenuGaussJordan.setText("Gauss-Jordan");
        jMenuGaussJordan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGaussJordanActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuGaussJordan);

        jMenu4.add(jMenu6);

        jMenuPrincipal.add(jMenu4);

        jMenu5.setText("Unidad 4");
        jMenuPrincipal.add(jMenu5);

        setJMenuBar(jMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBiseccionActionPerformed
        PanelBiseccion pb = new PanelBiseccion();
        pb.setSize(685,368);
        panelPrincipal.removeAll();
        panelPrincipal.add(pb);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jMenuBiseccionActionPerformed

    private void jMenuReglaFalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuReglaFalsaActionPerformed
        PanelReglaFalsa prf = new PanelReglaFalsa();
        prf.setSize(685,368);
        panelPrincipal.removeAll();
        panelPrincipal.add(prf);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jMenuReglaFalsaActionPerformed

    private void jMenuPuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPuntoFijoActionPerformed
        PanelPuntoFijo pf = new PanelPuntoFijo();
        pf.setSize(685,368);
        panelPrincipal.removeAll();
        panelPrincipal.add(pf);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jMenuPuntoFijoActionPerformed

    private void jMenuNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNewtonActionPerformed
        PanelNewton nr = new PanelNewton();
        nr.setSize(685,368);
        panelPrincipal.removeAll();
        panelPrincipal.add(nr);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();    }//GEN-LAST:event_jMenuNewtonActionPerformed

    private void jMenuSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSecanteActionPerformed
        PanelSecante ps = new PanelSecante();
        ps.setSize(685,368);
        panelPrincipal.removeAll();
        panelPrincipal.add(ps);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jMenuSecanteActionPerformed

    private void jMenuGaussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGaussActionPerformed
        // TODO add your handling code here:
        PanelGauss pg = new PanelGauss();
        pg.setSize(685,368);
        panelPrincipal.removeAll();
        panelPrincipal.add(pg);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jMenuGaussActionPerformed

    private void jMenuGaussJordanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGaussJordanActionPerformed
        // TODO add your handling code here:
        PanelGauss_Jordan pgj = new PanelGauss_Jordan();
        pgj.setSize(685,368);
        panelPrincipal.removeAll();
        panelPrincipal.add(pgj);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jMenuGaussJordanActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuBiseccion;
    private javax.swing.JMenuItem jMenuGauss;
    private javax.swing.JMenuItem jMenuGaussJordan;
    private javax.swing.JMenuItem jMenuNewton;
    private javax.swing.JMenuBar jMenuPrincipal;
    private javax.swing.JMenuItem jMenuPuntoFijo;
    private javax.swing.JMenuItem jMenuReglaFalsa;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JMenuItem jMenuSecante;
    public static javax.swing.JPanel panelGrafico;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}

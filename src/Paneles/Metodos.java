package Paneles;

import Paneles.InstruccionesGauss;
import Paneles.PanelJacobi;
import Paneles.PanelBiseccion;
import Paneles.PanelGauss;
import Paneles.PanelGauss_Jordan;
import Paneles.PanelInterpolacion;
import Paneles.PanelNewton;
import Paneles.PanelPuntoFijo;
import Paneles.PanelReglaFalsa;
import Paneles.PanelRegresionPolinomial;
import Paneles.PanelSecante;
import Paneles.RegresionMinimosPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Metodos extends javax.swing.JFrame 
{   
    public Metodos() 
    {
        initComponents();
        
       // ImageIcon portada = new ImageIcon("src/imagenes/inicio1.jpeg");
        ImageIcon portada = new ImageIcon(getClass().getResource("/imagenes/inicio1.jpeg")); 

       // ImageIcon logo = new ImageIcon("src/imagenes/logo.jpeg");
                ImageIcon logo = new ImageIcon(getClass().getResource("/imagenes/logo.jpeg")); 

        JLabel port = new JLabel(portada);
        JLabel icon = new JLabel(logo);
        
        port.setIcon(portada);
        port.setSize(689,400);
        port.setLocation(0,0);
        port.setVisible(true);
        
        icon.setIcon(logo);
        icon.setSize(523,400);
        icon.setLocation(0,0);
        icon.setVisible(true);
        
        panelPrincipal.add(port);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        
        panelGrafico.add(icon);
        panelGrafico.revalidate();
        panelGrafico.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelGrafico = new javax.swing.JPanel();
        jMenuPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMenuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuBiseccion = new javax.swing.JMenuItem();
        jMenuReglaFalsa = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuPuntoFijo = new javax.swing.JMenuItem();
        jMenuNewton = new javax.swing.JMenuItem();
        jMenuSecante = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuGauss = new javax.swing.JMenuItem();
        jMenuGaussJordan = new javax.swing.JMenuItem();
        jMenuJacobi = new javax.swing.JMenuItem();
        jMenuGaussSeidel = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuNewtonRaph = new javax.swing.JMenuItem();
        jMenuRegresion = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuInterpolacionCuad = new javax.swing.JMenuItem();
        jMenuInterpolacion = new javax.swing.JMenuItem();
        jMenuRMultiple = new javax.swing.JMenuItem();
        jMenuRegresionPolinomial = new javax.swing.JMenuItem();
        jMenuInterpolacionNewton = new javax.swing.JMenuItem();
        jMenuLagrange = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Métodos Numericos");
        setResizable(false);

        panelPrincipal.setPreferredSize(new java.awt.Dimension(685, 293));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("Inicio");

        JMenuSalir.setText("Salir");
        JMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(JMenuSalir);

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

        jMenu7.setText("Lineales");

        jMenuGauss.setText("Gauss");
        jMenuGauss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGaussActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuGauss);

        jMenuGaussJordan.setText("Gauss-Jordan");
        jMenuGaussJordan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGaussJordanActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuGaussJordan);

        jMenuJacobi.setText("Jacobi");
        jMenuJacobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuJacobiActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuJacobi);

        jMenuGaussSeidel.setText("Gauss-Seidel");
        jMenuGaussSeidel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGaussSeidelActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuGaussSeidel);

        jMenu6.add(jMenu7);

        jMenu8.setText("No Lineales");

        jMenuNewtonRaph.setText("Newton-Raphson");
        jMenuNewtonRaph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNewtonRaphActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuNewtonRaph);

        jMenu6.add(jMenu8);

        jMenu4.add(jMenu6);

        jMenuRegresion.setText("Regresión Lineal");
        jMenuRegresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegresionActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuRegresion);

        jMenuPrincipal.add(jMenu4);

        jMenu5.setText("Unidad 4");

        jMenuInterpolacionCuad.setText("Interpolacion Cuadratica");
        jMenuInterpolacionCuad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInterpolacionCuadActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuInterpolacionCuad);

        jMenuInterpolacion.setText("Interpolación Lineal");
        jMenuInterpolacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInterpolacionActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuInterpolacion);

        jMenuRMultiple.setText("Regresión Multiple");
        jMenuRMultiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRMultipleActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuRMultiple);

        jMenuRegresionPolinomial.setText("Regresión Polinomial");
        jMenuRegresionPolinomial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegresionPolinomialActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuRegresionPolinomial);

        jMenuInterpolacionNewton.setText("Interpolacion Newton");
        jMenuInterpolacionNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInterpolacionNewtonActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuInterpolacionNewton);

        jMenuLagrange.setText("Interpolacion de Lagrange");
        jMenuLagrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLagrangeActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuLagrange);

        jMenuPrincipal.add(jMenu5);

        setJMenuBar(jMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        pg.setSize(685,340);
        panelPrincipal.removeAll();
        panelPrincipal.add(pg);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        
        InstruccionesGauss ig = new InstruccionesGauss();
        ig.setLocationRelativeTo(null);
        ig.setVisible(true);
    }//GEN-LAST:event_jMenuGaussActionPerformed

    private void jMenuGaussJordanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGaussJordanActionPerformed
        // TODO add your handling code here:
        PanelGauss_Jordan pgj = new PanelGauss_Jordan();
        pgj.setSize(691,355);
        panelPrincipal.removeAll();
        panelPrincipal.add(pgj);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        
        InstruccionesGauss ig = new InstruccionesGauss();
        ig.setLocationRelativeTo(null);
        ig.setVisible(true);
    }//GEN-LAST:event_jMenuGaussJordanActionPerformed

    private void JMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuSalirActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_JMenuSalirActionPerformed

    private void jMenuJacobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuJacobiActionPerformed
        PanelJacobi pj = new PanelJacobi();
        pj.setSize(691,355);
        panelPrincipal.removeAll();
        panelPrincipal.add(pj);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        
        InstruccionesGauss ig = new InstruccionesGauss();
        ig.setLocationRelativeTo(null);
        ig.setVisible(true);
    }//GEN-LAST:event_jMenuJacobiActionPerformed

    private void jMenuGaussSeidelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGaussSeidelActionPerformed
        PanelGauss_Seidel pgs = new PanelGauss_Seidel();
        pgs.setSize(691,355);
        panelPrincipal.removeAll();
        panelPrincipal.add(pgs);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        
        InstruccionesGauss ig = new InstruccionesGauss();
        ig.setLocationRelativeTo(null);
        ig.setVisible(true);
    }//GEN-LAST:event_jMenuGaussSeidelActionPerformed

    private void jMenuRegresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegresionActionPerformed
        RegresionMinimosPanel rmcp= new RegresionMinimosPanel();
        rmcp.setSize(691,355);
        panelPrincipal.removeAll();
        panelPrincipal.add(rmcp);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jMenuRegresionActionPerformed

    private void jMenuInterpolacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInterpolacionActionPerformed
        PanelInterpolacion pi= new PanelInterpolacion();
        pi.setSize(691,355);
        panelPrincipal.removeAll();
        panelPrincipal.add(pi);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jMenuInterpolacionActionPerformed

    private void jMenuRegresionPolinomialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegresionPolinomialActionPerformed
        // TODO add your handling code here:
        PanelRegresionPolinomial prp= new PanelRegresionPolinomial();
        prp.setSize(691,355);
        panelPrincipal.removeAll();
        panelPrincipal.add(prp);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jMenuRegresionPolinomialActionPerformed

    private void jMenuRMultipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRMultipleActionPerformed
        RegresionMultiplePanel rmp= new RegresionMultiplePanel();
        rmp.setSize(691,355);
        panelPrincipal.removeAll();
        panelPrincipal.add(rmp);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jMenuRMultipleActionPerformed

    private void jMenuInterpolacionCuadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInterpolacionCuadActionPerformed
        PanelInterpolacionCuadratica rmp= new PanelInterpolacionCuadratica();
        rmp.setSize(691,355);
        panelPrincipal.removeAll();
        panelPrincipal.add(rmp);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jMenuInterpolacionCuadActionPerformed

    private void jMenuLagrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLagrangeActionPerformed
        // TODO add your handling code here:
        PanelLagrange pla = new PanelLagrange();
        pla.setSize(691,355);
        panelPrincipal.removeAll();
        panelPrincipal.add(pla);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jMenuLagrangeActionPerformed

    private void jMenuInterpolacionNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInterpolacionNewtonActionPerformed
        // TODO add your handling code here:
        PanelInterpolacionNewton pin = new PanelInterpolacionNewton();
        pin.setSize(685,368);
        panelPrincipal.removeAll();
        panelPrincipal.add(pin);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jMenuInterpolacionNewtonActionPerformed

    private void jMenuNewtonRaphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNewtonRaphActionPerformed
        PanelNewtonRaphson pnr = new PanelNewtonRaphson();
        pnr.setSize(685,368);
        panelPrincipal.removeAll();
        panelPrincipal.add(pnr);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jMenuNewtonRaphActionPerformed

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
    private javax.swing.JMenuItem JMenuSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuItem jMenuBiseccion;
    private javax.swing.JMenuItem jMenuGauss;
    private javax.swing.JMenuItem jMenuGaussJordan;
    private javax.swing.JMenuItem jMenuGaussSeidel;
    private javax.swing.JMenuItem jMenuInterpolacion;
    private javax.swing.JMenuItem jMenuInterpolacionCuad;
    private javax.swing.JMenuItem jMenuInterpolacionNewton;
    private javax.swing.JMenuItem jMenuJacobi;
    private javax.swing.JMenuItem jMenuLagrange;
    private javax.swing.JMenuItem jMenuNewton;
    private javax.swing.JMenuItem jMenuNewtonRaph;
    private javax.swing.JMenuBar jMenuPrincipal;
    private javax.swing.JMenuItem jMenuPuntoFijo;
    private javax.swing.JMenuItem jMenuRMultiple;
    private javax.swing.JMenuItem jMenuReglaFalsa;
    private javax.swing.JMenuItem jMenuRegresion;
    private javax.swing.JMenuItem jMenuRegresionPolinomial;
    private javax.swing.JMenuItem jMenuSecante;
    public static javax.swing.JPanel panelGrafico;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}

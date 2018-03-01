/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import javax.swing.JOptionPane;

/**
 *
 * @author marianaortc
 */
public class PuntoFijo {
    void datos() throws Exception
    {
    double x0, x1;
    String funcion;
    funcion=JOptionPane.showInputDialog("Escriba funcion");
    x0=Double.parseDouble(JOptionPane.showInputDialog("Escriba valor de x inicial"));
    Expresion ex= new Expresion(funcion);
       x1=ex.evaluar(x0);
       x0=x1;
    }
    
}

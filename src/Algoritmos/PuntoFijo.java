package Algoritmos;

import javax.swing.JOptionPane;

public class PuntoFijo 
{
    public double fx(String funcion, double x0) throws Exception
    {
       double x1;
       Expresion ex = new Expresion(funcion);
       x1 = ex.evaluar(x0);
       return x1;
    }

    /*void datos() throws Exception
    {
    double x0, x1;
    String funcion;
    funcion=JOptionPane.showInputDialog("Escriba funcion");
    x0=Double.parseDouble(JOptionPane.showInputDialog("Escriba valor de x inicial"));
    Expresion ex= new Expresion(funcion);
       x1=ex.evaluar(x0);
       x0=x1;
    }*/
}

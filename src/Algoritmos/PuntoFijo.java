package Algoritmos;

import javax.swing.JOptionPane;

public class PuntoFijo 
{
    public double x1(String funcion, double x0) throws Exception
    {
       double x1;
       Expresion ex = new Expresion(funcion);
       x1 = ex.evaluar(x0);
       return x1;
    }
}


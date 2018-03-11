package Algoritmos;

import javax.swing.JOptionPane;

public class PuntoFijo 
{
    double x1,error;
    String x11,error1,xant1,xact1;
    
    public String x1(String funcion, double x0) throws Exception
    {
       
       Expresion ex = new Expresion(funcion);
       x1 = ex.evaluar(x0);
       x11=String.format("%.6f", x1);
       return x11;
    }
        public String error(double xactual, double xanterior)
    {
        xact1=String.format("%.6f", xactual);
        xactual=Double.parseDouble(xact1);
        xant1=String.format("%.6f", xanterior);
        xanterior=Double.parseDouble(xant1);
        error=Math.abs(((xactual-xanterior)/xactual)*100);
        error1=String.format("%.6f", error);
        return error1;
    }
}


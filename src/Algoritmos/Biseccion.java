package Algoritmos;

import java.text.DecimalFormat;


public class Biseccion
{
    Expresion exp;
    String funcion,fa1,fb1,fxr1,error1,xant1,xact1;
    double a, b, xr;
    double error;
    
    public String fa(String funcion, double a) throws Exception
    {
        exp = new Expresion(funcion);
        double fa = exp.evaluar(a);
        fa1=String.format("%.6f", fa);
        return fa1;
    }
    
    public String fb(String funcion, double b) throws Exception
    {
        exp = new Expresion(funcion);
        double fb = exp.evaluar(b);
        fb1=String.format("%.6f", fb);
        return fb1;
    }
    
    public String fxr(String funcion, double x) throws Exception
    {
        exp = new Expresion(funcion);
        double fxr = exp.evaluar(x);
        fxr1=String.format("%.6f", fxr);
        return fxr1;
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

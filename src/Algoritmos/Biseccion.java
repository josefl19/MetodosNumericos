package Algoritmos;

import java.text.DecimalFormat;


public class Biseccion
{
    DecimalFormat decimales = new DecimalFormat(".000000");
    Expresion exp;
    String funcion;
    double a, b, xr;
    double error;
    
    public double fa(String funcion, double a) throws Exception
    {
        exp = new Expresion(funcion);
        double fa = exp.evaluar(a);
        decimales.format(fa);
        return fa;
    }
    
    public double fb(String funcion, double b) throws Exception
    {
        exp = new Expresion(funcion);
        double fb = exp.evaluar(b);
        return fb;
    }
    
    public double fxr(String funcion, double x) throws Exception
    {
        exp = new Expresion(funcion);
        double fxr = exp.evaluar(x);
        return fxr;
    }
}

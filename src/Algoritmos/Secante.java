package Algoritmos;


public class Secante {
    double ximinus,xi,fxi,fximinus,xiplus,error;
    String xiplus1,fxi1,fximinus1,error1,xant1,xact1;
    Expresion expr,ex;
    public String fxiSec(String dfuncion,double xi) throws Exception
    {
        expr= new Expresion(dfuncion);
        fxi=expr.evaluar(xi);
        fxi1=String.format("%.6f", fxi);
        return fxi1;
          
        
        
    }
    public String fximinusSec(String dfuncion,double ximinus) throws Exception
    {
        ex= new Expresion(dfuncion);
        fximinus=expr.evaluar(ximinus);
        fximinus1=String.format("%.6f", fximinus);
        return fximinus1;
        
    }
    public String xiplus1(double xi,double fxi, double fximinus, double ximinus)
    {
        xiplus=xi-((fxi*(ximinus-xi))/(fximinus-fxi));
        
        xiplus1=String.format("%.6f", xiplus);
        return xiplus1;
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
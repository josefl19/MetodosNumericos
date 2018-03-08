
package Algoritmos;



public class NewtonRaphson {
    double xi1,fxi,dfxi,xi,error;
    Expresion ex,expr;
    String fxi1,dfxi1,ximas,xact1,xant1,error1;
    
    public String fxiNR(String funcion,double xi) throws Exception
    {
        ex= new Expresion(funcion);
        fxi=ex.evaluar(xi);
        fxi1=String.format("%.6f", fxi);
        return fxi1;
        
    }
   public String dfxiNR(String dfuncion,double xi) throws Exception
    {
        expr= new Expresion(dfuncion);
        dfxi=expr.evaluar(xi);
        dfxi1=String.format("%.6f", dfxi);
        return dfxi1;
    }
   public String xiplus1(double xi, double fxi, double dfxi)
    {
      xi1=xi-(fxi/dfxi);  
      ximas=String.format("%.6f", xi1);
      return ximas;
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
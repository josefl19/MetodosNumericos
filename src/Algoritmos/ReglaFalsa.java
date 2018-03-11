package Algoritmos;

import javax.swing.JOptionPane;

public class ReglaFalsa {
     String xr1,fxr1,error1,xant1,xact1,fa1,fb1;
     double fb,fa,xr,fxr,error;
    public String fa (String funcion, double a) throws Exception
    {
       Expresion ex= new Expresion(funcion);
       fa=ex.evaluar(a);
       fa1=String.format("%.6f", fa);
       return fa1;
    }
    
    
    public String fb (String funcion, double b) throws Exception
    {
       
       Expresion ex= new Expresion(funcion);
       fb=ex.evaluar(b);
       fb1=String.format("%.6f", fb);
       
       return fb1;
    }
    
    public String Xr(double a, double b, double fa, double fb) throws Exception
    {
        
        xr=b-(((fb)*(a-b))/(fa-fb));
        xr1=String.format("%.6f", xr);
        return xr1;
    }
    
    public String fxr(String funcion, double xr) throws Exception
    {
       Expresion ex= new Expresion(funcion);
       fxr=ex.evaluar(xr);
       fxr1=String.format("%.6f", fxr1);
       
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

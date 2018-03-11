package Algoritmos;

import javax.swing.JOptionPane;

public class ReglaFalsa {
    public double fa (String funcion, double a) throws Exception
    {
       double fa1;
       Expresion ex= new Expresion(funcion);
       fa1=ex.evaluar(a);
       
       return fa1;
    }
    
    
    public double fb (String funcion, double b) throws Exception
    {
       double fb1;
       Expresion ex= new Expresion(funcion);
       fb1=ex.evaluar(b);
       
       return fb1;
    }
    
    public double Xr(double a, double b, double fa, double fb) throws Exception
    {
        double xr;
        xr=b-(((fb)*(a-b))/(fa-fb));
        return xr;
    }
    
    public double fxr(String funcion, double xr) throws Exception
    {
       double fxr1;
       Expresion ex= new Expresion(funcion);
       fxr1=ex.evaluar(xr);
       
       return fxr1;
    }
    
    /*public static void main (String args[]) throws Exception
    {
        double a,b,xr,fa,fb;
        String funcion;

       a=Double.parseDouble(JOptionPane.showInputDialog("Valor de a")) ;
       b=Double.parseDouble(JOptionPane.showInputDialog("Valor de b")) ;
       funcion=JOptionPane.showInputDialog("Valor de funcion") ;
       ReglaFalsa rf=new ReglaFalsa();
       System.out.println(rf.fa(funcion, a));
       System.out.println(rf.fb(funcion, b));
       fa=rf.fa(funcion, a);
       fb=rf.fb(funcion, b);
       System.out.println(rf.XrRf(a, b,fa,fb));
       xr=rf.XrRf(a, b,fa,fb);
       System.out.println(rf.fxr(funcion, xr));
       
       
    }*/
}

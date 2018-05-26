/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

/**
 *
 * @author marianaortc
 */
public class InterpolacionCuadratica {
   
    double [] fun=new double [3];
   
    double func,fx0,fx1,fx2;
    Expresion exp;

    public double[] llenar(String funcion,double x0,double x1, double x2,double num) throws Exception
    {
         
        exp = new Expresion(funcion);
        fx0=exp.evaluar(x0);
        fx1=exp.evaluar(x1);
        fx2=exp.evaluar(x2);
            fun[0]=1;
            fun[1]=1*(num-x0);
            fun[2]=1*(num-x0)*(num-x1);
            System.out.println("f(x)=b0+b1("+num+"-"+x0+")+b2("+num+"-"+x0+")*("+num+"-"+x1+")");
            
        return fun;
    }
    public double[] funcion(double[] fun,double x0,double x1, double x2)
    {
        double [] b=new double[3];
         double tempb2,temp3,temp4;
        b[0]=fx0;
        b[1]=(fx1-fx0)/(x1-x0);
        tempb2=(fx2-fx1)/(x2-x1);
        temp3=(fx1-fx0)/(x1-x0);
        b[2]=(tempb2-temp3)/(x2-x0);
        System.out.println("b0="+fx0);
        System.out.println("b1=("+fx1+"-"+fx0+")/("+x1+"-"+x0+")");
        System.out.println("b2=((("+fx2+"-"+fx1+")/("+x2+"-"+x1+"))-(("+fx1+"-"+fx0+")/("+x1+"-"+x0+")))/("+x2+"-"+x0+")");
        return b;
    }

    
    public String fin(double [] b, double[] fun, double x0, double x1, double x2,double num,String funcion) throws Exception
    {
        String fin;
        exp = new Expresion(funcion);
        double fx1,fx2,fx0;
         fx0=exp.evaluar(x0);
        fx1=exp.evaluar(x1);
        fx2=exp.evaluar(x2);
       fin= "f(x)=b0+b1("+num+"-"+x0+")+b2("+num+"-"+x0+")*("+num+"-"+x1+")";
       fin=fin+"\nb0="+fx0;
       fin=fin+"\nb1=("+fx1+"-"+fx0+")/("+x1+"-"+x0+")";
       fin=fin+"\nb2=((("+fx2+"-"+fx1+")/("+x2+"-"+x1+"))-(("+fx1+"-"+fx0+")/("+x1+"-"+x0+")))/("+x2+"-"+x0+")";
       
        for(int a=0;a<3;a++)
        {
            fun[a]=fun[a]*b[a];
            func=func+fun[a];
            
        }
        fin=fin+"\n\nfunción= "+func;
        System.out.println();
        return fin;
    }
}

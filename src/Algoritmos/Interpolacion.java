/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import Algoritmos.Expresion;

/**
 *
 * @author marianaortc
 */
public class Interpolacion {


     Expresion exp;
   
    double fx1,fx0,fx,res,temporal,error;
    public void evaluar(String funcion,double x0,double x1,double valor) throws Exception
    {
         exp = new Expresion(funcion);
        fx0=exp.evaluar(x0);
        fx1=exp.evaluar(x1);
        System.out.println("x0="+x0+"\nx1="+x1+"\nfx0="+fx0+"\nfx1="+fx1);
        temporal=(fx1-fx0)/(x1-x0);
        System.out.println("\nOperación: \n(("+fx1+"-"+fx0+")("+valor+"-"+x0+"))/"+"("+x1+"-"+x0+")  ");
      
        temporal=temporal*(valor-x0);
        res=fx0+temporal;
       // return res;
        System.out.println("\nResultado: "+res);
    }
    public void error(String funcion,double valor) throws Exception
    {
         exp = new Expresion(funcion);
        fx=exp.evaluar(valor);
        error=Math.abs(1-(res/fx));
        error=error*100;
        System.out.println("\nOperación para el error:\n1-"+"("+res+")/("+fx+")");
        System.out.println("\nError: "+error);
        
    }
   
    
}

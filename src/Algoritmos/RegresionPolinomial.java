/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import Algoritmos.Gauss;

/**
 *
 * @author marianaortc
 */
public class RegresionPolinomial {
    double [][] tab,gauss;
    double promy;
    double y=0,x=0,a1,a0,r;
     public double promedioy(double mat[][], int n)
    {
        for(int i=0; i<n;i++)
            y=y+mat[i][1];
        
        promy=y/n;
        
        return promy;
    }
     public double[][] tabla(double mat[][],int n, int grado,double promy)
     {
         tab=new double [n+2][9];
         int w=0;
        do
                {
                    tab[w][0]=mat[w][0];
                    tab[w][1]=mat[w][1];
                    tab[w][2]=Math.pow(mat[w][0],grado);
                    tab[w][3]=Math.pow(mat[w][0],grado+1);
                    tab[w][4]=Math.pow(mat[w][0],grado+2);
                    tab[w][5]=mat[w][0]*mat[w][1];
                    tab[w][6]=Math.pow(mat[w][0], grado)*mat[w][1];
                    tab[w][7]=(mat[w][1]-promy)*(mat[w][1]-promy);
                    w++;
                }
        while(w<n);
        for(int z=0;z<n+1;z++)
        {
        tab[n+1][0]=tab[n+1][0]+tab[z][0];//x
        tab[n+1][1]=tab[n+1][1]+tab[z][1];//y
        tab[n+1][2]=tab[n+1][2]+tab[z][2];//x^m
        tab[n+1][3]=tab[n+1][3]+tab[z][3];//x^m+1
        tab[n+1][4]=tab[n+1][4]+tab[z][4];//x^m+2
        tab[n+1][5]=tab[n+1][5]+tab[z][5];//xy
        tab[n+1][6]=tab[n+1][6]+tab[z][6];//x^my
        tab[n+1][7]=tab[n+1][4]+tab[z][7];//st
        }
        gauss=new double[3][4];
        
        gauss[0][0]=n;
        gauss[0][1]=tab[n+1][0];
        gauss[0][2]=tab[n+1][2];
        gauss[0][3]=tab[n+1][1];
        gauss[1][0]=tab[n+1][0];
        gauss[1][1]=tab[n+1][2];
        gauss[1][2]=tab[n+1][3];
        gauss[1][3]=tab[n+1][5];
        gauss[2][0]=tab[n+1][2];
        gauss[2][1]=tab[n+1][3];
        gauss[2][2]=tab[n+1][4];
        gauss[2][3]=tab[n+1][6];
         Gauss Gauss = new Gauss();
        String valores=Gauss.evaluar(gauss, false);
        int b=0;
       // do
          {
            tab[b][8]=(mat[b][1]-a0-(a1*mat[b][0]))*(mat[b][1]-a0-(a1*mat[b][0]));
            b++;
           }
        //while(b<n);
        /*for(int q=0;q<n+1;q++)
        {
            tab[n+1][8]=tab[n+1][4]+tab[q][5];
        }*/
        
         System.out.println(valores);
        return tab;
     }
     public double coeficiente(int n)
    {
        double c=(tab[n+1][4]-tab[n+1][5])/tab[n+1][4];
        r=Math.pow(c,2);
        return r;
    }
    
}

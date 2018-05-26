/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import Algoritmos.Gauss;
import static java.lang.System.in;

/**
 *
 * @author marianaortc
 */
public class RegresionPolinomial {
    double [][] tab,gauss;
    double promy;
    double y=0,x=0,a1,a0,r;
    String valores="";
    String ye1;
    GaussResultado Gauss= new GaussResultado();
    String [] ye;
    double[]as;
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
         
        valores=Gauss.evaluar(gauss, false);
         ye=valores.split(",");
            int r=0;
             as=new double [ye.length-1];
            
            for(int a=0;a<as.length;a++)
            {
                as[a]=Double.valueOf(ye[a]);
                
            }
         do
                {
                  
                    tab[r][8]=(tab[r][1]-(as[2])-as[1]*tab[r][0]-as[0]*tab[r][2])*(tab[r][1]-(as[2])-as[1]*tab[r][0]-as[0]*tab[r][2]);
                    r++;
                }
        while(r<n);
        //int b=0;
       // do
       for(int b=0;b<n;b++)
          {
            tab[n+1][8]=tab[n+1][8]+tab[b][8];//st
            
           }
        //while(b<n);

        
        
        return tab;
     }
     
     public String valores()
     {
         
        
         ye1=""+as[2];
        int cont=0;
         for(int a=0;a<as.length-1;a++)
        { cont++;
            ye1=ye1+"+"+ye[a]+"x^"+cont;
        }
         ye1="y= "+ye1;
                 return ye1;
     }
     public String coeficiente(int n)
    {
        String rr;
        double c=(tab[n+1][7]-tab[n+1][8])/tab[n+1][7];
        r=Math.pow(c,2);
        rr="Correlación: "+r;
        return rr;
    }
}

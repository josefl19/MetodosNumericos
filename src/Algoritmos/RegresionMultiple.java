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
public class RegresionMultiple {
    
    double [][] tab,gauss;
    double promy;
    double y=0,x=0,a1,a0,r;
    String valores;
    String [] ye;
    double [] as;
     GaussResultado Gauss = new GaussResultado();
    
    public double promedioy(double mat[][], int n)
    {
        for(int i=0; i<n;i++)
            y=y+mat[i][2];
        
        promy=y/n;
        
        return promy;
    }
    public double[][] table(double mat[][], int n, double promey)
    {
        tab=new double [n+2][10];
        int w=0;
        do
                {
                    tab[w][0]=mat[w][0];//x1
                    tab[w][1]=mat[w][1];//x2
                    tab[w][2]=mat[w][2];//y
                    tab[w][3]=mat[w][0]*mat[w][2];//x1*y
                    tab[w][4]=mat[w][0]*mat[w][0];//x1^2
                    tab[w][5]=mat[w][1]*mat[w][1];//x2^2
                    tab[w][6]=mat[w][1]*mat[w][0];//x1*x2
                    tab[w][7]=mat[w][1]*mat[w][2];//x2*y
                    tab[w][8]=(mat[w][2]-promey)*(mat[w][2]-promey);
                    //FALTAN VALORES DE GAUSS PARA SR
                    w++;
                }
        while(w<n);
        
        for(int z=0;z<n+1;z++)
        {
        tab[n+1][0]=tab[n+1][0]+tab[z][0];//x
        tab[n+1][1]=tab[n+1][1]+tab[z][1];//x2
        tab[n+1][2]=tab[n+1][2]+tab[z][2];//y
        tab[n+1][3]=tab[n+1][3]+tab[z][3];//xy
        tab[n+1][4]=tab[n+1][4]+tab[z][4];//x*x
        tab[n+1][5]=tab[n+1][5]+tab[z][5];//x2*x2
        tab[n+1][6]=tab[n+1][6]+tab[z][6];//x2*x
        tab[n+1][7]=tab[n+1][7]+tab[z][7];//x2*y
        tab[n+1][8]=tab[n+1][8]+tab[z][8];//st
        //tab[n+1][9]=tab[n+1][9]+tab[z][9];//sr
        
        }
        gauss=new double[3][4];
        gauss[0][0]=n;
        gauss[0][1]=tab[n+1][0];
        gauss[0][2]=tab[n+1][1];
        gauss[0][3]=tab[n+1][2];
        gauss[1][0]=tab[n+1][0];
        gauss[1][1]=tab[n+1][4];
        gauss[1][2]=tab[n+1][6];
        gauss[1][3]=tab[n+1][3];
        gauss[2][0]=tab[n+1][1];
        gauss[2][1]=tab[n+1][6];
        gauss[2][2]=tab[n+1][5];
        gauss[2][3]=tab[n+1][7];
        valores=Gauss.evaluar(gauss, false);
         ye=valores.split(",");
        as=new double [ye.length-1];
            
            for(int a=0;a<as.length;a++)
            {
                as[a]=Double.valueOf(ye[a]);
                
            }

        int b=0;
        int r=0;
 
         do
                {
                  
                    tab[r][9]=(tab[r][2]-(as[2])-as[1]*tab[r][0]-as[0]*tab[r][1])*(tab[r][2]-(as[2])-as[1]*tab[r][0]-as[0]*tab[r][1]);
                    r++;
                }
        while(r<n);
        for(int x=0;b<n+1;b++)
          {
            tab[n+1][9]=tab[n+1][9]+tab[x][9];//st
            
           }
        return tab;
    }
    public String resultado(double[][] tab,int n)
    {
        
         
        
        String y=""+ye[ye.length-2];
        int cont=0;
        for(int a=0;a<ye.length-2;a++)
        { cont++;
            y=y+"+"+ye[a]+"x"+cont;
        }
        y="y= "+y;
        return y;
    }
    public String coeficiente(int n)
    {   String resultado;
        double c=(tab[n+1][8]-tab[n+1][9])/tab[n+1][8];
        r=Math.pow(c,2);
        resultado="Correlacion= "+r;
        return resultado;
    }
    
}

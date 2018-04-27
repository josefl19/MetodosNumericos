
package Algoritmos;

/**
 *
 * @author marianaortc
 */
public class RegresionMinimosCuadrados {
    double [][] tab;
    double promy,promx;
    double y=0,x=0,a1,a0,r;
    
    public double promedioy(double mat[][], int n)
    {
        for(int i=0; i<n;i++)
            y=y+mat[i][1];
        
        promy=y;
        return promy;
    }
      public double promediox(double mat[][], int n)
    {
        for(int i=0; i<n;i++)
            x=x+mat[i][1];
       
        promx=x;
        return promx;
    }

    public void table(double mat[][], int n)
    {
        tab=new double [n+1][6];
        int w=0;
        do
                {
                    tab[w][0]=mat[w][0];
                    tab[w][1]=mat[w][1];
                    tab[w][2]=mat[w][0]*mat[w][1];
                    tab[w][3]=mat[w][0]*mat[w][0];
                    tab[w][4]=(mat[w][1]-promy)*(mat[w][1]-promy);
                    w++;
                }
        while(w<n);
        
        for(int z=0;z<n+1;z++)
        {
        tab[n+1][0]=tab[n+1][0]+tab[z][0];
        tab[n+1][1]=tab[n+1][1]+tab[z][1];
        tab[n+1][2]=tab[n+1][2]+tab[z][2];
        tab[n+1][3]=tab[n+1][3]+tab[z][3];
        tab[n+1][4]=tab[n+1][4]+tab[z][4];
        }
        a1=((n*tab[n+1][2])-(tab[n+1][0]*tab[n+1][1]))/((7*tab[n+1][3])-((tab[n+1][0])*tab[n+1][0]));
        a0=promy-(a1*promx);
        int b=0;
        do
          {
            tab[b][5]=(mat[b][1]-a0-(a1*mat[b][0]))*(mat[b][1]-a0-(a1*mat[b][0]));
            b++;
           }
        while(b<n);
        for(int q=0;q<n+1;q++)
        {
            tab[n+1][5]=tab[n+1][4]+tab[q][5];
        }
        
    }
    
    public double coeficiente(int n)
    {
        double c=(tab[n+1][4]-tab[n+1][5])/tab[n+1][4];
        r=Math.pow(c,2);
        return r;
    }
     
}

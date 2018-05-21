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
public class Jacobi {
    public static void main(String[] args) {
        Jacobi j= new Jacobi();
        j.llenar();
        j.ceros(mat,4,5);
        System.out.println("-----");
        j.mult(mat, mult, 5);
         System.out.println("-----");
        j.table(mat,mult, 4, 5);
         System.out.println("-----");
         for(int s=0;s<12;s++)
         {
        j.table(mat, tot, 4, 5);
        System.out.println("-----");}
         
        //j.table(mat, tot, 4, 5);
       //j.error(mat, tot, mult, 4, 5);



        
    }
    static double []tot=new double [4];
    // static double []fin=new double [4];
    static double [][] mat=new double[4][5];
    static double mult[]=new double [4];
    static double error[]=new double [4];
    static double [] actual=new double [4];
   static double [] anterior=new double [4];
  
    public double[][] llenar(){
    mat[0][0]=6;    mat[0][1]=-1;   mat[0][2]=-1;  mat[0][3]=4;    mat[0][4]=17;
    mat[1][0]=1;    mat[1][1]=-10;  mat[1][2]=2;   mat[1][3]=-1;   mat[1][4]=-17;
    mat[2][0]=3;    mat[2][1]=-2;   mat[2][2]=8;   mat[2][3]=-1;   mat[2][4]=19;
    mat[3][0]=1;    mat[3][1]=1;    mat[3][2]=1;   mat[3][3]=-5;   mat[3][4]=-14;
    return mat;
    }
    
    /*0      -1/6     -1/6     2/3     17/6
    -1/10   0        -2/5     -1/10   -17/10
    3/8     -1/4     0         -1/8    19/8
    -1/5    -1/5       -1/5     0       14/5*/
    public double[][] ceros(double[][] mat,int ren,int col)
    {
        for(int i=0;i<ren;i++)
        {
            double temp1=mat[i][i];
            for(int j=0;j<col;j++)
            {
                mat[i][j]=mat[i][j]/temp1;
               
            }
            mat[i][i]=0;
            for(int e=0;e<ren;e++)
            {
                mat[i][e]=mat[i][e]*-1;
            }
        }
        return mat;
    }
    public double [] mult(double [][] mat,double [] mult,int col)
    {
        for(int i=0;i<4;i++)
        {
            mult[i]=mat[i][col-1];
            
            
        }
        for(int k=0;k<4;k++)
        {
            
        System.out.println("con 0: "+mult[k]);
           
        error[k]=Math.abs((1-anterior[k]/actual[k])*100);
        System.out.println("error: "+error[k]);
            
        }
        
        return mult;
    }
    
    public double[] table(double[][]mat, double []mult, int ren, int col)
    {
        double temp;
        double [] temp1=new double [ren];
        for(int i=0;i<ren;i++)
        {
            for(int j=0;j<col-1;j++)
            {
                temp=mat[i][j]*mult[j];
                temp1[i]=temp1[i]+temp;
            }
            temp1[i]=temp1[i]+mat[i][col-1];
            
        }
        tot=temp1;//TOT= LA X1,X2,X3,X4
        anterior=mult;//AQUI EMPIEZA EL ERROR
         actual=tot;
        for(int k=0;k<4;k++)
        {
            
        
            System.out.println("total---:"+tot[k]);
        error[k]=Math.abs((1-anterior[k]/actual[k])*100);
        System.out.println("error: "+error[k]);
        
        }
       
       
            
        return tot;
    }
    
 /*   public void error(double [][] mat, double [] tot,double []mult, int ren, int col )
    {
        int j=1;
        error=new double[ren];
        
        actual=mult(mat,mult,col);
        for(int k=0;k<ren;k++)
        {
       error[k]=Math.abs((1-anterior[k]/actual[k])*100);
       
       System.out.println("err0: "+error[k]);
        }
        System.out.println("---------");
       anterior=actual;
        actual=table(mat,mult,ren,col);
         
        for(int k=0;k<ren;k++)
        {
        error[k]=Math.abs((1-anterior[k]/actual[k])*100);
        System.out.println("err1: "+error[k]);
        }
        System.out.println("---------1");
       anterior=actual;
        actual=table(mat,mult,ren,col);
         
        for(int k=0;k<ren;k++)
        {
        error[k]=Math.abs((1-anterior[k]/actual[k])*100);
        System.out.println("err1: "+error[k]);
        }
        /*for(int c=0;c<ren;c++)
        {
             anterior=actual;
        actual=table(mat,tot,ren,col);
        for(int k=0;k<4;k++)
        {
           
        error[k]=Math.abs((1-anterior[k]/actual[k])*100);
        System.out.println("error "+"2: "+error[k]);
        }
        }
        */
       /* do
        {
            
            anterior=actual;
        actual=table(mat,mult,ren,col);
        error[j]=Math.abs((1-anterior[j]/actual[j])*100);
        System.out.println("err: "+error[j]);
        j++;
        }
        while(error[j]>0.001);*/
               
        
    //}
    
    
    

}
    
    
 

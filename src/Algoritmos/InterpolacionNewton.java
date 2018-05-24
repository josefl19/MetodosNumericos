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
public class InterpolacionNewton {
    public static void main(String[] args) {
        InterpolacionNewton in=new InterpolacionNewton();
        double []X=new double[5];
        double [][]A=new double[5][5];
        X[0]=4;
        X[1]=-4;
        X[2]=7;
        X[3]=6;
        X[4]=2;
        double []F=new double[5];
        F[0]=278;
        F[1]=-242;
        F[2]=1430;
        F[3]=908;
        F[4]=40;
        in.Newton(X, F, 5, A);
        
    }
    public double Newton (double[] X, double[] F, double V,double [][]A){
        int n = X.length;
        for (int j=0;j<n;j++){
            A[j][0]=F[j];
        }
	int p;
        for (int k=0; k<n-1;k++){
        	p=0;
       		for(int i=k+1;i<n;i++){
            		A[i][k+1]=(A[i][k]-A[i-1][k])/(X[i]-X[p]);
        		p++;
       		}
        }
        double p1=0;
	double aux1;
        for(int s=0;s<n;s++){
        	double aux=1;
                for(int c=0;c<s;c++){
                	aux=aux*(V-X[c]);
                }
                p1=p1+A[s][s]*aux;
        }

            System.out.println("res: "+p1);
        
        return p1; 
  }
    
}

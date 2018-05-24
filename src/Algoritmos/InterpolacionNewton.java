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
        double []X=new double[4];
        double [][]A=new double[4][4];
        X[0]=3;
        X[1]=3.5;
        X[2]=4.5;
        X[3]=5;
        
        double []F=new double[4];
        F[0]=0.477121;
        F[1]=0.544068;
        F[2]=0.653212;
        F[3]=0.698970;
        
        in.Newton(X, F, 4, A);
        
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

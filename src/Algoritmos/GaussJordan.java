package Algoritmos;

import org.apache.commons.math3.fraction.*;

public class GaussJordan extends Gauss {

    public String evaluar(double[][] matriz, boolean pivoteo_parcial) 
    {
        String cadena = "";
        cadena = super.evaluar(matriz,pivoteo_parcial);
        
        double[][] matriz_original = this.clonar(matriz);
       	matriz = super.matrizInicialGaussJordan(matriz,pivoteo_parcial);

        int n = matriz.length;
        double alpha = 0;
        double[] x = new double[n];

        System.out.println("--------------------------------------------------");
        System.out.println("----------------- METODO DE GAUSS-JORDAN -----------");
        cadena = cadena + "----------------- METODO DE GAUSS-JORDAN -----------\n";
        System.out.println("--------------------------------------------------");

        System.out.println("MATRIZ INICIAL:");
        this.reportarmatriz(matriz);
        cadena = cadena + "\nMATRIZ INICIAL:\n";
        cadena = cadena + this.reportarmatriz(matriz);
        System.out.println("");

        for (int k = 1; k < n; k++) 
        {
            if (pivoteo_parcial) 
            {
                matriz = this.pivoteoParcial(matriz, k);
            }

            System.out.println("---------------");
            System.out.println("I=" + k);
            System.out.println("---------------");
            
            //cadena = cadena + "---------------\n";
            cadena = cadena + "I = " + k + "\n";
            //cadena = cadena + "---------------\n";

            for (int i = 0; i < n; i++) 
            {
                if (i != k && matriz[i][k] != 0) 
                {
                    alpha = matriz[i][k] / matriz[k][k];
                    System.out.println("alpha = " + this.redondear(matriz[i][k]) + " / " + this.redondear(matriz[k][k]) + " = " + this.redondear(alpha) + "\n");
                    cadena = cadena + "alpha= " + this.redondear(matriz[i][k]) + " / " + this.redondear(matriz[k][k]) + " = " + this.redondear(alpha) + "\n\n" ;
                    
                    for (int j = k; j <= n; j++) 
                    {
                        System.out.println("A" + i + "" + j + "=A" + i + "" + j + "-alpha*A" + k + "" + j + " => " + this.redondear(matriz[i][j] - alpha * matriz[k][j]) + " = " + this.redondear(matriz[i][j]) + " - " + this.redondear(alpha) + " * " + this.redondear(matriz[k][j]) + "");
                        cadena = cadena + "A" + i + "" + j + "=A" + i + "" + j + "-alpha*A" + k + "" + j + " => " + this.redondear(matriz[i][j] - alpha * matriz[k][j]) + " = " + this.redondear(matriz[i][j]) + " - " + this.redondear(alpha) + " * " + this.redondear(matriz[k][j]) + "\n";
                        matriz[i][j] = matriz[i][j] - alpha * matriz[k][j];
                    }

                    this.reportarmatriz(matriz);
                    cadena = cadena + "\n";
                    cadena = cadena + this.reportarmatriz(matriz);
                }
            }
        }

        System.out.println("");
        System.out.println("Dividiendo sobre el PIVOT");
        cadena = cadena + "Dividiendo sobre el PIVOTE\n";

        for (int i = 0; i < n; i++) 
        {
            matriz[i][n] = matriz[i][n] / matriz[i][i];
            x[i] = matriz[i][n];
            matriz[i][i] = 1;
        }

        cadena = cadena + this.reportarmatriz(matriz);
        
        if (matriz[n - 1][n - 1] == 0) 
        {
            System.out.println("No se puede seguir con el metodo ya que el coeficiente de la incognita Xn es 0");
            cadena = cadena + "No se puede seguir con el metodo ya que el coeficiente de la incognita Xn es 0\n";
            return cadena;
        } 
        else 
        {
            System.out.println("Calculando Xi");
            cadena = cadena + "Valores de X\n";
            x[n - 1] = matriz[n - 1][n];

            System.out.println("X" + (n - 1) + " = " + this.redondear(matriz[n - 1][n]) + "\n");
            cadena = cadena + "X" + (n) + " = " + this.redondear(x[n - 1]) + "\n";
            
            for (int i = (n - 2); i >= 0; i--) 
            {
                x[i] = matriz[i][n];

                cadena = cadena + "X" + i + " = " + this.redondear(x[i]) + "\n" ;
                //System.out.println("X" + i + "= (" + this.redondear(matriz[i][n]) + ") - [" + cadena_suma + "] / (" + this.redondear(matriz[i][i]) + ") = " + this.redondear(x[i]));
            }
        }
        
        return cadena;
    }
}
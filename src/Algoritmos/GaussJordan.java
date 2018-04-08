package Algoritmos;

import org.apache.commons.math3.fraction.*;

public class GaussJordan extends Gauss {

    public String evaluar(double[][] matriz, boolean pivoteo_parcial) 
    {
        String cadena = "";
        cadena = super.evaluarGauss(matriz,pivoteo_parcial);
        
        double[][] matriz_original = this.clonar(matriz);
       	matriz = super.matrizInicialGaussJordan(matriz,pivoteo_parcial);

        int n = matriz.length;
        double alpha = 0;
        double[] x = new double[n];

        cadena = cadena + "----------------- INICIANDO CON METODO DE GAUSS-JORDAN -----------\n";
        cadena = cadena + "\nMATRIZ INICIAL:\n";
        cadena = cadena + this.reportarmatriz(matriz);

        for (int k = 1; k < n; k++) 
        {
            if (pivoteo_parcial) 
            {
                matriz = this.pivoteoParcial(matriz, k);
            }

            for (int i = 0; i < n; i++) 
            {
                if (i != k && matriz[i][k] != 0) 
                {
                    alpha = matriz[i][k] / matriz[k][k];
                    cadena = cadena + "Escalar= " + this.redondear(matriz[i][k]) + " / " + this.redondear(matriz[k][k]) + " = " + this.redondear(alpha) + "\n\n" ;
                    
                    for (int j = k; j <= n; j++) 
                    {
                        cadena = cadena + "M[" + i + "][" + j + "] = M[" + i + "][" + j + "] - Pivote * M[" + k + "][" + j + "] => " + this.redondear(matriz[i][j] - alpha * matriz[k][j]) + " = " + this.redondear(matriz[i][j]) + " - " + this.redondear(alpha) + " * " + this.redondear(matriz[k][j]) + "\n";
                        matriz[i][j] = matriz[i][j] - alpha * matriz[k][j];
                    }

                    cadena = cadena + "\n";
                    cadena = cadena + this.reportarmatriz(matriz);
                }
            }
        }

        cadena = cadena + "Dividiendo sobre el PIVOTE de cada renglon\n";

        for (int i = 0; i < n; i++) 
        {
            matriz[i][n] = matriz[i][n] / matriz[i][i];
            x[i] = matriz[i][n];
            matriz[i][i] = 1;
        }

        cadena = cadena + this.reportarmatriz(matriz);
        
        if (matriz[n - 1][n - 1] == 0) 
        {
            cadena = cadena + "No se puede seguir con el metodo ya que el coeficiente de la incognita Xn es 0\n";
            return cadena;
        } 
        else 
        {
            cadena = cadena + "Valores de X\n";
            x[n - 1] = matriz[n - 1][n];

            cadena = cadena + "X" + (n) + " = " + this.redondear(x[n - 1]) + "\n";
            
            for (int i = (n - 2); i >= 0; i--) 
            {
                x[i] = matriz[i][n];
                cadena = cadena + "X" + (i+1) + " = " + this.redondear(x[i]) + "\n" ;
            }
        }
        
        return cadena;
    }
}
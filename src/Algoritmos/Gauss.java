package Algoritmos;

import org.apache.commons.math3.fraction.*;

public class Gauss extends Base {

    public Gauss() {
        this.espaciado = 0;
    }

    public String evaluar(double[][] matriz, boolean pivoteo_parcial) 
    {
        String cadena="";
        cadena = cadena + this.reportarmatriz(matriz);

        int n = matriz.length;
        double[] x = new double[n];
        double[][] matriz_original = this.clonar(matriz);
        double cte = 0;
        double suma = 0;

        cadena = cadena + "----------------- METODO DE GAUSS ------------------\n\n";
        
        for (int i = 0; i < n - 1; i++)
        {
            if (pivoteo_parcial) 
            {
                matriz = this.pivoteoParcial(matriz, i);
            }

            for (int j = i + 1; j < n; j++) 
            {
                cte = matriz[j][i] / matriz[i][i];
                cadena = cadena + "Escalar = " + this.redondear(matriz[j][i]) + " / " + this.redondear(matriz[i][i]) + " = " + this.redondear(cte) + "\n\n";
                
                for (int k = 0; k <= n; k++) 
                {
                    matriz[j][k] = matriz[j][k] - matriz[i][k] * cte;
                    cadena = cadena + "M[" + j + "][" + k + "] = M[" + j + "][" + k + "] - Escalar * M[" + i + "][" + k + "] => ";
                    cadena = cadena + this.redondear(matriz[j][k]) + " = " + this.redondear(matriz_original[j][k]) + " - " + this.redondear(matriz[i][k]) + " * " + this.redondear(cte) + "\n";
                }

                cadena = cadena + "\n";
            }

            cadena = cadena + this.reportarmatriz(matriz);
        }

        if (matriz[n - 1][n - 1] == 0) 
        {
            cadena = cadena + "No se puede seguir con el metodo ya que el coeficiente de la incognita Xn es 0\n";
            return cadena;
        } 
        else 
        {
            cadena = cadena + "Calculando los valores de X\n";
            x[n - 1] = matriz[n - 1][n] / matriz[n - 1][n - 1];
            
            cadena = cadena + "X" + (n - 1) + " = (" + this.redondear(matriz[n - 1][n]) + ") / (" + this.redondear(matriz[n - 1][n - 1]) + ") = " + this.redondear(x[n - 1]) + "\n";

            for (int i = (n - 2); i >= 0; i--) 
            {
                suma = 0;
                String cadena_suma = "";
                for (int j = 0; j < n; j++) 
                {
                    suma += matriz[i][j] * x[j];
                    cadena_suma += "(" + this.redondear(matriz[i][j]) + ")*(" + this.redondear(x[j]) + ")";

                    if ((n - 1) == j) {
                    } 
                    else 
                    {
                        cadena_suma += " + ";
                    }
                }

                x[i] = (matriz[i][n] - suma) / matriz[i][i];

                cadena = cadena + "X" + i + " : (" + this.redondear(matriz[i][n]) + ") - [" + cadena_suma + "] / (" + this.redondear(matriz[i][i]) + ") = " + this.redondear(x[i] + "\n");
            }
        }
        return cadena;
    }
    
    public String evaluarGauss(double[][] matriz, boolean pivoteo_parcial) 
    {
        String cadena="";
        cadena = cadena + this.reportarmatriz(matriz);

        int n = matriz.length;
        double[] x = new double[n];
        double[][] matriz_original = this.clonar(matriz);
        double cte = 0;

        cadena = cadena + "----------------- INICIANDO CON METODO DE GAUSS ------------------\n\n";
        
        for (int i = 0; i < n - 1; i++)
        {
            if (pivoteo_parcial) 
            {
                matriz = this.pivoteoParcial(matriz, i);
            }

            for (int j = i + 1; j < n; j++) 
            {
                cte = matriz[j][i] / matriz[i][i];
                cadena = cadena + "Escalar = " + this.redondear(matriz[j][i]) + " / " + this.redondear(matriz[i][i]) + " = " + this.redondear(cte) + "\n\n";
                
                for (int k = 0; k <= n; k++) 
                {
                    matriz[j][k] = matriz[j][k] - matriz[i][k] * cte;
                    cadena = cadena + "M[" + j + "][" + k + "] = M[" + j + "][" + k + "] - Escalar * M[" + i + "][" + k + "] ==> ";
                    cadena = cadena + this.redondear(matriz[j][k]) + " = " + this.redondear(matriz_original[j][k]) + " - " + this.redondear(matriz[i][k]) + " * " + this.redondear(cte) + "\n";
                }
                cadena = cadena + "\n";
            }

            cadena = cadena + this.reportarmatriz(matriz);
        }
        return cadena;
    }
    
    public double[][] matrizInicialGaussJordan(double[][] matriz, boolean pivoteo_parcial) 
    {
        int n = matriz.length;
        double[] x = new double[n];
        double[][] matriz_original = this.clonar(matriz);
        double cte = 0;

        for (int i = 0; i < n - 1; i++)
        {
            if (pivoteo_parcial) 
            {
                matriz = this.pivoteoParcial(matriz, i);
            }

            for (int j = i + 1; j < n; j++) 
            {
                cte = matriz[j][i] / matriz[i][i];
                
                for (int k = 0; k <= n; k++) 
                {
                    matriz[j][k] = matriz[j][k] - matriz[i][k] * cte;
                }
            }
        }

        return matriz;
    }
    
    public double[][] pivoteoParcial(double[][] matriz, int fila) 
    {
        double mayor = 0;
        int fila_mayor = 0;
        int n = matriz.length;
        double[] aux = new double[n + 1];

        for (int i = 0; i < n; i++) 
        {
            if (Math.abs(matriz[i][fila]) > mayor) 
            {
                mayor = Math.abs(matriz[i][fila]);
                fila_mayor = i;
            }
        }

        for (int j = 0; j <= n; j++) 
        {
            aux[j] = matriz[fila][j];
        }

        for (int j = 0; j <= n; j++) 
        {
            matriz[fila][j] = matriz[fila_mayor][j];
        }

        for (int j = 0; j <= n; j++) 
        {
            matriz[fila_mayor][j] = aux[j];
        }
        
        return matriz;
    }
}
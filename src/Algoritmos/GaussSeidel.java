package Algoritmos;

import org.apache.commons.math3.fraction.*;

public class GaussSeidel extends Gauss {

    public String evaluar(double[][] matriz, double error, int limite) 
    {
        String cadena = "";
        cadena = cadena + "Error: " + error + "\n";
        System.out.println("Error: " + error);
        System.out.println();

        boolean ok = false;
        double[][] matriz_original = this.clonar(matriz);
        int n = matriz.length;

        double[] Xa = new double[n];
        double[] Xp = new double[n];
        Xp = this.inicializar(Xp);
        Xa = this.inicializar(Xa);

        cadena = cadena + "-----------------METODO DE GAUSS-SEIDEL-----------\n";
        cadena = cadena + "\nMATRIZ INICIAL:\n";

        cadena = cadena + this.reportarmatriz(matriz);
        this.reportarmatriz(matriz);
        
        for (int k = 0; k < limite; k++) 
        {
            cadena = cadena + "Iteracion = " + (k+1) + "\n";

            for (int i = 0; i < n; i++) {

                double s = 0;
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        s = s + matriz[i][j] * Xa[j];
                    }
                }
                
                cadena = cadena + "X" + (i+1) + "N " + "= M[" + i + "][" + n + "] - s) / A[" + i + "][" + i + "] = (" + this.redondear(matriz[i][n]) + " - " + this.redondear(s) + ") / " + this.redondear(matriz[i][i]) + " = " + this.redondear(((matriz[i][n] - s) / matriz[i][i]), 6) + "\n";
                System.out.println("X" + i + "=(M" + i + "" + n + "-s)/A" + i + "" + i + " = (" + this.redondear(matriz[i][n]) + "-" + this.redondear(s) + ")/" + this.redondear(matriz[i][i]) + "=" + this.redondear((matriz[i][n] - s) / matriz[i][i]));
                Xa[i] = (matriz[i][n] - s) / matriz[i][i];
            }

            System.out.println("");
            cadena = cadena + "\n\t      1                2              3             4";
            cadena = cadena + "\nResultados XN: [";
            System.out.print("Resultados Xa:");
            
            System.out.print("[");
            for (int i = 0; i < n; i++) {
                cadena = cadena + this.redondear(Xa[i], 8, true) + (i < (n - 1) ? ", " : "");
                System.out.print(this.redondear(Xa[i], this.decimales + 4, false) + (i < (n - 1) ? ", " : ""));
            }
            System.out.println("]");
            cadena = cadena + "]\n";

            cadena = cadena + "Resultados Xi: [";
            System.out.print("Resultados Xp:");
            System.out.print("[");
            for (int i = 0; i < n; i++) {
                cadena = cadena + this.redondear(Xp[i], 8, true) + (i < (n - 1) ? ", " : "");
                //System.out.print(this.redondear(Xp[i], this.decimales + 4, false) + (i < (n - 1) ? ",   " : "   "));
            }
            System.out.println("]");
            cadena = cadena + "]\n";

            //	if(k>0){

            ok = verificarTolerancia(Xa, Xp, error);
            cadena = cadena + verificar(Xa, Xp, error) + "\n";

            if (ok) {
                break;
            }


            Xp = this.actualizarX(Xa, Xp);

            cadena = cadena + "\n-----------------------------------\n\n";
            System.out.println("");
            System.out.println("-----------------------------------");
            System.out.println("");

            //	}
        }

        if (!ok) {
            cadena = cadena + "No se Encontro la Solucion";
        } else {

            cadena = cadena + this.resultados(Xa, matriz_original);
        }

        return cadena;
    }
    
    public String verificar(double[] Xa, double[] Xp, double error) 
    {
        String cadena = "";
        int n = Xa.length;
        int correcto = 0;
        double tmp = 0;

        cadena = cadena + "             Errores: ";
        System.out.print("Errores:");

        cadena = cadena + "[";
        System.out.print("[");
        for (int i = 0; i < n; i++) 
        {
            tmp = (Math.abs(Xa[i] - Xp[i])) / Math.abs(Xa[i]);
            System.out.print(this.redondear(this.redondear(tmp * 100) + "%", this.decimales + 4, false) + (i < (n - 1) ? ", " : ""));
            cadena = cadena + this.redondear(this.redondear(tmp * 100) + "%", 8, true) + (i < (n - 1) ? ", " : "");

            if (Math.abs(tmp) <= Math.abs(error)) {
                correcto++;
            }

        }
        System.out.println("]");
        cadena = cadena + "]";

        return cadena;
    }
    
    public boolean verificarTolerancia(double[] Xa, double[] Xp, double error) {

        int n = Xa.length;
        int correcto = 0;
        double tmp = 0;

        System.out.print("Errores:");

        System.out.print("[");
        for (int i = 0; i < n; i++) {
            tmp = (Math.abs(Xa[i] - Xp[i])) / Math.abs(Xa[i]);
            System.out.print(this.redondear(this.redondear(tmp * 100) + "%", this.decimales + 4, false) + (i < (n - 1) ? ", " : ""));

            /* 	System.out.println("");
            System.out.println(tmp+"<="+error);
            System.out.println("");*/
            if (Math.abs(tmp) <= Math.abs(error)) {
                correcto++;

            }


        }
        System.out.println("]");

        //System.out.println(correcto+"=="+n);
        if (correcto == n) {
            return true;
        } else {
            return false;
        }
    }
    
    public double[] actualizarX(double[] Xa, double[] Xp) {
        int n = Xa.length;
        for (int i = 0; i < n; i++) {
            Xp[i] = Xa[i];
        }

        return Xp;

    }
    
    public String resultados(double[] x, double[][] matriz_original)
    {
        String cadena ="";
        System.out.println("");
        System.out.println("Resultados:");
        cadena = cadena + "\nResultados: \n";
        int n = matriz_original.length;
        
        for (int i = 0; i < n; i++) 
        {
            cadena = cadena + "X" + (i+1) + "=" + this.redondear(x[i]) + "\n";
            System.out.println("X" + i + "=" + this.redondear(x[i]));
        }
        
        return cadena;
    }
}
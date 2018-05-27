package Algoritmos;

public class Jacobi extends GaussSeidel
{
    public String resultado(double[][] matriz, double error, int limite) 
    {
        String cadena = "";
        cadena = cadena + "Error: " + error + "\n";
        System.out.println("e: " + error);
        System.out.println();

        boolean ok = false;
        double[][] matriz_original = this.clonar(matriz);
        int n = matriz.length;

        double[] Xa = new double[n];
        double[] Xp = new double[n];
        double[] Xt = new double[n];
        Xp = this.inicializar(Xp);
        Xa = this.inicializar(Xa);
        Xt = this.inicializar(Xt);
        
        cadena = cadena + "-----------------METODO DE GAUSS-JACOBI-----------\n";
        cadena = cadena + "\nMATRIZ INICIAL:\n";

        System.out.println("--------------------------------------------------");
        System.out.println("-----------------METODO DE GAUSS-JACOBI-----------");
        System.out.println("--------------------------------------------------");

        //	this.criterioConvergencia(matriz);
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
                
                //cadena = cadena + "Xt" + i + "=(M" + i + "" + n + "-s)/A" + i + "" + i + " = (" + this.redondear(matriz[i][n]) + "-" + this.redondear(s) + ")/" + this.redondear(matriz[i][i]) + "=" + this.redondear((matriz[i][n] - s) / matriz[i][i]) + "\n";
                System.out.println("Xt" + i + "=(M" + i + "" + n + "-s)/A" + i + "" + i + " = (" + this.redondear(matriz[i][n]) + "-" + this.redondear(s) + ")/" + this.redondear(matriz[i][i]) + "=" + this.redondear((matriz[i][n] - s) / matriz[i][i]));
                Xt[i] = (matriz[i][n] - s) / matriz[i][i];

            }

            Xa = this.actualizarX(Xt, Xa);
            System.out.println("");

            System.out.print("Resultados Xa:");
            System.out.print("[");
            cadena = cadena + "\n\t      1                2              3             4";
            cadena = cadena + "\nResultados XN: [";
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
                System.out.print(this.redondear(Xp[i], this.decimales + 4, false) + (i < (n - 1) ? ", " : ""));
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
            System.out.println("No se Encontro la Solucion");
        } else {

            this.comprobar(Xa, matriz_original);
            cadena = cadena + this.resultados(Xa, matriz_original);
        }


        return cadena;
    }
}
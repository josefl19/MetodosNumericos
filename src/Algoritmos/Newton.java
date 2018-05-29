package Algoritmos;

public class Newton extends Lagrange {

    public Newton() {
        this.espaciado = 0;
        this.decimales = 10;
    }

    public String evaluarNewton(double[] xi, double[] fxi, double x) 
    {
        String cadena = "";
        int n = xi.length - 1;
        double[][] T = new double[n+1][n];
        double resultado = 0;

        cadena = cadena + "------------ Interpolacion de Newton ---------------\n\n"; 
        System.out.println("--------------------------------------------------");
        System.out.println("------------Interpolacion de Newton---------------");
        System.out.println("--------------------------------------------------");

        this.reportarcoordenadas(xi, fxi);

        cadena = cadena + "Para x = " + x + "\n\n";
        System.out.println("x = " + x);
        System.out.println("");

        for (int i = 0; i < n; i++) {

            T[i][0] = (fxi[i + 1] - fxi[i]) / (xi[i + 1] - xi[i]);

        }

        
        //this.reportarmatriz(T);
        for (int j = 1; j<n; j++) {

            for (int i = 0; i <(n-j); i++) {
               // System.out.println(""+T[i][j]+" = ("+T[i+1][j-1]+" - "+T[i][j-1]+") / ("+xi[i+j+1]+" - "+xi[i]+");");
                T[i][j] = (T[i+1][j-1] - T[i][j-1]) / (xi[i+j+1] - xi[i]);

            }

        
          //this.reportarmatriz(T);
        }

        
        this.reportarmatriz(T, xi, fxi);

        cadena = cadena + "f(" + x + ") = \n";
        System.out.println("Y(x)=[");
        System.out.print(this.redondear(fxi[0]));
        resultado += fxi[0];
        cadena = cadena + this.redondear(fxi[0]) + " + \n";
        System.out.print(" + ");
        System.out.println("");
        
        for (int i = 0; i < T[0].length; i++) 
        {
            double parte = 1;
            parte *= T[0][i];

            cadena = cadena + this.redondear(T[0][i]) + " * ";
            System.out.print(this.redondear(T[0][i]));
            System.out.print(" * ");

            for (int j = 0; j <= i; j++) 
            {
                cadena = cadena + "( x - " + xi[j] + " )";
                System.out.print("( x - " + xi[j] + " )");
                parte *= (x - xi[j]);
            }

            if (i != (n - 1)) {

                cadena = cadena + " + ";
                System.out.print(" + ");
            }
            System.out.println("");
            cadena = cadena + "\n";


            resultado += parte;

        }

        System.out.println("]");
        System.out.println("");
        cadena = cadena + "\nResultado: " + this.redondear(resultado);
        System.out.println("Resultado:");
        //cadena = cadena
        System.out.println("Pnx=" + this.redondear(resultado));




        return cadena;

    }

    public void reportarmatriz(double[][] matriz, double[] x, double[] y) {

        int ancho = this.getEspaciado(matriz);
        System.out.println("");
        System.out.print(this.redondear("i", 3 ,true));
        System.out.print(" "+this.redondear("Xi", ancho, true));
        
        System.out.print("|"+this.redondear("f(Xi)", ancho, true));



        for (int i = 0; i < matriz[0].length; i++) {

            System.out.print("|"+this.redondear("Δ" + (i) + "f(Xi)", ancho, true));

        }

        System.out.print("\n");

        for (int i = 0; i < matriz.length; i++) {

            System.out.print(this.redondear(i + "", 3, true));

            double[] fila = matriz[i];

            System.out.print("[");

            System.out.print(this.redondear(x[i], ancho, true));
            System.out.print("|" + this.redondear(y[i], ancho, true));



            int n = fila.length;
            for (int j = 0; j < n; j++) {
                double numero = fila[j];


                System.out.print("|" + this.redondear(numero, ancho, true));



            }

            System.out.print("]");
            System.out.print("\n");

        }

        System.out.println("");

    }
}
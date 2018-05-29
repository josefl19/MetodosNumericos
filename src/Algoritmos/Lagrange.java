package Algoritmos;

public class Lagrange extends Base {

    public Lagrange() {
        this.espaciado = 0;
        this.decimales = 6;
    }

    public String evaluar(double[] xi, double[] fxi, double x) 
    {
        String cadena = "";
        int n = xi.length;

        double[] Lxi = new double[n];
        double Pnx = 0;

        cadena = cadena + "------------ Interpolacion de Lagrange -------------\n";
        
        System.out.println("--------------------------------------------------");
        System.out.println("------------Interpolacion de Lagrange-------------");
        System.out.println("--------------------------------------------------");

        System.out.println("Para x = " + x + "\n\n");
        System.out.println("");
        cadena = cadena + "\nPara x = " + x + "\n\n";
        
        System.out.println("f(" + x + ") = [");
        cadena = cadena + "f(" + x + ") = \n";
        for (int i = 0; i < n; i++) 
        {
            cadena = cadena + this.redondear(fxi[i]) + " * ";
            System.out.print(this.redondear(fxi[i]));
            System.out.print(" * ");
            cadena = cadena + this.Lagrangex(x, i, xi, n) + "\n";
            Lxi[i] = this.Lagrangeix(x, i, xi, n);

            Pnx = Pnx + Lxi[i] * fxi[i];

            System.out.println("");

        }

        System.out.println("]");
        System.out.println("");
        
        cadena = cadena + "\nResultado: " + this.redondear(Pnx);
        System.out.println("Resultado:");
        System.out.println("Pnx=" + this.redondear(Pnx));

        return cadena;

    }

    public double Lagrangeix(double x, int i, double[] xi, int n) {

        double Prod;

        Prod = 1;

        for (int j = 0; j < n; j++) {

            if (i != j) {
              
                System.out.print("( (x-" + this.redondear(xi[j]) + ") / (" + this.redondear(xi[i]) + " - " + this.redondear(xi[j]) + ") )");
                Prod = Prod * ((x - xi[j]) / (xi[i] - xi[j]));

                if (j == (n - 1)) {

                    System.out.print(" + ");
                }
            }
        }
        return Prod;
    }
    
    public String Lagrangex(double x, int i, double[] xi, int n) 
    {
        String cadena = "";
        double Prod;

        Prod = 1;

        for (int j = 0; j < n; j++) {

            if (i != j) 
            {
                cadena = cadena + "( (x - " + this.redondear(xi[j]) + ") / (" + this.redondear(xi[i]) + " - " + this.redondear(xi[j]) + ") )";
                System.out.print("((x-" + this.redondear(xi[j]) + ")/(" + this.redondear(xi[i]) + " - " + this.redondear(xi[j]) + "))");
                Prod = Prod * ((x - xi[j]) / (xi[i] - xi[j]));

                if (j == (n - 1)) {

                    cadena = cadena + " + ";
                    System.out.print(" + ");
                }
            }
        }
        return cadena;
    }
}
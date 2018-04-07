package Algoritmos;

import java.math.*;
import org.apache.commons.math3.fraction.*;

public class Base 
{
    public boolean fraccion = false;
    public int decimales = 4;
    public int espaciado = 12;

    public double[][] clonar(double[][] matriz) 
    {
        double[][] temporal = new double[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[0].length; j++) 
            {
                temporal[i][j] = matriz[i][j];
            }
        }
        return temporal;
    }

    public String redondear(double numero, int ancho, boolean centrado) {
        return this.redondear(numero, this.decimales, ancho, centrado);
    }

    public String redondear(double numero, boolean centrado) {
        return this.redondear(numero, this.decimales, this.espaciado, centrado);
    }

    public String redondear(double numero) {//
        return this.redondear(numero, this.decimales, this.espaciado);
    }

    public double redondear(double numero, int decimales) {//
        return Double.parseDouble(this.redondear(numero, decimales, 0));
    }

    public String redondear(double numero, int decimales, int ancho) {//
        return this.redondear(numero, decimales, ancho, false);
    }

    public String redondear(double numero, int decimales, int ancho, boolean centrado) 
    {//
        String cadena = "";
        try 
        {
            if (this.fraccion) 
            {
                Fraction fraccion = new Fraction(numero);
                cadena = fraccion.toString();
            } 
            else 
            {
                BigDecimal bd = new BigDecimal(numero);
                bd = bd.setScale(decimales, BigDecimal.ROUND_HALF_UP);
                double resultado = bd.doubleValue();
                cadena = resultado + "";
            }
        } catch (Exception e) {
            cadena = "0";
        }

        return this.redondearString(cadena, ancho, centrado);
    }

    public String redondearString(String cadena, int ancho, boolean centrado) 
    {//
        String str = "";
        String str2 = "";
        if (cadena.length() < ancho) 
        {
            if (centrado) 
            {
                int repetir = ancho - cadena.length();

                int mitad = Integer.parseInt(repetir / 2 + "");
                str = this.repetir(" ", mitad);
                str2 = this.repetir(" ", repetir - mitad);
                cadena = str2 + cadena + str;
            } 
            else 
            {
                int repetir = ancho - cadena.length();
                str = this.repetir(" ", repetir);
                cadena = cadena + str;
            }
        }

        return cadena;
    }

    public String redondear(String cadena) {
        return this.redondearString(cadena, this.espaciado, false);
    }

    public String redondear(String cadena, boolean centrado) {
        return this.redondearString(cadena, this.espaciado, centrado);
    }

    public String redondear(String cadena, int ancho) {
        return this.redondearString(cadena, ancho, false);
    }

    public String redondear(String cadena, int ancho, boolean centrado) {
        return this.redondearString(cadena, ancho, centrado);
    }

    /* temporal */
    public String redondearString(String cadena) {
        return this.redondearString(cadena, this.espaciado, false);
    }

    public String redondearString(String cadena, boolean centrado) {
        return this.redondearString(cadena, this.espaciado, centrado);
    }

    public String redondearString(String cadena, int ancho) {
        return this.redondearString(cadena, ancho, false);
    }
    /**/

    public String repetir(String str, int times) 
    {//
        String repetir = "";
        for (int i = 0; i < times; i++) 
        {
            repetir = repetir + str;
        }
        return repetir;
    }

    public int getEspaciado(double[][] matriz) 
    {
        int tamano = 0;
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[i].length; j++) 
            {
                int redondeado = (this.redondear(matriz[i][j])).length();
                tamano = redondeado > tamano ? redondeado : tamano;
            }
        }

        return tamano + 2;
    }

    public String reportarmatriz(double[][] matriz) 
    {
        String cadena="";
        int ancho= this.getEspaciado(matriz);
        cadena = cadena + this.reportarmatriz(matriz, ancho);
        
        return cadena;
    }

    public String reportarmatriz(double[][] matriz, int ancho) 
    {
        String cadena = "";
        
        System.out.println("");
        System.out.print(this.redondear("", 3 + 1));
        cadena = cadena + this.redondear("", 3 + 1);

        for (int i = 0; i < matriz[0].length; i++) 
        {
            if ((matriz[0].length - 1) == i) 
            {
                System.out.print(this.redondear(i + "", ancho + 1, true));
                cadena = cadena + this.redondear(i + "", ancho + 1, true);
            } 
            else 
            {
                System.out.print(this.redondear(i + "", ancho, true));
                cadena = cadena + this.redondear(i + "", ancho, true);
            }
        }

        System.out.print("\n");
        cadena = cadena + "\n";

        for (int i = 0; i < matriz.length; i++) 
        {
            System.out.print(this.redondear(i + "", 3, true));
            cadena = cadena + this.redondear(i + "", 3, true);
            this.reportarFilamatriz(matriz[i], ancho);
            cadena = cadena + this.reportarFilamatriz(matriz[i], ancho);
        }

        System.out.println("");
        cadena = cadena + "\n";
        
        return cadena;
    }

    public void reportarFilamatriz(double[] fila) 
    {
        this.reportarFilamatriz(fila, 5);
    }

    public String reportarFilamatriz(double[] fila, int ancho) 
    {
        String cadena="";
        
        System.out.print("[");
        cadena = cadena + "[";

        for (int i = 0; i < fila.length; i++) 
        {
            double numero = fila[i];

            if ((fila.length - 1) == i) 
            {
                System.out.print("|" + this.redondear(numero, ancho, true));
                cadena = cadena + "|" + this.redondear(numero, ancho, true);
            } 
            else 
            {
                System.out.print(this.redondear(numero, ancho, true));
                cadena = cadena + this.redondear(numero, ancho, true);
            }
        }

        System.out.print("]");
        cadena = cadena + "]" + "\n";
        System.out.print("\n");
        
        return cadena;
    }
}
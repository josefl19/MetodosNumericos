package Paneles;

import static Paneles.Metodos.panelGrafico;
import javax.swing.JTextField;

public class GaussJordanxx extends JTextField
{     
    public static String muestramatriz(float matriz[][], int var) 
    {
        String matriz_inicial = "";
        
        for (int x = 0; x < var; x++) 
        {
            for (int y = 0; y <(var + 1); y++) 
            {
                matriz_inicial = matriz_inicial + " " + matriz[x][y] + " |";
                System.out.print(" " + matriz[x][y] + " |");
            }
            
            matriz_inicial = matriz_inicial + "\n";
            System.out.println("");
        }
        
        return matriz_inicial;
    }

    public static void pivote(float matriz[][], int piv, int var) 
    {
        float temp = 0;
        temp = matriz[piv][piv];
        for (int y = 0; y <(var + 1); y++) 
        {
            matriz[piv][y] = matriz[piv][y] / temp;
        }
    }

    public static void hacerceros(float matriz[][], int piv, int var) 
    {
        for (int x = 0; x < var; x++) 
        {
            if (x != piv) 
            {
                float c = matriz[x][piv];
                for (int z = 0; z <(var + 1); z++) 
                {
                    matriz[x][z] = ((-1 * c) * matriz[piv][z]) + matriz[x][z];
                }
            }
        }
    }
    
    public String solucion(float matriz[][],int piv,int var)
    {
        String procedimiento = "";
        
         for (int a = 0; a < var; a++) 
         {
            pivote(matriz, piv, var);

            System.out.println("\tRenglon " + (a + 1) + " entre el pivote");
            procedimiento = procedimiento + "\tRenglon " + (a + 1) + " entre el pivote";
            procedimiento = procedimiento + "\n";
            procedimiento = procedimiento + muestramatriz(matriz, var)+ "\n";

            System.out.println("");

            procedimiento = procedimiento + "\tHaciendo ceros";
            System.out.println("\tHaciendo ceros");
            hacerceros(matriz, piv, var);
            procedimiento = procedimiento + "\n";
            procedimiento = procedimiento + muestramatriz(matriz, var) + "\n";
            
            System.out.println("");
            piv++;
        }
         
        for (int x = 0; x < var; x++) 
        {
            procedimiento = procedimiento + "La variable X" + (x + 1) + " es: " + matriz[x][var] + "\n";
            System.out.println("La variable X" + (x + 1) + " es: " + matriz[x][var]);
        }
        
        return procedimiento;
    }
}
package Algoritmos;

import static Paneles.Metodos.panelGrafico;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GaussJordan extends JTextField
{
    public JTextField[][] matrizGauss(int filas, int columnas)
    {
        JTextField[][] txtXi = new JTextField[filas][columnas];
        return txtXi;
    }
    
    public JPanel pos_tam(JTextField[][] txtXi, JPanel panel, int fila, int columna)
    { 
        for( int i = 1 ; i < fila; i++ )
        {
            for( int j = 1 ; j < columna ; j++ )
            {
                //Se crea el boton y se agrega a las celda de la matriz
                txtXi[i][j].setBounds(15*columna, 3*fila, 30, 25);
                //Se da el nombre en forma de coordenada enviando la fila y columna
                txtXi[i][j].setText("");
                //Se agrega el boton al panel
                panel.add( txtXi[i][j] );
            }
        }
        
        return panel;
    }
       
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
    
    public static void solucion(float matriz[][],int piv,int var)
    {
         for (int a = 0; a < var; a++) {
            pivote(matriz, piv, var);

            System.out.println("\tRenglon " + (a + 1) + " entre el pivote");
            muestramatriz(matriz, var);

            System.out.println("");

            System.out.println("\tHaciendo ceros");
            hacerceros(matriz, piv, var);

            muestramatriz(matriz, var);
            System.out.println("");
            piv++;
        }
        for (int x = 0; x < var; x++) {
            System.out.println("La variable X" + (x + 1) + " es: " + matriz[x][var]);
        }

    }
}
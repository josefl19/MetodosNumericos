/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author josef
 */
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
       public static void muestramatriz(float matriz[][], int var) {
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < (var + 1); y++) {
                System.out.print(" " + matriz[x][y] + " |");
            }
            System.out.println("");
        }

    }

    public static void pivote(float matriz[][], int piv, int var) {
        float temp = 0;
        temp = matriz[piv][piv];
        for (int y = 0; y < (var + 1); y++) {

            matriz[piv][y] = matriz[piv][y] / temp;
        }
    }

    public static void hacerceros(float matriz[][], int piv, int var) {
        for (int x = 0; x < var; x++) {
            if (x != piv) {
                float c = matriz[x][piv];
                for (int z = 0; z < (var + 1); z++) {
                    matriz[x][z] = ((-1 * c) * matriz[piv][z]) + matriz[x][z];
                }
            }
        }
    }
}
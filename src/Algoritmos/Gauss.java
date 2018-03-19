package Algoritmos;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gauss extends JTextField
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
}

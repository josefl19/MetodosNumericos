package Algoritmos;

import static Paneles.Metodos.panelGrafico;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class txtResultados 
{   
    public void txtResultados(String resultados) 
    {
        panelGrafico.removeAll();
        panelGrafico.setLayout(null);
        
        JTextArea txtResultados = new JTextArea();
        JScrollPane scrollingArea = new JScrollPane(txtResultados);
        txtResultados.setText(resultados);

        scrollingArea.setBounds(0, 0, 523, 400);

        panelGrafico.add(scrollingArea);
        panelGrafico.revalidate();
        panelGrafico.repaint();
    }
}
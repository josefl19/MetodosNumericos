package Algoritmos;
import Paneles.*;
import static Paneles.Metodos.panelGrafico;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.nfunk.jep.JEP;

public class Grafico 
{
    public void grafica(String funcion, double lx0)
    {  
        // pasamos a graficar a la funcion
        // arreglos usados para almacenar una particion en un intervalo en el que esta definoda la funcion ingresada
        double x[] = new double[200];
        double y[] = new double[200];
                
        double xi = lx0-10; //variable usada para los puntos dentro de la particion
        
        for (int i = 0; i < 200; i++) 
        {
            x[i] = xi + i * 0.12; //almacenamos valores xi que seran evaluados en la funcion ingresada es decir f(xi)

            JEP funcionx_h = new JEP();
            funcionx_h.addStandardFunctions(); // adiciona las funciones matem´aticas
            funcionx_h.addStandardConstants(); // adiciona las constantes matem´aticas
            funcionx_h.setImplicitMul(true);
            funcionx_h.addVariable("x", x[i]);// evaluamos la funcion ingresada en el funto xi
            // obtener el resultado de evaluar la expresi´on
            funcionx_h.parseExpression(funcion); // paso de la expresi´on a evaluar
            String inde=Double.toString(funcionx_h.getValue());// variable usada para verificar asintodas en la grafica de f(x)
            
            if ( inde.equals("NaN") || inde.equals("-Infinity") || inde.equals("Infinity") ) 
            {                 
            }
            else  
            {
                y[i] = funcionx_h.getValue();// almacenamos el valor f(xi)  en el arreglo y
            }
            
            panelGrafico.setVisible(true);// hace visible el panel de grafica
            ChartPanel panel = null;
            JFreeChart chart = null;
            XYSplineRenderer renderer = new XYSplineRenderer();// rederizador para poder hacer el grafico
            XYSeriesCollection dataset = new XYSeriesCollection();// variable usada para almacenar todos los datos a graficar

            ValueAxis ejex = new NumberAxis();//variable usada para definir el eje x
            ValueAxis ejey = new NumberAxis();//variable usada para definir el eje y

            XYSeries serie = new XYSeries("datos");// variable que almacenaras los datos ingresados en la tabla de cinco dilas
            panelGrafico.removeAll();// remueve todo lo que esta en el panel de lineas
            
            for (int j = 0; j < x.length; j++) {
                    serie.add(x[j], y[j]);
                }//
            
            dataset.addSeries(serie);// adiere la serie a la  XYSeriesCollection
             // acontinuacion detallamos los ejes en el grafico que apaerece en el jPanel
                ejex.setLabel(" EJE X");
                ejey.setLabel(" EJE Y");

                
                chart =ChartFactory.createXYLineChart("", "Eje X","Eje Y",dataset,PlotOrientation.VERTICAL,false,false,true );
                

                chart.setTitle("f(x) =" + funcion);// le ponemos un titulo a nuestro grafico
                 
                panel = new ChartPanel(chart);
                panel.setBounds(5, 5, 512, 400);// establecemos la posicion donde se visalizara la grafica de interpolacion
                panelGrafico.add(panel);// se adiere la grafica al JPanel
                panelGrafico.repaint();
                 

        }
    }
}

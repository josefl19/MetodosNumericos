package Algoritmos;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import net.objecthunter.exp4j.function.Function;
import net.objecthunter.exp4j.operator.Operator;

public class NewtonRaphsonMulti 
{
    Expression e;
    String f1, error1;
    double error;
    
    public String evaluar(String funcion,double x, double y) throws Exception
    {
        e = new ExpressionBuilder(funcion)
        .variables("x", "y")
        .build()
        .setVariable("x", x)
        .setVariable("y", y);
    
        double result = e.evaluate();
        f1 = String.format("%.6f", result);
        return f1;
    }
    String xact, xant;
    public String error(double xactual, double xanterior)
    {
        xact=String.format("%.6f", xactual);
        xactual=Double.parseDouble(xact);
        xant=String.format("%.6f", xanterior);
        xanterior=Double.parseDouble(xant);
        error = Math.abs(((xactual-xanterior)/xactual)*100);
        error1 = String.format("%.6f", error);
        
        return error1;
    }
}

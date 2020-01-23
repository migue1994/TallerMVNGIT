package edu.escuelaing.arem.ASE.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.escuelaing.arem.ASE.app.Entities.LinkedList;
import edu.escuelaing.arem.ASE.app.Entities.Program;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
     private Program programa = new Program();

    @Test
    public void calculoCorrectoMediaPrueba1()
    {
        LinkedList<Integer> prueba = programa.readData("src\\main\\Resourses\\Prueba1.txt");

        double ans = programa.getMean(prueba);
        
        assertEquals(550.6 , ans, 0.05);
    }

    @Test
    public void cálculoCorrectoDesviacionEstandarPrueba1(){
        LinkedList<Integer> prueba = programa.readData("src\\main\\Resourses\\Prueba1.txt");

        double ans = programa.getStandardDeviation(prueba);

        assertEquals(572.026, ans, 0.05);
    }

    @Test
    public void calculoCorrectoMediaPrueba2()
    {
        LinkedList<Integer> prueba = programa.readData("src\\main\\Resourses\\Prueba2.txt");

        double ans = programa.getMean(prueba);
        
        assertEquals(638.9 , ans, 0.05);
    }

    @Test
    public void cálculoCorrectoDesviacionEstandarPrueba2(){
        LinkedList<Integer> prueba = programa.readData("src\\main\\Resourses\\Prueba2.txt");

        double ans = programa.getStandardDeviation(prueba);

        assertEquals(625.633, ans, 0.05);
    }
}

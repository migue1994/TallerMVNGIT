package edu.escuelaing.arem.ASE.app;

/**
 * CLase principal del proyecto
 * 
 * @author Miguel Rivera
 */
public class App {

    /**
     * Método principal, presenta un pequeño menú al usuario y los resultados de la media y desviación estandar
     * @param args Arguments
     */
    public static void main(String[] args) {
        Program program = new Program();

        program.newSource();
        
        LinkedList<Integer> data = program.readData(program.getSource());

        System.out.println("La media de los datos es: " + program.getMean(data));
        System.out.println();

        System.out.println("La desviación estandar de los datos es: " + program.getStandardDeviation(data));
    }
}
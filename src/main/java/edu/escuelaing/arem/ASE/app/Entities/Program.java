package edu.escuelaing.arem.ASE.app.Entities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que se encarga de realizar la lógica del programa, para mostrar los resultados finales
 */
@Data
@NoArgsConstructor
public class Program{

    String source;

    /**
     * Método que lee el path, donde se encuentra el archivo que contiene los datos
     */
    public void newSource(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el path, en donde se encuentra el archivo que contiene los datos");
        setSource(input.next());
        input.close();
    }

     /**
     * Método que se encarga de leer los datos de un archivo de texto
     * @param source Path donde se encuentra ubicado el archivo de texto
     * @return Devuelve una LinkedList, que contiene los datos que suministró el usuario
     */
    public LinkedList<Integer> readData(String source){
        LinkedList<Integer> l = new LinkedList<>();
        Scanner s;
        try {
            s = new Scanner(new File(source));
            while( s.hasNext()){
                l.add(s.nextInt());
            }
            s.close();
            return l;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return l;
    }

    /**
     * Método que se encarga de calcular la media de los datos que se encuentran en la LinkedList
     * @param data LinkedList genérica compuesta por enteros que contiene los datos, suministrados por el usuario
     * @return Devuelve un dato de tipo double, que contiene el cálculo de la media de los datos en la LinkedList
     */
    public double getMean(LinkedList<Integer> data){
        double mean = 0;
        for (int i = 0; i < data.size(); i++){
            mean += data.get(i);
        }
        return mean/data.size();
    }

    /**
     * Método que se encarga de calcular la desviación estandar de los datos suministrados por el usuario
     * @param data LinkedList genérica de tipo entero, que contiene los datos, suministrados por el usuario
     * @return Devuelve un dato de tipo double, que contiene la desviación estándar de los datos suministrados por el usuario
     */
    public double getStandardDeviation(LinkedList<Integer> data){
        double ans = 0;
        double avg = getMean(data);
        for (int i = 0; i < data.size(); i++){
            ans += Math.pow((data.get(i) - avg),2);
        }
        ans /= data.size()-1;
        ans = Math.sqrt(ans);
        return ans;
    }

}
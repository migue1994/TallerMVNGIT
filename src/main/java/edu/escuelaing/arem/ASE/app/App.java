package edu.escuelaing.arem.ASE.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String source;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el path, en donde se encuentra el archivo que contiene los datos");
        source = input.next();
        input.close();

        System.out.println();

        LinkedList<Integer> data = readData(source);

        System.out.println("La media de los datos ingresados es:" + getMean(data));

        System.out.println();

        System.out.println("La desviación estandar de los datos ingresados es:" + getStandartDeviation(data));

    }

    private static LinkedList<Integer> readData(String source){
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

    public static double getMean(LinkedList<Integer> data){
        double mean = 0;
        for (int i = 0; i < data.size(); i++){
            mean += data.get(i);
        }
        return mean/data.size();
    }

    public static double getStandartDeviation(LinkedList<Integer> data){
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

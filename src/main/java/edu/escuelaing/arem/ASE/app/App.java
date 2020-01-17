package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        File file = new File("C:/Users/miguel.rivera-r/Documents/mi-primera-app/src/main/java/edu/escuelaing/arem/ASE/app");
        BufferedReader br = new BufferedReader(new FileReader(file)); 
    }
}

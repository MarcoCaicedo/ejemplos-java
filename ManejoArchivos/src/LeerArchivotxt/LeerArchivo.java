/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeerArchivotxt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class LeerArchivo {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("Calificaciones2.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

    // lee registro del archivo
    public void leer_informacion() {

        try // lee registros del archivo, usando el objeto Scanner
        {
            int j = 0;
            double [] prom = new double[4];
            double suma=0,num_M;
            System.out.printf("PROMEDIO DE CALIFICACIONES\n\n");
            while (entrada.hasNext()) {//el has es para que lea todas las lineas escritas
                
                String linea = entrada.nextLine();
                //System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(",")));
                //System.out.println(linea_partes);
                suma = Double.parseDouble(linea_partes.get(2)) +  
                        Double.parseDouble(linea_partes.get(3));
                prom[j]= (suma/2);
                
                System.out.printf("Promedio de %s es : %.2f\n",linea_partes.get(0),prom[j]);
                j++;
                
            } // fin de while
            num_M = prom[0];
            for (int i = 1; i < prom.length; i++) {
                if (num_M < prom[i]) {
                    num_M = prom[i];
                }
            }
            System.out.printf("\nEl promedio mayor es: %.2f\n",num_M);
        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del metodo leerRegistros
    // cierra el archivo y termina la aplicación

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo
}

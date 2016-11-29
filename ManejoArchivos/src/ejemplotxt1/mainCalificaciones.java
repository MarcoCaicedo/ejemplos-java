/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotxt1;

/**
 *
 * @author SALAS
 */
public class mainCalificaciones {
    public static void main(String[] args) {
        Calificaciones ca = new Calificaciones();
        ca.abrirArchivo();
        ca.agregarInformacion();
        ca.cerrarArchivo();
    }
    
}

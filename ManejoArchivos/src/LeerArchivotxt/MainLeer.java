/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeerArchivotxt;

/**
 *
 * @author SALAS
 */
public class MainLeer {
    public static void main( String args[] )
   {
      LeerArchivo ap = new LeerArchivo();

      ap.abrirArchivo();
      ap.leer_informacion();
      ap.cerrarArchivo();
   } // fin de main
}

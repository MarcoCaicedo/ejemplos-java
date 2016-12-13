/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursividadFactorial;

/**
 *
 * @author SALAS
 */
public class CalculoFactorial {
    
    //declaración recursiva del metodo factorial
    public double factorial (double numero){
        if(numero <= 1){ //evalua caso base
            return 1;
        }else{
            return numero * factorial (numero-1);
        }
    }//fin método factorial
    
    //imprime factoriales pa valores de 0 a 10 
    public void mostrarfactoriales(){
        
        //calcula factorial de 0-10
        for (int contador = 0; contador <= 10; contador++) {
            System.out.printf("%d! = %.0f\n",contador,factorial(contador));
        }
    }// fin metodo mostrar factoriales
           
    
}

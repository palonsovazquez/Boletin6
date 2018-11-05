/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Short numeroPrimero =  Peticiones.pedirNumeroShort("el primer numero:");
        Short numeroSegundo =  Peticiones.pedirNumeroShort(" el segundo numero:");
        
        if (numeroPrimero >= numeroSegundo){
            System.out.println("La resta de los dos numeros es : "+ (numeroPrimero - numeroSegundo));
        }
        System.out.println("La suma de los dos numeros es : "+ (numeroPrimero + numeroSegundo));
    }

}

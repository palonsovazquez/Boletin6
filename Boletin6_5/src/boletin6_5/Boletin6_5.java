/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_5;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double numero1, numero2, numero3;

        numero1 = Peticiones.pedirNumeroDouble("el primer numero");
        numero2 = Peticiones.pedirNumeroDouble("el segundo numero");
        numero3 = Peticiones.pedirNumeroDouble("el tercer numero");

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El numero " +numero1+ "es el mayor");

        } else {
            if (numero2 > numero1 && numero2 > numero3) {
              System.out.println("El numero " +numero2+ "es el mayor");  

            }else{System.out.println("El numero " +numero3+ "es el mayor");}
        }
    }

}

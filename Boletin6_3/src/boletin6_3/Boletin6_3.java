/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double numero = Peticiones.pedirNumeroDouble("un numero");
        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else {
            if (numero < 0) {
                System.out.println("El numero es negativo");
            }else{
                System.out.println("El numero es 0");
            }
        }
    }

}

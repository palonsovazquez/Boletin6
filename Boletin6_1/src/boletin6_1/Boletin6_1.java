/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_1;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Integer x = Peticiones.pedirNumIntFiltrado(" un numero", Peticiones.POSITIVO);
               
               if (null!= x){
                   
                   System.out.println(x+" es positivo");
               }
    }
    
}

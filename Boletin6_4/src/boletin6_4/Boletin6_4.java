/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;

import java.util.Scanner;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String nombrePersonaUno;
        String nombrePersonaDos;
        Double pesoPersonaUno;
        Double pesoPersonaDos;
        System.out.println(" Escriba el nombre de la primera persona");
        nombrePersonaUno = sca.nextLine();
        pesoPersonaUno = Peticiones.pedirNumDoubleFiltrado("el peso de la primera persona.", Peticiones.POSITIVO);
        System.out.println(" Escriba el nombre de la segunda persona");
        nombrePersonaDos = sca.nextLine();
        pesoPersonaDos = Peticiones.pedirNumDoubleFiltrado("el peso de la segunda persona.", Peticiones.POSITIVO);
        
        if(pesoPersonaUno >= pesoPersonaDos){
            System.out.println(nombrePersonaUno +" pesa "+pesoPersonaUno + " y hay una diferencia con "+ nombrePersonaDos + " de " + (pesoPersonaUno - pesoPersonaDos) +" kg");
        }else{System.out.println(nombrePersonaDos +" pesa "+pesoPersonaDos + " y hay una diferencia con "+ nombrePersonaUno + " de " + (pesoPersonaDos - pesoPersonaUno) +" kg");}
        
    }

}

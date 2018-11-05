/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin6_6 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Articulo x = new Articulo("manzanas",1055558);
        
        System.out.println("articulo: "+ x.getNombre() + " clasificacion: " + x.getClasifi());
    }
    
}

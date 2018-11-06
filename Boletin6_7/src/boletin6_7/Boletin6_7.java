/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_7;

import javax.swing.JOptionPane;

/**
 *
 * @author palonsovazquez
 */
public class Boletin6_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje = "";
        String[] options = {"Area triangulo", "Area cuadrado", "Area circulo"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione la opción", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        switch (seleccion) {
            case 0 :
                
              mensaje = "El Area del triangulo es: " +   new Triangulo(
                        Double.parseDouble(JOptionPane.showInputDialog(null, "Escriba la base", null)),
                        Double.parseDouble(JOptionPane.showInputDialog(null, "Escriba la altura", null)))
                        .getArea();
                
                
                break;
                case 1 :
                
              mensaje = "El Area del cuadrado es: " +   new Cuadrado(
                        Double.parseDouble(JOptionPane.showInputDialog(null, "Escriba el lado", null)))
                      
                        .getArea();
                
                
                break;
                case 2 :
                
              mensaje = "El Area del circulo es: " +   new Circulo(
                        Double.parseDouble(JOptionPane.showInputDialog(null, "Escriba el radio", null)))
                      
                        .getArea();
                
                
                break;

        }
    
        JOptionPane.showMessageDialog(null, mensaje, "Resultado", JOptionPane.DEFAULT_OPTION, null);
}
}


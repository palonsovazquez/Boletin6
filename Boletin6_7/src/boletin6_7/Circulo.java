/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_7;

/**
 *
 * @author palonsovazquez
 */
public class Circulo {

    Double radio;
    Double circunferencia;
    Double area;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.setRadio(radio);
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
        circunferencia = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(this.radio, 2);
    }

    public Double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(Double circunferencia) {
        
        this.setRadio((circunferencia/(Math.PI*2)));
        
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.setRadio(Math.sqrt((area/Math.PI))); 
    }

}

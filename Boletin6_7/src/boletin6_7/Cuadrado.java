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
public class Cuadrado {
    Double lado;
    Double perimetro;
    Double area;

    public Cuadrado() {
    }

    public Cuadrado(Double lado) {
        this.setLado(lado);
        
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
        this.perimetro = lado*4;
        this.area = Math.pow(lado, 2);
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.setLado(perimetro/4);
        
        
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
        this.setLado(Math.sqrt(area));
    }
    
}

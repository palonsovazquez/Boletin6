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
public class Articulo {
    private String nombre;
    private Integer ventas;
    private Clasificacion clasifi ;
    public Articulo() {
    }

    public String getClasifi() {
        return clasifi.toString();
    }

    public void setClasifi(Clasificacion clasifi) {
        this.clasifi = clasifi;
    }

    public Articulo(String nombre, Integer ventas) {
        this.nombre = nombre;
        this.ventas = ventas;
        this.clasifi = new Clasificacion(ventas);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVentas() {
        return ventas;
    }

    public void setVentas(Integer ventas) {
        this.ventas = ventas;
    }
    
}

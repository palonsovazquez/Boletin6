package boletin6_6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Clasificacion {

    private static final String[] clasificaciones = {"bajo", "medio", "alto", "primera necesidad"};
    private String clas;
    private Integer ventas;

    public Clasificacion() {
    }

    public Clasificacion(Integer ventas) {
        this.ventas = ventas;
        if (ventas <= 100) {
            this.setClas(clasificaciones[0]);
        } else {
            if (ventas <= 500) {
                this.setClas(clasificaciones[1]);
            } else {
                if (ventas <= 1000) {
                    this.setClas(clasificaciones[2]);
                } else {
                    if (ventas > 1000) {
                        this.setClas(clasificaciones[3]);
                    }else this.setClas(null);
                }
            }
        }
    }

    public Clasificacion(String clas) {
        this.clas = clas;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        switch (clas) {
            case "bajo":
            case "Bajo":
            case "BAJO":
                this.clas = clasificaciones[0];
                break;
            case "medio":
            case "Medio":
            case "MEDIO":
                this.clas = clasificaciones[1];
                break;
            case "alto":
            case "Alto":
            case "ALTO":
                this.clas = clasificaciones[1];
                break;
            case "primera necesidad":
            case "Primera Necesidad":
            case "PRIMERA NECESIDAD":
                this.clas = clasificaciones[1];
                break;
        }
    }

    public Integer getVentas() {
        return ventas;
    }

    public void setVentas(Integer ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return  clas ;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import java.util.ArrayList;
/**
 *
 * @author Mark
 */
public class Comida {
    private String preferencia;
    private int nroComidad;
    private String cocinero;

    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    public int getNroComidad() {
        return nroComidad;
    }

    public void setNroComidad(int nroComidad) {
        this.nroComidad = nroComidad;
    }

    public String getCocinero() {
        return cocinero;
    }

    public void setCocinero(String cocinero) {
        this.cocinero = cocinero;
    }
    
    public ArrayList<Tour> incluye = new ArrayList();
    
    public void agregarTour(Tour tour){
        incluye.add(tour);
    }
}

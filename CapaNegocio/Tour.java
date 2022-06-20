/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import java.time.DateTimeException;
import java.util.ArrayList;
/**
 *
 * @author Mark
 */
public class Tour {
    private DateTimeException fechaSalida;
    private DateTimeException fechaRetorno;
    private String puntoPartida;
    private String recorrido;
    private String duracion;
    private float coste;

    public DateTimeException getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(DateTimeException fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public DateTimeException getFechaRetorno() {
        return fechaRetorno;
    }

    public void setFechaRetorno(DateTimeException fechaRetorno) {
        this.fechaRetorno = fechaRetorno;
    }

    public String getPuntoPartida() {
        return puntoPartida;
    }

    public void setPuntoPartida(String puntoPartida) {
        this.puntoPartida = puntoPartida;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public float getCoste() {
        return coste;
    }

    public void setCoste(float coste) {
        this.coste = coste;
    }
    
    public ArrayList<Agencia> contiene = new ArrayList();
    
    public ArrayList<Comida> incluye = new ArrayList();
    
    public void agregarComida(Comida comida){
        incluye.add(comida);
    }
    
    public ArrayList<Ayudante> tiene = new ArrayList();
    
    public void agregarAyudante(Ayudante ayudante){
        tiene.add(ayudante);
    }
    
    public Guia gestionado;
}

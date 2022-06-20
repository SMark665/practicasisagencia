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
public class Hotel {
    private int cantHabitaciones;

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }
    
    public void Hospedar(){}
    
    public ArrayList<Agencia> arreglo = new ArrayList();
    
    public void agregarAgencia(Agencia agencia){
        arreglo.add(agencia);
    }
}

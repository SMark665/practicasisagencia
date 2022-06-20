/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

/**
 *
 * @author Mark
 */
public class Agencia {
    private String nombre;
    private int cantSucursales;
    private String Calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantSucursales() {
        return cantSucursales;
    }

    public void setCantSucursales(int cantSucursales) {
        this.cantSucursales = cantSucursales;
    }

    public String getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(String Calificacion) {
        this.Calificacion = Calificacion;
    }
    
    public void Planear(){}
    public void Atender(){}
    
    
    public ArrayList<Hotel> arreglo = new ArrayList();
    
    public ArrayList<Tour> contiene = new ArrayList();
    
    public void agregarHotel(Hotel hotel){
        arreglo.add(hotel);
    }
    
    public ArrayList<ServicioTransporte> asociado = new ArrayList();
    
    public void agregarServicioTransporte(ServicioTransporte transporte){
        asociado.add(transporte);
    }
}

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
public class Turista {
    private String Nombres;
    private String documentoIden;
    private int edad;
    private String lugarOrigen;

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getDocumentoIden() {
        return documentoIden;
    }

    public void setDocumentoIden(String documentoIden) {
        this.documentoIden = documentoIden;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    
    public void Aprender(){}
    public void Experimentar(){}
    
    public Grupo esta;
    public ArrayList<Reserva> posee = new ArrayList();
}

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
public class Guia {
    private String nombres;
    private String experiencia;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
    
    public void Gestionar(){}
    public void Guiar(){}
    public void Enseñar(){}
    
    public Tour gestionado;
    
    public ArrayList<Grupo> aCargoDe = new ArrayList();
}

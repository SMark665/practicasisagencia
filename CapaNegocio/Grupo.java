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
public class Grupo {
    private int nroGrupo;
    private int cantTuristas;

    public int getNroGrupo() {
        return nroGrupo;
    }

    public void setNroGrupo(int nroGrupo) {
        this.nroGrupo = nroGrupo;
    }

    public int getCantTuristas() {
        return cantTuristas;
    }

    public void setCantTuristas(int cantTuristas) {
        this.cantTuristas = cantTuristas;
    }
    public void Organizar(){}
    
    public Guia aCargoDe;
    
    public ArrayList<Turista> esta = new ArrayList();
}

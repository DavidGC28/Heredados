package com.krakedev.herencia;

public class Padre {

    
    private int defectos;
    private int virtudes;
    private int juguetes;

    
    public Padre(int virtudes, int defectos) {
        this.defectos = defectos;
        this.virtudes = virtudes;
    }

   
    public int getDefectos() {
        return defectos;
    }

    public void setDefectos(int defectos) {
        this.defectos = defectos;
    }

    public int getVirtudes() {
        return virtudes;
    }

    public void setVirtudes(int virtudes) {
        this.virtudes = virtudes;
    }

    public int getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(int juguetes) {
        this.juguetes = juguetes;
    }

   
    public void imprimir() {
        System.out.println("Virtudes:" + virtudes);
        System.out.println("Defectos:" + defectos);
    }

    public void guardarSecreto() {
        System.out.println("esto no se hereda");
    }

    @Override
    public String toString() {
        return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
    }
}

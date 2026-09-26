package com.krakedev.herencia;

public class Padre {

    
    private int defectos;
    private int virtudes;
    private int juguetes;
    private String nombre;
    private double totalAhorrado;

    
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

    public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
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

   
    public double getTotalAhorrado() {
		return totalAhorrado;
	}


	public void setTotalAhorrado(double totalAhorrado) {
		this.totalAhorrado = totalAhorrado;
	}


	public void imprimir() {
        System.out.println("Virtudes:" + virtudes);
        System.out.println("Defectos:" + defectos);
    }

    public void guardarSecreto() {
        System.out.println("esto no se hereda");
    }
    
    public void ahorrar (double monto) {
    	totalAhorrado += monto;
    }

    public void Nombre (String nombre) {
    	 System.out.println("Milton");
    }


	@Override
	public String toString() {
		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + ", juguetes=" + juguetes + ", nombre="
				+ nombre + ", totalAhorrado=" + totalAhorrado + "]";
	}

	

  
}

package com.krakedev.herencia;

public class Padre {

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
	private int defectos;
	private int virtudes;
	
	public Padre(int virtudes, int defectos) {


		this.defectos = defectos;
		this.virtudes = virtudes;
	}


 @Override
	public String toString() {
		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
	}
 public void imprimir() {
	 System.out.println("Virtudes:" + virtudes);
		System.out.println("Defectos:" + defectos);
 }
 

public void guardarSecreto() {
	System.out.println("esto no se hereda");
}
}



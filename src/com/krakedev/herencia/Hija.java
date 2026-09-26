package com.krakedev.herencia;

public class Hija extends Padre  {
	
	public Hija(int virtudes, int defectos) {
		super(virtudes, defectos);
		// TODO Auto-generated constructor stub
	}

	public void escuchandoKiss() {
		System.out.println("aiguasmeidfolovinyu");
		


}

	@Override
	public String toString() {
		return "Defectos: " +getDefectos() +" "+ "Virtudes: " + getVirtudes(); 
	}

	
	
	
	
	
	
	
	
	
}
package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Padre padre = new Padre (5,2);
		
		padre.ahorrar(1000.0);
		padre.ahorrar(2000.0);
		
		System.out.println("===Ahorros del Padre===");
		System.out.println("Total Ahorrado: $" + padre.getTotalAhorrado());
		
Hija hija = new Hija (5,2);
		
		hija.ahorrar(100.0);
		hija.ahorrar(200.0);
		
		System.out.println("===Ahorros de Hija===");
		System.out.println("Total Ahorrado: $" + hija.getTotalAhorrado());
		
Hijo hijo = new Hijo (5,2, 4);
		
		hijo.ahorrar(100.0);
		hijo.ahorrar(20.0);
		
		System.out.println("===Ahorros de Jijo===");
		System.out.println("Total Ahorrado: $" + hijo.getTotalAhorrado());
	}
	}



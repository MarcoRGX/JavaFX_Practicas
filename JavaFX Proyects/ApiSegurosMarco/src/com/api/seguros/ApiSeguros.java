package com.api.seguros;

public class ApiSeguros {
	
	public static String tramitar(int edad, String tipo, boolean habito, boolean lentes, boolean enfer) {
		String ticket = "";
		int cuota = 0;
		float cargoA = 0;
		//float cargoB = 0;
		//float cargoC = 0;
		float cargoD = 0;
		float cargoTo = 0;
		float costo = 0;
		double total = 0;
		
		if(tipo == "Cobertura Amplia") {
			cuota = 1200;
		}else {
			cuota = 950;
		}
		
		if(habito && lentes && enfer) {
			cargoA = (float) 0.2; 
		}else if(habito && lentes) {
			cargoA = (float) 0.15;
		}else if(habito) {
			cargoA = (float) 0.1;
		}else {
			cargoA = 0;
		}
		
		if(edad>40) {
			cargoD = (float) 0.20;
		}else {
			cargoD = (float) 0.10;
		}
		/*
		if(habito) {
			cargoA = (float) 0.1;
		}
		if(lentes) {
			cargoB = (float) 0.05;
		}
		if(enfer) {
			cargoC = (float) 0.05;
		}
		*/

		
		cargoTo = cargoA + cargoD;
		costo = cargoTo * cuota;
		
		total = costo + cuota;
		
		ticket = "Total a pagar:" + total;
		
		return ticket;
	}
	
}

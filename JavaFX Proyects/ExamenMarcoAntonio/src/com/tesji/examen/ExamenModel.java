package com.tesji.examen;

public class ExamenModel {
	
	public int precio;
	public String dia;
	public float hora;
	public int personas;
	public int edad;
	public String desFin;
	
	public float calcular() {
		float total=0;
		float descuentohora=0;
		float descuentoedad=0;
		float descuentototal=0;
		float descuentoaplicado=0;
		float pago=0;
		
		if(hora>=10.00 && hora<=12.00) {
			descuentohora = (float) 0.50;
		}else if(hora>12.00 && hora<=18.00) {
			descuentohora = (float) 0.25;
		}else if(hora>18.00){
			descuentohora=0;
		}
		
		if(dia.equals("Lunes")) {
			if(personas==2) {
				pago=(precio/2)+precio;
			}else {
				pago=precio;
			}
				
		}else if(dia.equals("Miercoles")) {
			if(personas==2) {
				pago=precio;
			}else {
				pago=precio*personas;
			}
			if(edad>=2 && edad<=10) {
				descuentoedad=(float) 0.50;
			}else if(edad>=60) {
				return total=0;
			}
		}else {
			pago=precio*personas;
		}
		
		descuentototal = descuentoedad + descuentohora;
		desFin= "Descuento: del " + (descuentototal*100) + "%" ;
		//+ "\n Equivalente a : $ " + descuentoaplicado;
		
		descuentoaplicado = descuentototal*pago;
		
		total = pago - descuentototal;
		
		
		return total;
	
	}
}
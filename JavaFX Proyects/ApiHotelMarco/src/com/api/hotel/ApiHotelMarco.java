package com.api.hotel;

public class ApiHotelMarco {

	public static String total(int costo, int dias) {
		String calculo = null;
		
		double descuento1= 0.10;
		double descuento2= 0.15;
		double descuento3= 0.20;
		double cdescuento= 0.0;
		double subtotal= 0.0;
		double total= 0.0;

		if (dias > 15){
		    subtotal= costo*dias;
		    cdescuento= subtotal*descuento3;
		    total= subtotal-cdescuento;}
		else{
		    if (dias > 10){ subtotal= costo*dias;
		    cdescuento= subtotal*descuento2;
		    total = subtotal-cdescuento;}
		    else
		    if (dias > 5){
		    subtotal= costo*dias;
		    cdescuento= subtotal*descuento1;
		    total= subtotal-cdescuento;}
		    else{
		    subtotal= costo*dias;
		    total=subtotal;}
		   }
		
		calculo = "Costo por dia: $" + costo +
                "\nSe quedo: " + dias + " dias" +
                "\nSubtotal " + subtotal +
                 "\nSu descuento es de: $" + cdescuento +
                "\nMenos el descuento\\n\nSu total es: $" +  total;
		
		return calculo;
	}
}

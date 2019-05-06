package com.tesji.api;

import com.jfoenix.controls.JFXButton;	//Importacion de JFX Boton de JFhoenix
import com.jfoenix.controls.JFXTextField;//Importacion de JFX TextFiel de JFhoenix

import eu.hansolo.medusa.Gauge; //Utilizando la api Medusa importaremos el Gauge
import eu.hansolo.medusa.TickLabelOrientation;//Leasignaremos una horientacion importandola
import eu.hansolo.medusa.skins.AmpSkin; //Importaciones de distintos diseños de medusa
import eu.hansolo.medusa.skins.BarSkin;
import eu.hansolo.medusa.skins.BatterySkin;
import eu.hansolo.medusa.skins.ModernSkin;
import eu.hansolo.medusa.skins.SimpleDigitalSkin;
import javafx.event.ActionEvent; //Importacion de eventos 
import javafx.fxml.FXML;
import javafx.scene.paint.Color; //Importacion de paleta de colores de javafx

public class ApiController{ //Declaracion de la clase

	float valor = 0; //Delaracion de variable global valor inicializada 
	
    @FXML
    private Gauge gauge; //asignacion del id gauge

    @FXML
    private JFXTextField txtValor;

    @FXML
    private JFXButton btnCalcular;

    @FXML
    private JFXButton btnBateria;

    @FXML
    private JFXButton btnAMP;

    @FXML
    private JFXButton btnBar;

    @FXML
    private JFXButton btnDigital;
    
    @FXML
    private JFXButton btnModern;
    
    @FXML
    private JFXButton btnSalir;
    
    @FXML
    void btnAMPOnAction(ActionEvent event) {
    	gauge.setSkin(new AmpSkin(gauge)); //Asignacion de la piel AMPSKin antes importada
        
        gauge.setUnit("%");  //Dentro de gauge le podemos asignar un tipo de unidad de medida
        gauge.setUnitColor(Color.WHITE);//Al cual le asignaremos un color blanco
        gauge.setDecimals(0); //Decimales no
        gauge.setValue(0.00); //En esta opcion colocaremos un valor por defaul para el medidor gauge si a si lo desean
        gauge.setAnimated(true);//y realizara una animacion
        gauge.setAnimationDuration(600); //gauge obtendra una duracion de animacion de 600 minsegundos 
        
        gauge.setValueColor(Color.WHITE);  //En esta opcion asignaremos un color blanco para el valor del centro
        gauge.setTitleColor(Color.RED);  //un color rojo a el titulo del gauge donde esta el texto Equipo Dinamita 
        gauge.setSubTitleColor(Color.WHITE); //un color blanco a el subtitulo osea el km/h
        gauge.setBarColor(Color.rgb(0, 214, 215)); //Por medio de colores rgb les asignaremos un color para la barra de progreso  
        gauge.setNeedleColor(Color.RED);  //Aqui asignaremos un color para la ahuja apuntadora
        gauge.setThresholdColor(Color.RED);  //Si el valor sube hasta 90 o mas cambiara a rojo
        gauge.setThreshold(85); //Este valor sera el limite para que la barra de progreso cambie
        gauge.setThresholdVisible(true); //Hacer visible el lugar o una agua roja del limite
        gauge.setTickLabelColor(Color.rgb(151, 151, 151));//En esta opcion podemos cambiar el color de los numeros del contador
        gauge.setTickMarkColor(Color.YELLOW);//En esta opcion podemos cambiar el color de las lineas de cada contador
        gauge.setTickLabelOrientation(TickLabelOrientation.ORTHOGONAL);
    }

    @FXML
    void btnBarOnAction(ActionEvent event) {
    	gauge.setSkin(new BarSkin(gauge));//Asignacion de la piel Barskin antes importada
        
        gauge.setUnit("%");  //Dentro de gauge le podemos asignar un tipo de unidad de medida
        gauge.setUnitColor(Color.WHITE);//Al cual le asignaremos un color blanco
        gauge.setDecimals(0); //Decimales no
        gauge.setValue(0.00); //En esta opcion colocaremos un valor por defaul para el medidor gauge si a si lo desean
        gauge.setAnimated(true);//y realizara una animacion
        gauge.setAnimationDuration(600); //gauge obtendra una duracion de animacion de 600 minsegundos 
        
        gauge.setValueColor(Color.WHITE);  //En esta opcion asignaremos un color blanco para el valor del centro
        gauge.setTitleColor(Color.RED);  //un color rojo a el titulo del gauge donde esta el texto Equipo Dinamita 
        gauge.setSubTitleColor(Color.WHITE); //un color blanco a el subtitulo osea el km/h
        gauge.setBarColor(Color.rgb(0, 214, 215)); //Por medio de colores rgb les asignaremos un color para la barra de progreso  
        gauge.setNeedleColor(Color.RED);  //Aqui asignaremos un color para la ahuja apuntadora
        gauge.setThresholdColor(Color.RED);  //Si el valor sube hasta 90 o mas cambiara a rojo
        gauge.setThreshold(85); //Este valor sera el limite para que la barra de progreso cambie
        gauge.setThresholdVisible(true); //Hacer visible el lugar o una agua roja del limite
        gauge.setTickLabelColor(Color.rgb(151, 151, 151));//En esta opcion podemos cambiar el color de los numeros del contador
        gauge.setTickMarkColor(Color.YELLOW);//En esta opcion podemos cambiar el color de las lineas de cada contador
        gauge.setTickLabelOrientation(TickLabelOrientation.ORTHOGONAL);
    }

    @FXML
    void btnBateriaOnAction(ActionEvent event) {
    	    	
    	gauge.setSkin(new BatterySkin(gauge));//Asignacion de la piel BateriaSkin antes importada
        
        gauge.setUnit("%");  //Dentro de gauge le podemos asignar un tipo de unidad de medida
        gauge.setUnitColor(Color.WHITE);//Al cual le asignaremos un color blanco
        gauge.setDecimals(0); //Decimales no
        gauge.setValue(0.00); //En esta opcion colocaremos un valor por defaul para el medidor gauge si a si lo desean
        gauge.setAnimated(true);//y realizara una animacion
        gauge.setAnimationDuration(600); //gauge obtendra una duracion de animacion de 600 minsegundos 
        
        gauge.setValueColor(Color.WHITE);  //En esta opcion asignaremos un color blanco para el valor del centro
        gauge.setTitleColor(Color.RED);  //un color rojo a el titulo del gauge donde esta el texto Equipo Dinamita 
        gauge.setSubTitleColor(Color.WHITE); //un color blanco a el subtitulo osea el km/h
        gauge.setBarColor(Color.rgb(0, 214, 215)); //Por medio de colores rgb les asignaremos un color para la barra de progreso  
        gauge.setNeedleColor(Color.RED);  //Aqui asignaremos un color para la ahuja apuntadora
        gauge.setThresholdColor(Color.RED);  //Si el valor sube hasta 90 o mas cambiara a rojo
        gauge.setThreshold(85); //Este valor sera el limite para que la barra de progreso cambie
        gauge.setThresholdVisible(true); //Hacer visible el lugar o una agua roja del limite
        gauge.setTickLabelColor(Color.rgb(151, 151, 151));//En esta opcion podemos cambiar el color de los numeros del contador
        gauge.setTickMarkColor(Color.YELLOW);//En esta opcion podemos cambiar el color de las lineas de cada contador
        gauge.setTickLabelOrientation(TickLabelOrientation.ORTHOGONAL);
    }

    @FXML
    void btnSalirOnAction(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void btnCalcularOnAction(ActionEvent event) {
    	
    	try { //}Por medio de un try catch intentaremos...
        	valor = Float.parseFloat(txtValor.getText()); //Utilizando el textfiel pediremos un numero y los guardaremos en valor
        	if(valor > 100) { //Si el valor se pasa de 100
        		valor = 0; //El valor se volvera 0
        	}
        	}catch(Exception e) { //Si el usuario escribe un caracter o no escribe ningun valor 
        		System.out.println("Ya lo descompusiste compa");  //Entonces Mandara el mensaje en consola  	
        	}
    	//Si el valor es valido
    	gauge.setAnimated(true);//Una vez obtenido el dato gauge hara una animacion 
        gauge.setValue(valor); //por lo cual y llegara hasta el valor que fue ingresado
    }

    @FXML
    void btnDigitalOnAction(ActionEvent event) {
    	gauge.setSkin(new SimpleDigitalSkin(gauge));//Asignacion de la piel digital antes importada
        
        gauge.setUnit("No nos repruebe \nprofe");  //Dentro de gauge le podemos asignar un tipo de unidad de medida
        gauge.setUnitColor(Color.WHITE);//Al cual le asignaremos un color blanco
        gauge.setDecimals(0); //Decimales no
        gauge.setValue(0.00); //En esta opcion colocaremos un valor por defaul para el medidor gauge si a si lo desean
        gauge.setAnimated(true);//y realizara una animacion
        gauge.setAnimationDuration(600); //gauge obtendra una duracion de animacion de 600 minsegundos 
        
        gauge.setValueColor(Color.WHITE);  //En esta opcion asignaremos un color blanco para el valor del centro
        gauge.setTitleColor(Color.RED);  //un color rojo a el titulo del gauge donde esta el texto Equipo Dinamita 
        gauge.setSubTitleColor(Color.WHITE); //un color blanco a el subtitulo osea el km/h
        gauge.setBarColor(Color.rgb(0, 214, 215)); //Por medio de colores rgb les asignaremos un color para la barra de progreso  
        gauge.setNeedleColor(Color.RED);  //Aqui asignaremos un color para la ahuja apuntadora
        gauge.setThresholdColor(Color.RED);  //Si el valor sube hasta 90 o mas cambiara a rojo
        gauge.setThreshold(85); //Este valor sera el limite para que la barra de progreso cambie
        gauge.setThresholdVisible(true); //Hacer visible el lugar o una agua roja del limite
        gauge.setTickLabelColor(Color.rgb(151, 151, 151));//En esta opcion podemos cambiar el color de los numeros del contador
        gauge.setTickMarkColor(Color.YELLOW);//En esta opcion podemos cambiar el color de las lineas de cada contador
        gauge.setTickLabelOrientation(TickLabelOrientation.ORTHOGONAL);
    }
    
    @FXML
    void btnModernOnAction(ActionEvent event) {
    	gauge.setSkin(new ModernSkin(gauge));//Asignacion de la piel Moderno antes importada
        
        gauge.setUnit("Equipo Dinamita");  //Dentro de gauge le podemos asignar un tipo de unidad de medida
        gauge.setUnitColor(Color.WHITE);//Al cual le asignaremos un color blanco
        gauge.setDecimals(0); //Decimales no
        gauge.setValue(0.00); //En esta opcion colocaremos un valor por defaul para el medidor gauge si a si lo desean
        gauge.setAnimated(true);//y realizara una animacion
        gauge.setAnimationDuration(600); //gauge obtendra una duracion de animacion de 600 minsegundos 
        
        gauge.setValueColor(Color.WHITE);  //En esta opcion asignaremos un color blanco para el valor del centro
        gauge.setTitleColor(Color.RED);  //un color rojo a el titulo del gauge donde esta el texto Equipo Dinamita 
        gauge.setSubTitleColor(Color.WHITE); //un color blanco a el subtitulo osea el km/h
        gauge.setBarColor(Color.rgb(0, 214, 215)); //Por medio de colores rgb les asignaremos un color para la barra de progreso  
        gauge.setNeedleColor(Color.RED);  //Aqui asignaremos un color para la ahuja apuntadora
        gauge.setThresholdColor(Color.RED);  //Si el valor sube hasta 90 o mas cambiara a rojo
        gauge.setThreshold(85); //Este valor sera el limite para que la barra de progreso cambie
        gauge.setThresholdVisible(true); //Hacer visible el lugar o una agua roja del limite
        gauge.setTickLabelColor(Color.rgb(151, 151, 151));//En esta opcion podemos cambiar el color de los numeros del contador
        gauge.setTickMarkColor(Color.YELLOW);//En esta opcion podemos cambiar el color de las lineas de cada contador
        gauge.setTickLabelOrientation(TickLabelOrientation.ORTHOGONAL);
    }

}

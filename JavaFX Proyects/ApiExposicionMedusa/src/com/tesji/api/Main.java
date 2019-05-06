package com.tesji.api;
	//Hola Compañeros nossotros somos el equipo dinamita y hoy les mostraremos el API Medusa

import javafx.application.Application;	//Importaciones del contenedor Stage, Scene, y la API Medusa y MedusaGauge
import javafx.stage.Stage;	//
import javafx.scene.Scene;	//
import javax.swing.JOptionPane;
//import javafx.scene.layout.BorderPane; 
//import javafx.fxml.FXMLLoader;
import eu.hansolo.medusa.Gauge; //Im
//import eu.hansolo.medusa.GaugeBuilder;
import eu.hansolo.medusa.TickLabelOrientation;
import eu.hansolo.medusa.skins.ModernSkin;
//import eu.hansolo.medusa.skins.SpaceXSkin;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Gauge gauge = new Gauge(); //Declaramos un objeto de la clase Gauge con su meotodo constructor
			Button btn = new Button(); //Declarqacion de un btn de la clase button de java 
	        btn.setText("Comenzar");	//A el objeto btn se le accicnara el texto "Comenzar"
	        btn.setTranslateX(0); //Por defecto el boton aparecera en el centro por lo cual la trasladaremos 0px a la derecha 
	        btn.setTranslateY(100);//y la bajaremos 100px abajo
	        gauge.setTitle("Equipo Dinamita");  //A el objeto gauge le asignaremos el texto "Equipo dinamits"
	        
	      //A el boton que creamos y posicionamos le daremos un evento al precionarlo
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	            
	            @Override
	            public void handle(ActionEvent event) { //Creamos un evento cuando el boton sea precionado
	            	float valor = 0; //Declaramos una variable del tipo con un valor que el usuario ingrese 
	            	try { //}Por medio de un try catch intentaremos...
	            	gauge.setTitle("Equipo Dinamita"); //Asignaremos de nuevo el nombre de equipo dinamita si el usuario vuelve a precionar el boton
	            	valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor compañero")); //Por medio de un JOptionPane pediremos datos y los guardaremos en valor
	            	}catch(Exception e) { //Si el usuario escribe un caracter o no escribe ningun valor 
	            		gauge.setTitle("Ya lo descompusiste compa");  //Entonces el gauge  	
	            	}
	                gauge.setAnimated(true);//Una vez obtenido el dato gauge hara una animacion 
	                gauge.setValue(valor); //por lo cual yyegara hasta el valor que fue ingresado
	            }
	        });
	        
	        gauge.setSkin(new ModernSkin(gauge));//Por medio del ModernSkin le daremos la piel de gauge 
	         gauge.setUnit("Km / h");  //Dentro de gauge le podemos asignar un tipo de unidad de medida
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
	        
	        //Creamos un objeto llamado root de un panel Stack del cual cargaremos todos las intrucciones y caracteristicas 
	        StackPane root = new StackPane();//del boton y el gauge que seran hijos del objeto root 
	        root.getChildren().addAll(gauge);//y cargara esas caracteristicas en la vista
	        root.getChildren().addAll(btn);
	        
	        //Todo esto es parte del primary stage
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("ApiView.fxml"));
			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Medusa Equipo Chido");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

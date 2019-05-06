   package com.teji.drawer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.tesji.elem.*;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

import com.tesji.elem.*;
public class drawerController implements Initializable {

    @FXML
    private AnchorPane root;

    @FXML
    private JFXDrawer drawer;

    @FXML
    private JFXHamburger hamburger;

	    @FXML
	    private JFXButton idOpciones;
	@Override
	public void initialize(URL location, ResourceBundle rb) {
		   
	    try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/tesji/elem/elemView.fxml"));//pasamos el fxml del paquete  elemento 
            VBox box = loader.load(); // aqui basamos el vbox con el que se creo la vista que se incluira en esta clase 
           drawer.setSidePane(box);//aqui el box que se manda del paquete elem se hace visible en el drawer
        } catch (IOException ex) {
        }
 
	   idOpciones.setOnMousePressed(e -> {

           if (drawer.isOpened()) {//si drawer este abierto entra en el if y 
               drawer.close(); //lo cambia a cerrado
           } else {//si drawer este cerrado 
        	 
               drawer.open();//drawer abrira
           }
		});

	    
	    

	        HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(hamburger);
	        /*Esta transición crea una flecha hacia atrás desde las 3 líneas paralelas (Hamburguesa). Esto se puede crear pasando el objeto de hamburguesa como un 
	        parámetro a la clase HamburgerBackArrowBasicTransition.uno
*/
	  /*
	   * El estado de la transición (ya sea flecha o hamburger) 
	   * se establece mediante el método setRate ().
	   *  La animación se controla cambiando la velocidad 
	   *  entre -1 y 1.*/      
	        transition.setRate(-1);
	        hamburger.setOnMousePressed(e  -> {//
	            transition.setRate(transition.getRate() * -1);
	            /*
	     
Como puede ver, al principio, el objeto transición se debe establecer 
en -1, que es la hamburger. Después de que el usuario haga clic en la 
hamburger, se puede actualizar multiplicando con -1, es decir, a 1. Ahora, la hamburger
 se convertirá en una flecha. 
Para más clics en la hamburguesa, se repetirá entre -1 y 1.*/
	            transition.play();//La animación se puede iniciar utilizando el método play ().

	            if (drawer.isOpened()) {//cuandp drawer este abiertp
	                drawer.close(); //
	            } else {
	                drawer.open();
	            }
	        });
	    }
	
}

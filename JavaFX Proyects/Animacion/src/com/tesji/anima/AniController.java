package com.tesji.anima;

import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class AniController {

    @FXML
    private AnchorPane imgAni;

    @FXML
    void imgAniOnKeyReleased(KeyEvent event) {
		
    	if(event.getCode() == KeyCode.DOWN) {
    		System.out.println("Tecla abajo");
    		//lblTitulo.setText("Niño deje ahi, solo numeros");
    		event.consume();
    		//Toolkit.getDefaultToolkit().beep();
    	}
    }

}

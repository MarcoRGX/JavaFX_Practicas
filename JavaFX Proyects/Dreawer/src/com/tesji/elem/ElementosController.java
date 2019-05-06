package com.tesji.elem;
import com.teji.drawer.*;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class ElementosController implements Initializable {

	   @FXML
	    private JFXButton b1;
	    @FXML
	    private JFXButton b2;
	    @FXML
	    private JFXButton b3;
	    @FXML
	    private JFXButton exit;

	    @Override
	    public void initialize(URL url, ResourceBundle rb) {

	    } 
	    @FXML
	    private void changeColor(ActionEvent event) {//aqui un ide  del evento de los botones
	        JFXButton btn = (JFXButton) event.getSource();//en el getsource procede de la acción sobre un botón
	     //   System.out.println(btn.getText());//imprecion de lo que contiene el texto en el boton
	    JOptionPane.showMessageDialog(null, btn.getText());
	    
	    }
	    @FXML
	    private void exit(ActionEvent event) {
	        System.exit(0);//salir del programa 
	    }

}
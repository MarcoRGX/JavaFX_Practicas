package com.tesji.examen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ExamenController {

    @FXML
    private TextField txtCosto;

    @FXML
    private RadioButton rbLunes;

    @FXML
    private ToggleGroup grupoSemana;

    @FXML
    private RadioButton rbMartes;

    @FXML
    private RadioButton rbMiercoles;

    @FXML
    private RadioButton rbJueves;

    @FXML
    private RadioButton rbViernes;

    @FXML
    private RadioButton rbSabado;

    @FXML
    private RadioButton rbDomingo;

    @FXML
    private TextField txtHora;

    @FXML
    private TextField txtPersonas;

    @FXML
    private TextField txtEdad;

    @FXML
    private Button btnCalcular;

    @FXML
    private Button btnBorrar;

    @FXML
    private Button btnSalir;

    @FXML
    private TextArea txtTotal;

    @FXML
    private TextArea txtMensaje;

    @FXML
    void btnBorrarOnAction(ActionEvent event) {
    	txtCosto.setText("");
    	txtEdad.setText("");
    	txtHora.setText("");
    	txtMensaje.setText("Gracias por su visita");
    	txtTotal.setText("Total a pagar:");
    	txtPersonas.setText("");    	
    }

    @FXML
    void btnCalcularOnAction(ActionEvent event) {
    	ExamenModel obj = new ExamenModel();
    	try {
    	obj.precio = Integer.parseInt(txtCosto.getText());
    	
    	if(rbLunes.isSelected()) {
    		obj.dia = "Lunes" ;
    	}else if(rbMartes.isSelected()) {
    		obj.dia = "Martes" ;
    	}else if(rbMiercoles.isSelected()) {
    		obj.dia = "Miercoles" ;
    	}else if(rbJueves.isSelected()) {
    		obj.dia = "Jueves" ;
    	}else if(rbViernes.isSelected()) {
    		obj.dia = "Viernes" ;
    	}else if(rbSabado.isSelected()) {
    		obj.dia = "Sabado" ;
    	}else if(rbDomingo.isSelected()) {
    		obj.dia = "Domingo" ;
    	}
    	
    	obj.hora = Float.parseFloat(txtHora.getText());
    	obj.personas = Integer.parseInt(txtPersonas.getText());
    	obj.edad = Integer.parseInt(txtEdad.getText());
    	
    	txtTotal.setText("Total a Pagar: \n" + "$" + obj.calcular());
    	txtMensaje.setText(obj.desFin);
    	
    	}catch(Exception e) {
    		txtTotal.setText("Llena todos los campos por favor" + 
    				"\n NO OLVIDES LLENAR LA FECHA CON \n DECIMALES EJEMPLO 12.00");
    	}
    	
    }

    @FXML
    void btnSalirOnAction(ActionEvent event) {
    	System.exit(0);
    }

}

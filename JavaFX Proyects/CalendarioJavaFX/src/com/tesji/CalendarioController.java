package com.tesji;

import com.tesji.CalendarioModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalendarioController {

    @FXML
    private Button btnComenzar;

    @FXML
    private Button btnBorrar;

    @FXML
    private Button btnSalir;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblElegida;

    @FXML
    private Label lblSiguiente;

    @FXML
    private TextField txtDia;

    @FXML
    private TextField txtMes;

    @FXML
    private TextField txtAño;

    @FXML
    void btnBorrarOnAction(ActionEvent event) {
    	txtDia.setText("");
    	txtMes.setText("");
    	txtAño.setText("");
    	lblElegida.setText("");
    	lblSiguiente.setText("");
    }

    @FXML
    void btnComenzarOnAction(ActionEvent event) {
        CalendarioModel obtener = new CalendarioModel();
        try {
            //obtener.dia = Integer.parseInt(txtDia.getText());
                //Metodo Set para asignarle el valor a otro metodo
            obtener.setDia(Integer.parseInt(txtDia.getText()));
            //obtener.mes = Integer.parseInt(txtMes.getText());
                //Metodo Set para asignarle el valor a otro metodo
            obtener.setMes(Integer.parseInt(txtMes.getText()));
            //obtener.año = Integer.parseInt(txtAño.getText());
                //Metodo Set para asignarle el valor a otro metodo
            obtener.setAño(Integer.parseInt(txtAño.getText()));
            lblSiguiente.setText(obtener.obtenerFecha());
            lblElegida.setText(obtener.getDia() + "/" + obtener.getMes() + "/" + obtener.getAño());
        } catch (Exception e) {
            txtDia.setText("");
            txtMes.setText("");
            txtAño.setText("");
            lblSiguiente.setText("");
            lblElegida.setText("");
        }
    }

    @FXML
    void btnSalirOnAction(ActionEvent event) {
    	System.exit(0);
    }

}

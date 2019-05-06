package com.tesji.cine;

import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class CineController {

    @FXML
    private BorderPane BorderPane;

    @FXML
    private ImageView imgLogo;

    @FXML
    private Label lblTitle;

    @FXML
    private JFXTextField txtCosto;

    @FXML
    private Button btnCalcular;

    @FXML
    private Button btnBorrar;

    @FXML
    private Button btnSalir;

    @FXML
    private JFXRadioButton rbLunes;

    @FXML
    private JFXRadioButton rbMartes;

    @FXML
    private JFXRadioButton rbMiercoles;

    @FXML
    private JFXRadioButton rbJueves;

    @FXML
    private JFXRadioButton rbViernes;

    @FXML
    private JFXTextArea txtTicket;

    @FXML
    private JFXTextArea txtPromos;

    @FXML
    private JFXTextField txtHora;

    @FXML
    private JFXTextField txtPersonas;

    @FXML
    void BorderPaneEntered(MouseEvent event) {

    }

    @FXML
    void BorderPaneExited(MouseEvent event) {

    }

    @FXML
    void btnBorrarOnAction(ActionEvent event) {

    }

    @FXML
    void btnCalcularOnAction(ActionEvent event) {

    }

    @FXML
    void btnSalirOnAction(ActionEvent event) {

    }

    @FXML
    void lblTitleEntered(MouseEvent event) {

    }

    @FXML
    void lblTitleExited(MouseEvent event) {

    }

}

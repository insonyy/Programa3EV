package ui;
import domain.Animal;
import java.net.URL;
import java.util.ResourceBundle;

import common.TipoException;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXTextField;
import io.github.palexdev.materialfx.controls.MFXToggleButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import service.ServicioGestion;

import java.net.URL;
import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class FXController implements Initializable {

    private MainViewModel viewModel;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private MFXButton botonAdd;
    @FXML
    private MFXButton botonDelete;
    @FXML
    private MFXButton botonUpdate;
    @FXML
    private TableView<Animal> tablaAnimales;
    @FXML
    private TableColumn<Animal, String> columna1;
    @FXML
    private TableColumn<Animal, Integer> columna2;
    @FXML
    private TableColumn<Animal, String> columna3;
    @FXML
    private TableColumn<Animal, String> columna4;
    @FXML
    private MFXComboBox<String> comboBox;
    @FXML
    private MFXTextField nombre;
    @FXML
    private MFXTextField edad;
    @FXML
    private MFXTextField id;
    @FXML
    private Label label;
    @FXML
    private MFXToggleButton toggleidioma;

    @FXML
    private MFXToggleButton modooscuro;

    public FXController() throws TipoException {
		this.viewModel = new MainViewModel();
        viewModel = new MainViewModel(new ServicioGestion());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tablaAnimales.setItems(viewModel.getAnimales());
        //mapeo de los atributos a las columnas
        columna1.setCellValueFactory(new PropertyValueFactory<>("id"));
        columna2.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columna3.setCellValueFactory(new PropertyValueFactory<>("edad"));
        columna4.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        comboBox.getItems().addAll(resourceBundle.getString("combo1"), resourceBundle.getString("combo2"), resourceBundle.getString("combo3"), resourceBundle.getString("combo4"));
        //si queremos que al seleccionar un elemento de la tabla se rellenen los textField hay que añadir un listener a la tabla para que
        //ejecute el método onEdit cada vez que ocurra..
//        tablaAnimales.setOnMouseClicked((MouseEvent event) -> {
//                        onEdit();
//        });
    }


}

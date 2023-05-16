package ui;
import daoEmpleados.*;
import domain.Empleado;

import java.net.URL;
import java.util.ResourceBundle;
import common.TipoException;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXTextField;
import io.github.palexdev.materialfx.controls.MFXToggleButton;
import javafx.collections.ObservableList;
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
	private Button botonAdd;
	@FXML
	private Button botonDelete;
	@FXML
	private Button botonUpdate;
	@FXML
	private TableView<Empleado> tablaEmpleados;
	@FXML
	private TableColumn<Empleado, String> columna1;
	@FXML
	private TableColumn<Empleado, String> columna2;
	@FXML
	private TableColumn<Empleado, String> columna3;
	@FXML
	private TableColumn<Empleado, String> columna4;
	@FXML
	private TextField nombre;
	@FXML
	private TextField apellido;
	@FXML
	private TextField nif;
	@FXML
	private TextField cargo;
	@FXML
	private Label label;
	@FXML
	private MFXToggleButton toggle;
	public FXController() throws TipoException {
		this.viewModel = new MainViewModel();
		viewModel = new MainViewModel(new ServicioGestion());
	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		try {
			tablaEmpleados.setItems((ObservableList<Empleado>) viewModel.getServicioGestion().getListaEmpleados());
		} catch (TipoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//mapeo de los atributos a las columnas
		columna1.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
		columna2.setCellValueFactory(new PropertyValueFactory<>("Apellido"));
		columna3.setCellValueFactory(new PropertyValueFactory<>("DNI"));
		columna4.setCellValueFactory(new PropertyValueFactory<>("Cargo"));
		//si queremos que al seleccionar un elemento de la tabla se rellenen los textField hay que añadir un listener a la tabla para que
		//ejecute el método onEdit cada vez que ocurra..
		tablaEmpleados.setOnMouseClicked((MouseEvent event) -> {
			onEdit();
		});
	}
	public void onEdit() {
        //check si se ha seleccionado un elemento y actualiza los textField con los valores de los atributos del elemento seleccionado
        //Con esto no haría falta la imagen de ayuda puesto que el usuario no tendría que introducirlo en los textField
        if (tablaEmpleados.getSelectionModel().getSelectedItem() != null) {
            Empleado selectedEmpleado = tablaEmpleados.getSelectionModel().getSelectedItem();
            nombre.setText(selectedEmpleado.getNombre());
            apellido.setText(selectedEmpleado.getApellido());
            nif.setText(selectedEmpleado.getDni());
            cargo.setText(selectedEmpleado.getCargo());
        }
    }

    @FXML
    private void addEmpleado() throws TipoException {
        if (nombre.getText().isEmpty() || apellido.getText().isEmpty() || nif.getText().isEmpty() || cargo.getText().isEmpty()) {
        } else {
            Empleado empleado = new Empleado(nombre.getText(), apellido.getText(), nif.getText(), cargo.getText());
            if (viewModel.getServicioGestion().nuevoEmpleado(empleado)) {
                tablaEmpleados.getItems().add(empleado);
                limpiarCampos();
            }
        }
    }

    @FXML
    private void deleteEmpleado() {
        Empleado empleado = tablaEmpleados.getSelectionModel().getSelectedItem();
        try {
			if (empleado != null && viewModel.getServicioGestion().eliminarFichaEmpleado(empleado.getNombre())) {
			    limpiarCampos();
			}
		} catch (TipoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    private void updateEmpleado() {
        if (nombre.getText() == null || apellido.getText() == null || nif.getText() == null || cargo.getText() == null) {
        	
        } else {
            Empleado empleado = new Empleado(nombre.getText(), apellido.getText(), nif.getText(), cargo.getText());
            Empleado empleado2 = tablaEmpleados.getSelectionModel().getSelectedItem();
            if (viewModel.getServicioGestion() != null) {
                tablaEmpleados.getItems().remove(empleado2);
                tablaEmpleados.getItems().add(empleado);
                limpiarCampos();
                tablaEmpleados.refresh();
            } 
        }
    }

    private void limpiarCampos() {
        nombre.clear();
        apellido.clear();
        nif.clear();
        cargo.clear();
    }


}

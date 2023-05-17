package ui;
import domain.Empleado;

import java.net.URL;
import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;
import common.TipoException;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import service.ServicioGestion;

public class FXController implements Initializable {

	private MainViewModel viewModel;
	@FXML
	private AnchorPane anchorPane;
	@FXML
	private Button buttonNew;
	@FXML
	private Button buttonDelete;
	@FXML
	private Button buttonUpdate;
	@FXML
	private TableView<Empleado> tablaEmpleados;
	@FXML
	private TableColumn<Empleado, String> columnaNombre;
	@FXML
	private TableColumn<Empleado, String> columnaApellido;
	@FXML
	private TableColumn<Empleado, String> columnaDNI;
	@FXML
	private TableColumn<Empleado, String> columnaCargo;
	@FXML
	private TextField nombre;
	@FXML
	private TextField apellido;
	@FXML
	private TextField nif;
	@FXML
	private TextField cargo;
	public FXController() throws TipoException {
		this.viewModel = new MainViewModel(new ServicioGestion());
	}

	public void initialize(URL url, ResourceBundle resourceBundle) {
		tablaEmpleados.setItems(viewModel.getEmpleados());
		//mapeo de los atributos a las columnas
		columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		columnaApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
		columnaDNI.setCellValueFactory(new PropertyValueFactory<>("dni"));
		columnaCargo.setCellValueFactory(new PropertyValueFactory<>("cargo"));
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
			Empleado selectedAnimal = tablaEmpleados.getSelectionModel().getSelectedItem();
			nombre.setText(selectedAnimal.getNombre());
			apellido.setText(selectedAnimal.getApellido());
			nif.setText(String.valueOf(selectedAnimal.getDni()));
			cargo.setText(String.valueOf(selectedAnimal.getCargo()));
		}
	}


	@FXML
	private void addEmpleado() throws TipoException {
		if (nombre.getText().isEmpty() || apellido.getText().isEmpty() || nif.getText().isEmpty() || cargo.getText().isEmpty()) {
			alertaErrorAddEmpleado();
		} else {
			Empleado empleado = new Empleado(nombre.getText(), apellido.getText(), nif.getText(), cargo.getText());
			if (viewModel.getServicioGestion().nuevoEmpleado(empleado)) {
				tablaEmpleados.getItems().add(empleado);
				alertaOKAddEmpleado();
				limpiarCampos();
			} else {
				alertaErrorAddEmpleado();
			}
		}
	}

	@FXML
	private void deleteEmpleado() throws TipoException {
		Empleado empleado = tablaEmpleados.getSelectionModel().getSelectedItem();
		if (empleado != null && viewModel.getServicioGestion().eliminarFichaEmpleado(empleado.getNombre())) {
			alertaConfirmationDeleteEmpleado(empleado);
			alertaOkDeleteEmpleado();
			limpiarCampos();
		} else {
			alertaErrorDeleteEmpleado();
		}
	}

	@FXML
	private void updateEmpleado() {
		if (nombre.getText() == null || apellido.getText() == null || nif.getText() == null || cargo.getText() == null) {
			alertaErrorUpdateEmpleado();
		} else {
			Empleado animal1 = new Empleado(nombre.getText(), apellido.getText(), nif.getText(), cargo.getText());
			Empleado animal2 = tablaEmpleados.getSelectionModel().getSelectedItem();
			if (viewModel.getEmpleados()!=null) {
				tablaEmpleados.getItems().remove(animal2);
				tablaEmpleados.getItems().add(animal1);
				alertaOKUpdateEmpleado();
				limpiarCampos();
				tablaEmpleados.refresh();
			} else {
				alertaErrorUpdateEmpleado();
			}
		}
	}

	private void limpiarCampos() {
		nombre.clear();
		apellido.clear();
		nif.clear();
		cargo.clear();
	}

	@FXML
	private void alertaErrorAddEmpleado() {
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setTitle("Error");
		alert.setHeaderText("Error al añadir el animal");
		alert.setContentText("No se ha podido añadir el animal");
		alert.show();
	}

	private void alertaOKAddEmpleado() {
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Animal añadido correctamente");
		alert.setHeaderText("Animal añadido correctamente");
		alert.setContentText("Se ha añadido correctamente");
		alert.show();

	}

	private void alertaOKUpdateEmpleado() {
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Animal actualizado con éxito");
		alert.setHeaderText("Animal actualizado con éxito");
		alert.setContentText("Se ha actualizado correctamente");
		alert.show();
	}

	@FXML
	private void alertaErrorUpdateEmpleado() {
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setTitle("Error");
		alert.setHeaderText("Error al actualizar animal");
		alert.setContentText("Problemas al actualizar el animal");
		alert.show();
	}

	private void alertaConfirmationDeleteEmpleado(Empleado empleado) {
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Diálogo de Confirmación");
		alert.setHeaderText("Diálogo confirmación");
		alert.setContentText("Confirma el borrado de " + empleado + "?");

		Optional<ButtonType> result = alert.showAndWait();
		if (result.isPresent() && result.get() == ButtonType.OK) {
			tablaEmpleados.getItems().remove(empleado);
			Alert alert2 = new Alert(Alert.AlertType.CONFIRMATION);
			alert2.setTitle("Animal eliminada con éxito");
			alert2.setHeaderText("Animal eliminada con éxito");
			alert2.setContentText("Se ha eliminado correctamente");
			alert2.show();
		}

	}

	private void alertaOkDeleteEmpleado() {
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Animal eliminada con éxito");
		alert.setHeaderText("Animal eliminada con éxito");
		alert.setContentText("Se ha eliminado correctamente");
		alert.show();
	}

	@FXML
	private void alertaErrorDeleteEmpleado() {
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setTitle("Error");
		alert.setHeaderText("Error al eliminar el animal");
		alert.setContentText("No se ha podido eliminar el animal");
		alert.show();
	}

/*	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		tablaEmpleados.setItems(viewModel.getEmpleados());
		//mapeo de los atributos a las columnas
		columnaNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
		columnaApellido.setCellValueFactory(new PropertyValueFactory<>("Apellido"));
		columnaDNI.setCellValueFactory(new PropertyValueFactory<>("DNI"));
		columnaCargo.setCellValueFactory(new PropertyValueFactory<>("Cargo"));
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

*/
}

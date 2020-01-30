package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemVendedor;
	@FXML
	public void onMenuItemVendedorAction() {
		System.out.println("onMenuItemVendedorAction");
	}
	
	
	@FXML
	private MenuItem menuItemDepartamento;
	@FXML
	public void onMenuItemDepartamentoAction() {
		System.out.println("onMenuItemDepartamentoAction");
		loadView("/gui/DepartmentList.fxml");
	}
	
	
	@FXML
	private MenuItem menuItemSobre;
	@FXML
	public void onMenuItemVendedorSobre() {
		System.out.println("onMenuItemSobreAction");
		loadView("/gui/About.fxml");
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle Rb) {
		
	}	

	private synchronized void loadView(String nome) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(nome));
			VBox novoVbox = loader.load();
			Scene mainScene = Main.getMainScene();
			VBox mainVbox = (VBox)((ScrollPane)mainScene.getRoot()).getContent();
			Node mainMenu = mainVbox.getChildren().get(0);
			mainVbox.getChildren().clear();
			mainVbox.getChildren().add(mainMenu);
			mainVbox.getChildren().addAll(novoVbox.getChildren());
		}catch (IOException e) {
			Alerts.showAlert("IOException", "Erro", e.getMessage(), AlertType.ERROR);
		}
		
	}
}

package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

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
	}
	
	
	@FXML
	private MenuItem menuItemSobre;
	@FXML
	public void onMenuItemVendedorSobre() {
		System.out.println("onMenuItemSobreAction");
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle Rb) {
		
	}	
}

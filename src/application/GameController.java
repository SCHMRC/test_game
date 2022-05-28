/**
 * Sample Skeleton for 'Game.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class GameController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="BTNSTART"
    private Button BTNSTART; // Value injected by FXMLLoader

    @FXML // fx:id="btnLeft"
    private Button btnLeft; // Value injected by FXMLLoader

    @FXML // fx:id="btnRigth"
    private Button btnRigth; // Value injected by FXMLLoader

    @FXML // fx:id="btnSelect"
    private Button btnSelect; // Value injected by FXMLLoader

    @FXML // fx:id="btnUP"
    private Button btnUP; // Value injected by FXMLLoader

    @FXML // fx:id="btnbot"
    private Button btnbot; // Value injected by FXMLLoader

    @FXML // fx:id="display"
    private TextArea display; // Value injected by FXMLLoader
    
    
    
    

    @FXML
    void onStart(ActionEvent event) {

    }

    @FXML
    void onclick(ActionEvent event) {

    }

    @FXML
    void onpress(KeyEvent event) {

    }

    @FXML
    void onpressStart(KeyEvent event) {

    }

    @FXML
    void onpressselect(KeyEvent event) {

    }

    @FXML
    void onselect(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert BTNSTART != null : "fx:id=\"BTNSTART\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnLeft != null : "fx:id=\"btnLeft\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnRigth != null : "fx:id=\"btnRigth\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnSelect != null : "fx:id=\"btnSelect\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnUP != null : "fx:id=\"btnUP\" was not injected: check your FXML file 'Game.fxml'.";
        assert btnbot != null : "fx:id=\"btnbot\" was not injected: check your FXML file 'Game.fxml'.";
        assert display != null : "fx:id=\"display\" was not injected: check your FXML file 'Game.fxml'.";
        this.display.setDisable(true);
        this.display.appendText("         /000\\    \n");
        this.display.appendText("\n");
        this.display.appendText("\n");
        this.display.appendText("\n");
        this.display.appendText("\n");
        this.display.appendText("\n");
        this.display.appendText("\n");
        this.display.appendText("\n");
        this.display.appendText("***********************************************\n");
        
    }

}

package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane screen;

    @FXML
    private Text pogoda;

    @FXML
    private TextField city;

    @FXML
    private Button getData;

    @FXML
    private Text information;

    @FXML
    private Text temp_info;

    @FXML
    private Text temp_feels;

    @FXML
    private Text temp_max;

    @FXML
    private Text temp_min;

    @FXML
    private Text temp_pressure;

    @FXML
    void initialize() {
        getData.setOnAction(event -> {
            System.out.println("2");
        });

    }
}


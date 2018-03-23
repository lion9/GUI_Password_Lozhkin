package sample;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class Controller {
    @FXML
    private ImageView eye1, eye2, eye3, eye4;

    @FXML
    private TextField login = new TextField();

    @FXML
    private PasswordField password = new PasswordField();

    @FXML

    private AnchorPane rootPane;

    @FXML
    public void move() throws IOException {
        if (login.getText().length() > 0) {
            setLeft();
        }
        if (login.getText().length() > 4) {
            setDown();
        }
        if (login.getText().length() > 12) {
            setRight();
        }
    }


    @FXML
    public void movePass() throws IOException {
        if (password.getText().length() > 0) {
            setLeft();
        }
        if (password.getText().length() > 4) {
            setDown();
        }
        if (password.getText().length() > 12) {
            setRight();


        }
    }

    private void setLeft() {
        eye1.setLayoutX(72.0);
        eye1.setLayoutY(59.0);

        eye2.setLayoutX(96.0);
        eye2.setLayoutY(59.0);

        eye3.setLayoutX(198.0);
        eye3.setLayoutY(92.0);

        eye4.setLayoutX(221.0);
        eye4.setLayoutY(91.0);
    }

    private void setDown() {
        eye1.setLayoutX(73.0);
        eye1.setLayoutY(60.0);

        eye2.setLayoutX(97.0);
        eye2.setLayoutY(60.0);

        eye3.setLayoutX(199.0);
        eye3.setLayoutY(93.0);

        eye4.setLayoutX(222.0);
        eye4.setLayoutY(92.0);
    }

    private void setRight() {
        eye1.setLayoutX(75.0);
        eye1.setLayoutY(60.0);

        eye2.setLayoutX(98.0);
        eye2.setLayoutY(60.0);

        eye3.setLayoutX(200.0);
        eye3.setLayoutY(93.0);

        eye4.setLayoutX(223.0);
        eye4.setLayoutY(92.0);
    }

    public void stop() {
        System.exit(0);
    }

}

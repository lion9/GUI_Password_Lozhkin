package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
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
    private Group kgb;
    @FXML
    private ImageView imageKGB;

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
        eye1.setLayoutX(31.0);
        eye1.setLayoutY(28.0);

        eye2.setLayoutX(55.0);
        eye2.setLayoutY(28.0);

        eye3.setLayoutX(157.0);
        eye3.setLayoutY(61.0);

        eye4.setLayoutX(180.0);
        eye4.setLayoutY(61.0);
    }

    private void setDown() {
        eye1.setLayoutX(32.0);
        eye1.setLayoutY(29.0);

        eye2.setLayoutX(56.0);
        eye2.setLayoutY(28.0);

        eye3.setLayoutX(158.0);
        eye3.setLayoutY(61.0);

        eye4.setLayoutX(181.0);
        eye4.setLayoutY(61.0);
    }

    private void setRight() {
        eye1.setLayoutX(33.0);
        eye1.setLayoutY(29.0);

        eye2.setLayoutX(57.0);
        eye2.setLayoutY(28.0);

        eye3.setLayoutX(159.0);
        eye3.setLayoutY(61.0);

        eye4.setLayoutX(182.0);
        eye4.setLayoutY(61.0);
    }

    public void stop() {
        System.exit(0);
    }

    public void showKGB() {
        kgb.setVisible(true);
    }

}

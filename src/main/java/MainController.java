import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    TextField wordHolder;

    @FXML
    ComboBox comboBox;

    @FXML
    Label resultLabel;

    @FXML
    private void add() {
        comboBox.getItems().add(wordHolder.getText());
    }

    @FXML
    private void showInLabel() {
        resultLabel.setText(comboBox.getSelectionModel().getSelectedItem().toString());
    }
}

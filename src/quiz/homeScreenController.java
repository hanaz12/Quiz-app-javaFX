package quiz;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class homeScreenController {

    @FXML
    private Button btn_start;

    @FXML
    private Label label;

    @FXML
    void OnClickStartButton(ActionEvent event) throws IOException {
       FXMLLoader loader=new FXMLLoader (getClass().getResource("Quistions.fxml"));
       Parent root=loader.load();
       QuistionsController controller=(QuistionsController)loader.getController();
       Scene scene = new Scene (root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}

package quiz;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FinalScoreController {
     private Stage  stage;
   private String data;

    @FXML
    private Label lbl_finalScore;
    
    public void setData(String data) {
        this.data = data;
        lbl_finalScore.setText(data);
    }

    @FXML
    void onClickingExit(ActionEvent event) {
       Platform.exit();
    }

}

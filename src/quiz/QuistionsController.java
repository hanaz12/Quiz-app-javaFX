/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package quiz;



import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class QuistionsController {
    public static int index=0 , TotalCorrect=0 , totalQuestions=0;
    
    QuestionsAndAnswers ob= new QuestionsAndAnswers ();
   // totalQuestions = ob.getTotalNumberOfQuestions();
     
    @FXML
    private Label lbl_Question;


      @FXML
    private ToggleGroup answers;
      
     @FXML
    private RadioButton rb_q1;  

    @FXML
    private RadioButton rb_q2;

    @FXML
    private RadioButton rb_q3;

    @FXML
    private RadioButton rb_q4;

    @FXML
    private Button btn_nextQuestion;
    
    public void setDataForScene (int index){
        answers.selectToggle(null);
        lbl_Question.setText(ob.getQuestionByIdx(index)); 
        ArrayList<String> choices = ob.getChoicesForQuestion(index);
        rb_q1.setText(choices.get(0));
        rb_q2.setText(choices.get(1));
        rb_q3.setText(choices.get(2));
        rb_q4.setText(choices.get(3));
    }
    public void initialize() {
        setDataForScene (index);
    }

    @FXML
    void onClickingNext(ActionEvent event) throws IOException {
       // answers.selectToggle(null);
    String correctAnswer=ob.getCorrectAnswer(index);
    
    System.out.println("Correct Answer: " + correctAnswer);
System.out.println("Selected Answer: " + (rb_q1.isSelected() ? "A" : rb_q2.isSelected() ? "B" : rb_q3.isSelected() ? "C" : rb_q4.isSelected() ? "D" : "None"));

    if (correctAnswer.equals("A") && rb_q1.isSelected()) {
            TotalCorrect += 1;
        } else if (correctAnswer.equals("B") && rb_q2.isSelected()) {
            TotalCorrect += 1;
        } else if (correctAnswer.equals("C") && rb_q3.isSelected()) {
            TotalCorrect += 1;
        } else if (correctAnswer.equals("D") && rb_q4.isSelected()) {
            TotalCorrect += 1;
        }
    index++;
    if (index != ob.getTotalNumberOfQuestions()){
         setDataForScene (index);
    }
    else{
         FXMLLoader loader=new FXMLLoader (getClass().getResource("FinalScore.fxml"));
    
       Parent root = loader.load();
        
       FinalScoreController controller = ( FinalScoreController)loader.getController();
     Scene scene = new Scene(root);
       Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//       controller.setData(data);

//       controller.setStage(stage);
String data;
 if (TotalCorrect > ob.getTotalNumberOfQuestions()/2){
       data = "Well Done. You got " + TotalCorrect + "  true out of " + ob.getTotalNumberOfQuestions() + " questions";
 }
 else{
      data = "Sorry. You got " + TotalCorrect + "  true out of " + ob.getTotalNumberOfQuestions() + " questions";
 }
    controller.setData(data);
     //  stage.setUserData(data);
       stage.setScene(scene);
        stage.show();
    }
    }

}

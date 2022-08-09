package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class UserLoginFormController {

    public AnchorPane logInContext;
    public JFXTextField txtUserName;

    static String userName;

    public void btnLogInOnAction(ActionEvent actionEvent) throws IOException {
        userName=txtUserName.getText();
        Stage stage = (Stage) txtUserName.getScene().getWindow();
        stage.close();
        Stage stage1=new Stage();
        stage1.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ChatRoomForm.fxml"))));
        stage1.setResizable(false);
        //primaryStage.getIcons().add(new Image("location"));
        stage1.setTitle("sample title");
        stage1.centerOnScreen();
        stage1.show();
    }
}

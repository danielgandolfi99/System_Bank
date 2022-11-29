package project.system_bank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import db.ConexaoDB;


public class BankApp extends Application {

    private static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BankApp.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
        setStage(stage);
    }

    protected static void createAccount() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BankApp.class.getResource("create_account.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public static Stage getStage(){
        return stage;
    }

    public Stage setStage(Stage stage){
        return this.stage = stage;
    }
    public static void main(String[] args) {



    }


}
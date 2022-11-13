package project.system_bank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ConnectionDB.ConexaoDB;
import java.io.IOException;
import java.sql.Connection;

import static ConnectionDB.ConexaoDB.getConnection;

public class BankApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BankApp.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Connection conn = ConexaoDB.getConnection();
    }
}
package project.system_bank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class home_login {

    @FXML
    private TextField password;

    @FXML
    private Button login_action;

    @FXML
    private TextField login;

    @FXML
    private Label create_account;

    public TextField getPassword() {
        return password;
    }

    public void setPassword(TextField password) {
        this.password = password;
    }

    public Button getLogin_action() {
        return login_action;
    }

    public void setLogin_action(Button login_action) {
        this.login_action = login_action;
    }

    public TextField getLogin() {
        return login;
    }

    public void setLogin(TextField login) {
        this.login = login;
    }

    public Label getCreate_account() {
        return create_account;
    }

    public void setCreate_account(Label create_account) {
        this.create_account = create_account;
    }

    @Override
    public String toString() {
        return "home_login{" +
                "password=" + password +
                ", login_action=" + login_action +
                ", login=" + login +
                ", create_account=" + create_account +
                '}';
    }

    @FXML
    void login_action(ActionEvent event) {
        toString();
        System.out.println("ola");
    }

    @FXML
    void get_login(ActionEvent event) {
        System.out.println(login);
    }

    @FXML
    void get_password(ActionEvent event) {
        getPassword();
    }
}

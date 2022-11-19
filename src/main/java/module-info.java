module project.system_bank {
    requires javafx.controls;
    requires javafx.fxml;

    opens project.system_bank to javafx.fxml;
    exports project.system_bank;
}
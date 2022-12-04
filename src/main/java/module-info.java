module project.system_bank {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires itextpdf;

    opens project.system_bank to javafx.fxml;
    exports project.system_bank;
}
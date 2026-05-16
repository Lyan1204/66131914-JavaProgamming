module HelloJavaFX001 {
    requires javafx.controls;
    requires javafx.fxml;
    opens lyan.java to javafx.fxml;
    exports lyan.java;
}
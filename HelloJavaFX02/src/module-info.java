module HelloJavaFX {
	requires javafx.controls;
	
	opens lyan.app to javafx.graphics, javafx.fxml;
}

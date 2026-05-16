package lyan.java;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class HelloFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception{
		// Tạo một nút bấm
		Button btn = new Button();
		
		
		//
		btn.setText("Xin chao JavaFX")
		// Tao cua so 
		StackPane root = new StacPane();
		
		root.getChildren().add(btn);
		
		// Màn hình / cảnh hiển thị
		Scene scn = new Scene(root, 400, 200);
		
		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scn);
		primaryStage.show();
		
		 
		
	}
	
	
	public static void main(String[] args) {
		Launch(args);
		
		
	}

}

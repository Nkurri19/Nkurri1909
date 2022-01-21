package helloworldproject;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class HelloWorldProject extends Application {
    
    @Override
    public void start(Stage primaryStage){
        
        try {
            Parent root=FXMLLoader.load(getClass().getClassLoader().getResource("/Test.fxml"));
            
            Scene scene = new Scene(root);
            
            primaryStage.setTitle("First Application");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        } 
        public static void main(String[] args){
            launch(args);
            
        }
}
    

    
    


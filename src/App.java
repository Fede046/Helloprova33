import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    public void start(Stage primo)throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ddd.fxml"));
        Parent root = loader.load();
        primo.setTitle(STYLESHEET_CASPIAN);
        primo.setScene(new Scene(root));
        primo.show();
    }
    public static void main(String[] args)  {
       launch(args);
    }
}

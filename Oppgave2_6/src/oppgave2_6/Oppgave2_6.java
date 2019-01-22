package oppgave2_6;

import java.awt.Color;
import java.awt.Insets;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import static javafx.scene.paint.Color.color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class Oppgave2_6 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Button btn = new Button();
        btn.setText("Regn ut GCD");
        
        TextField firstNumber = new TextField();
        TextField secondNumber = new TextField();

        Text tekst1 = new Text(10,20,"Skriv inn tall 1");
        Text tekst2 = new Text(10,20,"Skriv inn tall 2");
        Text result = new Text(10,20,"");
        result.setFont(Font.font ("Verdana", 20));

        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                try{
                    int a = Integer.parseInt(firstNumber.getText());
                    int b = Integer.parseInt(secondNumber.getText());
                    int c = gcd(a,b);
                    String d = Integer.toString(c);
                    result.setText("Gcd blir: " + d);
            }
            catch(Exception e){
                result.setFont(Font.font ("Verdana", 25));
                result.setText("Det må være heltall");
            }
        }
        });
        VBox layout = new VBox(10);

        layout.getChildren().addAll(tekst1,firstNumber,tekst2,secondNumber,btn,result);
        
        Scene scene = new Scene(layout, 300, 250);
        
        primaryStage.setTitle("Regn ut GCD");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
        public static int gcd(int a, int b) throws Exception{
        if (a < 0 || b < 0) {
            throw new Exception("Ingen av tallene kan være negative");
        }
        while( a != b ) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }   
        return a;
    } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }    
}

package example;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.BubbleChart;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by Notebook on 05.03.2016.
 */
public class main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {


       Rectangle background= new Rectangle(500,500,Color.DARKGRAY);

        background.setTranslateX(50);
        background.setTranslateY(50);

        Player player=new Player();
       Pane castomPane= new Pane(background,player);
        Scene scene=new Scene(castomPane,600,600);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
            public void handle(KeyEvent event){
                if(event.getCode()== KeyCode.W){
                    player.directionY=-1;
                }
                if(event.getCode()== KeyCode.S){
                    player.directionY=1;
                }

                if(event.getCode()== KeyCode.A){
                    player.directionX=-1;
                }
                if(event.getCode()== KeyCode.D){
                    player.directionX=1;
                }

                player.MoveX();
                player.MoveY();

            }

        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>(){
            public void handle(KeyEvent event){
                if(event.getCode()!= KeyCode.W){
                    player.directionY=0;
                }
                if(event.getCode()!= KeyCode.S){
                    player.directionY=0;
                }

                if(event.getCode()!= KeyCode.A){
                    player.directionX=0;
                }
                if(event.getCode()!= KeyCode.D){
                    player.directionX=0;
                }

                player.MoveX();
                player.MoveY();

            }

        });
        //Thread.sleep(30);

        primaryStage.setScene(scene);


        primaryStage.show();


    }

    public static void main(String[] args){
launch(args);
    }
}
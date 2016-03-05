package example;

import com.sun.javafx.css.converters.ColorConverter;
import com.sun.javafx.geom.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Pane;
import javafx.scene.input.KeyEvent;
import javafx.scene.transform.Transform;

/**
 * Created by Notebook on 05.03.2016.
 */
public class Player extends Pane {
    Player(){
        rect=new Rectangle(20,20, Color.RED);
        directionX=0;
        directionY=0;
        direction=new Point2D(directionX,directionY);
        velocity=10;
        timer=System.currentTimeMillis();
        getChildren().addAll(rect);
    }
    Rectangle rect;

    int directionX;//принимает значения 1 0 -1
    int directionY;//принимает значения 1 0 -1
    long x,y;
    Point2D direction;
    long timer;


    int velocity;

    public void MoveX(){
        x+=directionX*velocity;
        setTranslateX(x);


    }
    public void MoveY(){
        y+=directionY*velocity;
        setTranslateY(y);

    }



}

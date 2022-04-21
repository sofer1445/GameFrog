import javax.swing.*;
import java.awt.*;

public class Definitions extends JPanel {
    private int x ;
    private int y ;
    private int width ;
    private int height ;
//    private Frog frog;

    public Definitions(int x , int y , int width , int height){
        this.y = y ;
        this.x = x ;
        this.height = height ;
        this.width = width ;


    }
    public void paint (Graphics graphics){


    }



    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

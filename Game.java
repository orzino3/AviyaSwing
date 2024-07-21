import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Game extends JPanel {
    private Square square;
    private List<Point> paintSquare;

    private List<Square> greenSquare;

    public Game(int x,int y,int width,int height){
        this.setBounds(x,y,width,height);
        this.paintSquare = new ArrayList<>();
        this.greenSquare = new ArrayList<>();
        setGreenSquare();
        //this.paintSquare.add(new Point(0,0));
        this.square = new Square(0,0,Constants.SQUARE_SIZE);
        setFocusable(true);
        KeyboardHandler keyboardHandler = new KeyboardHandler(this);
        addKeyListener(keyboardHandler);

    }

    private void setGreenSquare() {
        int x = 400;
        int y= 200;
        for (int i = 0; i < Constants.SIZE_OF_GREEN_SQUARE; i++) {
            this.greenSquare.add(new Square(x,y,Constants.SQUARE_SIZE));
            x+=100;
            y+=60;
        }

    }

    public void addToList(){
        this.paintSquare.add(new Point(this.square.getX(),this.square.getY()));
    }
    public void setSquareX(int x) {
        this.square.setX(x);
    }
    public void setSquareY(int y) {
        this.square.setY(y);

    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        for (int i = 0; i < this.paintSquare.size(); i++) {
            Point point = this.paintSquare.get(i);
            g.fillRect(point.x,point.y,Constants.SQUARE_SIZE,Constants.SQUARE_SIZE);
        }
        g.setColor(Color.black);
        g.fillRect(this.square.getX(),this.square.getY(),this.square.getSize(),this.square.getSize());

        g.setColor(Color.GREEN);
        for (int i = 0; i < this.greenSquare.size(); i++) {
            Square tempSquare =this.greenSquare.get(i);
            g.fillRect(tempSquare.getX(),tempSquare.getY(),tempSquare.getSize(),tempSquare.getSize());
}
}
}
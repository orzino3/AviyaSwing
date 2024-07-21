import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardHandler implements KeyListener {
    private Game game;

    public KeyboardHandler(Game game) {
        this.game = game;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        this.game.addToList();
        if (key==KeyEvent.VK_LEFT){
            this.game.setSquareX(-Constants.SQUARE_SIZE);
        } else if (key==KeyEvent.VK_RIGHT) {
            this.game.setSquareX(Constants.SQUARE_SIZE);
        } else if (key==KeyEvent.VK_UP) {
            this.game.setSquareY(-Constants.SQUARE_SIZE);
        }else if(key==KeyEvent.VK_DOWN) {
            this.game.setSquareY(Constants.SQUARE_SIZE);
        }

        this.game.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e){

}
}
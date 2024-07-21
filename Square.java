public class Square {
    private int x;
    private int y;
    private int size;

    public Square(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public void setX(int x) {
        if ((this.x+x)>=0&&(this.x+x)<=Constants.WIDTH-Constants.SQUARE_SIZE){
            this.x += x;
        }

    }

    public void setY(int y) {
        System.out.println(y + " "+ this.y);
        if ((this.y+y)>=0&&(this.y+y)<Constants.HEIGHT-Constants.SQUARE_SIZE){
            this.y += y;
  }

}
}
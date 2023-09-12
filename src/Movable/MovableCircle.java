package Movable;

public class MovableCircle implements Movable {

    int radio;
    MovablePoint centro;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radio){
        this.centro = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radio = radio;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void moveUp() {
        this.centro.y++;
    }

    @Override
    public void moveDown() {
        this.centro.y--;
    }

    @Override
    public void moveLeft() {
        this.centro.x--;
    }

    @Override
    public void moveRight() {
        this.centro.x--;
    }
}

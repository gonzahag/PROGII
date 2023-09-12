package Movable;

public class Main {

    public static void main(String args[]){

        MovablePoint point1 = new MovablePoint(3, 2, 0 , 0);
        System.out.println(point1.y);
        point1.moveDown();
        System.out.println(point1.y);

        MovableCircle circle1 = new MovableCircle(5, 2, 0 , 0, 4);
        System.out.println(circle1.centro.y);
        circle1.moveUp();
        System.out.println(circle1.centro.y);



    }

}

package RedRover.M7;

public class Line {

    Point p1;

    Point p2;

    public double length(){
        int deltaX = p2.x - p1.x;
        int deltaY = p2.y - p1.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}

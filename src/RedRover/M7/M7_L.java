package RedRover.M7;

public class M7_L {

public static double distance (Point point1, Point point2){   //Point - это класс, как тип int
    int deltaX = point2.x - point1.x;
    int deltaY = point2.y - point1.y;
    return Math.sqrt(deltaX * deltaX + deltaY * deltaY);

}
    public static void main(String[] args) {

    Point daleko = new Point(4, 7); //констрактор Point

    //Берем значение из констрактора public Point
//    daleko.x = 30;
//    daleko.y = 33;

    Point blizko = new Point();

    blizko.x = 38;
    blizko.y = 41;

        System.out.println(distance(daleko,blizko));

        Line line1 = new Line();
        line1.p1 = daleko;
        line1.p2 = blizko;

        System.out.println(line1.length());
    }
}



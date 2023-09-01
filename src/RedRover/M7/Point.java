package RedRover.M7;

public class Point {

    int x; //Это называется поле

    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = x;
    }

    public Point(){}

    public boolean isValid(){
        return x>0 && y>0;
    }

}

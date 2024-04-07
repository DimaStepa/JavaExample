package OtherCases.testClass;

public class Box {
    private double depth;
    private double wight;
    private double height;

    void setDimension(double d, double w, double h){
        depth = d;
        wight = w;
        height = h;
    }
    double volumeBox() {
        return depth*wight*height;
    }
}



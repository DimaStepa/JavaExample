package RedRover.M11_L.grade;

public class Grades {

    private int value;

    public Grades(int value){
        if (value < 1 || value > 5){
            System.out.println("Invalid grade: " + value + "\nSet: 5 ");
            this.value = 5;
        }
        else {
            this.value = value;
        }
    }

    public int getValue(){
        return value;
    }
}

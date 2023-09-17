package RedRover.M12_L.H10_L.finals;

public class Grade {

    public static final int MAX_GRAGE = 5;
    public static final int MIN_GRADE = 1;
    private final int value;

    public Grade (int value) {
        if (value > Grade.MIN_GRADE || value < MIN_GRADE) {
            System.out.println("Wrong grade. ");
            this.value = MAX_GRAGE;
        } else {
            this.value = value;
        }
    }

    public int getValue(){
        return value;
    }


    public static void main(String[] args) {
        Grade five = new Grade(5);
        System.out.println(five.value );
        System.out.println(Grade.MIN_GRADE);
    }
}

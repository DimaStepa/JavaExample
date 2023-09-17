package RedRover.M12_L.H10_L.finals;

public class Main {

    public static void main(String[] args) {
//        Nest nest = new Nest();
//        nest.setTargetTemp(20);
//        nest.checkAndAdjust(18);
//        nest.checkAndAdjust(22);
//        nest.checkAndAdjust(20);

        Wigwam w =new Wigwam();
        w.checkAndAdjust(10);
        w.checkAndAdjust(17);
        w.checkAndAdjust(18);
        w.checkAndAdjust(20);
        w.checkAndAdjust(25);
        w.checkAndAdjust(26);

        System.out.println(w instanceof Wigwam); //true
        System.out.println(w instanceof AbstractThermostat); //true
        System.out.println(w instanceof Object); //true
//        System.out.println(w instanceof Nest); //false
    }
}

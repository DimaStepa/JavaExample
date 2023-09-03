package RedRover.M8;

public class Accomodations {

    Housing[] housings;

    public int totalCapacity(){
        int sum = 0;
        for (int i = 0; i < housings.length; i++) {
            Housing h = housings[i];
            sum = sum + h.getCapacity();
        }
        return sum;
    }

    public void printAll () {
        for (int i = 0; i < housings.length; i++) {
            Housing h = housings[i];
            System.out.println(h.getPrintable());

        }
    }

    public Housing findForGroup (int groupSize) {
        for (int i = 0; i < housings.length; i++) {
            Housing h = housings[i];
            if (h.getCapacity()>=groupSize) {
                return h;
            }
        }
        return null;
    }



}

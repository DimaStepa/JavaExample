package RedRover.M8;

public abstract class Housing {

    public int id;

    public abstract int getCapacity();

    public abstract String getPrintable();

    public boolean isSuitableForPeople(){
        return true;
    }

}

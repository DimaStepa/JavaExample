package RedRover.M8;

public class Prison extends Housing {

int cells;

    public int getCapacity(){
        return 0;
    }

    public String getPrintable (){
        return id + ". I'm a prison!!! for " + getCapacity() + " inmates";
    }

    public boolean isSuitableForPeople(){
        return false;

    }
}

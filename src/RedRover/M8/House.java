package RedRover.M8;

public class House extends Housing{

    String ownersName;
    int bedrooms;

    public int getCapacity(){
        return bedrooms*2;
    }

    public String getPrintable(){
        return id+ ". " + ownersName + "'s house with capacity of " +getCapacity();
    }
}

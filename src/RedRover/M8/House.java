package RedRover.M8;

public class House extends Housing{

    String ownersName;
    int bedrooms;

    public House(int id, String ownersName, int bedrooms){
        super(id); // super относится к инстансу родиельского класса
        this.ownersName =ownersName; //this относится к своему классу (к самому себе)
        this.bedrooms = bedrooms;
    }

    public int getCapacity(){
        return bedrooms*2;
    }

    public String getPrintable(){
        return id+ ". " + ownersName + "'s house with capacity of " +getCapacity();
    }
}

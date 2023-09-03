package RedRover.M8;

public class Hotel  extends  Housing {  // класс Hotel - это вид Housing

    String name;

    int singleRoom;

    int doubleRoom;

    public int getCapacity(){
        return singleRoom + doubleRoom*2;
    }

    public String getPrintable (){
        return id + ". " + "Гостиница " + name + "c возможностью вмещения: " + getCapacity();
    }


}

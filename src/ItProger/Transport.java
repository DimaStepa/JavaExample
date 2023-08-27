package ItProger;

public class Transport {

    /*
    модификаторы доступа
    public - полностью открыта, достпуна из любого друго класса
    protected - доступно из самого класса и класса наследников
    private - закрытая переменная, функция, тогда этот метод будет доступен тольковк внутри этодо метого
     */

    public float speed;
    public int weight;
    public String color;
    public byte[] coordinates;  //массив с координатами на основе метода byte

    public void setValues (float _speed, int _weight, String _color, byte[] _coordinates){
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinates = _coordinates;
    }

    public String getValues(){
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color + ".";
        String infoCoordinates = "Coordinates: \n";
        for (int i = 0; i <coordinates.length; i++){
            infoCoordinates += coordinates[i] + "\n";

        }
        return info + infoCoordinates;
    }
}

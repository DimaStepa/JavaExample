package RedRover.M8_HW;

public class ManagementCount {

    DataBase[] dataBases;

    public String searchNameForName (String searchName){
        for (int i = 0; i < dataBases.length; i++) {
            DataBase person = dataBases[i];
            if (person.getName().equals(searchName)){
                return "Такой персонаж существует";
            }
            else {
                return "Такой персонажа НЕТ";
            }
        }
        return null;
    }

    public String capacitySalary (int budget){
        double sumCapacity = 0;
        for (int i = 0; i < dataBases.length; i++) {
            DataBase person = dataBases[i];
            sumCapacity = sumCapacity + person.getSalary();
        }
        if (sumCapacity <= budget){
            return "Указанный бюджета :" + sumCapacity + " < "+ budget + " - хватит";
        }
        else {
            return "Указанного бюджета :" + sumCapacity + " > "+ budget + " - НЕ хватит";
        }
    }
}

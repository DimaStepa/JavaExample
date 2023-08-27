package ItProger;

public class Main {

    public static void main(String[] args) {
        //ООП: классы и объекты

        Transport bmw = new Transport(); // выделяем память под объект
        bmw.setValues(250.5f, 2500, "yellow", new byte[] {0, 0, 0});
        String res1 = bmw.getValues();
        System.out.println(res1);
//        bmw.speed = 250.5f;
//        bmw.weight = 2500;
//        bmw.color = "yellow";
//        bmw.coordinates = new byte[] {0, 0, 0};

        Transport truck = new Transport();
        truck.speed = 140.5f;
        truck.weight = 5600;
        truck.color = "brown";
        truck.coordinates = new byte[] {100, 0, 100};

        String res2 = truck.getValues();
        System.out.println(res2);

        ZooMagazine Stepa = new ZooMagazine();


    }
}

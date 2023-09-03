package RedRover.M8;


public class M8 {
    public static int add (int a, int b){
        return a+b;

    }
    public static void main(String[] args) {

        int result = add((add(4,5)),7);
        System.out.println(result);

        Hotel tourist = new Hotel();
        tourist.name = "ТУРИСТ";
        tourist.id = 1;
        tourist.singleRoom = 40;
        tourist.doubleRoom = 30;
        System.out.println("Кол-во людей в гостинице "+ tourist.name + ": " +  tourist.getCapacity());


        Hotel hilton = new Hotel();
        hilton.name = "Хилтон";
        hilton.id = 2;
        hilton.singleRoom = 100;
        hilton.doubleRoom = 125;
        System.out.println("Кол-во людей в гостинице "+ hilton.name + ": " +  hilton.getCapacity());

        House jacks = new House();
        jacks.ownersName = "Jack's House";
        jacks.id = 15;
        jacks.bedrooms = 23;
        System.out.println("Кол-во людей в доме "+ jacks.ownersName + ": " +  jacks.getCapacity());
        System.out.println("Is Jack's house suitable for people? " + jacks.isSuitableForPeople());

        Prison singSing = new Prison();
        singSing.id = 102;
        singSing.cells = 100;
        System.out.println("Is singSing's prison suitable for people? " + singSing.isSuitableForPeople());



        Accomodations acc = new Accomodations();
        acc.housings = new Housing[] {jacks, tourist, hilton, singSing};

        System.out.println("Общее кол-во людей во всех гостиницах: " + acc.totalCapacity());

        System.out.println();
        acc.printAll();

        System.out.println();
        System.out.println(acc.findForGroup(30).getPrintable());
        Housing hotel = acc.findForGroup(500); // если для объекта null вызывается метод -> получаем NPE
        if (hotel != null){
            System.out.println(hotel.getPrintable());
        }
        else {
            System.out.println("Nothing found");
        }
    }

}

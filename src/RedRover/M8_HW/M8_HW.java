package RedRover.M8_HW;

public class M8_HW {

    public static void main(String[] args) {

        Employee footballer = new Employee();
        footballer.name = "John Don";
//        footballer.setName("Don");
//        String emploeeName1 = footballer.getName();


        footballer.setBaseSalary = 500;
        System.out.println("Employee: " + footballer.getName()+
                ".\nHis/Her get base salary for hour: " + footballer.getBaseSalary() +
                " Rub/hour. \nHis/her salary for month: " + footballer.getSalary() + " Rub.");

        System.out.println("------------------");

        Worker layer = new Worker();
        System.out.println("Base salary of worker is " + layer.getSalary() +
                " rub/hour.");

        System.out.println("------------------");

        Manager manager1 = new Manager();
        Manager manager2 = new Manager();
        Manager manager3 = new Manager();
        manager1.name = "Pirogi And Cotlety";
        manager2.name = "Dochki Sinochki";
        manager3.name = "COPU";
        manager1.setNumberOfSubordinates = 21;
        manager2.setNumberOfSubordinates = 7;
        manager3.setNumberOfSubordinates = 11;
        System.out.println("Numbers of subordinates is " + manager1.name +
                ": " + manager1.setNumberOfSubordinates);
        System.out.println("Salary of subordinates is " + manager1.name +
                ": " + manager1.getSalary());
        System.out.println("Numbers of subordinates is " + manager2.name +
                ": " + manager2.setNumberOfSubordinates);
        System.out.println("Salary of subordinates is " + manager2.name +
                ": " + manager3.getSalary());
        System.out.println("Salary of subordinates is " + manager2.name +
                ": " + manager3.getSalary());

        System.out.println("------------------");

        Director director1 = new Director();
        Director director2 = new Director();
        director1.name = "Pirogock";
        director2.name = "Sinochkin";
        director1.setNumberOfSubordinates = 109;
        director2.setNumberOfSubordinates = 1;
        System.out.println("Numbers of subordinates is " + director1.name +
                ": " + director1.setNumberOfSubordinates);
        System.out.println("Salary of subordinates is " + director1.name +
                ": " + director1.getSalary());
        System.out.println("Numbers of subordinates is " + director2.name +
                ": " + director2.setNumberOfSubordinates);
        System.out.println("Salary of subordinates is " + director2.name +
                ": " + director2.getSalary());

        System.out.println("--------______________----------");
        System.out.println("--------ПОИСК ПО ИМЕНИ----------");
        System.out.println("--------______________----------");

        ManagementCount nameArray = new ManagementCount();
        nameArray.dataBases = new DataBase[]{footballer,manager1,manager2,director1,director2};
        nameArray.searchNameForName("JOHN DON");
        nameArray.searchNameForName("Sino");


        System.out.println("--------______________----------");
        System.out.println("--------ПОИСК ПО ВХОЖДЕНИЮ СТРОКИ----------");
        System.out.println("--------______________----------");

        nameArray.searchSubstringNameForName("John");
        nameArray.searchSubstringNameForName("Sino");
        nameArray.searchSubstringNameForName("Sin12");


//        System.out.println("--------______________----------");
//        System.out.println("--------Определение бюджета----------");
//        System.out.println("--------______________----------");
//        System.out.println(nameArray.capacitySalary(100000));
//
//        System.out.println("--------______________----------");
//        System.out.println("--------Минимальная зарплата----------");
//        System.out.println("--------______________----------");
//        nameArray.searchMinSalary();
//
//
//        System.out.println("--------______________----------");
//        System.out.println("-------- Минимальное кол-во сотрудников у каждого Manager----------");
//        System.out.println("--------______________----------");
//        ManagementCount searchLimitArrayManager = new ManagementCount();
//        searchLimitArrayManager.dataBases = new DataBase[] {manager1,manager2,manager3};
//        searchLimitArrayManager.searchMinSubordinatesInManagers();
//
//
//        System.out.println("--------______________----------");
//        System.out.println("-------- Минимальная надбавка----------");
//        System.out.println("--------______________----------");
//        searchLimitArrayManager.searchMinAdditionSalary();
//
//        System.out.println("--------______________----------");
//        System.out.println("-------- Максимальная надбавка----------");
//        System.out.println("--------______________----------");
//        searchLimitArrayManager.searchMaxAdditionSalary();



    }
}

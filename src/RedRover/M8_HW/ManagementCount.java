package RedRover.M8_HW;

import java.util.Arrays;

public class ManagementCount {

    DataBase[] dataBases;



    public void searchNameForName(String searchName) {
        int count = 0;
        for (int i = 0; i < dataBases.length; i++) {
            DataBase person = dataBases[i];
           System.out.println(person.getName());
            if (person.getName().toLowerCase().equals(searchName.toLowerCase())) {
                System.out.println("Такой персонаж существует: " + person.getName());
                count += 1;
            }
            }
        System.out.println("Поиск завершен. Кол-во совпадений:" + count);
        }


    public void searchSubstringNameForName(String searchName2) {
        int count = 0;
        for (int i = 0; i < dataBases.length; i++) {
            DataBase person = dataBases[i];
            System.out.println(person.getName());
            if (person.getName().contains(searchName2)) {
                System.out.println("Такой персонаж существует: " + person.getName());
                count += 1;
            }
            }
        System.out.println("Поиск завершен. Кол-во совпадений:" + count);
    }

    public String capacitySalary(int budget) {
        double sumCapacity = 0;
        for (int i = 0; i < dataBases.length; i++) {
            DataBase person = dataBases[i];
            sumCapacity = sumCapacity + person.getSalary();
        }
        if (sumCapacity <= budget) {
            return "Указанный бюджета :" + sumCapacity + " < " + budget + " - хватит";
        } else {
            return "Указанного бюджета :" + sumCapacity + " > " + budget + " - НЕ хватит";
        }
    }

    public void searchMinSalary() {
        double minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < dataBases.length; i++) {
            DataBase salaryPerson = dataBases[i];
            if (salaryPerson.getSalary() < minSalary) {
                minSalary = salaryPerson.getSalary();
            }

        }
        System.out.println("Минимальная зарплата: " + minSalary);
    }

    public void searchMaxSalary() {
        double maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < dataBases.length; i++) {
            DataBase salaryPerson = dataBases[i];
            if (salaryPerson.getSalary() > maxSalary) {
                maxSalary = salaryPerson.getSalary();
            }

        }
        System.out.println("Минимальная зарплата: " + maxSalary);
    }

    public void searchMinSubordinatesInManagers() {
        int minSubordinates = Integer.MAX_VALUE;
        for (int i = 0; i < dataBases.length; i++) {
            DataBase countSubordinates = dataBases[i];
            System.out.println(countSubordinates.getName());
            if (countSubordinates.getNumberOfSubordinates() < minSubordinates) {
                minSubordinates = countSubordinates.getNumberOfSubordinates();
            }
        }

        System.out.println("Минимальное кол-во сотрудников: " + minSubordinates);
    }

    public void searchMaxSubordinatesInManagers() {
        int minSubordinates = Integer.MIN_VALUE;
        for (int i = 0; i < dataBases.length; i++) {
            DataBase countSubordinates = dataBases[i];
            if (countSubordinates.getNumberOfSubordinates() > minSubordinates) {
                minSubordinates = countSubordinates.getNumberOfSubordinates();
            }
        }
        System.out.println("Максимальное кол-во сотрудников: " + minSubordinates);
    }

    public void searchMinAdditionSalary() {
        double minAdditionSalary = Integer.MAX_VALUE;
        for (int i = 0; i < dataBases.length; i++) {
            DataBase additionSalary = dataBases[i];
            System.out.println(additionSalary.getBaseSalary()-additionSalary.getSalary());
            if ((additionSalary.getBaseSalary()-additionSalary.getSalary()) < minAdditionSalary) {
                minAdditionSalary = (additionSalary.getBaseSalary()-additionSalary.getSalary());
            }

        }
        System.out.println("Минимальная надбавка: " + minAdditionSalary);
    }


    public void searchMaxAdditionSalary() {
        double maxAdditionSalary = Integer.MIN_VALUE;
        for (int i = 0; i < dataBases.length; i++) {
            DataBase additionSalary = dataBases[i];
            if ((additionSalary.getBaseSalary()-additionSalary.getSalary()) > maxAdditionSalary) {
                maxAdditionSalary = (additionSalary.getBaseSalary()-additionSalary.getSalary());
            }

        }
        System.out.println("Максимальная надбавка: " + maxAdditionSalary);
    }

}

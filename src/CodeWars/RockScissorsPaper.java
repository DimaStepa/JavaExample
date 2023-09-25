package CodeWars;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.*;

public class RockScissorsPaper {


    //классическая игра камень-ножницы-бумага
    public static List<String> gameRockScissorsPaper() {
        List<String> list = new ArrayList<>();
        list.add("камень");
        list.add("ножницы");
        list.add("бумага");
        return list;
    }

    //расширенная версия игры камень-ножницы-бумага
    public static List<String> gameRockScissorsPaperLizardSpock() {
        List<String> list = new ArrayList<>();
        list.add("камень");
        list.add("ножницы");
        list.add("бумага");
        list.add("ящерица");
        list.add("спок");
        return list;
    }

    //Сделать выбор
    public static String game (){
        Scanner numberChangeReader = new Scanner(System.in);
        Scanner userChangeReader = new Scanner(System.in);
        int numberGame;
        String userChange, computerChange;
        Random random = new SecureRandom();
        List<String> changeGame = new ArrayList<>();

        int countComputer = 0;
        int countUser = 0;
        Scanner userAnswerReader = new Scanner(System.in);
        String confirm = "нет";
        String userAnswer = confirm;

        while (userAnswer.equals(confirm)) {
        System.out.println("Введите номер игры:\n1. Классическая игра\n2. Игра Шелдона");
        numberGame = numberChangeReader.nextInt();
        switch (numberGame){
            case (1):
                for (int i = 0; i < gameRockScissorsPaper().size(); i++){
                    changeGame.add("");
                }
                Collections.copy(changeGame,gameRockScissorsPaper());
                System.out.println("Поздравляю\nТы выбрал классическую игру КАМЕНЬ-НОЖНИЦЫ-БУМАГА");
                break;
            case (2):
                for (int i = 0; i < gameRockScissorsPaperLizardSpock().size(); i++)
                    changeGame.add("");
                Collections.copy(changeGame,gameRockScissorsPaperLizardSpock());
                System.out.println("Поздравляю\nТы выбрал игру КАМЕНЬ-НОЖНИЦЫ-БУМАГА-ЯЩЕРИЦА-СПОК");
                break;
            default:
                System.out.println("Ты ввел не те значения, пока!");
                break;
        }
        System.out.println("Сейчас компьютер выберет вариант");
        computerChange = "";
        computerChange = changeGame.get(random.nextInt(changeGame.size()));
        System.out.println("Компьютер загадал вариант, введите ваше значение");
        userChange = userChangeReader.next();
        System.out.println(computerChange);
//        String[] userChange = new String[]{computerChange,userChange};
//        System.out.println(Arrays.toString(userChange));

            switch (computerChange) {
                case ("камень"):
                    switch (userChange) {
                        case ("камень"):
                            System.out.println("У вас ничья");
                            break;
                        case ("ножницы"):
                            System.out.println("Камень ломает ножницы");
                            countComputer += 1;
                            break;
                        case ("бумага"):
                            System.out.println("Бумага оборачивает камень");
                            countUser += 1;
                            break;
                        case ("ящерица"):
                            System.out.println("Камень давит ящерицу");
                            countComputer += 1;
                            break;
                        case ("спок"):
                            System.out.println("Спок испаряет камень");
                            countUser += 1;
                            break;
                    }
                    break;
                case ("ножницы"):
                    switch (userChange) {
                        case ("камень"):
                            System.out.println("Камень ломает ножницы");
                            countUser = +1;
                            break;
                        case ("ножницы"):
                            System.out.println("У вас ничья");
                            break;
                        case ("бумага"):
                            System.out.println("Бумагу режут ножницы");
                            countComputer += 1;
                            break;
                        case ("ящерица"):
                            System.out.println("Ножницы отрезают голову ящерице");
                            countComputer += 1;
                            break;
                        case ("спок"):
                            System.out.println("Спок ломает ножницы");
                            countUser += 1;
                            break;
                    }
                    break;
                case ("бумага"):
                    switch (userChange) {
                        case ("камень"):
                            System.out.println("Бумага обаричивает камень");
                            countComputer = +1;
                            break;
                        case ("ножницы"):
                            System.out.println("Ножницы режут бумагу");
                            countUser = +1;
                            break;
                        case ("бумага"):
                            System.out.println("У вас ничья");
                            break;
                        case ("ящерица"):
                            System.out.println("Ящерица съедает бумагу");
                            countUser += 1;
                            break;
                        case ("спок"):
                            System.out.println("Бумага опровергает спока");
                            countComputer += 1;
                            break;
                    }
                    break;

                case ("ящерица"):
                    switch (userChange) {
                        case ("камень"):
                            System.out.println("Камень давит ящерицу");
                            countUser = +1;
                            break;
                        case ("ножницы"):
                            System.out.println("Ножницы отрезают голову ящерице");
                            countUser = +1;
                            break;
                        case ("бумага"):
                            System.out.println("Ящерица съедает бумагу");
                            countComputer += 1;
                            break;
                        case ("ящерица"):
                            System.out.println("У вас ничья");
                            break;
                        case ("спок"):
                            System.out.println("Ящерица отравляет Спока");
                            countComputer += 1;
                            break;
                    }
                    break;

                case ("спок"):
                    switch (userChange) {
                        case ("камень"):
                            System.out.println("Спок испаряет камень");
                            countComputer = +1;
                            break;
                        case ("ножницы"):
                            System.out.println("Спок ломает ножницы");
                            countComputer = +1;
                            break;
                        case ("бумага"):
                            System.out.println("Бумага разоблачает Спока");
                            countUser += 1;
                            break;
                        case ("ящерица"):
                            System.out.println("Ящерица отравляет спока");
                            countUser += 1;
                            break;
                        case ("спок"):
                            System.out.println("У вас ничья");
                            break;
                    }
                    break;

            }

            System.out.println("Вы закончили играть да/" + confirm);
            userAnswer = userAnswerReader.next();
        }
        String result = "Общий счет:\n Компьютер: " + Integer.toString(countComputer)
                +"\nПользователь: " +  Integer.toString(countUser);
        return result;

        }




    public static void main(String[] args) {
        System.out.println(game());
    }

}


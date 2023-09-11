package CodeWars;

import java.util.Scanner;

public class Algorithm {

    public static Integer BinarnySearch(int min, int max) {
        Scanner text = new Scanner(System.in);

            int num = (min + max) / 2;
            System.out.println("Ваше число " + num + " ? (Yes/No)");
            String yes_no = text.next();
            if (yes_no.equals("No")) {
                System.out.println("Ваше число больше/меньше? (bolshe/menshe)");
                String bolshe = text.next();
                if (bolshe.equals("bolshe")) {
                    min = num;
                    return BinarnySearch(min, max);
                }
                if (bolshe.equals("menshe")) {
                    max = num;
                    return BinarnySearch(min, max);
                }
            } else {
                System.out.println("Sveta, tu bolshay molodec!!! \n БЫСТРЕЕ ЦЕЛУЙ МУЖА!!");
            }
        return null;
        }



    public static void main(String[] args) {



    }

    }


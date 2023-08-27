package ItProger;

public class FunctionTest {

    public static void main(String[] args) {

        //Методы
        info("Hello"); //вызываем функцию
        String javaT = "javaTest";
        info(javaT);
        info("");

        short num = 7;
        int result1 = summa((short)5, num);

        short num2 = 11;
        int result2 = summa((short)8, num2);
        info(String.valueOf(result2)+ " Обосраться");  // приводим int result2 -> в String

        byte[] num3 = new byte[]{5, 6, 1};
        int summRes1 = summaArray(num3);
        System.out.println("Сумма 1: " + summRes1);


        byte[] num4 = new byte[]{1, 8, 9, 22, -45, 109, -98};
        int summRes2 = summaArray(num4);
        System.out.println("Сумма 2: " + summRes2);
    }

    public static int summa(short a, short b){
        int res = a + b;
        String result = "Результат: " +res;
        info(result);
        return res;
    }

    public static void info(String word){    //в круглых скобках указываются параметр функиции, которые  она может принимать
        System.out.print(word);
        System.out.println("!");
    }


    //еще один пример

    public static int summaArray(byte[] arr){
        int summa = 0;
        for (byte i = 0; i < arr.length; i++) {
            summa +=arr[i];
        }
        return summa;
    }
}

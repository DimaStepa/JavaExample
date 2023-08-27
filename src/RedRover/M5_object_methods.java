package RedRover;

public class M5_object_methods {

    public static void main(String[] args) {

//    int a = 5;
//
//    String str = "10";
//    String str2 = "sergey";
//
//    int b = Integer.parseInt(str);
//    int c = str2.length();
//
//        System.out.println(b);
//        System.out.println(c);

        // С большой буквы обозначаются референсные типы (Н/р String, Integer),
        // референсными объектами также являются массивами
        // С маленькой буквы обозначаются value типы (Н/р int, byte)
        String str3 = "А роза упала на лапу Азора";
        str3 = str3.toLowerCase();
        int countA = 0;
        for (int s = 0; s < str3.length(); s++) {
 //           if(str3.charAt(s) == 'а'|| str3.charAt(s) == 'А'){
            if (Character.toLowerCase(str3.charAt(s)) == 'а'){  // символы которые перебираем приводим к нижнему регистру
                System.out.println(s);
                countA = countA + 1 ;
            }
        }
        System.out.println(str3);
        System.out.println("Количество 'А' во фразе: " + countA);

        int a = 10;
        int b =  10;
        System.out.println( a == b);

        // референсные объекты можно сравнивать только с помощью equesl
        String str11 = "sergey";
        String str22 = "anna";
        System.out.println(str11.equals(str22));


    }
}

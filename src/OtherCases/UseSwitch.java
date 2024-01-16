package OtherCases;

public class UseSwitch {

    public static void listOfConstantsSwitch(int eventCode) {
        int priorityLevel = 0;
        switch (eventCode) {
            case 2001, 3234, 6010:
                priorityLevel = 1;
                break;
            case 7000, 8901, 9292:
                priorityLevel = 2;
                break;
            default:
                priorityLevel = 3;
        }
        System.out.println("Приоритет кода " + eventCode + ": "+ priorityLevel);
    }

    public static void expressionSwitch(int eventCode) {
        int priorityLevel = switch (eventCode) {
            case 1000, 1025, 8900:
                yield 1;
            case 2000, 6010, 9128:
                yield 2;
            case 1002, 7023, 9300:
                yield 3;
            //обязательно должен быть default
            default:
                yield 0;
        };
        System.out.println("Уровень приоритета кода события " + eventCode +": " + priorityLevel);
    }

    public static void expressionWithArrow(int eventCode) {
        //использование case со стрелкой
        int priorityLevel = switch (eventCode) {
            case 1000, 1025, 8900 -> 1;
            case 2000, 6010, 9128 -> 2;
            case 1002, 7023, 9300 -> 3;
                //обязательно должен быть default
            default -> 0;
        };
        System.out.println("Уровень приоритета кода события " + eventCode +": " + priorityLevel);
    }

    public static void expressionWithArrowAndYield(int eventCode) {
        boolean stopNow;
        //использование case со стрелкой и блоком кода
        //yield используется, чтобы установить значение для переменной priorityLevel
        //тип значения в yield должен соответствовать типу переменной, которой присваивается значение
        int priorityLevel = switch (eventCode) {
            case 1000, 1025, 8900 -> {
                stopNow = false;
                System.out.println("Тревога");
                yield 1;
            }
            case 2000, 6010, 9128 -> {
                stopNow = false;
                System.out.println("Предупреждение");
                yield 2;
            }
            case 1002, 7023, 9300 -> {
                stopNow = true;
                System.out.println("Опасность");
                yield 3;
            }
            //обязательно должен быть default
            default -> {
                stopNow = false;
                System.out.println("Штатная ситуация");
                yield 0;
            }
        };
        System.out.println("Уровень приоритета кода события " + eventCode +": " + priorityLevel);
        if (stopNow) {
            System.out.println("Нужно останить машину");
        }
    }

    public static void yIsVowel (char vowel) {
        boolean isVowel = switch (vowel) {
            case 'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y' -> true;
            default -> false;
        };
        if (isVowel) {
            System.out.println(vowel + " - гласная буква");
        }
        else {
            System.out.println(vowel + " - ЭТО НЕ гласная буква");
        }
    }

    public static void main(String[] args) {
        System.out.println("---- Кейсы, когда в case используется список констант ----");
        listOfConstantsSwitch(3234);
        listOfConstantsSwitch(8901);
        listOfConstantsSwitch(8902);
        System.out.println("----  Когда switch используется как выражение ----");
        expressionSwitch(9300);
        expressionWithArrow(6010);
        System.out.println("----  Когда case со стрелкой и блоком ----");
        expressionWithArrowAndYield(7023);
        System.out.println("----  Eще один пример с switch ----");
        yIsVowel('a');
        yIsVowel('b');
    }
}

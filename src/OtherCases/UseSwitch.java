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

    public static void main(String[] args) {
        System.out.println("---- Кейсы, когда в case используется список констант ----");
        listOfConstantsSwitch(3234);
        listOfConstantsSwitch(8901);
        listOfConstantsSwitch(8902);
        System.out.println("----  Когда switch используется как выражение ----");
        expressionSwitch(9300);
    }
}

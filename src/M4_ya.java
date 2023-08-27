public class M4_ya {

    public static void main(String[] args) {
    printFizzBuzzShorted(15);
    }

    public static void printFizzBuzzShorted (int limit) {

        for (int numder = 0; numder <= limit; numder++) {
            String answer = "";
            if (numder % 3 ==0) {
                answer += "FIZZ";
            }
            if (numder % 5 ==0) {
                answer += "BUZZ";
            }
            if (answer.equals("")){
                answer +=numder;
            }
            System.out.println(answer);
            }

        }

    }


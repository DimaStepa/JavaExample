package RedRover.M9;

public class MyResult {

    int sum;

    int mul;

    int module;

    int dev;

    public int getMul() {
        return mul;
    }

    public int getModule() {
        return module;
    }

    public int getDev() {
        return dev;
    }

    public int getSum() {
        return sum;
    }

    void printAll(){
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(module);
        System.out.println(dev);
    }

    public static MyResult myMethod (int a, int b){

        MyResult result = new MyResult();

        result.sum = a + b;
        result.mul = a * b;
        result.module = a % b;
        result.dev = a / b;

        return result;
    }
}

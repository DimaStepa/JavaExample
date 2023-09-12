package RedRover.M9;

public class M9_L {

//public - атрибут или член класса публичный
//private - могут быть вызваны только внутри класса
//protected - могут быть вызван всеми объектами в одном пакете, или любым наследником данного класа(extended/abstract)
//package - "" когда мы ничего не указали, указываем в одном пакете

    public static void main(String[] args) {

        MyResult result1 = MyResult.myMethod(12, 6);
        result1.printAll();

    }
}

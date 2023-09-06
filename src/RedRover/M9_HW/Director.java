package RedRover.M9_HW;

public class Director {

    private double BaseSalary;
    private String Name;

    private double Salary;

    private int NumberOfSubordinates;

    public double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.BaseSalary = baseSalary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary (double BaseSalary){
        this.BaseSalary = BaseSalary;
        return BaseSalary * (NumberOfSubordinates * 9 / 100);
    }



}

package at.htlpinkafeld.Gehaltsberechnung;

public abstract class Employee {
    private int empNo;
    private String name;

    public Employee(int empNo, String name) {
        this.empNo = empNo;
        this.name = name;
    }

    public abstract double getWage();

}

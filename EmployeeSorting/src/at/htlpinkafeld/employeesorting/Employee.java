package at.htlpinkafeld.employeesorting;

public class Employee implements Comparable<Employee> {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Employee(String name, String dept, double sal) {
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }

    private String name;
    private String dept;  //Department
    private double sal;   //Salary

    @Override
    public String toString() {
        return this.name + " " + this.dept + " " + this.sal;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}

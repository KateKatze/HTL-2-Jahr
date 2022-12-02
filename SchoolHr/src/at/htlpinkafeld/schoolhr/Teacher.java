package at.htlpinkafeld.schoolhr;

public class Teacher extends Person {
    private int employeeNum;

    public Teacher (int day, int month, int year,String firstName, String lastName, long socSecNum,int employeeNum) {
        super(day, month, year, firstName, lastName, socSecNum);
        this.employeeNum = employeeNum;
    }

    public String toJSON() {
        return super.toJSON() + ", " +  "'employeeNum': " + this.employeeNum + "}";
    }
}

package at.htlpinkafeld.schoolhr;

public class HeadOfDepartment extends Teacher {
    String departmentName;

    public HeadOfDepartment (int day, int month, int year,  String firstName, String lastName, long socSecNum, int employeeNum, String departmentName) {
        super (day, month, year, firstName, lastName, socSecNum, employeeNum);
        this.departmentName = departmentName;
    }

    @Override
    public String toJSON() {
        return "HeadOfDepartment: {'departmentName': " + this.departmentName +  ", " + super.toJSON() + "}";
    }
}

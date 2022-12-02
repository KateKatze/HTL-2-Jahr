package at.htlpinkafeld.schoolhr;

public class Person {
    private String firstName;
    private String lastName;
    private long socSecNum;
    private MyDate birthdate;

    public Person (int day, int month, int year, String firstName, String lastName, long socSecNum) {
        this.birthdate = new MyDate(day, month, year);
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecNum = socSecNum;
    }

    public String toJSON() {
        return "{'firstName': " + "'" + firstName +
                "', 'lastName': "  + "'" + lastName +
                "', 'socSecNum': "  + "'" + socSecNum +
                "', 'birthdate': " + this.birthdate.toJSON();
    }
}

package at.htlpinkafeld.schoolhr;

public class Person {
    private String firstName;
    private String lastName;
    private long socSecNum;
    private MyDate birthdate;

    public Person (int day, int month, int year, String firstName, String lastName, long socSecNum) {
        this.birthdate = birthdate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecNum = socSecNum;
    }

    @Override
    public String toJSON() {
        return  "Person: { 'firstName': " +  firstName +
                ", 'lastName': " + lastName +
                ", 'socSecNum': " + socSecNum +
                ", 'birthdate': " + this.birthdate.toJSON() +
                "}";
    }
}

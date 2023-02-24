package at.htlpinkafeld.generics;

public class Person implements Comparable<Person> {
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String firstName;

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + age + "Years";
    }

    private String lastName;
    private int age;


    @Override
    public int compareTo(Person o) {
        int ret;
        ret = this.lastName.compareTo(p.lastName);
        if(ret == 0){
            ret = this.firstName.compareTo(p.firstName);
        }
        return ret;
    }
}

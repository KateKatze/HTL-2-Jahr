package at.htlpinkafeld.schoolhr;

public class Pupil extends Person {
    private String className;

    public Pupil(int day, int month, int year, String firstName, String lastName, long socSecNum, String className) {
        super(day, month, year, firstName, lastName, socSecNum);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getObjectAsJson() {
        return super.getObjectAsJson() + ", 'className': " + className;
    }
}

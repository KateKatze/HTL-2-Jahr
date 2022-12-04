package at.htlpinkafeld.schoolhr;

public class Person {
    private String firstName;
    private String lastName;
    private long socSecNum;

    private MyDate birthdate;

    public Person(int day, int month, int year, String firstName, String lastName, long socSecNum) {
        this.birthdate = new MyDate(day, month, year);
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecNum = socSecNum;
    }

    /**
     * toJson wird nur in Person definiert. Nicht ableiten.
     * toJson kann aber auf jedes abgeleitet Objekt aufgerufen werden.
     *
     * @return ein String mit einem JSON Objekt
     */
    public String toJSON() {
        // je nachdem auf welchen Objekt toJSON aufgerufen wird, wird in der folgenden Zeile
        // getObjectAsJson im richtigen Objekt aufgerufen.
        // zb: Pupil.toJSON() -> es wird in Pupil reingesprungen, dort das getObjectAsJson aufgerufen. Dort wird aber
        // wieder mit super().getObjectAsJson() als erstes das getObjectAsJson von Person aufgerufen.
        // dann werden im Pupil die gewünschten "Spezialattribute" von Pupil hinzugefügt.
        return "{" + getObjectAsJson() + "}";
    }

    public String getObjectAsJson() {
        return "'firstName': " + "'" + this.firstName +
                "', 'lastName': " + "'" + lastName +
                "', 'socSecNum': " + socSecNum +
                ", 'birthdate': " + birthdate.toJSON();
    }
}

package at.htlpinkafeld.schoolhr;

public class SchoolHr {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(14, 2, 1982, "Max", "Mustermann", 34568765, 24);
        System.out.println(teacher1.toJSON());

        Pupil pupil1 = new Pupil(28, 8, 2009, "Maria", "Musterfrau", 75483573, "1abc");
        System.out.println(pupil1.toJSON());

        HeadOfDepartment hod1 = new HeadOfDepartment(18, 11, 1980, "Mimi", "Fischer", 4243243, 2, "Sekretariat");
        System.out.println(hod1.toJSON());
    }
}

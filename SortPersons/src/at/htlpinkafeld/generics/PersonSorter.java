package at.htlpinkafeld.generics;
import java.util.Arrays;

public class PersonSorter {
    public static void main(String[] args) {
        Person[] persArr = new Person[5];
        //fill the Array with Persons
        persArr[0] = new Person("Max", "Mustemann", 44);
        persArr[1] = new Person("Maria", "Mustemann", 24);
        persArr[2] = new Person("Peter", "Buschen", 32);
        persArr[3] = new Person("Mia", "Papi", 29);
        persArr[4] = new Person("Thomas", "Lazy", 22);

        showPersons("Unsorted", pArr);
        //sort the Array with several Comparators and show the result
        Arrays.sort(persArr);  //Use the compareTo-Method of the
        //Person-Class for sorting
        // you have to implement the Comparable
        //Interface first
        showPersons("Natural", pArr);

        Arrays.sort(persArr, new AgeComparator());//Use the compare-Method
        // of the Comparator-Object for sorting
        showPersons("By age", pArr);

        //Continue
        public static void showPersons(String header, Person[] people) {
            for(Person p : person) {
                System.out.println(p);
            }
    }
}

package at.htlpinkafeld.pm.OlderPersons;
import java.util.Scanner;

public class OlderPersons {
    public static void main(String[] args) {
        // array for ppl args.length = 2 (name, age)
        Persons[] person = new Persons[args.length];
        // scanner
        Scanner input = new Scanner(System.in);

        // checking arguments = 2
        if (args.length != 2){
            System.out.println("It supposed to be name and age!");
            return;
        }

        int idx = 0;
        for (int i = 0; i < (args.length-1); i++) {
            person[idx++] = new Persons(args[i], Integer.parseInt(args[++i]));
        }

        // printing out the list of people
        System.out.println("The whole crowd:");
        for (Persons p: person) {
            System.out.println("\n" + p);
        }

        // printing the older ones
        double averageAge = getAverageAge(person);
        System.out.println("The older ones (avg = " + averageAge + "):");
        for (Persons p: person) {
            if (p.getAge() > averageAge){
                System.out.println("\n" + p);
            }
        }

        // setting false to find the match with the name we have in the "base"
        boolean search = false;
        System.out.print("Enter the name you are looking for: ");
        String name = input.next();
        for (Persons p: person){
            if (name.equals(p.getName())){
                if (!search){
                    System.out.println("I've found:");
                    search = true;
                }
                System.out.println("\n" + p);
            }
        }
        if (!search){
            System.out.println("That person doesn´t exist");
        }
    }
    // checking the average age to print the older ones (>averageAge)
    public static double getAverageAge(Persons[] person){
        double ageTotal = 0;
        for (Persons p: person){
            ageTotal += p.getAge();
        }
        return  ageTotal/(person.length);
    }
}

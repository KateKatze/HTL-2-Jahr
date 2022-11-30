package at.htlpinkafeld.pm.OlderPersons;
import java.util.Scanner;

public class OlderPersons {
    public static void main(String[] args) {
        // scanner
        Scanner input = new Scanner(System.in);

        // creating array for ppl args.length / 2 // (name, age)
        Persons[] person = new Persons[args.length/2];

        // checking arguments = 2 for every person, when no - throwing an error
        if (args.length%2 != 0) {
            System.out.println("It supposed to be name and age for every person!");
            return;
        }

        int idx = 0;
        for (int i = 0; i < (args.length-1); i++) {
            person[idx++] = new Persons(args[i], Integer.parseInt(args[++i]));
        }

        // printing out the list of people
        System.out.println("\n" + "The whole crowd:");
        for (Persons per: person) {
            System.out.println("\n" + per);
        }

        // printing the older ones
        double averageAge = getAverageAge(person);
        System.out.println("\n" + "The older ones (avg = " + averageAge + "):");
        for (Persons per: person) {
            if (per.getAge() > averageAge){
                System.out.println("\n" + per);
            }
        }

        // setting false to find the match with the name we have in the "base"
        boolean search = false;
        System.out.println("\n" + "Enter the name you are looking for: ");
        String name = input.next();
        for (Persons per: person){
            if (name.equals(per.getName())){
                if (!search){
                    System.out.println("I've found:");
                    search = true;
                }
                System.out.println("\n" + per);
            }
        }
        if (!search){
            System.out.println("That person doesn´t exist");
        }
    }

    // checking the average age to print the older ones (>averageAge)
    public static double getAverageAge(Persons[] person){
        double ageTotal = 0;
        for (Persons per: person){
            ageTotal += per.getAge();
        }
        return  ageTotal/(person.length);
    }
}

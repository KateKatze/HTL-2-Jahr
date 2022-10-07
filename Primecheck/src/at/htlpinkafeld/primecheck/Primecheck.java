package at.htlpinkafeld.primecheck;
import java.util.Scanner;

public class Primecheck {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int readVal;
        readVal = readInt("Type your number to check: ", 1, 1000000000);
        if (isPrim(readVal)) {
            System.out.print(readVal + " is a primary number!");
        } else {
            System.out.print(readVal + " is not a primary number!");
        }
    }
        public static int readInt (String txt,int min, int max){
            int returnedVal;
            Scanner input = new Scanner(System.in);
            do {
                System.out.print(txt);
                returnedVal = input.nextInt();
            } while (returnedVal < min || returnedVal > max);
            return returnedVal;
        }
        public static boolean isPrim (int nums){
            if (nums <= 1) {
                return false;
            }

            int i;
            for (i = 2; i <= nums/2; i++) {
                if ((nums % i) == 0) {
                    return false;
                }
            }
            return true;
        }

    }
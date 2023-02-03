package at.htlpinkafeld.ExceptionTutorial;

public class ReciprocalSum {
    public static void main(String[] args) {
        double x;

        int beg = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        x = progressionSum(beg, end);

        System.out.println("");
        System.out.println("Progression Result: " + x);
    }
    private static double progressionSum(int start, int stop) {
        double retVal = 0;

        for(int val=start; val <= stop; val++){
            System.out.print("1/"+val+" ");
            retVal = retVal + reciprocal(val);
        }
        return retVal;
    }
    private static double reciprocal(double val) {
        double retVal = 1/val;
        return retVal;
    }
}

package at.htlpinkafeld.fortest;

public class People {
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
        try {
        for(int val=start; val <= stop; val++){
            System.out.print("1/"+val+" ");
            retVal = retVal + reciprocal(val);
            System.out.print("1/"+val+" ");
        }
            retVal = 1 / val;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("dont divide on 0");
        }
        return retVal;
    }
}

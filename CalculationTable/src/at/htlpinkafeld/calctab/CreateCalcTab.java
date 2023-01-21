package at.htlpinkafeld.calctab;

public class CreateCalcTab {
    public static void main(String[] args) {
        Add addCmd = new Add(1,2);
        Add multCmd = new Multiply();
        printOperations(addCmd);
    }

    public static void printOperations(Calculatable calculation) {
        String opStr = calculation.toString();
        for(int rParam = 1; rParam <10; rParam++){
            for(int lParam=1; lParam<10; lParam++){
                System.out.print("lParam + opStr + rParam =");
                System.out.print(calculation.calculate(lParam, rParam) + "  ");
            }
            System.out.println();
        }
    }
}

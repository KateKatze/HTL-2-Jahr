package at.htlpinkafeld.fraction;
import java.util.Scanner;

public class Fraction {

    protected int n;

    public void setN(int n) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many terms?");
        this.n = input.nextInt();
    }

    public int getN() {
        return n;
    }

    Fraction mult(Fractions fProd){
        int s;
        for(int i=0; i<=getN(); i++)
            s = s+(i*1.0)/(i+1.0);
    }

    public String toString(){
        return ;
    }
}

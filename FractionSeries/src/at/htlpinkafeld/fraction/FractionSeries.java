package at.htlpinkafeld.fraction;
import java.util.Scanner;

public class FractionSeries {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(2,3);
        Fraction fProd, fSum;
        System.out.println(f1); //1/2

        fProd=f1.mult(f2);
        System.out.println(fProd);//2/6

        System.out.println(f1+"*"+f2+"="+fProd);

        //fSum = f1.add(f2);
        //System.out.println(fSum); //7/6

        int [] values = {2,4,8};
        int prod = 1;
        for(int val: values){
            prod *= val;
        }


    }
}

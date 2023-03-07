package at.htlpinkafeld.lotto;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.lang.Math;

public class LottoTip {
    private String msg = "";
    public Set<Integer> tip = new TreeSet<>();

    // 6 random numbers
    public LottoTip() {
        while (tip.size() < 6)
            tip.add(generateTipNumber());
    }

    // 6 not repeated nums, if not - exception
    public LottoTip(int[] tip) throws InvalidLottoTipException {
        if (tip.length != 6)
            throw new InvalidLottoTipException("Error: Number of the tips must be equal 6");
        // add numbers to set
        for (int number : tip)
            this.tip.add(number);
        if (this.tip.size() != 6)
            throw new InvalidLottoTipException("Error: Tips can not include the same number");
    }

    // num in the range 1-45
    private int generateTipNumber() {
        return (int) (Math.random() * 45) + 1;
    }

    public Set<Integer> getTip() {
        return this.tip;
    }

    public void setWinMsg(String msg) {
        this.msg = msg;
    }

    public boolean contains(int num){
        for (int lt:this.tip) {
            if (lt == num){
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String s = "{";
        boolean b = true;
        for (int n : this.tip) {
            if (b) {
                s += String.format("%2d", n);
                b = false;
            } else
                s += String.format(", %2d", n);
        }
        s += "} " + msg;
        return s;
    }
}
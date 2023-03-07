package at.htlpinkafeld.lotto;

public class PlayLotto {
    public static void main(String[] args) throws BetSlipOverflowException {
        Drawing d = new Drawing(6);
        Round r = new Round();
        r.setDrawing(d);
        for (int i = 0; i < 100; i++) {
            BetSlip b = new BetSlip(i);
            b.addQuickTip(9);
            r.addBetSlip(b);
        }
        r.evaluate();
    }
}

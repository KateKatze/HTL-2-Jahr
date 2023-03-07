package at.htlpinkafeld.lotto;

import java.util.ArrayList;
import java.util.List;

public class BetSlip {
    private int id;
    private String msg = "";
    private List<LottoTip> tips = new ArrayList<>();

    // id of a betslip
    public BetSlip(int id) {
        this.id = id;
    }

    // betslip filled with tips, not more than 20
    public void addQuickTip(int anzahl) throws BetSlipOverflowException {
        for(int i = 0; i< anzahl; i++){
            if (this.tips.size() >20) {
                throw new BetSlipOverflowException("Only 20 tips are allowed");
            }
            this.tips.add(new LottoTip());
        }
    }

    public void addTip(LottoTip tip) throws BetSlipOverflowException {
        if (tips.size() >= 20) throw new BetSlipOverflowException("Only 20 tips are allowed");
        this.tips.add(tip);
    }

    public long getId() {
        return id;
    }

    public List<LottoTip> getTips() {
        return tips;
    }

    public void setWinMsg(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "" + tips;
    }
}
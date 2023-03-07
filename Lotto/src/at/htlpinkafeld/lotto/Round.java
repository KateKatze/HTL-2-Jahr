package at.htlpinkafeld.lotto;

import java.util.ArrayList;
import java.util.LinkedList;

public class Round {
    private ArrayList<BetSlip> bs = new ArrayList<>();
    private Drawing drawing;

    private int drei;
    private int vier;
    private int fuenf;
    private int sechs;

    // adding betslip extra
    public void addBetSlip(BetSlip bs) {
        this.bs.add(bs);
    }
    public void setDrawing(Drawing dr) {
        this.drawing = dr;
    }

    public void evaluate() {
        System.out.println(this.drawing);
        for (BetSlip b: this.bs) {
            int corr = 0;
            for(LottoTip lt:b.getTips()){
                corr=0;
                for(int d:drawing.tip) {
                    if (lt.contains(d)) {
                        corr++;
                    }
                }
                if (lt.contains(drawing.getExtraNumber())){
                    corr++;
                }
                if (corr >=3){
                    switch (corr) {
                        case 3:
                            lt.setWinMsg("3er");
                            drei++;
                            break;
                        case 4:
                            lt.setWinMsg("4er");
                            vier++;
                            break;
                        case 5:
                            lt.setWinMsg("5er");
                            fuenf++;
                            break;
                        case 6:
                            lt.setWinMsg("6er");
                            sechs++;
                            break;
                    }
                    System.out.println("Wettschein Nr. " + b.getId() +  "\n" + " " + drei + " - 3er; " + vier + " - 4er; " + fuenf + " - 5er; " + sechs + " - 6er; " + "\n" + b);
                }
            }
            this.drei = this.vier = this.fuenf = this.sechs = 0;
        }
    }

    @Override
    public String toString() {
        return bs + "\n" + drawing;
    }
}


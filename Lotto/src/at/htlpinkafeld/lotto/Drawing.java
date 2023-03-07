package at.htlpinkafeld.lotto;

public class Drawing extends LottoTip {
    private int extraNumber;

    public Drawing(int extraNumber) {
        super();
        setExtraNumber(extraNumber);
    }

    public Drawing(int extraNumber, int[] tip) throws InvalidLottoTipException {
        super(tip);
        setExtraNumber(extraNumber);
        this.extraNumber = extraNumber;
    }

    private void setExtraNumber(int extraNumber){
        if (!super.getTip().contains(extraNumber)){
            this.extraNumber = extraNumber;
        } else {
            System.out.println("Extra number already exists");
        }
    }

    public int getExtraNumber() {
        return extraNumber;
    }

    @Override
    public String toString() {
        return "\n" + "Ziehung: " + super.toString() + "\n" + "Zusatzzahl: " + this.extraNumber;
    }
}

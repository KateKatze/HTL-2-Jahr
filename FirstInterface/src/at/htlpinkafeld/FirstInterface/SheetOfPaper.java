package at.htlpinkafeld.FirstInterface;

public class SheetOfPaper {
    private int format; //0=DIN A0, 1=DIN A1 usw. bis 6=DIN A6

    public SheetOfPaper(int format) {
        this.format = format;
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public int getLength(){
        int retVal;
        switch(this.format){
            case 0:
                retVal = 1189;
                break;
        }
    }

}

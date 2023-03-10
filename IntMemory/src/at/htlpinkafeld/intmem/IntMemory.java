package at.htlpinkafeld.intmem;

public class IntMemory {
    private int val;

    public IntMemory(){
        this.val = 0;
    }

    public IntMemory(int n){
        this.val = n;
    }

    public int getValue(){
        return this.val;
    }

    public void setValue(int n){
        this.val = n;
    }
}

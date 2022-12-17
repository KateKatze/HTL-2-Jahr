package at.htlpinkafeld.AnimalFarm;

public class Dog extends Animal {

    public Dog (String name) {
        super(name);
    }
    public void speak() {
        System.out.println("The dog says: woooff " + this.name);
    }
}

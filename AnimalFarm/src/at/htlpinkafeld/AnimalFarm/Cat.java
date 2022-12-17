package at.htlpinkafeld.AnimalFarm;

public class Cat extends Animal {
    public Cat (String name) {
        super(name);
    }
    public void speak() {
        System.out.println("The cat says: meooow " +  this.name);
    }
}

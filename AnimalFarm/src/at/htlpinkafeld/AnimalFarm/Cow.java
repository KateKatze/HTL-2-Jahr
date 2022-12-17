package at.htlpinkafeld.AnimalFarm;

public abstract class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    public void speak() {
        System.out.println(this.getName() + "the cow says: moooooh! ");
    }
}

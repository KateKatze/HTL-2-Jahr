package at.htlpinkafeld.AnimalFarm;

public class AnimalFarmTalk {
    public static void main(String[] args) {
        Animal[] farm;
        //= new Animal[2];
        // farm[0] = new Cat("Katze");
       // farm[1] = new Dog("Schnurli");

        farm = createAnimalFarm();

        for(Animal a: farm)
            a.speak();
    }

    public Animal[] createAnimalFarm(){
        Animal[] f = new Animal[4];
        f[0] = new Cat("Mutzi");
        f[1] = new Dog("One");
        f[2] = new Cow("Two");
        f[3] = new Dog("Three");
        return f;
    }
}

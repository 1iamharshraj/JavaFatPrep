class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Cat extends Animal{
    public void animalSound(){
        super.animalSound();
        System.out.println("the cat says: meow meow");
    }
}

class Dog extends Animal {
    public void animalSound() {
        super.animalSound();
        System.out.println("The dog says: bow wow");
    }
}

public class OverridingAndSuperKeyword {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.animalSound();
        myCat.animalSound();
    }
}
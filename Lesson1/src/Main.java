package lesson1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 5);
        cat.info();
        cat.superJump();

        Dog dog = new Dog("Tuzik", "White", 2);
        dog.info();
        dog.run();

        Animal animal = new Cat("murka", "black", 5);
        ((Cat) animal).go();


    }


}

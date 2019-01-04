package lesson1;

public class Cat extends Animal implements JumpInterface{
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Наша кошка хорошая");
    }

    @Override
    void voice() {
        System.out.println("Miau");
    }

    public void go(){
        System.out.println("кошка ходит");
    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {

    }
}

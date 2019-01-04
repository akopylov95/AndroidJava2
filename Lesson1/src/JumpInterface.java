package lesson1;

public interface JumpInterface extends MyInterface{
    void jump();
    default void superJump(){
        System.out.println("Супер прыжок!!!");
    }
}

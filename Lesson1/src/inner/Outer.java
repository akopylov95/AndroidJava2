package lesson1.inner;

public class Outer {
    private int outX = 5;

    class Inner {
        private int inX = 7;

        public void info(){
            System.out.println("inX "+ inX);
            System.out.println("outX "+ outX);
        }
    }


}

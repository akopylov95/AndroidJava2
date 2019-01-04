package lesson1.enums;

public enum Fruit {
    Orange("Апельсин",150), Apple("Яблоко",200),
    Banana("Банан", 70), Chery("Вишня",25);

    private int weigth;
    private String rus;

    Fruit(String rus, int weigth ) {
        this.weigth = weigth;
        this.rus = rus;
    }

    Fruit(int weigth) {
        this.weigth = weigth;
    }
    Fruit() {
        this.weigth = -1;
    }

    public int getWeigth() {
        return weigth;
    }

    public String getRus() {
        return rus;
    }
}

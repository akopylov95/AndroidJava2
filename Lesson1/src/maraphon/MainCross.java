package lesson1.maraphon;

public class MainCross {
    public static void main(String[] args) {

        Animal[] animalsFirst = new Animal[4];
        animalsFirst[0] = new Cat("Barsik");
        animalsFirst[1] = new Dog("Bobik");
        animalsFirst[2] = new Dog("Bob");
        animalsFirst[3] = new Cat("Kokos");

        Team t1 = new Team(animalsFirst,"DreamTeam");

        Animal[] animalSecond = new Animal[4];
        animalSecond[0] = new Cat("Murka");
        animalSecond[1] = new Dog("Sharik");
        animalSecond[2] = new Dog("Drujog");
        animalSecond[3] = new Cat("Donald");

        Team t2 = new Team(animalSecond, "SuperTeam");

        Obstracle[] obs = new Obstracle[4];
        obs[0] = new Cross(200);
        obs[1] = new Wall(8);
        obs[2] = new Water(200);
        obs[3] = new Cross(800);

        Course c = new Course(obs);

        c.doIt(t1);
        c.doIt(t2);

        t1.showWinners();
        t2.showWinners();

    }
}

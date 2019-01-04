package lesson1.maraphon;

public class Course {
    private Obstracle[] obs;

    public Course(Obstracle[] obs){
        this.obs = obs;
    }

    public void doIt(Team t){
        for (int i = 0; i < t.getAnimals().length; i++) {
            for (int j = 0; j < obs.length; j++) {
                obs[j].doIt(t.getAnimals()[i]);
                if (!t.getAnimals()[i].isDistance()){
                    break;
                }
            }
        }
    }

}

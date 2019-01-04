package lesson1.maraphon;

public class Team {
    private Animal[] animals;
    private String title;

    public Team(Animal[] animals, String title){
        this.animals = animals;
        this.title = title;
    }

    public Team(String title, String nameCat, String nameDog, String nameDog1, String nameCat1){
        this.title = title;
        animals = new Animal[4];
        animals[0] = new Cat(nameCat);
        animals[1] = new Dog(nameDog);
        animals[2] = new Dog(nameDog1);
        animals[3] = new Cat(nameCat1);
    }

    public void info(){
        for (int i = 0; i < animals.length; i++){
            animals[i].info();
        }
    }

    public void showWinners(){
        System.out.println("Team " + title + " winners");
        for(int i = 0; i<animals.length; i++){
            if(animals[i].isDistance()){
                System.out.println(animals[i].getName());
            }
        }
    }

    public Animal getMember(int i){
        return animals[i];
    }

    public Animal[] getAnimals() {
        return animals;
    }
}

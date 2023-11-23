public class Animal {
    private static int animalCount = 0;
    private String name;

    public Animal(String name){
        animalCunt++;
        this.name = name;
    }
    public static int getCount() {
        return animalCunt;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void run(int distance) {}
    public void swim(int distance) {}
}

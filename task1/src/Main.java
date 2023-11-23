import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int distanceForRun = 100;
        int distanceForSwim = 5;
        ArrayList<Animal> arrAnimal = new ArrayList<Animal>();
        for(int i = 0; i < random.nextInt(3) + 1; i++) {
            Animal animal = new Dog("Dog" + Integer.toString(i+1));
            arrAnimal.add(animal);
        }
        for(int i = 0; i < random.nextInt(3) + 1; i++) {
            Animal animal = new Cat("Cat" + Integer.toString(i+1));
            arrAnimal.add(animal);
        }
        for(int i = 0; i < random.nextInt(3) + 1; i++) {
            Animal animal = new Tiger("Tiger" + Integer.toString(i+1));
            arrAnimal.add(animal);
        }
        for(int i = 0; i < random.nextInt(3) + 1; i++) {
            Animal animal = new Rabbit("Rabbit" + Integer.toString(i+1));
            arrAnimal.add(animal);
        }

        System.out.println("All animals = " + Integer.toString(Animal.getCount()));
        System.out.println("Dogs = " + Integer.toString(Dog.getCount()));
        System.out.println("Cats = " + Integer.toString(Cat.getCount()));
        System.out.println("Tigers = " + Integer.toString(Tiger.getCount()));
        System.out.println("Rabbits = " + Integer.toString(Rabbit.getCount()));

        for(Animal q : arrAnimal) {
            q.run(distanceForRun);
            q.swim(distanceForSwim);
        }
    }
}

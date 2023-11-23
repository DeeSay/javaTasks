public class Cat extends Animal {
    private static int count = 0;
    public Cat(String name){
        super(name);
        count++;
    }
    public static int getCount() {
        return count;
    }
    @Override
    public void run(int distance) {
        super.run(distance);
        if(0 < distance && distance <= 200) {
            System.out.println("Кот " + getName() + " пробежал " + Integer.toString(distance) + " м.");
        } else {
            System.out.println("Кот " + getName() + " может пробежать не более 200 м.");
        }
    }
    @Override
    public void swim(int distance) {
        super.swim(distance);
        System.out.println("Кот " + getName() + " не умеет плавать.");
    }

}

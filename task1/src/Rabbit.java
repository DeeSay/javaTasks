public class Rabbit extends Animal{
    private static int count = 0;
    public Rabbit(String name){
        super(name);
        count++;
    }
    public static int getCount() {
        return count;
    }
    @Override
    public void run(int distance) {
        super.run(distance);
        if(0 < distance && distance <= 100) {
            System.out.println("Кролик " + getName() + " пробежал " + Integer.toString(distance) + " м.");
        } else {
            System.out.println("Кролик " + getName() + " может пробежать не более 100 м.");
        }
    }
    @Override
    public void swim(int distance) {
        super.swim(distance);
        System.out.println("Кролик " + getName() + " не умеет плавать.");
    }
}

public class Tiger extends Animal{
    private static int count = 0;
    public Tiger(String name){
        super(name);
        count++;
    }
    public static int getCount() {
        return count;
    }
    @Override
    public void run(int distance) {
        super.run(distance);
        if(0 < distance && distance <= 800) {
            System.out.println("Тигр " + getName() + " пробежал " + Integer.toString(distance) + " м.");
        } else {
            System.out.println("Тигр " + getName() + "может пробежать не более 800 м.");
        }
    }
    @Override
    public void swim(int distance) {
        super.swim(distance);
        System.out.println("Тигр " + getName() + " не умеет плавать.");
    }
}

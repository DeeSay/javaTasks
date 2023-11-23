public class Dog extends Animal {
    private static int count = 0;
    public Dog(String name){
        super(name);
        count++;
    }
    public static int getCount() {
        return count;
    }
    @Override
    public void run(int distance) {
        super.run(distance);
        if(0 < distance && distance <= 500) {
            System.out.println("Собака " + getName() + " пробежала " + Integer.toString(distance) + " м.");
        } else {
            System.out.println("Собака " + getName() + "может пробежать не более 500 м.");
        }
    }
    @Override
    public void swim(int distance) {
        super.swim(distance);
        if(0 < distance && distance <= 10) {
            System.out.println("Собака " + getName() + " проплыла " + Integer.toString(distance) + " м.");
        } else {
            System.out.println("Собака " + getName() + " может проплыть не более 10 м.");
        }
    }
}

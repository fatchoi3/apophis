public class Child extends Human implements Walkable,Runnable,Swimmable {
    public Child(String name, int age) {
        super(name, age, 5);
    }

    @Override
    public void swim(int x, int y) {
        printWhoAmIA();
        System.out.println("swim speed: " + (speed + 1));
        this.x = x;
        this.y = y;
        System.out.println("swum to " + getlocation());
    }

    @Override
    public void walk(int x, int y) {
        printWhoAmIA();
        System.out.println("walk speed: " + (speed + 2));
        this.x = x;
        this.y = y;
        System.out.println("Walked to " + getlocation());
    }

    @Override
    public void run(int x, int y) {
        printWhoAmIA();
        System.out.println("run speed: " + speed);
        this.x = x;
        this.y = y;
        System.out.println("ran to " + getlocation());
    }

}

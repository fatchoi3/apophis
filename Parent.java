public class Parent extends Human implements Walkable, Runnable{
    public Parent(String name, int age) {
        super(name, age, 3);
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

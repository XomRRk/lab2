package qwert;

public class Robot implements Run{
    protected  String name;
    protected int distance;
    protected int height;
    @Override
    public int run() {
        Run.super.run();
        return distance;
    }

    @Override
    public int jump() {
        Run.super.jump();
        return height;
    }
    @Override
    public String name() {
        Run.super.name();
        return name;
    }
    public Robot(String name, int height, int distance) {
        this.name = name;
        this.distance = distance;
        this.height = height;
        System.out.println(name + " пробежал " + distance);
        System.out.println(name + " прыгнул " + height);
    }
}

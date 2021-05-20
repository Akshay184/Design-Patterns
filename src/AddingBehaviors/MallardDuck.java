package AddingBehaviors;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("I am Mallard duck");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void quack() {
        System.out.println("I am quacking");
    }
}

package AddingBehaviors;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void display() {
        System.out.println("I am Rubber duck");
    }

    @Override
    public void quack() {
        System.out.println("I am quacking");
    }
}

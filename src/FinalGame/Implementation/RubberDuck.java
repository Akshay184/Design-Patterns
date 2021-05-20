package FinalGame.Implementation;

import FinalGame.Duck;
import FinalGame.QuackBehavior.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am Rubber duck");
    }
}

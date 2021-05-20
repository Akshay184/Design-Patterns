package FinalGame.Implementation;

import FinalGame.Duck;
import FinalGame.FlyBehavior.FlyWithWings;
import FinalGame.QuackBehavior.Quack;

public class MillardDuck extends Duck {
    public MillardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am Millard duck");
    }
}

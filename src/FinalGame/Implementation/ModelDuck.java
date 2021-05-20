package FinalGame.Implementation;

import FinalGame.Duck;
import FinalGame.FlyBehavior.FlyNoWay;
import FinalGame.QuackBehavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am Model duck");
    }
}

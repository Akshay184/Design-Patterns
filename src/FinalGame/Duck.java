package FinalGame;

import FinalGame.FlyBehavior.FlyBehavior;
import FinalGame.QuackBehavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack() {
        flyBehavior.fly();
    }

    public void performFly() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("I am swimming");
    }

    public abstract void display();
}

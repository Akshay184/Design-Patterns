import AddingBehaviors.DecoyDuck;
import AddingBehaviors.MallardDuck;
import AddingBehaviors.RubberDuck;

public class Main {

    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        mallard.fly();
        mallard.swim();
        mallard.quack();

        RubberDuck rubber = new RubberDuck();
        rubber.quack();

        DecoyDuck decoy = new DecoyDuck();
        decoy.swim();
//        becuase decoy can't  fly
//        decoy.fly();
    }
}

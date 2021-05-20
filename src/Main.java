import FinalGame.FlyBehavior.FlyRockerPower;
import FinalGame.Implementation.MillardDuck;
import FinalGame.Implementation.ModelDuck;
import FinalGame.Implementation.RubberDuck;

public class Main {

    public static void main(String[] args) {
        MillardDuck millard = new MillardDuck();
        millard.performFly();
        millard.performQuack();

        ModelDuck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRockerPower());
        model.performFly();
    }
}

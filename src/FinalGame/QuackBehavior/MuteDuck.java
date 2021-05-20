package FinalGame.QuackBehavior;

public class MuteDuck implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I am silent");
    }
}

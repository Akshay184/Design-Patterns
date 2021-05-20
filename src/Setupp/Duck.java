package Setupp;

// Duck parent class
public abstract class Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void swim() {
        System.out.println("Swim");
    }

    // different duck have different view
    public abstract void display();

    // now we have to add flying feature to duck also
    // what we can do we can just add fly method in this class
    public void fly() {
        System.out.println("Duck is fly");
    }

    // the problem that arises here is that rubber duck
    // was also seeing flying
    // so I thought that I could just override this method
    // but when I added wooden duck I have to override both
    // the fly and quack method and it will keep on changing as we
    // add new ducks to the game
    // move to Behavior to more what I thought
}

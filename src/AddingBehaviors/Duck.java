package AddingBehaviors;

// all things are same except me don't add fly method in here
public abstract class Duck {
    public void swim() {
        System.out.println("Swim");
    }

    // different duck have different view
    public abstract void display();
}

// The problem with this approach is that now if we add 30 40 more
// ducks then we have to implement methods for fly and quack
// for all of them and if there is any change in the method
// then we have to change all of them which will just lead to
// more bugs.
// Here we are not using the concept of code re-use which is bad.
// To solve this problem I took some other approach. Use can see it
// in final game section

package duck;

/**
 * Created by liulang on 2017/9/5.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("i'm a real Mallard duck");
    }
}

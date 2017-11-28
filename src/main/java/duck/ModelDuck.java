package duck;

/**
 * Created by liulang on 2017/9/5.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("i'm a model duck");
    }
}

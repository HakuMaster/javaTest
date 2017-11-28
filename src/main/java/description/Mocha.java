package description;

/**
 * Created by liulang on 2017/9/6.
 */
public class Mocha extends  CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }
}

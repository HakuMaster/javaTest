package description;

/**
 * Created by liulang on 2017/9/6.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    public double cost() {
        return 0.10 + beverage.cost();
    }
}

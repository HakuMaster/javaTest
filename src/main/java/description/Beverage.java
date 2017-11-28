package description;

/**
 * Created by liulang on 2017/9/6.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}

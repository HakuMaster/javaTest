package description;

/**
 * Created by liulang on 2017/9/6.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" +beverage.cost());

        Beverage beverage2 =  new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 =new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}

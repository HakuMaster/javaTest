package methodModle;

/**
 * Created by liulang on 2017/8/28.
 */
public class Coffee {
    void prepareRexipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }
    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void brewCoffeeGrinds(){
        System.out.println("Dripping Coffee through filter");
    }
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }
    public void addSugarAndMilk(){
        System.out.println("Add Sugar and Milk");
    }
}

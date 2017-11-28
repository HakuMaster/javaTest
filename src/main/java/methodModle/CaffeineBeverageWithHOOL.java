package methodModle;

/**
 * Created by liulang on 2017/8/28.
 */
public abstract class CaffeineBeverageWithHOOL {
    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }

    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
    boolean customerWantsCondiments(){
        return true;
    }
}

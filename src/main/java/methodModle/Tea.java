package methodModle;

/**
 * Created by liulang on 2017/8/28.
 */
public class Tea {
    void prapareRecipe(){
        boilWater();
        steepTeaBag();
        addLemon();
        pourInCup();
    }
    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void steepTeaBag(){
        System.out.println("Steeping the tea");
    }
    public void addLemon(){
        System.out.println("Adding Lemon");
    }
    public  void pourInCup(){
        System.out.println("Pouring into cup");
    }
}


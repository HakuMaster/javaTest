package methodModle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by liulang on 2017/8/28.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHOOL {
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")){
            return true;
        }else {
            return false;
        }
    }
    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer =in.readLine();
        }catch (IOException ioe){
            System.out.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}

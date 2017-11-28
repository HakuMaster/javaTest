package thread.mylist;

import com.sun.org.apache.xpath.internal.operations.String;

public class Test1 {
    public static void main(String[] args) {
        try{
            String string = new String();
            string.wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

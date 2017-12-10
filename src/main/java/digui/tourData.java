package digui;

/**
 * Created by ll on 17-12-10.
 */
public class tourData {

    public static String tourData(int n) {
        String str = new String();
        if(1 == n) {
            str = rowData(n) + "\n";

            return str;
    }
    else {
        str = tourData(n-1) + rowData(n) + "\n";
            System.out.println(str);
    }
    return str;
}
    private static String rowData(int n) {
        String str = new String();
        for(int i=0; i<n; i++) {
            str = str+ n + "      ";
            System.out.println(i+"&&");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(tourData(6));
    }
}

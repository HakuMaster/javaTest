package thread.threadclass;

public class ThrowText {
    public static void main(String[] args) {
        try {
            Throw th = new Throw();
            th.start();
            Thread.sleep(1000);
            th.interrupt();
        } catch (InterruptedException e) {
            System.out.println("mian catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}

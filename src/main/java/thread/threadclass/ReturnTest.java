package thread.threadclass;

public class ReturnTest {
    public static void main(String[] args) throws InterruptedException {
        Return t = new Return();
        t.start();
        Thread.sleep(2000);
        t.interrupt();
    }
}

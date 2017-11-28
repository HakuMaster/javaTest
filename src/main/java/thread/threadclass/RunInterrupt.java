package thread.threadclass;

public class RunInterrupt {
    public static void main(String[] args) {

        try {
            Interrupt interrupt = new Interrupt();
            interrupt.start();
            Thread.sleep(2000);
            interrupt.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }

    }
}

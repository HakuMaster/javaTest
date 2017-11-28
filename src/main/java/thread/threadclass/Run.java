package thread.threadclass;

public class Run {
    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        Thread a = new Thread(mythread, "A");
        Thread b = new Thread(mythread, "B");
        Thread c = new Thread(mythread, "C");
        Thread d = new Thread(mythread, "D");
        Thread e = new Thread(mythread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

        Alive alive = new Alive();
        System.out.println("begin =="+alive.isAlive());
        alive.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        System.out.println("end =="+ alive.isAlive());
    }
}

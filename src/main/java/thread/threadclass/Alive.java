package thread.threadclass;

public class Alive extends Thread{
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }
}

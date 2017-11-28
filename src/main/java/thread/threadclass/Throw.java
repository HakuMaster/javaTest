package thread.threadclass;

public class Throw extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 50000; i++){
                if (this.isInterrupted()){
                System.out.println("已经是停止状态了！我要推出了！");
                throw new InterruptedException();
            }
            System.out.println("i="+(i +1));
        }
            System.out.println("我在for下面了");
        } catch (InterruptedException e) {
            System.out.println("进throw。java类run方法中的catch了！");
            e.printStackTrace();
        }
    }
}

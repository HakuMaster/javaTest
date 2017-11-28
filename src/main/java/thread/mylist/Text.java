package thread.mylist;

public class Text {
    public static void main(String[] args) {
        MyList myList = new MyList();
        ThreadA a = new ThreadA(myList);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(myList);
        b.setName("B");
        b.start();
    }
}

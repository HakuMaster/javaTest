package observer;

/**
 * Created by liulang on 2017/9/5.
 */
public interface Subject {
     void registerObserver(Observer o);
     void removeObserver(Observer o);
     void notifyObservers();
}

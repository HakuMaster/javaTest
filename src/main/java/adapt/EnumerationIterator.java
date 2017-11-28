package adapt;

import java.util.Iterator;

/**
 * Created by liulang on 2017/8/28.
 */
public class EnumerationIterator implements Iterator {
    EnumerationIterator enumerationIterator;

    public EnumerationIterator(EnumerationIterator enumerationIterator) {
        this.enumerationIterator = enumerationIterator;
    }

    public boolean hasNext() {
        return enumerationIterator.hasNext();
    }

    public Object next() {
        return enumerationIterator.next();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}

package structural.adapter.enumerationIterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by thomas on 09/03/15.
 */
public class EnumerationIterator implements Iterator {
    /**
     * maps the newer Iterator Interface to the older Enumeration Interface
     */
    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }
}

package DataStructures.Iter;

import DataStructures.Exceptions.IndexOutOfRange;

/**
 * Created by xenonus on 7/27/2010.
 */
public interface Iterator<T> {

    public boolean hasNext();
    public T next();

}

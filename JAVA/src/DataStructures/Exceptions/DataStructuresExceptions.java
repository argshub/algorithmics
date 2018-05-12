package DataStructures.Exceptions;

/**
 * Created by xenonus on 7/25/2010.
 */
public abstract class DataStructuresExceptions extends Exception {

    private int capacity;

    public DataStructuresExceptions(String message, int capacity) {
        super(message);
        this.capacity = capacity;
    }

    public DataStructuresExceptions(String message) {
        this(message, 0);
    }

    public final int getCapacity() {
        return this.capacity;
    }
}

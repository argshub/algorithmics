package DataStructures.Arrays;
import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.IndexOutOfRange;
/**
 * Created by xenonus on 7/25/2010.
 */
public class ArrayADT<T> {

    private T arrayStorage[];
    private int capacity;

    public ArrayADT(int capacity) {
        this.capacity  = capacity;
        this.arrayStorage = (T[]) new Object[this.capacity];
    }

    public ArrayADT() {
        this(20);
    }

    public void atIndex(int index, T data) throws IndexOutOfRange {
        if(index >= this.capacity) throw new IndexOutOfRange("Index out of range", this.capacity);
        this.arrayStorage[index] = data;
    }

    public T atIndex(int index) throws IndexOutOfRange {
        if(index >= this.capacity) throw new IndexOutOfRange("Index Out Of range", this.capacity);
        return this.arrayStorage[index];
    }

    public static void main(String arg[]) {
        try {
            ArrayADT arrayADT = new ArrayADT(100);
            for (int i = 0; i < 100; i ++) {
                arrayADT.atIndex(i , i * i);
                System.out.printf("%d\t", arrayADT.atIndex(i));
            }
        } catch (DataStructuresExceptions exceptions) {
            System.out.printf("%s & capacity: %d", exceptions.getMessage(), exceptions.getCapacity());
        }
    }
}

package DataStructures.Arrays;
import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.IndexOutOfRange;
/**
 * Created by xenonus on 7/26/2010.
 */
public class BitArray {
    private int capacity;
    private int arrayData[];

    public BitArray(int capacity) {
        this.capacity = capacity;
        this.arrayData = new int[((this.capacity / 32) + 1)];
    }

    public BitArray() {
        this(128);
    }

    public void setBit(int index) throws IndexOutOfRange {
        if(index >= this.capacity) throw new IndexOutOfRange("Index Out Of Range", this.capacity);
        this.arrayData[(index / 32)] |= (1 << (index % 32));
    }

    public void clearBit(int index) throws IndexOutOfRange {
        if(index >= this.capacity) throw new IndexOutOfRange("Index out of range", this.capacity);
        this.arrayData[(index / 32)] &= ~(1 << (index % 32));
    }

    public boolean checkBit(int index) throws IndexOutOfRange {
        if(index >= this.capacity) throw new IndexOutOfRange("Index out of range", this.capacity);
        return (this.arrayData[(index / 32)] & (1 << (index % 32))) != 0;
    }

    public void printBitArray() {
        for (int i = this.arrayData.length - 1; i >= 0; i--) {
            int j = 1;
            for (int k = 31; k >= 0; k--) {
                if((arrayData[i] & (1 << k)) != 0) System.out.print("1");
                else System.out.print("0");
            }
        }
    }

    public static void main(String arg[]) {
        try {
            BitArray bitArray = new BitArray();
            bitArray.setBit(0);
            bitArray.setBit(15);
            bitArray.setBit(32);
            bitArray.setBit(64);
            bitArray.setBit(88);
            bitArray.setBit(100);
            bitArray.setBit(127);
            bitArray.setBit(126);

            System.out.println(bitArray.checkBit(15));
            bitArray.clearBit(0);
            bitArray.clearBit(15);
            System.out.println(bitArray.checkBit(15));

            bitArray.printBitArray();

        } catch (DataStructuresExceptions exceptions) {
            System.out.printf("%s & capacity: %d", exceptions.getMessage(), exceptions.getCapacity());
        }
    }
}

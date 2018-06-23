package DataStructures.Hashes;

import DataStructures.Arrays.BitArray;
import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.IndexOutOfRange;

/**
 * Created by argshub on 6/7/2018.
 */
public class BloomFilter {

    private int capacity;
    private BitArray bitArray;

    public BloomFilter(int capacity) {
        this.capacity = capacity;
        this.bitArray = new BitArray(this.capacity);
    }

    public void insert(int element) throws IndexOutOfRange {
        this.bitArray.setBit(this.hash(element));
        this.bitArray.setBit(this.hash2(element));
        this.bitArray.setBit(this.hash3(element));
    }

    public boolean exists(int element) throws IndexOutOfRange {
        return this.bitArray.checkBit(this.hash(element)) && this.bitArray.checkBit(this.hash2(element)) && this.bitArray.checkBit(this.hash3(element));
    }

    private int hash(int element) {
        return element % this.capacity;
    }

    private int hash2(int element) {
        return (element << 3 | element >> 5) % this.capacity;
    }

    private int hash3(int element) {
        return (element << 4 | element >> 7) % this.capacity;
    }

    public static void main(String arg[]) {
        try {

            BloomFilter bloomFilter = new BloomFilter(100);
            bloomFilter.insert(50);
            bloomFilter.insert(60);
            bloomFilter.insert(70);

            System.out.println(bloomFilter.exists(50));
            System.out.println(bloomFilter.exists(60));
            System.out.println(bloomFilter.exists(70));
            System.out.println(bloomFilter.exists(80));

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }
}

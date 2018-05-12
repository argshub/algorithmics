package DataStructures.Hashes;

import DataStructures.Exceptions.HashTableIsEmpty;
import DataStructures.Exceptions.HashTableIsFull;
import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.ValueNotExistsOnThatKey;

/**
 * Created by xenonus on 7/31/2010.
 */
public class HashTableWithLinearProbing {

    private int capacity;
    private Entry entry[];
    private int counter;

    public HashTableWithLinearProbing(int capacity) {
        this.capacity = capacity;
        this.entry = new Entry[this.capacity];
        this.counter= 0;
    }

    public void insert(String key, int value) throws HashTableIsFull {
        if(this.counter >= this.capacity) throw new HashTableIsFull("Hash Table is Full & capacity: " + this.capacity);
        Entry entry = new Entry(key, value);
        int index = this.hashValue(key);
        while (this.entry[index] != null) {
            if(this.entry[index].key == key) {
                this.entry[index].value = value;
                return;
            }
            index++;
        }
        this.entry[index] = entry;
        this.counter++;
    }

    public int get(String key) throws HashTableIsEmpty, ValueNotExistsOnThatKey {
        if(this.counter == 0) throw new HashTableIsEmpty("Hash Table is Empty");
        int index = this.hashValue(key);
        while (index < this.capacity) {
            if(this.entry[index] != null) {
                if(this.entry[index].key == key) return this.entry[index].value;
            }
            index++;
        }
        throw new ValueNotExistsOnThatKey("Value not Exists On Key: " + key);
    }

    public void delete(String key) throws ValueNotExistsOnThatKey {
        int index = this.hashValue(key);
        while (index < this.capacity) {
            if(this.entry[index] != null) {
                if(this.entry[index].key == key) {
                    this.entry[index] = null;
                    this.counter--;
                    return;
                }
            }
            index++;
        }
        throw new ValueNotExistsOnThatKey("Value not Exists on That key: " + key);
    }

    private int hashValue(String key) {
        char data[] = key.toCharArray();
        int hashValue = 0;
        for (int i = 0; i < data.length; i++) {
            hashValue += ((hashValue << 3) &  (hashValue >> 5));
            hashValue += (int) data[i];
        }
        return hashValue(hashValue);
    }

    private int hashValue(int hashValue) {
        return hashValue % this.capacity;
    }

    private class Entry {
        private String key;
        private int value;
        private Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String arg[]) {
        try {
            HashTableWithLinearProbing hashTableWithLinearProbing = new HashTableWithLinearProbing(100);
            hashTableWithLinearProbing.insert("Shazzad Hossain", 13066043);
            hashTableWithLinearProbing.insert("Masum Billah", 13036033);
            hashTableWithLinearProbing.insert("Rasel Ahmed", 13066104);
            hashTableWithLinearProbing.insert("Asik Hasan", 13066071);
            hashTableWithLinearProbing.insert("Mintu Plabon", 13066066);
            hashTableWithLinearProbing.insert("Ahsan Khan", 13066116);

            System.out.println(hashTableWithLinearProbing.get("Shazzad Hossain"));
            System.out.println(hashTableWithLinearProbing.get("Ahsan Khan"));

            hashTableWithLinearProbing.delete("Shazzad Hossain");
            System.out.println(hashTableWithLinearProbing.get("Shazzad Hossain"));

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }
}

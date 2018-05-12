package DataStructures.Hashes;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.HashTableIsEmpty;
import DataStructures.Exceptions.HashTableIsFull;
import DataStructures.Exceptions.ValueNotExistsOnThatKey;
import DataStructures.Iter.Iterator;
import DataStructures.Lists.DoublyLinkedList;
import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry;


/**
 * Created by xenonus on 7/31/2010.
 */
public class HashTableWithSeparateChaining {

    private int counter;
    private int capacity;
    private DoublyLinkedList<Entry> doublyLinkedList[];
    private Iterator iterator;

    public HashTableWithSeparateChaining(int capacity) {
        this.capacity = capacity;
        this.doublyLinkedList = new DoublyLinkedList[this.capacity];
        this.iterator = null;
        this.counter = 0;
    }

    public void insert(String key, int value) throws HashTableIsFull {
        if(this.counter >= this.capacity) throw new HashTableIsFull("Hash Table Is Full");
        int index = this.hashValue(key);
        if(this.doublyLinkedList[index] == null) this.doublyLinkedList[index] = new DoublyLinkedList<>();
        iterator = this.doublyLinkedList[index].iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            if(entry.key == key) {
                entry.value = value;
                return;
            }
        }
        this.doublyLinkedList[index].insertBack(new Entry(key, value));
        this.counter++;
    }

    public int get(String key) throws ValueNotExistsOnThatKey {
        int index = this.hashValue(key);
        if(this.doublyLinkedList[index] == null) throw new ValueNotExistsOnThatKey("Value Not Exists on Key: " + key);
        iterator = doublyLinkedList[index].iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            if(entry.key == key) return entry.value;
        }

        throw new ValueNotExistsOnThatKey("Value Not Exists on Key: " + key);
    }

    public void remove(String key) throws ValueNotExistsOnThatKey {
        int index = this.hashValue(key);
        if(this.doublyLinkedList[index] == null) throw new ValueNotExistsOnThatKey("Value not exists on key: " + key);
        iterator = this.doublyLinkedList[index].iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            if(entry.key == key) {
                this.doublyLinkedList[index].remove(iterator);
                return;
            }
        }
        throw new ValueNotExistsOnThatKey("Value Not Exists on Key: " + key);
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
        private Entry (String key, int value) {
            this.key = key;
            this.value  = value;
        }

        public String key() {
            return this.key;
        }

        public int value() {
            return this.value;
        }
    }

    public static void main(String arg[]) {
        try {
            HashTableWithSeparateChaining hashTableWithSeparateChaining = new HashTableWithSeparateChaining(100);
            hashTableWithSeparateChaining.insert("Shazzad Hossain", 13066043);
            hashTableWithSeparateChaining.insert("Masum Billah", 13036033);
            hashTableWithSeparateChaining.insert("Rasel Ahmed", 13066104);
            hashTableWithSeparateChaining.insert("Asik Hasan", 13066071);
            hashTableWithSeparateChaining.insert("Mintu Plabon", 13066066);
            hashTableWithSeparateChaining.insert("Ahsan Khan", 13066116);
            hashTableWithSeparateChaining.insert("Shazzad Hossain", 1407772);

            System.out.println(hashTableWithSeparateChaining.get("Shazzad Hossain"));
            System.out.println(hashTableWithSeparateChaining.get("Ahsan Khan"));
            System.out.println(hashTableWithSeparateChaining.get("Masum Billah"));

            hashTableWithSeparateChaining.remove("Shazzad Hossain");
            System.out.println(hashTableWithSeparateChaining.get("Shazzad Hossain"));

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }
}

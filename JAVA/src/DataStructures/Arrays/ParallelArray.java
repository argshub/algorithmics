package DataStructures.Arrays;

import DataStructures.Exceptions.ArrayIsFull;
import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.IndexOutOfRange;
import DataStructures.Exceptions.ValueNotExistsOnThatKey;

/**
 * Created by xenonus on 8/9/2010.
 */
public class ParallelArray<NameType, RollType, AddressType> {

    private int capacity;
    private NameType names[];
    private RollType rolls[];
    private AddressType addresses[];

    private int count;

    public ParallelArray(int capacity) {
        this.capacity = capacity;
        this.names = (NameType[]) new Object[this.capacity];
        this.rolls = (RollType[]) new Object[this.capacity];
        this.addresses = (AddressType[]) new Object[this.capacity];
        this.count = 0;
    }

    public void insert(NameType name, RollType roll, AddressType address) throws ArrayIsFull {
        if(this.count == this.capacity) throw new ArrayIsFull("Array is Full");
        this.names[this.count] = name;
        this.rolls[this.count] = roll;
        this.addresses[this.count++] = address;
    }

    public void atIndex(int index) throws IndexOutOfRange {
        if(index >= this.count) throw new IndexOutOfRange("Index Out Of Range", this.count);
        System.out.printf("Name: %s, Roll: %d & Address: %s\n", this.names[index], this.rolls[index], this.addresses[index]);
    }

    public NameType searchName(int roll) throws ValueNotExistsOnThatKey {
        for (int i = 0; i < this.count; i++) {
            if((Integer) this.rolls[i] == roll) return this.names[i];
        }
        throw new ValueNotExistsOnThatKey("Value not exists on key: " + roll);
    }

    public static void main(String arg[]) {

       try {

           ParallelArray<String, Integer, String> parallelArray = new ParallelArray<>(10);
           parallelArray.insert("Shazad Hossain", 13066043, "Joypurhat");
           parallelArray.insert("Masum Billah", 13056033, "Dinajpur");
           parallelArray.insert("Mintu Plabon", 13066022, "Pabna");

           parallelArray.atIndex(2);
           parallelArray.atIndex(0);

           System.out.println(parallelArray.searchName(13056033));
           System.out.println(parallelArray.searchName(13056037));
       } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
       }

    }
}

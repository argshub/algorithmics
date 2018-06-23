package DataStructures.Maps;

import DataStructures.Exceptions.DataStructuresExceptions;

/**
 * Created by xenonus on 5/19/2018.
 */
public class MultiMap extends Map {

    @Override
    public void insert(int key, String value) {
        Node node = new Node(key, value);
        if(this.header == null) this.header = node;
        else {
            node.next = this.header;
            this.header = node;
        }
    }

    public static void main(String arg[]) {
        try {

            MultiMap map = new MultiMap();
            map.insert(111, "Shazzad Hossain");
            map.insert(222, "Masum Billah");
            map.insert(333, "Ahsan Khan");
            map.insert(444, "Mintu Plabon");
            map.insert(555, "Rasel Ahmed");
            map.insert(666, "Asik Hasan");
            map.insert(444, "Krisna Ghosh");


            map.traverse();
            System.out.println();
            System.out.println(map.search(222));
            System.out.println(map.search(444));

            map.remove(444);
            map.remove(111);
            map.traverse();
            System.out.println();
            System.out.println(map.search(343));

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }
}

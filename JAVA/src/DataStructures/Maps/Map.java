package DataStructures.Maps;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.ValueNotExistsOnThatKey;

import java.awt.event.HierarchyEvent;

/**
 * Created by xenonus on 5/19/2018.
 */
public class Map {

    protected Node header;

    public Map() {
        this.header = null;
    }

    public void insert(int key, String value) {
        Node node = new Node(key, value);
        if(this.header == null) this.header = node;
        else {
            Node head = this.header;
            while (head != null) {
                if(head.key == key) {
                    head.value = value;
                    return;
                }
                head = head.next;
            }
            node.next = this.header;
            this.header = node;
        }
    }

    public String search(int key) throws ValueNotExistsOnThatKey {
        Node head = this.header;
        while (head != null) {
            if(head.key == key) return head.value;
            head = head.next;
        }
        throw new ValueNotExistsOnThatKey("value not exists on that key " + key);
    }

    public void traverse() {
        Node head = this.header;
        while (head != null) {
            System.out.printf("%d\t", head.key);
            head = head.next;
        }
    }

    public void remove(int key) throws ValueNotExistsOnThatKey {
        Node head = this.header;
        Node trailer = null;
        boolean found = false;
        while (head != null) {
            if(head.key == key) {
                found = true;
                break;
            }
            trailer = head;
            head = head.next;
        }

        if(found) {
            if(trailer == null) this.header = this.header.next;
            else trailer.next = head.next;
            return;
        }
        throw new ValueNotExistsOnThatKey("Value not Exists on That key " + key);
    }

    protected class Node {
        protected int key;
        protected String value;
        protected Node next;
        protected  Node(int key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }


    public static void main(String arg[]) {
        try {

            Map map = new Map();
            map.insert(111, "Shazzad Hossain");
            map.insert(222, "Masum Billah");
            map.insert(333, "Ahsan Khan");
            map.insert(444, "Mintu Plabon");
            map.insert(444, "Krisna Ghosh");
            map.insert(555, "Rasel Ahmed");
            map.insert(666, "Asik Hasan");


            map.traverse();
            System.out.println();
            System.out.println(map.search(222));
            System.out.println(map.search(444));

            map.remove(111);
            map.traverse();
            System.out.println();
            System.out.println(map.search(343));

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }
}

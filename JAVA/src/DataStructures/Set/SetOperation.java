package DataStructures.Set;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.SetIsEmpty;

/**
 * Created by xenonus on 5/19/2018.
 */
public class SetOperation {

    public void union(OrderedSet setA, OrderedSet setB, OrderedSet setC) throws SetIsEmpty {
        while (!setA.empty() && !setB.empty()) {
            int setALowest = setA.lowest();
            int setBLowest = setB.lowest();
            if(setALowest == setBLowest) {
                setC.insert(setALowest);
                setA.removeLowest();
                setB.removeLowest();
            } else if(setALowest < setBLowest) {
                setC.insert(setALowest);
                setA.removeLowest();
            } else {
                setC.insert(setBLowest);
                setB.removeLowest();
            }
        }
        while (!setA.empty()) {
            setC.insert(setA.lowest());
            setA.removeLowest();
        }

        while (!setB.empty()) {
            setC.insert(setB.lowest());
            setB.removeLowest();
        }
    }

    public void intersection(OrderedSet setA, OrderedSet setB, OrderedSet setC) throws  SetIsEmpty {
        while (!setA.empty() && !setB.empty()) {
            int setALowest = setA.lowest();
            int setBLowest = setB.lowest();
            if(setALowest == setBLowest) {
                setC.insert(setALowest);
                setA.removeLowest();
                setB.removeLowest();
            } else if(setALowest < setBLowest) setA.removeLowest();
            else setB.removeLowest();
        }
    }

    public void difference(OrderedSet setA, OrderedSet setB, OrderedSet setC) throws SetIsEmpty {
        while (!setA.empty() && !setB.empty()) {
            int setALowest = setA.lowest();
            int setBLowest = setB.lowest();
            if(setALowest == setBLowest) {
                setA.removeLowest();
                setB.removeLowest();
            } else if (setALowest < setBLowest) {
                setC.insert(setALowest);
                setA.removeLowest();
            } else setB.removeLowest();
        }
        while (!setA.empty()) {
            setC.insert(setA.lowest());
            setA.removeLowest();
        }
    }

    public static void main(String arg[]) {
        try {

            SetOperation setOperation = new SetOperation();
            OrderedSet setA = new OrderedSet();

            setA.insert(1);
            setA.insert(2);
            setA.insert(3);
            setA.insert(4);
            setA.insert(5);

            OrderedSet setB = new OrderedSet();

            setB.insert(4);
            setB.insert(5);
            setB.insert(6);
            setB.insert(7);
            setB.insert(8);
            OrderedSet setC = new OrderedSet();

            // union Operation
            /*
            setOperation.union(setA, setB, setC);

            System.out.println("After Union");
            setC.traverse();
            System.out.println();
            */
                // Intersection Operation
            /*
            setOperation.intersection(setA, setB, setC);

            System.out.println("After Intersection");
            setC.traverse();
            System.out.println();

            */

            setOperation.difference(setA, setB, setC);

            System.out.println("After Difference");
            setC.traverse();
            System.out.println();


        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }


}

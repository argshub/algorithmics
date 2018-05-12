package DataStructures.Exceptions;

import DataStructures.Stacks.Stack;

/**
 * Created by xenonus on 7/26/2010.
 */
public class StackOverflow extends  DataStructuresExceptions {

    public StackOverflow(String message, int capacity) {
        super(message, capacity);
    }
}

package StackThroughArrayComposition;


public class StackArray {
    private Object stackArray[];
    final private int maxStackSize = 1024;
    private int current;

    public StackArray () {
        stackArray = new Object[maxStackSize];
        current = 0;
    }

    public Object getFirst() {return stackArray[current-1];}

    public void push (Object data) {
        if (current == maxStackSize) {
            return;//Ideally throw an exception here
        }
        stackArray[current++] = data;
    }

    public Object pop () {
        if (getFirst() == null) {
            return null;
        }

        Object removedObject = stackArray[--current];

        stackArray[current] = null;
        return removedObject;
    }

    public void isFull () {
        if (current == maxStackSize) {
            System.out.println("Stack array is full!");
        } else {
            int empty = maxStackSize -  current;
            System.out.format("Stack array is not full, there still are %d spaces available", empty);
        }
    }

    //Complete with a toString method and egt isFull checked  cause  i dont know what it should really do
}

package StackThroughListInheritance;
import List.List;



public class Stack extends List {
    public Stack() {
        super("Stack");
    }

    public void push(Object data) {
        insertAtFront(data);
    }

    public Object pop() {
        return removeFromFront();
    }

    @Override
    public void insertAtBack(Object data) {
        System.err.println("insertAtBack should not be called in Stack!");
    }

    @Override
    public Object removeFromBack() {
        System.err.println("removetAtBack should not be called in Stack!");
        return null;
    }
}

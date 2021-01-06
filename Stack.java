package StackThroughListComposition;
import List.List;


public class Stack {
    private List stackList;

    public Stack() {stackList = new  List("Stack");}

    public void push (Object data) {stackList.insertAtFront(data);}

    public Object pop () { return stackList.removeFromFront();}

    public Object getFirst ()  {return stackList.getFirst();}

    @Override
    public String toString () { return stackList.toString();}
}

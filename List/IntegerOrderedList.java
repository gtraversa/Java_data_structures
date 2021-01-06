package List;

public class IntegerOrderedList extends OrderedList{
    protected int compare(Object obj1, Object obj2) {return (Integer) obj1 - (Integer)obj2; }

    public IntegerOrderedList() {name = "Unnamed Integer ordered List";}
    public IntegerOrderedList(String listName) {firstNode = lastNode = null; name = listName;}
}

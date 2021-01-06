package List;

public class StringOrderedList extends OrderedList {
    protected int compare(Object obj1, Object obj2) {
        return ((String)obj1).compareTo((String)obj2);
    }

    public StringOrderedList() {name = "Unnamed String ordered List";}
    public StringOrderedList(String listName) {firstNode = lastNode = null; name = listName;}
}

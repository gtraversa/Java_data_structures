package List;

public class StudentRecordOrderedList extends OrderedList {
    protected int compare(Object student1, Object student2) {
        StudentRecord st1 = (StudentRecord)student1;
        StudentRecord st2 = (StudentRecord)student2;
        String alphOrdering1 = st1.surname + st1.name;
        String alphOrdering2 = st2.surname + st2.name;
        return alphOrdering1.compareTo(alphOrdering2);
    }

    @Override
    public String toString() {
        ListNode current = firstNode;
        String output = "";
        while (current != null) {
            output += current.data + "----------------------------\n";
            current = current.next;
        }
        return output;
    }

    public StudentRecordOrderedList() {name = "Unnamed Sudent record";}
    public StudentRecordOrderedList(String listName) {firstNode = lastNode = null; name = listName;}
}

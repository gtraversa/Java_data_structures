package List;

public class ListNode extends List {
    public Object data;
    public ListNode next;

    public ListNode(Object newData, ListNode newNext) {
        data = newData;
        next = newNext;
    }


    public ListNode(){
        data = null;
        next = null;
    }
}


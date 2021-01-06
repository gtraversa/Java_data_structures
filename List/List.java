package List;

public class List {
    protected ListNode firstNode;
    protected ListNode lastNode;
    protected String    name;

    public void insertAtFront (Object newData) {
        if (firstNode == null) {
            firstNode = lastNode = new ListNode(newData, null);
        } else {
            ListNode newFirstNode = new ListNode(newData, firstNode);
            firstNode = newFirstNode;
        }
    }


    public void insertAtBack (Object newData) {
        if (firstNode == null) {
            firstNode = lastNode = new ListNode(newData, null);
        } else {
            ListNode newLastNode = new ListNode(newData, null);
            lastNode.next = newLastNode;
            lastNode = newLastNode;
        }
    }

    public Object removeFromFront () {
        if (firstNode == null) {
            return null;
        }

        Object removedData = firstNode.data;

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.next;
        }
        return removedData;
    }

    public Object removeFromBack () {
        if (firstNode == null) {
            return null;
        }

        Object removedData = lastNode.data;

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode current = firstNode;
            while (current.next != lastNode) {
                current = current.next;
            }
            lastNode = current;
            current.next = null;
        }
        return removedData;
    }

    public ListNode getFirst () {
        return firstNode;
    }

    @Override
    public String toString () {
        String output;
        ListNode current = firstNode;

        output = name + ":";
        while (current != null) {
            output += " " + current.data;
            current = current.next;
        }
        return output;
    }

    public List (String listName) { firstNode = lastNode = null ; name = listName;}
    public List () {this("List");}
}

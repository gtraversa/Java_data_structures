package List;


public abstract class OrderedList extends List {
    protected abstract int compare(Object obj1, Object obj2);

    public ListNode find (Object newData) {
        if (firstNode == null) {
            return null;
        }
        else if (firstNode.next == null) {
            if (compare(firstNode.data, newData) == 0) {
                return firstNode;
            }
        }

        ListNode current = firstNode;

        while (current != null) {
            if (compare(current.data, newData) == 0) {
                return current;
            }
            current = current.next;
        }
        return null;
    }


    public boolean insert (Object newData) {
        ListNode ifFound = find(newData);
        if (ifFound != null) {
            return false;
        }

        if (firstNode == null) {
            firstNode = lastNode = new ListNode(newData, null);
            return true;
        }

        ListNode current = firstNode;
        ListNode prev;
        if (compare(current.data, newData) > 0) {
            firstNode = new ListNode(newData,current);
            return true;
        }
        while (current.next  != null){
            if (compare(current.data, newData) < 0) {
                if (compare(current.next.data, newData) >= 0) {
                    prev = current;
                    current = current.next;
                    prev.next = new ListNode(newData, current);
                    return true;
                }
                current = current.next;
            }
        }
        current.next = new ListNode(newData, null);
        return true;
    }


    public ListNode remove (Object remData) {
        ListNode retNode;

        if (firstNode == null) {
            return null;
        }
        else if (firstNode == lastNode) {
            if (compare(firstNode.data, remData) == 0) {
                retNode = firstNode;
                firstNode=lastNode=null;
                return retNode;
            }
        }

        ListNode current = firstNode;
        ListNode prev =  null;

        while (current != null) {
            if (compare(current.data, remData) == 0) {
                if(prev == null) {
                    retNode = current;
                    firstNode = current.next;
                    return retNode;
                }
                retNode = current;
                prev.next = current.next;
                return retNode;
            }
            prev = current;
            current = current.next;
        }
        return null;
    }

    @Override
    public void insertAtFront(Object newData) {
        System.out.println("insertAtFront should not be used on an ordered list!\n");
    }

    @Override
    public void insertAtBack(Object newData) {
        System.out.println("insertAtBack should not be used on an ordered list!\n");
    }
}
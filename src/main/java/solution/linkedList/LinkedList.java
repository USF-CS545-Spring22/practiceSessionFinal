package solution.linkedList;

public class LinkedList {
    private Node head, tail;

    /**
     * Constructor for class LinkedList
     */
    public LinkedList() {
        head = null;
        tail = null;
    }

    /** Creates a new node with the given element and adds it to the back of the list
     *
     * @param elem Element to append to the list
     */
    public void append(int elem) {
        Node newNode = new Node(elem);
        if (tail != null) {
            tail.setNext(newNode);
            tail = newNode;
        } else {
            head = tail = newNode;
        }

    }

    /** Return a linked list that contains elements from "this" list and listOther" in increasing order
     * @param listOther the second list
     * @return a sorted linked list
     */
    public LinkedList combineLists(LinkedList listOther) {
        LinkedList res = new LinkedList();
        Node curr1 = this.head;
        Node curr2 = listOther.head;

        while (curr1 != null || curr2 != null) {
            if (curr1 == null) { // no elements in list 1; list 2 has elements
                res.append(curr2.elem());
                curr2 = curr2.next();
            } else if (curr2 == null) { // no elements in list2; list1 has elements
                res.append(curr1.elem());
                curr1 = curr1.next();
            } else {
                // Add whichever one is smaller and advance the corresponding pointer
                if (curr1.elem() < curr2.elem()) {
                    res.append(curr1.elem());
                    curr1 = curr1.next();
                }
                else {
                    res.append(curr2.elem());
                    curr2 = curr2.next();
                }
            }
        }

        return res;
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.elem() + " ");
            curr = curr.next();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(4);
        list1.append(9);
        list1.print();

        LinkedList list2 = new LinkedList();
        list2.append(3);
        list2.append(8);
        list2.append(12);
        list2.append(18);
        list2.print();

        LinkedList res = list1.combineLists(list2);
        System.out.println("After combining the lists: ");
        res.print();
    }
}
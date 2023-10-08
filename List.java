public class List<T> {


    Node head;

    List() {
        head = null; }
    public void add(T d) {    // insert new node at the end of list.
        //cases: 1. if list is empty  2. if list has only one element  3. if list has more than one element
        Node current = null;
        Node n = new Node(d);
        if (head == null) {
            head = n;
        }
        else if (head.next == null) {
            current = head;
            head.next = n;
        }
        else if (head.next != null) {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
        }

    }


    public void remove(T d) {           // delete a node with data d (first occurrence)
        Node current = head;

        if (head.data.equals(d)) {                         //for first value
            head = head.next;
            return;  }

        while (current.next != null) {               //for middle and last value
            if (current.next.data.equals(d)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

}

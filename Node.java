class Node<T> {

    T data;
    Node next;

    Node() {
        data = null;
        next = null;
    }

    Node(T d) {
        data = d;
        next = null;
    }
}
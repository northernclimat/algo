public class DoublyLinkedList {
    Node head;

    // метод для добавления элемента в список
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null)
            head.prev = newNode;
        head = newNode;
    }

    // метод для разворота списка
    public void reverse() {
        Node temp = null;
        Node current = head;

        // меняем next и prev для всех узлов списка
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        // меняем голову списка
        if (temp != null) {
            head = temp.prev;
        }
    }

    // метод для сортировки пузырьком
    public void bubbleSort() {
        if (head == null)
            return;

        boolean swapped;
        Node ptr1;
        Node lptr = null;

        do {
            swapped = false;
            ptr1 = head;

            while (ptr1.next != lptr) {
                if (ptr1.data > ptr1.next.data) {
                    int temp = ptr1.data;
                    ptr1.data = ptr1.next.data;
                    ptr1.next.data = temp;

                    swapped = true;
                }
                ptr1 = ptr1.next;
            }
            lptr = ptr1;

        }
        while (swapped);
    }
}

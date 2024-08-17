public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.insertFirst(10);
        // list.insertAtIndex(2, 22);
        // list.removeAtIndex(2);
        list.show();

        System.out.println(list.size());
    }

    public static class Node {
        int data;
        Node next;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static class LinkedList {
        private Node head;
        private Node tail;
        private int size = 0;

        // public void insert(int data) {
        // Node node = new Node();
        // node.data = data;
        // node.next = null;

        // if (head == null) {
        // head = node;
        // } else {
        // Node n = head;
        // while (n.next != null) {
        // n = n.next;
        // }
        // n.next = node;
        // }
        // size++;
        // }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void show() {
            Node node = head;

            while (node.next != null) {
                System.out.print(" [ " + node.data + " ] -->");
                node = node.next;
                if (node.next == null) {
                    System.out.println(" [ " + node.data + " ]");
                    break;
                }
            }
        }

        public void insertFirst(int data) {
            Node node = new Node();
            node.data = data;
            node.next = null;
            node.next = head;
            head = node;

            if (tail == null)
                tail = head;

            size++;
        }

        public void insertLast(int data) {
            if (tail == null) {
                insertFirst(data);
                return;
            }

            Node node = new Node(data);
            tail.next = node;
            tail = node;
            size++;
        }

        public void insertAtIndex(int index, int data) {
            Node node = new Node();
            node.data = data;
            node.next = null;

            if (index == 0) {
                insertFirst(data);
                return;
            }

            if (index == size) {
                insertLast(data);
                return;
            }

            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;

            size++;
        }

        public void removeAtIndex(int index) {
            Node n = head;
            if (index == 0) {
                head = head.next;
            } else {
                for (int i = 0; i < index - 1; i++) {
                    n = n.next;
                }
                Node n1 = n.next;
                n.next = n1.next;
                System.out.println("Deleted element : " + n1.data);
                n1 = null;
            }
            size--;
        }

    }
}

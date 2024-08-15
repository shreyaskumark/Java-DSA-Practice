public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.Insert(20);
        list.Insert(30);
        list.Insert(40);
        list.Insert(50);
        list.insertAtStart(10);
        list.insertAtIndex(2, 22);
        list.remove(2);
        list.show();
    }

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;

        public void Insert(int data) {
            Node node = new Node();
            node.data = data;
            node.next = null;

            if (head == null) {
                head = node;
            } else {
                Node n = head;
                while (n.next != null) {
                    n = n.next;
                }
                n.next = node;
            }
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

        public void insertAtStart(int data) {
            Node node = new Node();
            node.data = data;
            node.next = null;
            node.next = head;
            head = node;
        }

        public void insertAtIndex(int index, int data) {
            Node node = new Node();
            node.data = data;
            node.next = null;

            if (index == 0) {
                insertAtStart(data);
            } else {
                Node n = head;
                for (int i = 0; i < index - 1; i++) {
                    n = n.next;
                }
                node.next = n.next;
                n.next = node;
            }
        }

        public void remove(int index) {
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
        }

    }
}

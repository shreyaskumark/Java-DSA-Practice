public class DoublyLinkedList {
    public static void main(String[] args) {
        LinkedListDoubly list = new LinkedListDoubly();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertAt(3, 6);
        list.deleteAt(3);
        list.Display();
    }
    
    public static class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public static class LinkedListDoubly{
        private Node head;
        private Node tail;
        private int size = 0;

        public int size(){
            return size;
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public Node getNode(int index){
            Node node = head;

            for(int i = 0;i < index - 1;i++){
                node = node.next;
            }
            
            return node;
        }

        public void insertFirst(int data){
            Node node = new Node(data);
            
            if( head == null){
                head = tail = node;
                return;
            }

            node.next = head;
            head.prev = node;
            head = node;
            size++;
        }

        public void insertLast(int data){
            Node node = new Node(data);
            
            if( tail == null){
                insertFirst(data);
                return;
            }

            tail.next = node;
            node.prev = tail;
            tail = node;
            size++;
        }

        public void insertAt(int index, int data){
            if(index == 0){
                insertFirst(data);
                return;
            }

            if(index == size){
                insertLast(data);
                return;
            }

            Node node = new Node(data);
            Node n = getNode(index);

            n.next.prev = node;   
            node.next = n.next;

            n.next = node;
            node.prev = n;                     

            size++;
        }

        public void deleteFirst(){
            if(size == 0)
                throw new RuntimeException("Empty List");
            
            if( head == tail){
                head = tail = null;
                return;
            }

            head = head.next;
            head.prev = null;
            size--;
        }

        public void deleteLast(){
            if(size == 0)
                throw new RuntimeException("Empty List");
            
            if( head == tail){
                head = tail = null;
                return;
            }

            tail = tail.prev;
            tail.next = null;

            size--;
        }

        public void deleteAt(int index){
            if(index == 0){
                deleteFirst();
                return;
            }

            if(index == size){
                deleteLast();
                return;
            }

            Node node = getNode(index);
            node.next = node.next.next;
            node.next.next.prev = node;

            size--;
        }

        public void Display(){
            Node node = head;

            while(node != null){
                System.out.print(node.data +" -> ");
                node = node.next;
            }
            System.out.println("End");
        }
    }
}

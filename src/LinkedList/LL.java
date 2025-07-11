package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }
    private class Node{
        private int value;
        Node next;
        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public Node insertRec(int val, int index){
        head = insertRec(head, index, val);
        return head;
    }

    public Node insertRec(Node node, int index, int val){
        if(index == 0){
            Node temp = new Node(val);
            temp.next = node;
            size++;
            return temp;

        }
        if(node == null){
            return null;
        }

        node.next = insertRec(node.next,index-1,val);
        return null;

    }

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size =+ 1;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);

        tail.next = node;
        tail = tail.next;
        size +=1;
    }

    public void insert(int val, int index){
        if(index == 0 ){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
        }

        Node temp = head;
        for(int i=1 ; i<index ; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size+=1;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for(int i=0 ; i<index; i++){
            node = node.next;
        }
        return node;
    }
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        int val = tail.value;
        Node secondNode= get(size-2);
        tail = secondNode;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index -1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
        System.out.print(temp.value + " -->");
        temp=temp.next;

    }
        System.out.println("END");
}}




public class Ll{
    public static class Node{
      int data;
      Node next;
      public Node(int data){
        this.data = data;
        this.next = null;
      }  
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        //newNode next = head
        newNode.next = head;//link

        //head = newNode
        head = newNode;

    }
    public void addLast(int data){
        //Create a newNode
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public int removeFirst(){
        if(size==0){
            System.out.println("Linked List is empty");
        } else if(size==1){
            int val = head.data;
            head=tail=null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("Linked List is empty");
        } else if(size==1){
            int val = tail.data;
            head=tail=null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        //recSearch = Recursive Search
        return helper(head,key);
    }
    public void reverseLL(){
        Node prev = null;
        Node curr = tail =  head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;  

    }
    public int remoneNthfromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while (i<iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return 0;

    }
    //Slow Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPallindrome(){
        if(head == null || head.next == null){
            return true;
        }

        // step1- find mid
        Node midNode = findMid(head);
        // step2- reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
        }
        Node right = prev;
        Node left = head;

        //step3: check left and right half
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public void printLL(){
        if(head == null){
            System.out.println("LinkedList is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    
    public static void main(String[] args) {
        Ll linkedll = new Ll();
      linkedll.addLast(1);
      linkedll.addLast(2);
      linkedll.addLast(1);
      linkedll.addLast(1);
    
      linkedll.printLL();
      System.out.println(linkedll.isPallindrome());
    }
}



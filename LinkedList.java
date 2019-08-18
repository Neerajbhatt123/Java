class LinkedList {

    Node begin=null,end=null;
    
    class Node{
        Node prev;
        int data;
        Node next;
        
        {
            this.next = this.prev = null;
        }
        
        Node( int value ){
            this.data = value;
        }        
        
    }

    void add( int value ){
        Node n = new Node(value);
        
        if( begin == null && end == null ){
            begin = n;
        }else{
            end.next = n;
            n.prev = end;
            
        }
        
        end = n;
    }
    
    void addAtBeginning( int value ){
        Node n = new Node(value);
        
        if( begin == null && end == null ){
            end = n;
        }else{
            begin.prev = n;
            n.next = begin;            
        }
        
        begin = n;
    }
    
    void display(){
        Node disp = begin;
        
        while( disp != null ){
            System.out.println(disp.data);
            disp = disp.next;
        }
    }
    
    void displayReverse(){
        Node disp = end;
        
        while( disp != null ){
            System.out.println(disp.data);
            disp = disp.prev;
        }
    }
    
    public LinkedList() {}
    
    public static void main(String[] args) {        
        LinkedList l = new LinkedList();
        
        l.addAtBeginning(4);
        l.addAtBeginning(2);
        l.addAtBeginning(1);
//        l.add(2);
//        l.add(4);
        
        System.out.println("Displaying forward:");
        l.display();
        System.out.println("Displaying reverse:");
        l.displayReverse();
        
        }
    }

class Node{
    int data;
    Node next;
}

interface StandardLinkedList{
    
    void add( int data );
    void read();
    void update( int index, int data );
    void updateAll( int oldValue, int newValue );
    void delete(int index);
    void deleteAll(int value);
    int size();
    int search(int value);
}

class LinkedList implements StandardLinkedList{
    
    Node start = null;
    int count=0;
    
    
    
    @Override
    public void add(int data ) {
        
        Node n = new Node();
        n.data = data;
        
        if( this.start == null )
            this.start = n;
        else{
            
            Node t = this.start;
            
            while(t.next != null) t = t.next;
            
            t.next = n;
            
        }
        
        this.count++;
        
    }

    
    
    @Override
    public void read() {
        
        if( this.start == null ){
            System.out.println("Nothing to Display!!");
        }
        else{
            
            Node t = this.start;
            
            while( t != null ){
                System.out.print( t.data + "\t");
                t = t.next;
            }
            
            System.out.println("");
            
        }
        
    }

    @Override
    public void update(int index, int data) {
        
        if(this.start != null && index >= 0 && index < this.size()){
            
            Node t = this.start;
            
            for( int i = 0 ; i < index ; i++ )t = t.next;
            
            t.data = data;
            
        }
        
    }

    @Override
    public void updateAll(int oldValue, int newValue) {
        
        if(this.start != null){
            
            Node t = this.start;
            
            while( t != null ){
                
                if( t.data == oldValue )
                    t.data = newValue;
            
                t = t.next;
            }
            
        }
        
    }

    @Override
    public void delete(int index) {
        if(this.start != null && index >= 0 && index < this.size()){
            
            if( index == 0 ){
                
                this.start = this.start.next;
                
                
                
            }
            else{
                
                Node t = this.start;
            
                for( int i = 0 ; i < index-1 ; i++ )t = t.next;
            
                t.next = t.next.next;
                
                
                
            }
        }
        
        this.count--;
        
    }

    @Override
    public void deleteAll(int value) {

        while( true ){
            
            int index = this.search(value);
            
            if( index == -1 )
                return;
            else
                this.delete(index);
            
        }
        
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public int search(int value) {
        
        int index = 0;
        
        if(this.start == null)
            return -1;
        else{
            
            Node t = this.start;
            
            while( t != null ){
                
                if( t.data == value )
                    return index;
            
                index++;
                
                t = t.next;
            }
            
            
        }
        
        return -1;
    }
    
    
}

public class MyLinkedList {

    public static void main(String[] args) {
    
        StandardLinkedList stdLinkedList = new LinkedList();
        
        
        System.out.println( stdLinkedList.search(160) );
    
        System.out.println( stdLinkedList.size() );
        
        stdLinkedList.add(10);
        stdLinkedList.add(20);
        stdLinkedList.add(30);
        
        System.out.println( stdLinkedList.size() );

        stdLinkedList.read();
        
        stdLinkedList.add(40);
        stdLinkedList.add(50);
        stdLinkedList.add(60);
        
        System.out.println( stdLinkedList.size() );

        stdLinkedList.read();
        
        System.out.println( stdLinkedList.search(160) );
        
        stdLinkedList.updateAll(40, 400);
        stdLinkedList.updateAll(30, 400);
        stdLinkedList.updateAll(400, 200);
        stdLinkedList.read();
        
        stdLinkedList.update(0, -10);
        stdLinkedList.read();
        
        
        stdLinkedList.deleteAll(200);
        stdLinkedList.read();
        
        stdLinkedList.delete(2);
        stdLinkedList.read();
        
    }
    
}
;
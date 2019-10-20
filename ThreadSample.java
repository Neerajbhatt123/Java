
package threadsample;

import java.util.*;
class Heart extends Thread{
    
    void beat(){
        while(true)
            System.out.println("Beating");
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(1000000000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
}

class Lungs implements Runnable{
    
    void breathe(){
        while(true){
            System.out.println("Breathing");
        }
    }

    @Override
    public void run() {
        breathe();
    }
    
}

public class ThreadSample {

    static void startThread( Thread t ){
        t.interrupt();
    }
    
    public static void main(String[] args) throws InterruptedException {
    
        Thread l = new Thread(new Lungs(),"Lungs");
        Thread h = new Heart();
        h.setName("Heart");
     
        System.out.println( h.getName() );
        System.out.println( l.getName() );
        
        h.start();        
        
        Thread.sleep(1000);
        
        startThread(h);
        
        
//        h.start();
//        l.start();
    
    }
    
}

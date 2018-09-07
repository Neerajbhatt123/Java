public class StringSample {

    public static void main(String[] args) {

        char ch [] = {'k','a','d','d','u'};

        String s = "daddudaddudaddudaddudaddudaddudaddudaddudaddudaddudaddudaddu";
        
        System.out.println( s.hashCode() );
        
        String s1 = "daddu";        
        
        String s2 = "kaddu";        
        
        System.out.println( s1.hashCode() );
        System.out.println( s2.hashCode() );
        
        System.out.println( s.charAt(0) );        
        
        System.out.println( s.charAt(0) );
        System.out.println( s.length() );
        
        System.out.println( s.substring(1) );
        System.out.println( s.substring(1,2) );
        
        System.out.println( s.contains("addu") );
        //System.out.println( s.indexOf("addu") );
        
        int index = 0;
        
        while( true ){
            if( s.indexOf("addu",index) == -1 )
                break;
            
            index = s.indexOf("addu",index) + 1;
            
            System.out.println( index - 1 );
        }
        
        System.out.println( String.join(",", "dhal","gaya","din") );
        
        String d = String.join(",", "dhal","gaya","din");
        
        for(String x: d.split(",")){
            System.out.println( x );
        }
        
        String g = "";
        
        System.out.println( g.isEmpty() );
        
        System.out.println("  aage peeche  ".trim());
        
        int i = 10;
        
        System.out.println( String.valueOf(i) );
        
        String s11="Sachin";  
        String s21="Sachin";  
        String s31=new String("Sachin");  
        System.out.println(s11==s21);//true (because both refer to same instance)  
        System.out.println(s11==s31);//false(because s3 refers to instance created in nonpool)  
        
        String s12="AA";  
        String s22="AB";  
        String s32="AC";  
        System.out.println(s12.compareTo(s22));//0  
        System.out.println(s12.compareTo(s32));//1(because s1>s3)  
        System.out.println(s32.compareTo(s12));//-1(because s3 < s1 )  
        
    }
    
}

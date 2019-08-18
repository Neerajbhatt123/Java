import org.apache.commons.lang.ArrayUtils;
import java.util.*;
import com.google.common.collect.ObjectArrays;
class ArrayAdd{
	public static void main(String[] args) {
		
		int[] ar={1,1,12,12,5,4,2};
		int[] ar1={12,121,0,1,24,04,05,54};
	    int [] combined = ArrayUtils.addAll(ar, ar1);
     
        System.out.println("First array : " + Arrays.toString(ar));
        System.out.println("Second array : " + Arrays.toString(ar1));
        System.out.println("Combined array : " + Arrays.toString(combined));

}
}
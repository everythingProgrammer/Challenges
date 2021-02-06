package feb_long;
import java.util.*;
public class FrogSort2 {
	
	
	public static int countMoves(int w[] , int r[]) {
		TreeMap<Integer, Integer> positions = new TreeMap<>();
		
		
		/*What weight frog jumps what positions*/
		HashMap<Integer,Integer> jumpsMap = new HashMap<>();
		for(int i = 0 ; i< w.length; i++) {
			jumpsMap.put(w[i], r[i]);
		}
		
		
		/*Now in the begining we will insert into positions 1,2,3,4... according to
		 * original positions in w
		 * 
		 * positions ->  weight*/
		for(int i = 0 ; i<w.length; i++) {
			positions.put(i+1, w[i]);
		}
		/*Now we have things in positions map*/
		
		/*Now we have to iterate over this TreeMap one by one and keep modifying 
		 * positions*/
		
		
		
		 Set set = positions.entrySet();
		 Iterator it = set.iterator();
		 
		 while(it.hasNext()) {
			 Map.Entry e1 = (Map.Entry)it.next();
//			 /*Here I have 1st elements */
			 if(it.hasNext()) {
				 Map.Entry e2 = (Map.Entry)it.next();
				 int pos = (int)e1.getKey();
				 if( (int) e1.getValue() > (int) e2.getValue()) {
					 /*Now we calculate next position to fit it in!!*/
					 /*and we also have to refresh the set and iterator...*/
					 
					   pos  = pos + jumpsMap.get(e1.getValue());
					 if(!positions.containsKey(pos)) {
						 /*Insert here in hashmap and delete original*/
					 }
					 else {
						 /*bring iterator here*/
					 }
				 }
				 else {
					 break;
				 }
				 
			 }
		 }
			 
//			 if(it.hasNext()) {
//				 Map.Entry e2 = (Map.Entry) it.next();
//				 if((int)e2.getValue() > (int) me.getValue() ) {
//					 break; 
//				 }
//				 else {
//					 int pos = (int) me.getKey()+ jumpsMap.get(me.getValue());
//					 
//					 while( positions.get(pos)>(int)me.getValue())
//						 pos+=(int)jumpsMap.get(me.getValue()); 
//					 positions.remove(me.getKey());
//					 positions.put((int)me.getKey(), pos );
//					 break;
//				 }
//			 }
//			 break; 
//		 }
		 
		
		
		
		
		System.out.println(positions);
		
		return 0;
	}
	
	
	public static void main(String args[]) {
		
		
		
		
		int arr[] = {3,1,2};
		int right[] = {1,4,5};
		countMoves(arr, right);
		
		
	}
	
	
}

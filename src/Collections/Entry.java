package Collections;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class Entry {

	public static void main(String[] args) {
		//int[] Array = {2,3,4};
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(2);
		ll.add(8);
		ll.add(32);
		ll.add(32);
		//ll.add(null);
		ll.add(35);
		
		ll.add(3,99);
		
		for(int i=0;i<ll.size();i++)
			{
			System.out.println("Elements in the List:" + ll.get(i));
			}
		
		Iterator<Integer> it = ll.iterator();
	//System.out.println(it.next());
	//System.out.println(it.next());
	//System.out.println(it.next());
		
//	while(it.hasNext())	
//	{
//		System.out.println("Elements in the List:" + it.next());
//	}
		
    Collections.sort(ll);
	for(int i=0;i<ll.size();i++)
	{
	System.out.println("Elements in the List:" + ll.get(i));
	}
    
	}

}

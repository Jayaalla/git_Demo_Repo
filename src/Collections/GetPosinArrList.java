package Collections;

import java.util.ArrayList;
import java.util.Iterator;


public class GetPosinArrList {

	public static void main(String[] args) {
		ArrayList<Element> eleList = new ArrayList<Element>();
		  eleList.add(new Element(40));
		  eleList.add(new Element(30));
		  eleList.add(new Element(10));
		  eleList.add(new Element(50));
		  
	Iterator<Element> it3 = eleList.iterator();
	while(it3.hasNext())
	{
		Element tempEle = it3.next();
		System.out.println("Element:" + tempEle.Id);
	}
	
	}	
}
		



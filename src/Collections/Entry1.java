package Collections;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class Entry1 {

	public static void main(String[] args) {
		
		LinkedList<Student> stuList = new LinkedList<>();
		  stuList.add(new Student("Jaya",40));
		  stuList.add(new Student("Sree",30));
		  stuList.add(new Student("Susmita",10));
		  stuList.add(new Student("Vineeta",50));
		  
	Iterator<Student> it3 = stuList.iterator();
	while(it3.hasNext())
	{
		Student tempStu = it3.next();
		System.out.println("Student:" + tempStu.Id+ " name is:" +tempStu.name);
	}
	
	Collections.sort(stuList);
	
	Iterator<Student> it4 = stuList.iterator();
	while(it4.hasNext())
	{
		Student tempStu = it4.next();
		System.out.println("1.Student:" + tempStu.Id+ " name is:" +tempStu.name);
	}
}
	
		
	}
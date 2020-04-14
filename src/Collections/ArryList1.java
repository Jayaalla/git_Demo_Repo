package Collections;

import java.util.ArrayList;

public class ArryList1 {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		aList.add("Jaya");
        aList.add("Sree");
        aList.add("Lakshmi");
        aList.add("Geetha");
        System.out.println(aList);
        System.out.print("The position of sree in ArrayList is ");
        System.out.println(aList.indexOf("Sree"));
	}

}

package Assignments;
/*	to replace each substring of a given string that matches the given 
regular expression 	with the given replacement 
String: "Dog chases cat, Cat chases rat". Note: Replace 'cat' with 'rat'*/
public class AssigS5Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="Dog chases cat, cat chases rat";
	String searchStr1 = "cat";
	//System.out.println(str.contains(searchStr1));
	String searchStr2 = "rat";
	//System.out.println(str.contains(searchStr2));
    searchStr1 = searchStr2;
    System.out.println(searchStr1);
    System.out.println(str);
	}
	

}

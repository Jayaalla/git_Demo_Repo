package SeleniumPrerequisiteAssignment;

//Reverse words in string 
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name is Jayasree";
		String str1="";
			String words[] = str.split(" ");
			for(int i=0; i<words.length; i++) {
			System.out.print(words[i] + " ");
			}
			System.out.println();
			for(int i=words.length-1; i>=0; i--) 
			{
			str1 = str1 + words[i] + " ";
			}
			System.out.print(str1);
	}
}
	
	

		

	


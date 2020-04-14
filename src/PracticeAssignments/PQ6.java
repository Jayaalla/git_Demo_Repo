package PracticeAssignments;
//Reverse the content of the sentence without using reverse keyword
//--Input  Hi I am Jayasree  output eersayaJ ma I iH
public class PQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sInput = "Hi I am Jayasree";
		char[] cInput = sInput.toCharArray();
		for(int i=(cInput.length-1); i>=0; i--)
		{
			System.out.print(cInput[i]);
		}
		

	}

}

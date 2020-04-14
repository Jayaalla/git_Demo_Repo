package PracticeAssignments;
//Reverse the content of the sentence without using reverse keyword
//1--Input  Hi I am Jayasree  output Jayasree am I Hi
//2--Input  Hi I am Jayasree  output eersayaJ ma I iH
public class PQ5 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	      String sInput = "I am Jayasree";
	      String[] sArrInput=sInput.split(" ");
	      /*for(String str:sArrInput);
	      		System.out.println(str);*/
	      for(int i=(sArrInput.length-1);i>=0; i--)
	      {
	    	 // System.out.print(sArrInput[i]+" ");
	    	 char[] temp = sArrInput[i].toCharArray();
	    	  System.out.print("\n");
	      for(int j=temp.length-1; j>=0; j--) 
	      {
	    	    System.out.print(temp[j]);
	      }
	      }
	}

}	
	
	   
   
	


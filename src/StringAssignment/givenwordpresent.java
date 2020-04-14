package StringAssignment;
//given word is present in a given string.
//!String = "this is me doing qa automation testing" Word="qa" 
 class IWP
 {
//function that returns true if word is present	 
 static boolean isWordPresent(String sentence, String word)
 {
 //to break the string into word
 String[] str = sentence.split(" ");
 //to temporarily store each individual word
 for(String temp :str)
 {
	 //compare current word with each word to be searched
   if(temp.compareTo(word) == 0)
   {
	   return true;
   }
 }
 return false;
 }
 
 	public static void main(String[] args) {
	
	String str = "this is me dooing qa automation";	
	String word = "qa";
	if (isWordPresent(str,word))
			System.out.println("yes");
		else
		System.out.println("No");	
	}
	
	}
 
 

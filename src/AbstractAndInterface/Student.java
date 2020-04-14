package AbstractAndInterface;

public class Student implements IDance,ISpotrs{
 
		public void Activity() {
    	 System.out.println("I have implemented my own activity");
    	 System.out.println("I can play both sports and dance");
    	 System.out.println("I can play only sports ");
     }
		
		public void Cricket() {
		 System.out.println("I cam play cricket");
		 System.out.println(IDance.sBranchName);
		 System.out.println(ISpotrs.sBranchName);
	}
		
}


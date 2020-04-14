package PracticeAssignments;

//find the firstbig,secondbig,thirdbig
public class PQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numArray[] = {10,40,20,50,30};
		int firstbig = 0;
		int secondbig = 0;
		int thirdbig = 0;
				for(int i=0;i <numArray.length; i++);{
				int i;
				if(firstbig<numArray[i]) {
				secondbig = firstbig;
				firstbig = numArray[i];
			}else if (secondbig < numArray[i]) {
				thirdbig = secondbig;
				secondbig = numArray[i];
			}else if (thirdbig <numArray[i]){
					thirdbig = numArray[i];
			}
				}
				System.out.println(thirdbig);
		
		}
			
		}



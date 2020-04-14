package SeleniumPrerequisiteAssignment;
//Program to find first big,second big and third biggest number
public class Q3{
	public static void main(String[] args) {
		int numArray[] = {10,30,0,20,50,40};
		int firstbig = 0;
		int secondbig = 0;
		int thirdbig = 0;
				for(int i=0; i<numArray.length;i++) {
			if(firstbig < numArray[i]) {
				secondbig = firstbig;
				firstbig = numArray[i];
			}else if (secondbig < numArray[i]) {
				thirdbig = secondbig;
			secondbig = numArray[i];
		}else if (thirdbig < numArray[i]) {
			thirdbig = numArray[i];
		}
		
		}
		
 System.out.println("The First big number is "+firstbig+" and the second big number is "+secondbig+ "and the third biggest number is " +thirdbig);
	}
}

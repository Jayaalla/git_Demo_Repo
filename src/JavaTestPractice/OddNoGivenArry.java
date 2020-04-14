package JavaTestPractice;
//Given an array of integers, print only odd numbers array[]={3,8,6,14,5,17,19} 

public class OddNoGivenArry {

	public static void main(String[] args) {
		int Arry[] = {3,8,6,14,5,17,19};
		System.out.print("The Odd Numbers in the array are:\n");	
		for(int i=0;i<Arry.length;i++)
		{
			if(Arry[i] % 2 != 0)
			{
				System.out.println(Arry[i]);
						
							
			}
				
		}
	}	
}
	



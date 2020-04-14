package Assignments;
/*program to find the average score of two students in three papers.
NOTE: Given, score of first student is 60, 55 and 70 
while score of the second student is 80, 60 and 41.
i.e. int[][] score = { {60, 55, 70}, {80, 60, 41} };  
*/
public class AssigS4Q2  {

	public static void main(double[][] args) {
				// TODO Auto-generated method stub
	int score[][] = {{60,55,70},{80,60,41}};
	//int sum = 0;
	double Avg = 0;
	double sum=0;
	int count = 0;
	for(int i=0; i<score.length; i++)
	{
		for(int j=0; j<=score.length; j++)
		{
			sum +=  score[i][j];
			count++;
		}
		//return sum	;
		}
		
	 return sum;
	}
}


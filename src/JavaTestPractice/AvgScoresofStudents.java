package JavaTestPractice;

public class AvgScoresofStudents {

	public static void main(String[] args) {
		int[][] score = {{60,55,70},{80,60,41}};
		int temp = 0;
		double sum[] = new double[3];
		for(int i =0; i<score.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				temp = temp+score[i][j];
			}
        sum[i]=temp;
        temp = 0;
     }
	System.out.println("The average of 1st student:"+sum[0]/3);
	System.out.println("The average of 2nd student:"+sum[1]/3);
		}
}


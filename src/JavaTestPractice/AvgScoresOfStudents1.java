package JavaTestPractice;

public class AvgScoresOfStudents1 {
	
	static void average(int score[]) {
		float sum = 0;
		for(int marks:score)
		{
			sum = sum+marks;
		}
		System.out.println("Average of student: " +(sum/score.length));
	}
	

	public static void main(String[] args) {
		int arr[][]= {{60,55,70},{80,60,41}};
		average(arr[0]);
		average(arr[1]);

	}

}

package Assignments;

public class AssigS42{
    int[][] num = {{60,55,70},{80,60,41}};
   
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[][] scope = {{60,55,70},{80,60,41}};
		 int[][] num = {{60,55,70},{80,60,41}};
		int total = sum(num);
   System.out.println(total);
	}
	
	public static int sum(int[][] score){
				int total = 0;
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score.length; j++) {
				total += score[i][j];
						
			}
			}
	return total;
	}
}
    
	
	
	
	
	
	
	

	
	
	
package JavaTestPractice;

 class Overriding {
	 public int SpeedLimit()
	 {
		 return 100;
	 }
 }
class car extends Overriding
{
	public int SpeedLimit()
	{
		return 150;
	}
public static void main(String[] args) {
		
      Overriding obj = new car();
      int num = obj.SpeedLimit();
      System.out.println("SpeedLimit is:" +num);
	}

}

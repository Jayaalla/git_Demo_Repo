package AbstractAndInterface;

interface flight {
     void takeoff();
     void takedown();
}  

public  class Boeing implements flight{
	
	public void takeoff() {
		System.out.println("implemented Boeing takeoff");
	}
	public void takedown() {
		System.out.println("implemented Boeing takedown");
		
}
	
}












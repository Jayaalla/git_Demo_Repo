package AbstractAndInterface;

public class Airplane {

	public static void main(String[] args) {
		Boeing b = new Boeing();
		b.takeoff();
		b.takedown();
		Airbus a = new Airbus();
		a.takeoff();
		a.takedown();

	}
	
}

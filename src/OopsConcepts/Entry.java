package OopsConcepts;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Car c1 = new Car();
	Car c2 = new Car();

	c1.colour = "Gray";
	c2.colour = "white";
	
	c1.maxSpeed = 120;
	c2.maxSpeed = 90;
	c1.sModelName = "Audi Q7";
	c2.sModelName = "Audi Q5";
	
	c1.fueltype = "desiel";
	System.out.println("colour1 : "+c1.colour+"\tMaxSpeed: "+c1.maxSpeed+"\tModelName: "
	+c1.sModelName+"::"+c1.fueltype);
	System.out.println("colour2 : "+c2.colour+"\tMaxSpeed: "+c2.maxSpeed+"\tModelName: "
	+c2.sModelName+"::"+c2.fueltype);
	c2.maxSpeed = 150;
	c2.fueltype ="petrol";
	
	System.out.println("***************");
	System.out.println("colour1 : "+c1.colour+"\tMaxSpeed: "+c1.maxSpeed+"\tModelName: "
			+c1.sModelName+"::"+c1.fueltype);
			System.out.println("colour2 : "+c2.colour+"\tMaxSpeed: "+c2.maxSpeed+"\tModelName: "
			+c2.sModelName+"::"+c2.fueltype);
	
	c1.SpecialFeature();
	c2.SpecialFeature();
	
	}
}
	

	
	
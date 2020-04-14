package Overidding;

public class Human{
	public void eat()
	{
		System.out.println("Human is eating");
	}
	class Boy extends Human{
	public void eat() {
		System.out.println("Boy is eating");
	}
		
	}
class Human1{
	public  void main(String[] args) {
		   Boy obj1 = new Boy();
	    obj1.eat();
	}
}
}
	



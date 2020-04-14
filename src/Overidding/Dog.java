package Overidding;

public class Dog extends Animal {

	public void animalSounds( ) {
		//super.animalSounds();//refers to object of the immediate parent class
		System.out.println("Dog says Bow Bow");
	}

}

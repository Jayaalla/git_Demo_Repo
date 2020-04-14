package Overidding;

public class Entry {

	public static void main(String[] args) {
		
//Overriding is done in parent to child class
//Overloading is done in same class		
		Animal a = new Animal();
		//a.animalSounds();
		MakeSound(a);
		Dog d = new Dog();
		//d.animalSounds();
		MakeSound(d);
		Pig p = new Pig();
		//p.animalSounds();
		MakeSound(p);
		
		Animal a1 = new Pig();
		a1.animalSounds();

	}

	private static void MakeSound(Animal a) {
	  a.animalSounds();
		
		
	}

}

package PassbyValuePassByReference;

public class Entry {

	public static void main(String[] args) {
	  //pass by value
		Tree t = new Tree();
		int i = 10;
		t.method1(i);
		System.out.println(i);

	//	pass by reference
		Fruit f = new Fruit();
		f.color = "Red";
		t.method2(f);
		System.out.println(f.color);
		
		
	}

}

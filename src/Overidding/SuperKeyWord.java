package Overidding;

class SuperKeyWord {

	public void eat() {
		System.out.println("eating");
	}
class Dog extends SuperKeyWord {	
  public void eat() {
	  System.out.println("eating bread");
  }
	public void bark() {
	   System.out.println("barking");
   }
   public void work() {
	   super.eat();
	   bark();
   }
	}
class SuperTest{
	public void main(String args[]) {
	Dog d = new Dog();
	d.work();
}
}}


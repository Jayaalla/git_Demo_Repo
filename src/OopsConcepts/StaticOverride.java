package OopsConcepts;
/*Can we override static method in JAVA?
 * No , you cannot override static method in JAVA because method overriding in JAVA 
 * because method overriding is based upon dynamic binding at runtime and 
 * static method comes at compile time
 */
public class StaticOverride {

	public static void main(String[] args) {
	
    screen  scrn = new ColourScreen();
	//If we can override static, this should call method from chid class
	scrn.show();
	//will show warning,
	//static method should be called from classroom
}
}

	class screen{
  //public static method which cannot be overridden in JAVA
	public static void show() {
	System.out.println("static method from parent class")	;
	}
}
	
   class ColourScreen extends screen {
/*Static method of same name signature as existed in super class, 
 * this is not method overriding instead this is called method hiding in JAVA*/	   
   public static void show() {
	   System.err.println("overridden static method in child class in JAVA");
   }
   }
	
	
	
	
package AccessModifier;

class Private {
	private int data=40;
	private void msg() {
		System.out.println("Hello Java");
	}
}
public class Simple{
	public static void main(String args[])
	{
		Private obj = new Private();
		System.out.println(obj.data);
		obj.msg();
		
	}
}

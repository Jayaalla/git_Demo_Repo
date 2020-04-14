package OopsConcepts;

public class OverLoad {

	public int add(int a, int b) {
		return a+b;
		}
	public double add(double a, double b) {
		return a+b;
		}
	
// 1.No. of parameters	
	public int add(int a, int b, int c) {
		return a+b;
		}
	public double add(double a, double b, double c) {
		return a+b;
		}
	
//  2.  Data types of parameters
	public float add(int a,  float b) {
		return a+b;
		}
	public float add(float a, int b) {
		return a+b;
		}
//	3.Sequence of data type parameters
	public float add(float a, int b, int c) {
		return a+b;
		}

}

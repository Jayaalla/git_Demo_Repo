package OopsConcepts;
/*Write a program to print the names of students by creating a Student class.
 *  If no name is passed while creating an object of Student class, 
 *  then the name should be "Unknown", otherwise the name should be equal 
 *  to the String value passed while creating object of Student class.
 */
class Student {
    
    Student(){
    	System.out.println("unknown");
    }	

   Student(String s){
	System.out.println(s);
}

	public static void main(String[] args) {
	      Student s1 = new Student();
	      Student s2 = new Student("Jayasree");
	}      

}
   
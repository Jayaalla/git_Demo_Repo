package OopsConcepts;
/*Create a class named 'Programming'. 
 * While creating an object of the class, if nothing is passed to it, 
 * then the message "I love programming languages" should be printed. 
 * If some String is passed to it, then in place of "programming languages"
 * the name of that String variable should be printed. 
 */

 class programming {
	programming(){
		System.out.println("I love programming");
	}
 	programming(String s){
	System.out.println(s);
}

	public static void main(String[] args) {
		programming pro = new programming();
		programming prog = new programming("programming language");

	}

}

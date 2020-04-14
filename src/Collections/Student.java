package Collections;

public class Student implements Comparable<Student>{
	public String name;
	public int Id;

	Student(String name,int Id)
	{
		this.name = name;
		this.Id = Id;
	}

	@Override
	public int compareTo(Student s){
	return this.name.compareTo(s.name);
	}
	

}

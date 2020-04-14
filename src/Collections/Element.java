package Collections;


	public class Element implements Comparable<Element>{
		
		public int Id;

	Element(int Id)
		{
			
			this.Id = Id;
		}

		
		public int compareTo(Element e){
			return this.Id - e.Id;
		}
		

	}
	



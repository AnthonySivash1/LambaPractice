package Unit1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
interface Condition
{
	//void abc();
	 boolean show(Person p) ;
		
	
}


	
	

public class Interview
{
	public static void main(String[]args)
	{
		List<Person> people=Arrays.asList(
				new Person("Bob","Myer",44),
				new Person("god","Sia",34),
				new Person("der","Dear",24),
				new Person("Yo","Mye",14),
				new Person("Bab","Ayer",4)
				);
		//sort a list by last name
		Collections.sort(people,new Comparator<Person>()
				
				{
					@Override
					public int compare(Person o1, Person o2) 
					{
						return o1.getLastName().compareTo(o2.getLastName());
					}
			        
				});
		printAll(people);
		printConditional(people, new Condition(){

			@Override
			public boolean show(Person p) {
				// TODO Auto-generated method stub
				return p.getLastName().startsWith("M");
			}
			
		});
	}
     
	private static void printConditional(List<Person> people, Condition condition) {
		for(Person p:people)
		{
			if(condition.show(p))
			{
			System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		for(Person p:people)
		{
			System.out.println(p);
		}
		
	}
}



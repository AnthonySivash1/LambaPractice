package Unit1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;



public class Interview2 {
	
	public static void main(String[]args)
	{
		List<Person> people=Arrays.asList(
				new Person("Bob","Myer",44),
				new Person("god","Sia",34),
				new Person("der","Dear",24),
				new Person("Yo","Mye",14),
				new Person("Bab","Ayer",4)
				);
		//startt list by last name
		Collections.sort(people, (p,p1)->p.getLastName().compareTo(p1.getLastName()));
		printConditional(people, p->true);
		
		System.out.println("fin fun fun");
		printConditional(people, (p)->p.getLastName().startsWith("M"));
		
	}

	private static void printConditional(List<Person> people, Predicate<Person> condition) {
		for(Person p:people)
		{
			if(condition.test(p))
			System.out.println(p);
			
		}
		
	}

}

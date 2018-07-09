package Unit2;
interface Process
{
	void process(int i);
}
public class Closure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		test(a,i->System.out.println(i+b));
		
	}
		
	public static void test(int i, Process p)
	{
		p.process(i);
	}

}

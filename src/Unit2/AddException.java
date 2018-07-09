package Unit2;

import java.util.function.BiConsumer;

public class AddException {

	public static void main(String[] args) {
		int[]arr={1,2,3,4};
		int key=2;
		addTwonumbers(arr,key,wrapperLamba((k,v)->System.out.println(k/v)));

	}

	private static BiConsumer<Integer, Integer> wrapperLamba(BiConsumer<Integer, Integer>consumer) {
		// TODO Auto-generated method stub
		return (v,k)->
		{
			try
			{
		consumer.accept(v, k);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exception caught");
			}
		};
	}

	private static void addTwonumbers(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {
		
		for(int i:arr)
		{
			consumer.accept(i, key);
		}
	}

}

package genericsDemo;

public class Generics {
	
	public static void findMax(Integer[] intArray)
	{
		Integer max = intArray[0];
		for(Integer element: intArray)
		{
			if(element.compareTo(max)>0)
				max = element;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
				
		Integer intArray[] = {25, 10, 13};
		findMax(intArray);
		Integer intArray1[] = {25, 35, 13};
		findMax(intArray1);
		Integer intArray2[] = {25, 10, 50};
		findMax(intArray2);
	}

}


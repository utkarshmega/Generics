package genericsDemo;

public class Generics {
	
	public static <T extends Comparable<T>> void findMax(T[] inpArray)
	{
		T max = inpArray[0];
		for(T element: inpArray)
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
		Float floatArray1[] = {10.30f, 8.30f, 4.12f};
		findMax(floatArray1);
		Float floatArray2[] = {10.30f, 18.30f, 4.12f};
		findMax(floatArray2);
		Float floatArray3[] = {10.30f, 8.30f, 24.12f};
		findMax(floatArray3);
		String stringArray1[] = {"Peach", "Apple", "Banana"};
		findMax(stringArray1);
		String stringArray2[] = {"Apple", "Peach", "Banana"};
		findMax(stringArray2);
		String stringArray3[] = {"Apple", "Banana", "Peach"};
		findMax(stringArray3);
	}

}


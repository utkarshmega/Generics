package genericsDemo;

public class Generics <T extends Comparable<T>> {
	
//	T a, b, c;
//	public Generics(T a, T b, T c)
//	{
//		this.a = a;
//		this.b = b;
//		this.c = c;
//	}
//	public <T> void findMax() {
//		return Generics.findMax(a, b, c);
//	}
	
	public static <T extends Comparable<T>> void findMax(T a, T b, T c)
	{
		T max = a;
		if(b.compareTo(max)>0)
			max = b;
		if(c.compareTo(max)>0)
			max = c;
		System.out.println(max);
	}
	public static void main(String[] args) {
				

		Integer int_a=25, int_b = 40, int_c = 30;
		Generics.findMax(int_a, int_b, int_c);
		Float float_a = 25.13f, float_b = 40.15f, float_c = 30.45f;
		Generics.findMax(float_a, float_b, float_c);
		String str_a = "Apple", str_b = "Peach", str_c = "Banana";
		Generics.findMax(str_a, str_b, str_c);
		
	}

}


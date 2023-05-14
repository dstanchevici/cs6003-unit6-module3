public class StaticExample {

	static double x;

	static void printx ()
	{
		System.out.println ("x= " + x);
	}

	public static void main (String[] argv)
	{
		x = 5.34;
		printx ();
	}
}
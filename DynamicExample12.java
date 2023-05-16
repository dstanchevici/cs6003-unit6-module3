class ObjX12 {

    int i;
    String name;

    // Constructors
    public ObjX12 (String initialName)
    {
        name = initialName;
        i = 0;
    }

    public ObjX12 (String initialName, int ID)
    {
        name = initialName;
        i = ID;
    }

    public String toString ()
    {
        return "My name is " + name + ", and my ID number is " + i + ".";
    }
} // End of "ObjX12" class


public class DynamicExample12 {

    public static void main (String[] argv)
    {
        /*
        // Will not compile
        ObjX12 x = new ObjX12 ();
        x.i = 5;
        x.name = "Ms. X";
        System.out.println (x);
        */

        ObjX12 x = new ObjX12 ("Ms.X");
        System.out.println (x);

        x = new ObjX12 ("Ms. X", 5);
        System.out.println (x);
    }


}
// NOTE: I use "ObjX4" instead of "ObjX"
// b/c "ObjX" is used in "StaticExample2."

class ObjX4 {

    int i;

    void print ()
    {
        System.out.println ("i=" + i);
    }
}

public class DynamicExample4 {

    public static void main (String[] arv)
    {
        ObjX4 x = new ObjX4 ();
        x.i = 5;
        x.print();

        ObjX4 x2 = new ObjX4 ();
        x2.i = 6;
        x2.print();
    }
}

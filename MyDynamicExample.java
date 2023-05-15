// NOTE: I use "ObjX3" instead of "ObjX"
// b/c "ObjX" is used in "StaticExample2."

class ObjX3 {

    int i;
    int j;

    void print ()
    {
        System.out.println ("i="+i + " j="+j);
    }
}

public class MyDynamicExample {

    public static void main (String[] argv)
    {
        ObjX3 x = new ObjX3 ();

        x.i = 5;
        x.j = 6;
        x.print ();
    }
}

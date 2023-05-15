// NOTE: I use "ObjX2" instead of "ObjX"
// b/c "ObjX" is used in "StaticExample2."

class ObjX2 {

    static int i;

    static void print ()
    {
        System.out.println ("i = " + i);
    }
}

public class StaticExample3 {

    public static void main (String[] argv)
    {
        ObjX2.i = 5;

        ObjX2.print();
    }
}


class ObjX6 {

    int i;

    void print ()
    {
        System.out.println ("i=" + i);
    }
}

public class DynamicExample6 {

    public static void main (String[] argv)
    {
        ObjX6 x = new ObjX6 ();
        x.i = 5;

        ObjX6 x2 = x;
        x2.i = 6;

        x.print();
        x2.print();
    }
}
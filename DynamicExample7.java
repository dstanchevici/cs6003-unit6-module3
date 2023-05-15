class ObjX7 {

    int i;

    void print ()
    {
        System.out.println ("i=" + i);
    }
}

public class DynamicExample7 {

    public static void main (String[] argv)
    {
        ObjX7 x = makeAnObject();

        printTheObject (x);
    }

    static ObjX7 makeAnObject ()
    {
        ObjX7 obj = new ObjX7 ();
        obj.i = 5;
        return obj;
    }

    static void printTheObject (ObjX7 obj)
    {
        obj.print();
    }
}
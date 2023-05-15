class ObjX8 {

    int i;

    void print ()
    {
        System.out.println ("i=" + i);
    }
}

class ObjY {

    String name;
}

public class DynamicExample8 {

    public static void main (String[] argv)
    {
        ObjX8 x = new ObjX8 ();
        x.i = 5;

        ObjY y = new ObjY ();
        y.name = "Mr. Y";
    }
}

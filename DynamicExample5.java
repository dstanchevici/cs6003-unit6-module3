// NOTE: I use "ObjX5" instead of "ObjX"
// b/c "ObjX" is used in "StaticExample2."

class ObjX5 {

    int i;

    void print ()
    {
        System.out.println ("i=" + i);
    }
}

public class DynamicExample5 {

    public static void main (String[] argv)
    {
        ObjX5[] xArray = new ObjX5 [4];

        for (int k=0; k < 4; k++) {
            xArray[k] = new ObjX5 ();
        }

        xArray[0].i = 5;
        xArray[1].i = 6;

        for (int k=0; k < 4; k++) {
            xArray[k].print();
        }
    }
}

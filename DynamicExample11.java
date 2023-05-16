class ObjX11 {

    int i;
/*
    public String toString ()
    {
        String s = "i=" + i;
        return s;
    }

 */
}

public class DynamicExample11 {

    public static void main (String[] argv)
    {
        ObjX11 x = new ObjX11 ();
        x.i = 5;

        System.out.println (x);

        String outputStr = "Objtc x: " + x;
        System.out.println (outputStr);
    }
}
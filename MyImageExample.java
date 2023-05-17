public class MyImageExample {

    public static void main (String[] argv)
    {
        MyImage image = new MyImage ("Capitol1814.jpg", "Capitol", false);
        System.out.println (image);
        System.out.println (image.averagePixelIntensity());
        image.show ();

        MyImage image2 = new MyImage ("JeffMem.jpg", "Jefferson Memorial", true);
        System.out.println (image2);
        System.out.println (image2.averagePixelIntensity());
        image2.show ();
    }
}
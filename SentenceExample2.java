public class SentenceExample2 {

    public static void main (String[] argv)
    {
        Sentence s = new Sentence ();
        s.set ("Was it a rat I saw?");
        System.out.println (s);

        s = new Sentence ("Madam, in Eden, I'm Adam");
        System.out.println (s);
    }
}
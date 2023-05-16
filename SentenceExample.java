public class SentenceExample {

    public static void main (String[] argv)
    {
        Sentence s = new Sentence ();

        // Mutator (setter?)
        s.set ("Was it a rat I saw?");

        System.out.println ("Length=" + s.length() + " #letters=" + s.countLetters());

        // toString()
        System.out.println (s);

        // Accessor and another method:
        System.out.println ("Is \"" + s.get() + "\" a palindrome? " + s.isPalindrome());
    }
}
public class SentenceExample3 {

    public static void main (String[] argv)
    {
        Sentence s = new Sentence ("Eleven. Plus two");
        System.out.println ("Letters:[" + s.getLetters() + "] sorted:[" + s.getLettersSorted() + "]");
        Sentence s2 = new Sentence ("Twelve plus one!");
        System.out.println ("Anagram? " + s.isAnagram(s2));
    }
}
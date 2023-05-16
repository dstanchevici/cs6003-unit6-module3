import java.util.*;

class Sentence {

    private String sentence;

    // constructors

    public Sentence (String s)
    {
        sentence = s; // Initialized with the parameter
    }

    public Sentence ()
    {
        // No action
        // Initialized thru set (String s)
    }
    public void set (String s)
    {
        sentence = s;
    }

    public String get ()
    {
        if (sentence == null){
            System.out.println ("ERROR in Sentence.length(): No sentence set");
            return "@";
        }

        return sentence;
    }

    public int length ()
    {
        if (sentence == null){
            System.out.println ("ERROR in Sentence.length(): No sentence set");
            return -1;
        }

        return sentence.length();
    }

    public int countLetters ()
    {
        if (sentence == null){
            System.out.println ("ERROR in Sentence.length(): No sentence set");
            return -1;
        }

        int letterCnt = 0;
        char[] characters = sentence.toCharArray ();
        for (char c: characters){
            if (Character.isLetter(c)) {
                letterCnt ++;
            }
        }
        return letterCnt;
    }

    public String toString ()
    {
        if (sentence == null){
            System.out.println ("ERROR in Sentence.length(): No sentence set");
            return "@";
        }

        return ("Sentence: [" + sentence + "] length=" + length() + " #letters=" + countLetters());
    }

    public boolean isPalindrome ()
    {
        char[] allChars = sentence.toCharArray ();

        ArrayList<Character> lowerCaseLetters = new ArrayList<>();
        for (char c: allChars) {
            if (Character.isLetter(c)) {
                lowerCaseLetters.add (Character.toLowerCase(c));
            }
        }

        Stack<Character> stack = new Stack<>();
        int mid = lowerCaseLetters.size() / 2;
        for (int i=0; i<mid; i++) {
            stack.push (lowerCaseLetters.get(i));
        }

        if (lowerCaseLetters.size() % 2 != 0) {
            mid += 1;
        }
        for (int i=mid; i<lowerCaseLetters.size(); i++) {
            char c = stack.pop ();
            if (lowerCaseLetters.get(i) != c) {
                return false;
            }
        }
        return true;
    }

    public String getLetters ()
    {
        if (sentence == null){
            System.out.println ("ERROR in Sentence.length(): No sentence set");
            return "@";
        }

        String letters = "";
        for (int i=0; i<length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetter(c)) {
                letters += Character.toLowerCase(c);
            }
        }
        return letters;
    }

    public String getLettersSorted ()
    {
        char[] chars = getLetters().toCharArray();
        Arrays.sort (chars);

        return String.copyValueOf(chars);
    }

    public boolean isAnagram (Sentence other)
    {
        String thisSentence = getLettersSorted ();
        String otherSentence = other.getLettersSorted ();

        if (thisSentence.equals(otherSentence)) {
            return true;
        }
        return false;
    }
}
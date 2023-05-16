import java.util.*;

class Sentence {

    private String sentence;

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
}
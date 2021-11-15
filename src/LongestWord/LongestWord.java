package LongestWord;

import java.util.Arrays;

class LongestWord {
    static void main(String[] args) {
        String text = "everasdfadfsdfs are the best!!!!!!!!!!!! CodeFighter !";
        System.out.println(longestWord(text));
    }
    static String longestWord(String text) {
        String[] sentence = text.replaceAll("[^a-zA-Z]+", " ").split(" ");
        String longest = "";
        for (String word : sentence) if (word.length() > longest.length()) longest = word;
        return longest;
    }

}

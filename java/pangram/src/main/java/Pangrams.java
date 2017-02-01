import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Pangrams {

  private static final List<String> alphabet = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));

  public static boolean isPangram(String sentence) {
    if(invalidSentence(sentence)) return false ;

    Set<String> letterSet = new HashSet<String>();
    for(String letter : sanitize(sentence).split("")) {
      letterSet.add(letter);
    }

    return hasAllLetters(letterSet);
  }

  private static boolean invalidSentence(String sentence) {
    return (sentence == null || sentence.length() < alphabet.size());
  }

  private static boolean hasAllLetters(Set<String> letterSet) {
    if(letterSet.size() == alphabet.size()) {
      return true;
    } else {
      return false;
    }
  }

  private static String sanitize(String str) {
    return str.replaceAll("[^a-zA-Z]+", "").toLowerCase();
  }
}

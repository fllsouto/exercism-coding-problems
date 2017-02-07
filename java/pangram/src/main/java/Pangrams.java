import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;

public class Pangrams {

  private static final List<String> alphabet = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));

  public static boolean isPangram(String sentence) {
    if(hasInvalidSentence(sentence)) return false ;
    Set<String> letterSet = new HashSet<String>(Arrays.asList(sanitize(sentence).split("")));
    return hasSameSize(letterSet, alphabet);
  }

  private static boolean hasInvalidSentence(String sentence) {
    return (sentence == null || sentence.length() < alphabet.size());
  }

  private static boolean hasSameSize(Collection<String> col1, Collection<String> col2) {
    return col1.size() == col2.size();
  }

  private static String sanitize(String str) {
    return str.replaceAll("[^a-zA-Z]+", "").toLowerCase();
  }
}

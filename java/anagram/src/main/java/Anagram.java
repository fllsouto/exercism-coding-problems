import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Anagram {

  private final String str;
  private final String sanitizeStr;
  Set<String> wordSet;

  public Anagram(String str) {
    this.str = str.toLowerCase();
    this.sanitizeStr = sanitizeAndSortChars(str);
    wordSet = new HashSet<>();
  }

  public List<String> match(List<String> wordList) {
    List<String> anagramList = new ArrayList<>();

    wordList.forEach( word -> {
      if(isAnagram(word)) {
        anagramList.add(word);
      }
    });
    return anagramList;
  }

  private boolean isAnagram(String word) {
    String sanitizedWord = sanitizeAndSortChars(word);
    if(!this.str.equals(word.toLowerCase()) && !this.wordSet.contains(word) && this.sanitizeStr.equals(sanitizedWord)) {
      this.wordSet.add(sanitizedWord);
      return true;
    }
    return false;
  }

  private String sanitizeAndSortChars(String str) {
    char[] chars = str.toLowerCase().toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }
}

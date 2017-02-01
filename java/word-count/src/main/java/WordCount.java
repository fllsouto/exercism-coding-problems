import java.util.Map;
import java.util.HashMap;

public class WordCount {

  public Map<String, Integer> phrase(String sentence) {
    Map<String, Integer> words =  new HashMap<String, Integer>();
    System.out.println("Foo : " + foo);
    for(String word : this.sanitaze(sentence)) {
      words.put(word, words.getOrDefault(word, 0) + 1);
    }
    return words;
  }

  private String[] sanitaze(String string) {
    return string
           .toLowerCase()
           .replaceAll("[^a-zA-Z0-9\\s]+", "")
           .split("\\s+");
  }
}

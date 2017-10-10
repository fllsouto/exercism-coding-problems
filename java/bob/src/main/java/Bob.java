
import java.util.Map;
import java.util.HashMap;
import java.util.regex.Pattern;

public class Bob {

  Map<String, String> answers;

  private static  final String noLowerCasePattern = "/(\\S*[^a-z]+)+/";
  private static  final String numberAndSpecialPattern = "/(\\S*[^a-ZA-Z]+)+/";

  public Bob() {
    answers = new HashMap<String, String>();
    answers.put("question", "Sure.");
    answers.put("yell", "Whoa, chill out!");
    answers.put("nothing", "Fine. Be that way!");
    answers.put("anything else", "Whatever.");
  }
  public String hey(String conversation) {
    String key;

    if(Pattern.matches(noLowerCasePattern, conversation )  && Pattern.matches(numberAndSpecialPattern, conversation )) {
      key = "yell";
    } else if(conversation.isEmpty()) {
      key = "nothing";
    } else if(conversation.indexOf('?') != -1) {
      key = "question";
    } else {
      key = "anything else";
    }

    return this.answers.get(key);
  }
}

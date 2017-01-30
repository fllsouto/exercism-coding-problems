import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Etl {

    //Functional + Short version
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
      return new HashMap<String, Integer>(){
        {
          old.forEach((key, values) -> {
            values.forEach((value) -> {
              put(value.toLowerCase(), key);
            });
          });
        }};
    }

    /* Short version :)
    * public Map<String, Integer> transform(Map<Integer, List<String>> old) {
    *   return new HashMap<String, Integer>(){
    *     {
    *       for(Integer key : old.keySet())
    *         for(String value : old.get(key))
    *           put(value.toLowerCase(), key);
    *     }
    *   };
    *  }
    */

    /* Normal version
    *  public Map<String, Integer> transform(Map<Integer, List<String>> old) {
    *    Map<String, Integer> newSet = new HashMap<String, Integer>();
    *
    *    for(Integer key : old.keySet()) {
    *      for(String value : old.get(key)) {
    *        newSet.put(value.toLowerCase(), key);
    *      }
    *    }
    *    return newSet;
    *  }
    */
}

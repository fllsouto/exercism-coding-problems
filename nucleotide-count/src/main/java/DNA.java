import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class DNA {

  private Map<Character, Integer> nucleotidesIncidence;
  private String dnaString;
  private boolean calculated;

  public DNA(String dnaString) {
    this.dnaString = dnaString;
    this.nucleotidesIncidence = new HashMap<Character, Integer>() {
      {
        put('A', 0);
        put('C', 0);
        put('G', 0);
        put('T', 0);
      }
    };
  }

  public Integer count(Character nucleotide) throws IllegalArgumentException{
      Integer count = this.nucleotideCounts().get(nucleotide);
      if(count != null) return count;

      throw new IllegalArgumentException("Undefined Character: " + nucleotide);
  }

  public Map<Character, Integer> nucleotideCounts(){
    if(calculated) return nucleotidesIncidence;

    return calculateNucleotideCounts();
  }

  private Map<Character, Integer> calculateNucleotideCounts(){

    for(char nct : dnaString.toCharArray()) {
        Integer count = nucleotidesIncidence.get(nct);
        nucleotidesIncidence.put(nct, count + 1);
    }
    this.calculated = !this.calculated;
    return nucleotidesIncidence;
  }


}

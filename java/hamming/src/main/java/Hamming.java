public class Hamming {
  public static int compute(String sequenceA, String sequenceB) throws IllegalArgumentException {
    validSequence(sequenceA, sequenceB);

    return hammingDifference(sequenceA, sequenceB);
  }

  private static int hammingDifference(String sequenceA, String sequenceB) {
    int difference = 0;
    for(int i = 0; i < sequenceA.length(); i++) {
      if(sequenceA.charAt(i) != sequenceB.charAt(i)) difference++;
    }
    return difference;
  }

  private static void validSequence(String sequenceA, String sequenceB) throws IllegalArgumentException {
    if(sequenceA.length() != sequenceB.length()) throw new IllegalArgumentException("Invalid sequence size!");
  }
}

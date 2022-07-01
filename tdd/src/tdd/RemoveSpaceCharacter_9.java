package tdd;

public class RemoveSpaceCharacter_9 {
  public static String removeSpeChar(String str) {
	  str=str.replaceAll("[^a-zA-Z0-9]", " ");
	  return str;
  }
}

package tdd;

public class VowelOrNOt_Q6 {
	  public static int getCount(String str) {
		    int vowelsCount = 0;
		    char[] chars = str.toCharArray();
		    for (char c : chars) {
		      if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		        vowelsCount++;
		    }
		    return vowelsCount;
		  }

		}
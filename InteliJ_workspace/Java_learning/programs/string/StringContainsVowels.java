package string;

import static java.lang.System.*;

public class StringContainsVowels {
	public static void main(String[] args) {
		String str = "Vikram";

		if (str.matches(".*[AEIOUaeiou].*")){
			out.println(str + " contains vowels");
		}else {
			out.println(str + " does not contain vowels");
		}
		
	}
}
package string;

import static java.lang.System.*;

public class StringMirrorImageOrReverse {
	public static void main(String[] args) {
        String input = "Vikram";
        int n = input.length();

        /*for(int i=n; i>0; --i) {
            out.print(input.charAt(i-1));
        }*/

        /*StringBuilder sb = new StringBuilder();
        for (int i = n-1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        String output = sb.toString();
        out.println(input + " : " + output);*/

        /*String output = new StringBuilder(input).reverse().toString();
        out.println(input + " : " + output);*/

        StringBuilder sb = new StringBuilder(input);
        String output = sb.reverse().toString();//String.valueOf(sb.reverse());
        out.println(input + " : " + output);

    }
}
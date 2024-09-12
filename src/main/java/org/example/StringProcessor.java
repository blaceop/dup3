package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {
    private static final Pattern PATTERN = Pattern.compile("(.)\\1{2,}");

    public static String processString(String input) {
        String result = input;
        Matcher matcher;
        do {
            matcher = PATTERN.matcher(result);
            if (matcher.find()) {
                String replacement = String.valueOf((char) (matcher.group().charAt(0) - 1));
                result = matcher.replaceAll(replacement);
            } else {
                break;
            }
        } while (true);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(processString("aabcccbbad")); // Output: aabbbad
        System.out.println(processString("abcccbad"));   // Output: abbbad
    }
}
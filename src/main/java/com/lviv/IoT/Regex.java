package com.lviv.IoT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class for regular expressions
public class Regex {

    public final String mainRegex(final String sentenceExample, final int numberOfWords) {

        // Pattern means words in the sentence must contain characters from 'a' to 'z' and question mark
        String pattern = "([a-z])([?])";

        if (numberOfWords < 5) {

            // Adding all the necessary stuff for regex
            // 'Pattern.CASE_INSENSITIVE' means that we're ignoring upper case
            Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(sentenceExample);
            Boolean b = m.find();

            System.out.println(b);

            return sentenceExample;
        }

        // If the given sentence contain more than 5 words - reversing it
        else {

            // Reversing each word in the given string
            Pattern pattern1 = Pattern.compile("\\s");

            String[] temp = pattern1.split(sentenceExample);

            // Using StringBuilder instead of string(because of operation '+')
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < temp.length; i++) {

                if (i == temp.length - 1)

                    result.insert(0, temp[i]);
                else {

                    result.insert(0, " " + temp[i]);
                }

            }
            System.out.println("false");

            return result.toString();
        }
    }

}

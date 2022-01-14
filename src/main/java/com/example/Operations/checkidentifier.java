package com.example.Operations;

public class checkidentifier {
    public static boolean is_identifier(String str)
    {
        int i=0;

        if ( Character.isLetter(str.charAt(0)) ) {
            while (i < str.length() && str.charAt(i) != '\0') {
                if (Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i)))
                    i++;
                else
                    return false;
            }
            return true;
        }
        else
            return false;
    }
}

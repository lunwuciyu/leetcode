package com.github.leetcode;

import java.util.Vector;
import java.util.regex.Pattern;

/**
 * Keyboard Row
 */
class Solution500 {
    public String[] findWords(String[] words) {
        String row0 = "[qwertyuiopQWERTYUIOP]+";
        String row1 = "[asdfghjklASDFGHJKL]+";
        String row2 = "[zxcvbnmZXCVBNM]+";
        Vector<String> vector = new Vector<>();
        for (String s : words) {
            if (Pattern.matches(row0, s) || Pattern.matches(row1, s) || Pattern.matches(row2, s)) {
                vector.add(s);
            }
        }
        return vector.toArray(new String[vector.size()]);
    }
}
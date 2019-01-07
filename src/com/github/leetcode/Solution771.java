package com.github.leetcode;

class Solution771 {
    public int numJewelsInStones(String J, String S) {
        String S2 =  S.replaceAll("["+J+"]+", "");
        return S.length()-S2.length();
    }
}
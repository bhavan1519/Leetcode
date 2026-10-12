class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String d = s+s;
        String sub = d.substring(1, d.length()-1);
        return sub.contains(s);
    }
}
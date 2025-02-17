class Solution {
    public int lengthOfLastWord(String s) {
        String[] q=s.split(" ");
        String l=q[q.length-1];
        return l.length()>0?l.length():0;
    }
}
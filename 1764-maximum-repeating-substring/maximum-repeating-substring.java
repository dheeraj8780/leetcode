class Solution {
    public int maxRepeating(String sequence, String word) {
        StringBuilder s=new StringBuilder(word);
        int c=0;
        while(sequence.contains(s.toString())){
            c++;
            s.append(word);
        }
        return c;
    }
}
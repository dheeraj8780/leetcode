class Solution {
    private static void reverse(char[] charArray, int start, int end) {
        while (start < end) {
            char temp = charArray[start];
            charArray[start++] = charArray[end];
            charArray[end--] = temp;
        }
    }

    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;

        for(int i=0; i<n; i+=2*k) {
            int end = Math.min(i+k-1, n-1);
            reverse(charArray, i, end);
        }

        return new String(charArray);
    }
}
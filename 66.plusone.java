class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        while(i>=0){
            digits[i]++;
            if(digits[i]<10){
                return digits;
            }
            digits[i]=0;
            --i;
        }
        int arr[]=new int[digits.length+1];
        arr[0]=1;
        return arr;
    }
}

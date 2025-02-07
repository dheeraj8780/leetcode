class Solution {
    public int largestAltitude(int[] gain) {
        int val=0,i=0,max=0;
        while(i<gain.length){
            val+=gain[i];
            max=Math.max(max,val);
            i++;
        }
        return max;
    }
}
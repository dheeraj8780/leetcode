import java.util.*;
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)-> Integer.compare(a[1],b[1]));
        int c=0;
        int currend=Integer.MIN_VALUE;
        for(int[] pair:pairs){
            if(pair[0]>currend){
                currend=pair[1];
                c++;
            }
        }
        return c;
    }
}
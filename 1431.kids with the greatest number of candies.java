import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcan=0;
        for(int x:candies){
            maxcan=Math.max(x,maxcan);
        }
        List<Boolean> res=new ArrayList<>();
        for(int i:candies){
            if(i+extraCandies >= maxcan){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}

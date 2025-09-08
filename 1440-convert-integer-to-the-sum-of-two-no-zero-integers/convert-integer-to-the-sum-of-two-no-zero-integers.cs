public class Solution {
    public int[] GetNoZeroIntegers(int n) {
        bool Check(int q){
            return !q.ToString().Contains("0");
        }
        for(int i=1;i<n+1;i++){
            int a=i;
            int b=n-a;
            if(Check(a) && Check(b)){
                return new int[]{a,b};
            }
        }
        return new int[]{-1,-1};
    }
}
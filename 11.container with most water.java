class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r){
            int minarea=Math.min(height[l],height[r]);
            int w=r-l;
            int currarea=minarea*w;
            max=Math.max(max,currarea);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
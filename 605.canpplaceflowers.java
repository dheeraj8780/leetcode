class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int t=0;
        int prev=-2;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==1){
                t+=(i-prev-2)/2;
                prev=i;
            }
        }
        t+=(flowerbed.length-prev-1)/2;
        return t>=n;
    }
}
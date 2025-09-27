class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr=new int[101];
        for(int i:nums){
            arr[i]++;
        }
        Arrays.sort(arr);
        int maxf=arr[arr.length-1];
        int res=0;
        for(int i:arr){
            if(i==maxf){
                res+=i;
            }
        }
        return res;
    }
}
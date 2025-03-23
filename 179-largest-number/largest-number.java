class Solution {
    public String largestNumber(int[] nums) {
        String []strnums=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strnums[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strnums,(a,b) -> (b+a).compareTo(a+b));
        if(strnums[0].equals("0")) return "0";
        return String.join("",strnums);
    }
}
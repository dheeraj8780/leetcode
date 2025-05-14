class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int[] arr:operations)
        {
            int index1=map.get(arr[0]);
            map.put(arr[1],index1);
            nums[index1]=arr[1];
        }
        return nums;
    }
}
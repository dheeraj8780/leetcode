class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> res=new HashMap<>();
        res.put(0,0);
        res.put(1,0);
        res.put(2,0);
        for(int i:nums){
            res.put(i,res.get(i)+1);
        }
        int q=0;
        for(int c=0;c<3;c++){
            int f=res.get(c);
            for(int k=0;k<f;k++){
                nums[q]=c;
                q++;
            }
        }
    }
}
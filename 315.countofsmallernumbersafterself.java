import java.util.*;
class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res= new ArrayList<>();
        List<Integer> sort=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            int num=nums[i];
            int id = bisectleft(sort,num);
            res.add(id);
            sort.add(id,num);
        }
        Collections.reverse(res);
        return res;
    }
    private int bisectleft(List<Integer> container, int insertVal) {
        int l = 0;
        int r = container.size()-1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (container.get(mid) < insertVal) {
                l = mid + 1;
            } else {
                r = mid-1;
            }
        }
        return l;
    }
}

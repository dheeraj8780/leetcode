class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> al = new HashSet<>();
        for(int k : nums1){
           
            hs.add(k);
        }
         for(int k : nums2){
            if(hs.contains(k)){
                 al.add(k);
            }
      }
        int[] k= new int[al.size()];
       int i=0;
       for(int x:al){
           k[i++] =x;
       }
        return k;
    }
}

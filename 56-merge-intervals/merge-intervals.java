class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> mer=new ArrayList<>();
        int[] curr=intervals[0];
        mer.add(curr);
        for(int[] intvl:intervals){
            if(intvl[0]<=curr[1]){
                curr[1]=Math.max(curr[1],intvl[1]);
            }else{
                curr=intvl;
                mer.add(curr);
            }
        }
        return mer.toArray(new int[mer.size()][]);
    }
}
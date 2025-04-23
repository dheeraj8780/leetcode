class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> res=new HashMap<>();
        int max=0;
        for(int i=1;i<=n;i++){
            int s=0,q=i;
            while(q>0){
                int r=q%10;
                s+=r;
                q=q/10;
            }
            res.put(s,res.getOrDefault(s,0)+1);
            max=Math.max(max,res.get(s));
        }
        int c=0;
        for(int i:res.values()){
            if(i==max){
                c++;
            }
        }
        return c;
    }
}
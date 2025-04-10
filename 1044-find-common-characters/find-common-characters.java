class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res=new ArrayList<>();
        for(char c='a';c<='z';c++){
            int minc=Integer.MAX_VALUE;
            for(String w:words){
                int count=0;
                for(char ch:w.toCharArray()){
                    if(ch==c){
                        count++;
                    }
                }
                minc=Math.min(minc,count);
                if(minc==0){
                    break;
                }
            }
            for(int i=0;i<minc;i++){
                res.add(String.valueOf(c));
            }
        }
        return res;
    }
}
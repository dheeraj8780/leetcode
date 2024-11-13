import java.util.*;
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int taskcount[]=new int[26];
        for(char t:tasks){
            taskcount[t-'A']++;
        }
        Arrays.sort(taskcount);
        int maxcount=taskcount[25]-1;
        int idle=maxcount*n;
        for(int i=24;i>=0 && taskcount[i]>0;i--){
            idle-=Math.min(taskcount[i],maxcount);
        }
        idle=Math.max(0,idle);
        return idle+tasks.length;
    }
}
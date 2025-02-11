class Solution {
    public int equalPairs(int[][] grid) {
        int l=grid.length;
        int [][] cols= new int[l][l];
        int i=0,j=0;
        while(j<l){
            cols[j][i]=grid[i][j];
            i++;
            if(i>=l){
                i=0;
                j++;
            }
        }
        int ans=0;
        i=0;j=0;
        while(i<l){

            if(Arrays.equals(grid[i],cols[j])) ans++;
            j++;
            if(j>=l){
                i++;
                j=0;
            }
        }
        return ans;
    }
}
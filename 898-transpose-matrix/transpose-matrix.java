class Solution {
    public int[][] transpose(int[][] matrix) {
        int q=matrix.length;
        int w=matrix[0].length;
        int[][] res=new int[w][q];
        for(int i=0;i<q;i++){
            for(int j=0;j<w;j++){
                res[j][i]=matrix[i][j];
            }
        }
        return res;
    }
}
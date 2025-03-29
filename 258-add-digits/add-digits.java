class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        while(num>=10){
            num=digit(num);
        }
        return num;
    }
    public int digit(int n){
        int s=0;
        while(n>0){
            int r=n%10;
            s+=r;
            n=n/10;
        }
        return s;
    }
}
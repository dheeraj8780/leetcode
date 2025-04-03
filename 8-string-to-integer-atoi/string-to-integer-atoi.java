class Solution {
    public int myAtoi(String s) {
        int max=(int) Math.pow(2,31);
        int min=(int) -Math.pow(2,31);
        int i=0,n=s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i==n) return 0;
        int sign=1;
        if(s.charAt(i)== '-'){
            i++;
            sign=-1;
        }else if(s.charAt(i)== '+'){
            i++;
        }
        long res=0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int d=s.charAt(i)-'0';
            res=res*10+d;
            if(sign==1 && res>max) return max;
            if(sign== -1 && -res<min) return min;
            i++;
        }
        return (int)(sign*res);
    }
}
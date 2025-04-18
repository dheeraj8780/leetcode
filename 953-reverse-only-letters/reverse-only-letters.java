class Solution {
    public String reverseOnlyLetters(String s) {
        int l=0;
        int r=s.length()-1;
        char arr[]=s.toCharArray();
        while(l<r){
            if(!Character.isLetter(s.charAt(l))){
                l++;
            }else if(!Character.isLetter(s.charAt(r))){
                r--;
            }else{
                swap(arr,l,r);
                l++;
                r--;
            }
        }
        return new String(arr);
    }
    public static void swap(char arr[],int f,int s){
        char temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
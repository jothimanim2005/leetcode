class Solution {
    public String longestPalindrome(String s) {
        int m1=0;
        String a=" ";
       for(int i=0;i<s.length();i++){
        String o=h(s,i,i);
        String e=h(s,i,i+1);

        if(m1<o.length()){
            m1=o.length();
            a=o;
        }
        if(m1<e.length()){
            m1=e.length();
            a=e;
        }
       }
       return a;
    }
    public String h(String s,int l,int r){
        while(l>=0 && r<s.length() &&s.charAt(l)==s.charAt(r) ){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}
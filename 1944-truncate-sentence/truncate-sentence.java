class Solution {
    public String truncateSentence(String s, int k) {
       String[] words=s.split(" ");
       String result="";
       for(int i=0;i<k;i++){
          result=result+words[i];
           if(i<k-1){
            result+=" ";
       } 
       }
     return result;
       
    }
}
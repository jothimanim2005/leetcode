class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result =new ArrayList<>();
        for(int a=0;a<12;a++){
            for(int b=0;b<60;b++){
                int t=Integer.bitCount(a)+Integer.bitCount(b);
                if(t==turnedOn){
                    String ti=a+":"+(b<10?"0"+b:b);
                    result.add(ti);
                }
            }
        }
       return result; 
    }
}
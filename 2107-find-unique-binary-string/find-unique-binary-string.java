class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        Set m=new HashSet<>();
        for(String s:nums){
            m.add(Integer.parseInt(s,2));
        }
        for(int i=0;i<(1<<n);i++){
            if(!m.contains(i)){
                String b=Integer.toBinaryString(i);
                while(b.length()<n){
                    b="0"+b;
                }
                return b;
            }
        }
        return "";
    }
}
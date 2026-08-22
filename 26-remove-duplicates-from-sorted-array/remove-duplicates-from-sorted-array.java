class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s=new LinkedHashSet<>();
        for(int a:nums){
            s.add(a);
        }
        int i=0;
        for(int a:s){
            nums[i]=a;
            i++;
        }
      return s.size();
    }
    
}
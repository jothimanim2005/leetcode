class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int a[]=new int[friends.length];
        int i=0;
        for(int o:order){
            for(int f:friends){
                if(o==f){
                    a[i]=o;
                    i++;
                }
            }
        }
        return a;
    }
}
class Solution {
    public boolean squareIsWhite(String coordinates) {
     int col = coordinates.charAt(0) - 'a' + 1;
     int row = coordinates.charAt(1) - '0';
     int val=col+row;
     if(val%2==1){
        return true;
     }
     else{
        return false;
     }
    }
}
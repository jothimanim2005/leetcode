class Solution {
    public int findNumbers(int[] nums) {
         int evenDigitCount = 0;
         for (int num : nums) {
            int digitCount = 0;
            if (num == 0) {
                digitCount = 1; 
            } else {
                    while (num > 0) {
                    num /= 10;
                    digitCount++;
                }
            }
               if (digitCount % 2 == 0) {
                evenDigitCount++;
                 }
        }
        return evenDigitCount;
            }
    }

    
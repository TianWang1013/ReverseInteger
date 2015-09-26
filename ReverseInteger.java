public class Solution {
    public int reverse(int x) {
        int reminder;
        int reverse = 0;
        int num = Math.abs(x);
     
       
        while(num != 0) {
            
            if (reverse > (Integer.MAX_VALUE - num % 10) / 10)  // if reverse * 10 + reminder > MAX_VALUE, return 0
                 return 0;                                      // reminder = num % 10
                                                                // reverse * 10 + num % 10 > MAX_VALUE
                 
            reminder = num % 10;
            reverse = reverse * 10 + reminder;
            num= num / 10;
        }
        
        return x > 0? reverse:-reverse;
    }
}
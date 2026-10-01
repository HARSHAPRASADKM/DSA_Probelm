import java.util.*;
import java.util.HashMap;
import java.util.Scanner;
class Solution {
    public int romanToInt(String s) {

        HashMap<Character,Integer > roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        
        int result = 0;
        int n=s.length();

        for (int i=0; i<n;i++)
        {
            int current = roman.get(s.charAt(i));
            if(i<n-1 && current < roman.get(s.charAt(i+1)))
            {
                result -= current;
            }
            else
            {
                result += current;
            }
        }
        return result ;        
    }
}
public class romanInteger {
    public static void main(String[] args) {
      Solution sol = new Solution();
      Scanner scan =new Scanner(System.in);
      String s = scan.nextLine();
      int res = sol.romanToInt(s);
      System.out.println(res);
    }
}
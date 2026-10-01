import java.util.*;
import java.util.Scanner;


class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String temp = "";

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return temp;
                }
            }

            temp += ch;
        }

        return temp;
    }
}
public class longest_common_prefix {
    public static void main(String[] args) {
      Solution sl = new Solution();
      Scanner scan = new Scanner(System.in);

      String str[] = new String[3];
      for (int i=0;i<str.length;i++)
      {
        str[i]=scan.nextLine();
      }
      String res = sl.longestCommonPrefix(str);

      System.out.println(res);

    }
}
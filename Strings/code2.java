import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
      
      //solution1
        /*char[] arr = new char[S.length()];
        for(int i=0;i<S.length();i++){
            arr[i] = S.charAt(i);
        }
        for(int i=start;i<end;i++){
            System.out.print(arr[i]);

        }*/
      
      //solution2
        System.out.print(S.substring(start, end));
    }
}

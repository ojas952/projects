import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        boolean flag = true;
        /* Enter your code here. Print output to STDOUT. */
        //char[] ar = new char[A.length()];
        

        /*for(int i=0;i<A.length();i++){
            ar[i] = A.charAt(i);
        }*/
        char[] ar = A.toCharArray();

        int n = A.length()-1;
        for(int i=0;i<=A.length()/2;i++){
            if(ar[i]!=ar[n-i]){
                flag = false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Yes");
        }
        else
        System.out.println("No");
    }
}




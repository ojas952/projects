
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        
        if((A.compareTo(B))>0)
        System.out.println("Yes");
        else
        System.out.println("No");
        
        String first=A.substring(0,1);
        String afterfirst=A.substring(1);
        String first1=B.substring(0,1);
        String afterfirst1=B.substring(1, B.length());
        System.out.println(first.toUpperCase()+afterfirst+" "+first1.toUpperCase()+afterfirst1);
    }
}




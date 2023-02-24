import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            long mThree = (n-1)/3;
            long mFive = (n-1)/5;
            long mFifteen = (n-1)/15;

            long sum = (3*(mThree*(mThree+1))/2);
                sum += (5*(mFive*(mFive+1))/2);
                sum-= (15*(mFifteen*(mFifteen+1))/2);
                System. out. println(sum);
        }
    }
}
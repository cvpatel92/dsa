//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int d = (b*b) - (4*a*c);
        //System.out.print(d);
        int r1, r2;
        if(d<0){
            ans.add(-1);
        }
        else if(d==0){
            r1 = r2 = -b/(2*a);
            ans.add(r1);
            ans.add(r2);
        }
        else{
            r1 = (int)Math.ceil((-b + Math.sqrt(Math.abs(d)))/(2*a));
            r2 = (int)Math.ceil((-b - Math.sqrt(Math.abs(d)))/(2*a));
            ans.add(r1);
            ans.add(r2);
        }

        return ans;
    }
}
package T2018;

import java.util.Scanner;

public class FuJiaTi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] p=new int[n+1];
        int[] count=new int[n+1];
        for (int i = 1; i <= n; i++) {
            p[i]=scanner.nextInt();
        }
        helper(0,p,count,1);
    }

    private static void helper(int out, int[] p,int[] count,int cur) {
        if(cur==p.length) {
            System.out.println(out);
            return;
        }
        count[cur]++;
        if (count[cur] % 2==0){
            helper(out+1,p,count,cur+1);
        }else {
            helper(out+1,p,count,p[cur]);
        }
    }
}

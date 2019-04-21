package T2018;

import java.util.Scanner;

public class HuiWenShuZu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line= scanner.nextLine();
        char[] arr= line.toCharArray();
        int pi=0,pj=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(j-i>pj-pi&&isHuiWen(arr,i,j)){
                   pj=j;
                   pi=i;
                }
            }
        }
        System.out.println(line.substring(pi,pj+1));
    }

    private static boolean isHuiWen(char[] arr, int i, int j) {
        for (;i<j;i++,j--){
            if (arr[i]!=arr[j])
                return false;
        }
        return true;
    }
}

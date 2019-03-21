package T2018;

import java.util.Scanner;

public class LieBiaoBuQuan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int offset=scanner.nextInt();
            int n=scanner.nextInt();
            int l1=scanner.nextInt();
            int l2=scanner.nextInt();
            int st1,ed1,st2,ed2;
            if (offset>=l1+l2){
                st1=ed1=l1;
                st2=ed2=l2;
            }else if (offset>=l1){
                st1=ed1=l1;
                st2=offset-l1;
                ed2=Math.min(st2+n,l2);

            }else{
                st1=offset;
                ed1=Math.min(st1+n,l1);
                if (st1+n<=l1)
                    st2=ed2=0;
                else {
                    st2=0;
                    ed2=Math.min(n-l1+st1,l2);
                }
            }
            System.out.println(st1+" "+ed1+" "+st2+" "+ed2);
        }
    }
}

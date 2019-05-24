package T2019;

import java.util.*;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/5/24/024 16:31
 * @Description:
 */
public class FindQujian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int time=sc.nextInt();
        sc.nextLine();
        LinkedList<Integer> linkedList=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String[] line=sc.nextLine().split(" ");
            int start=Integer.parseInt(line[1]);
            int end=Integer.parseInt(line[2]);
            if (start<=time&&time<=end)
                linkedList.add(Integer.parseInt(line[0]));
        }
        Collections.sort(linkedList);
        if (linkedList.isEmpty()){
            System.out.println("null");
        }else {
            for (int i:linkedList
                 ) {
                System.out.println(i);
            }
        }
    }

}

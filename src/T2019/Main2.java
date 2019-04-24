package T2019;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/4/24/024 19:48
 * @Description:
 */

import java.util.*;

public class Main2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
       // sc.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i:arr
             ) {
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else map.put(i,1);
        }
        if (map.containsValue(1))
            return 0;
        Set<Map.Entry<Integer,Integer>> set=map.entrySet();
        ArrayList<Integer> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int res=0;
        for (Map.Entry<Integer,Integer> entry:set){
            int temp=entry.getValue();
            if (temp<min)
                min=temp;
            list.add(temp);
        }
        for (int i = 0; i < list.size(); i++) {
            int temp=list.get(i);
            if (temp!=min&&temp%min!=0)
                return 0;
            res+=temp/min;
        }
        return res;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {

        int res;
        res = main();
        System.out.println(String.valueOf(res));

    }
}


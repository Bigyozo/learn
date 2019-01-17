package zfl;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-15 16:01
 * @Description: 输出所有和为S的连续正数序列
 */
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int plow=1,phigh=2;
        while(plow<phigh){
            int cur=(plow+phigh)*(phigh-plow+1)>>1;
            if(cur==sum){
                ArrayList<Integer>list=new ArrayList<>();
                for(int i=plow;i<=phigh;i++)
                    list.add(i);
                result.add(list);
                plow++;
            }
            else if(cur<sum)
                phigh++;
            else plow++;
        }
        return result;
    }

    public static void main(String[] args){
        FindContinuousSequence f=new FindContinuousSequence();
        List list=f.FindContinuousSequence(3);
        System.out.println(list);
    }
}

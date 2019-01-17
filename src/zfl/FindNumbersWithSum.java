package zfl;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-16 14:34
 * @Description: 输入一递增排序数组和一数字S，在数组中查找两个数，使得他们的和正好是S，且乘积最小
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> result=new ArrayList<>();
        int mid=sum/2;
        int low=-1,high;
        while (array[++low]<=mid);
        low--;
        high=low+1;
        while (low>=0&&high<array.length){
            int cur=array[low]+array[high];
            if (cur==sum){
                if(result.size()==0) {
                    result.add(array[low]);
                    result.add(array[high]);
                }else {
                    result.set(0,array[low]);
                    result.set(1,array[high]);
                }
                low--;
            }
            else if(cur<sum)
                high++;
            else low--;
        }
        return result;
    }

    public static void main(String[] args) {
        FindNumbersWithSum findNumbersWithSum=new FindNumbersWithSum();
        List list=findNumbersWithSum.FindNumbersWithSum(new int[]{1,2,3,4,5,6},8);
        System.out.println(list);

    }
}

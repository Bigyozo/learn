package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-08 15:14
 * @Description: 统计一个数字在排序数组中出现的次数
 */
public class GetNumberFromArr {
    int first=-1;
    int last=-1;

    public int GetNumberOfK(int[] array, int k) {
        getFirstIndex(array, k, 0, array.length - 1);
        getLastIndex(array, k,0, array.length - 1);
        if(last==-1&&first==-1)
            return 0;
        return last-first+1;

    }

    private void getLastIndex(int[] array,  int k, int from, int end) {
        if (from > end) {
            last = -1;
            return;
        }
        int mid = (end + from) >> 1;
        if (array[mid] > k)
            getLastIndex(array, k, from, mid - 1);
        else if (array[mid] < k)
            getLastIndex(array, k, mid + 1, end);
        else if(mid<array.length-1&&array[mid+1]==k)
            getLastIndex(array,k,mid+1,end);
        else last=mid;
    }

    private void getFirstIndex(int[] array, int k, int from, int end) {
        if (from > end) {
            first = -1;
            return;
        }
        int mid = (end + from) >> 1;
        if (array[mid] > k)
            getFirstIndex(array, k, from, mid - 1);
        else if (array[mid] < k)
            getFirstIndex(array, k, mid + 1, end);
        else if(mid>=1&&array[mid-1]==k)
            getFirstIndex(array,k,from,mid-1);
        else first=mid;
    }

    public static void main(String[] args){
        GetNumberFromArr i=new GetNumberFromArr();
        int[] arr={0,1,2,3,3,3,4,5};
        int r=i.GetNumberOfK(arr,3);
        System.out.println(r);
    }
}

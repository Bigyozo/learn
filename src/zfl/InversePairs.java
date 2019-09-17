package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-07 15:29
 * @Description: 利用归并排序求数组中的逆序对数
 */
public class InversePairs {
    int count = 0;
    int[] copy;

    public int InversePairs(int[] array) {
        if (array == null || array.length < 2)
            return 0;
        this.copy = new int[array.length];
        mergeSort(array, 0, array.length - 1);
        return count;
    }

    private void mergeSort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int mid = (start + end) >> 1;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    private void merge(int[] arr, int start, int mid, int end) {
        int i = start, j = mid + 1, k = start;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j])
                copy[k++] = arr[i++];
            else {
                copy[k++] = arr[j++];
                count += mid - i + 1;
            }
        }
        while (i <= mid)
            copy[k++] = arr[i++];
        while (j <= end)
            copy[k++] = arr[j++];
        k--;
        while (k >= start) {
            arr[k] = copy[k];
            k--;
        }
    }

    public static void main(String[] args){
        int[] a={1,2,3,5,4,6,0};
        InversePairs inversePairs=new InversePairs();
        int t=inversePairs.InversePairs(a);
        System.out.println(t);
    }
}

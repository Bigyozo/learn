package JianZhiOffer;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/6/17/017 20:31
 * @Description:在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下
 * 递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class T1FindIn2dArray {
    public boolean Find(int target, int[][] array) {
        int i = array.length - 1, j = 0;
        while (i >= 0 && j < array[i].length) {
            if (target == array[i][j])
                return true;
            else if (target > array[i][j])
                j++;
            else
                i--;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}

package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-20 15:27
 * @Description: ${Description}
 */
public class MovingCount {
    int count=0;

    public int movingCount(int threshold, int rows, int cols) {
        boolean[] path=new boolean[rows*cols];
        helper(threshold,rows,cols,0,0,path);
        return count;
    }

    private void helper(int threshold, int rows, int cols,int i,int j,boolean[] path) {
        int p=i*cols+j;
        if(i<0||i>=rows||j<0||j>=cols||countNum(i,j)>threshold||path[p]==true)
            return;
        count++;
        path[p]=true;
        helper(threshold,rows,cols,i-1,j,path);
        helper(threshold,rows,cols,i+1,j,path);
        helper(threshold,rows,cols,i,j-1,path);
        helper(threshold,rows,cols,i,j+1,path);
    }

    private int countNum(int i,int j){
        int num=0;
        while (i > 0) {
            num += i % 10;
            i /= 10;
        }
        while (j > 0) {
            num += j% 10;
            j /= 10;
        }
        return num;
    }
}

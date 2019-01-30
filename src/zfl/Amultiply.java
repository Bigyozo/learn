package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-24 17:09
 * @Description: ${Description}
 */
public class Amultiply {
    public int[] multiply(int[] A) {
        int len=A.length;
        int[] B=new int[len];
        for(int i=0;i<len;i++)
            B[i]=1;
        for (int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(j==i)
                    continue;
                B[j]*=A[i];
            }
        }
        return B;
    }
}

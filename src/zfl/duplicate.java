package zfl;

        import java.util.HashSet;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-22 16:08
 * @Description: ${Description}
 */
public class duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean[] b=new boolean[length];
        for (int i=0;i<length;i++){
            if(b[numbers[i]]==true){
                duplication[0]=numbers[i];
                return true;
            }else {
                b[numbers[i]]=true;
            }
        }
        return false;
    }
}

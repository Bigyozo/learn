package T2019;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/5/24/024 17:17
 * @Description:
 */
public class Test {
    static {
        System.out.println("blockB");
    }


    public static Test t1=new Test();

    {
        System.out.println("blockA");
    }


    public static void main(String[] args){
        Test t2=new Test();
    }
}

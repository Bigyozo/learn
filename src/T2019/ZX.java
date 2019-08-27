package T2019;

import java.util.*;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-08-19 09:51
 * @Description: ${Description}
 */
public class ZX {
    static class myNode implements Comparable<myNode>{
        int sal;
        Integer value;

        myNode(int sal,int value){
            this.sal=sal;
            this.value=value;
        }
        @Override
        public int compareTo(myNode o) {
            return o.value-this.value;
        }
    }
    static List<Integer> sf(int num,int[] sal){
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:sal
             ) {
            if (!map.containsKey(i)){
                map.put(i,1);
            }else {
                int val=map.get(i);
                map.put(i,val+1);
            }
        }
        Set<Integer> set=map.keySet();
        Iterator<Integer> iterator=set.iterator();
        myNode[] arr=new myNode[set.size()];
        int i=0;
        while (iterator.hasNext()){
            int temp=iterator.next();
            arr[i++]=new myNode(temp,map.get(temp));
        }
        Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].value; k++) {
                list.add(arr[j].sal);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int num=19;
        int[] sal={100,100,100,20,20,50,50,50,50,50,15,15,25};
        List<Integer> list=sf(num,sal);
        System.out.println(list);
    }
}

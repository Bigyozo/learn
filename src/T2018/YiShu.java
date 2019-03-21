package T2018;

import java.util.*;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-21 16:44
 * @Description: ${Description}
 */
public class YiShu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line;
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        HashMap<Integer,String> map2=new HashMap<>();
        while (!(line=scanner.nextLine()).equals("END")){
            String[] strs=line.split("#");
            int k=Integer.parseInt(strs[0]);
            char[] chars=strs[1].toCharArray();
            int res=0;
            for (int i = chars.length-1,j=0; i >=0 ; i--,j++) {
                if (chars[i]>='A'&&chars[i]<='Z')
                res+=Math.pow(k,j)*(chars[i]-'A'+10);
                else
                    res+=Math.pow(k,j)*(chars[i]-'0');
            }
            if (!map.containsKey(res)) {
                map.put(res, 1);
                map2.put(res, line);
            }
            else{
                int count=map.get(res);
                map.put(res,count+1);
            }
        }
        Set<Map.Entry<Integer,Integer>> set=map.entrySet();
        for (Map.Entry<Integer,Integer> entry:
             set) {
            if (entry.getValue()==1)
                System.out.println(map2.get(entry.getKey()));
        }
    }
}

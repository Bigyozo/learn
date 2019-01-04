package zfl;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-04 16:14
 * @Description: ${Description}
 */
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str){
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        char[] ch=str.toCharArray();
        for(char c:ch){
            if(!map.containsKey(c))
            map.put(c,1);
            else{
                map.put(c,map.get(c)+1);
            }
        }
        Set<Character> set=map.keySet();
        char out=' ';
        for(char c:set){
            if(map.get(c)==1){
               out=c;
               break;
            }
        }
        return str.indexOf(out);
  }
}

package T2019;


import java.util.*;

public abstract class Jd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][2];
        int foo[] = new int[2 * n + 1];
        List<Integer> list = new LinkedList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i][0] = a;
            arr[i][1] = b;
            method(map, i, a);
            method(map, i, b);
            foo[arr[i][0]]++;
            foo[arr[i][1]]++;
        }
        boolean[] bools=new boolean[m+1];
        for (int c = 0; c < m; ) {
            int max = -1;
            for (int i = 0; i < foo.length; i++) {
                if (max < foo[i])
                    max = i;
            }
            List<Integer> mlist = map.get(max);
            for (int i = 0; i < mlist.size(); i++) {
                int k = mlist.get(i);
                foo[arr[k][0]]--;
                foo[arr[k][1]]--;
                if (bools[k]==false){
                    c++;
                    bools[k]=true;
                }
            }
            list.add(max);
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int i:
             list) {
            System.out.println(i+" ");
        }
    }

    private static void method(HashMap<Integer, List<Integer>> map, int i, int b) {
        if (map.containsKey(b)) {
            map.get(b).add(i);
        } else {
            List li = new LinkedList<Integer>();
            li.add(i);
            map.put(b, li);
        }
    }


}

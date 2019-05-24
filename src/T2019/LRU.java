package T2019;

import java.util.Scanner;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/5/24/024 17:02
 * @Description:
 */
public class LRU {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

    }

    static class LRUMem{
        Node[] nodes;
        int size;
        int history=0;

        public LRUMem(int size) {
            this.size = size;
            nodes=new Node[size];
        }

        public void put(int key,int value){

        }

    }

    static class Node{
        int key;
        int value;
        int history;
    }
}

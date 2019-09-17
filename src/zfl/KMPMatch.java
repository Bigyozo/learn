package zfl;

public class KMPMatch {
	public static int[] getNext(String pattern) {
		int[] next=new int[pattern.length()];
		int i=0,j=-1;
		next[0]=-1;
		while(i<pattern.length()-1) {
			if(-1==j||pattern.charAt(i)==pattern.charAt(j)) {
				i++;
				j++;
				next[i]=j;
			}
			else {
				j=next[j];
			}
		}
		return next;
	}
	
	public static int kmpMatch(String target, String pattern) {
        int i = 0, j = 0, index = 0;
        int[] next = getNext(pattern); // 计算部分匹配表

        while (i < target.length() && j < pattern.length()) {
            if (-1 == j || target.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j]; // 如果出现部分不匹配，获取跳过的位置
            }
        }

        if (j >= pattern.length())
            index = i - pattern.length(); // 匹配成功，返回匹配子串的首字符下标
        else
            index = -1; // 匹配失败

        return index;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="abcacabcca";
		String p ="acab";
		System.out.println(KMPMatch.kmpMatch(t,p));

	}

}

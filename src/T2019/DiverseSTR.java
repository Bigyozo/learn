package T2019;

public class DiverseSTR {
    public static void main(String[] args) {
        DiverseSTR t=new DiverseSTR();
        String s=t.solution(3,3,1);
        System.out.println(s);
    }

    public String solution(int A, int B, int C) {
        // write your code in Java SE 8
        int m = Math.max(A, Math.max(B, C));
        String str;
        if (m == A)
            str=helper(A, B, C, 'a', 'b', 'c');
        else if (m == B)
            str=helper(B, C, A, 'b', 'c', 'a');
        else
            str=helper(C, A, B, 'c', 'a', 'b');
        return str;
    }

    public String helper(int A, int B, int C, char a, char b, char c) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (A > 0 && (B > 0 || C > 0)) {
            while (A > 0 & count < 2) {
                sb.append(a);
                count++;
                A--;
            }
            count = 0;
            if (B > 0) {
                sb.append(b);
                B--;
            } else if (C > 0) {
                sb.append(c);
                C--;
            }
        }
        while (A > 0 && count < 2) {
            sb.append(a);
            count++;
            A--;
        }
        count=0;
        while (B > 0 && count < 2) {
            sb.append(b);
            count++;
            B--;
        }count=0;
        while (C > 0 && count < 2) {
            sb.append(c);
            count++;
            C--;
        }
        return sb.toString();
    }

}

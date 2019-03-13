package T2018;


import java.util.Scanner;

public class YiNianDiJiTian {

    public static void main(String[] args){
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int Y = sc.nextInt();
            int M = sc.nextInt();
            int D = sc.nextInt();

            if (isLeapYear(Y)){
                days[1] = days[1]+1;
            }

            int day = 0;
            for (int i = 1; i < M; i++) {
                day+=days[i-1];
            }
            day +=D;
            System.out.println(day);
        }
    }


    public static boolean isLeapYear(int year){
        if (year%4==0&&year%100!=0){
            return true;
        }else if (year%400==0){
            return true;
        }
        return false;
    }
}

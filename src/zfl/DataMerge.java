package zfl;

import java.io.*;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-19 10:31
 * @Description: 将数据格式转换成易于origin作图的格式
 */
public class DataMerge {
    public static void main(String[] args) throws IOException {
        File data = new File(args[0]);
        if (!data.isFile()) return;
        File pdata = new File(data.getParent(), data.getName().split("\\.")[0] + "p.txt");
        pdata.createNewFile();
        BufferedReader br = new BufferedReader(new FileReader(data));
        BufferedWriter bw = new BufferedWriter(new FileWriter(pdata));
        int n = 3000;
        if (args.length == 2)
            n = Integer.parseInt(args[1]);
        String[][] arr = new String[n][10];
        String line;
        int k = 1;
        boolean flag = true;
        while (k < 10 && flag) {
            for (int i = 0; i < n; i++) {
                line = br.readLine();
                if ("".equals(line)) {
                    flag = false;
                    break;
                }
                line = line.trim();
                String[] strings = line.split("\\s+");
                if (k == 1)
                    arr[i][0] = strings[0];
                arr[i][k] = strings[1];
            }
            br.readLine();
            k++;
        }
        bw.write("Energy\tDensity");
        bw.newLine();
        bw.write("eV\tstates/eV");
        bw.newLine();
        if (k==5){
            bw.write("x\ttotal\tSi\tO");
            bw.newLine();
        }else {
            bw.write("x\ttotal\tSi up\tO up\tSi down\tO down");
            bw.newLine();
        }
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < k-1; j++) {
                sb.append(arr[i][j] + "      ");
            }
            sb.append("0");
            bw.write(sb.toString());
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

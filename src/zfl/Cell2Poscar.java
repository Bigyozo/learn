package zfl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Cell2Poscar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File cell = new File(args[0]);
	    if(!cell.isFile())return;
		File poscar =new File(cell.getParent(),"POSCAR");
		poscar.createNewFile();
		BufferedReader br = new BufferedReader(new FileReader(cell));
		BufferedWriter bw = new BufferedWriter(new FileWriter(poscar));
		String line;
		bw.write("SiC "+cell.getName());
		bw.newLine();
		bw.write(" 1.0000000");
		bw.newLine();
		String[] ch=new String[8];
		int[] num=new int[8];
		int i=0;
		while ((line = br.readLine()) != null) {
			line=line.trim();
			if (line.startsWith("%")) {
				if (line.equals("%ENDBLOCK POSITIONS_FRAC"))
					break;
				else if(line.equals("%ENDBLOCK LATTICE_CART"))
				{
					bw.write("Selective dynamics");
					bw.newLine();
					bw.write("Direct");
					bw.newLine();
				}
				else continue;
			}
			String[] strs=line.split("\\s+");
			if(strs.length==3) {
				bw.write("\t"+line);	
				bw.newLine();
			}
			if(strs.length==4) {
				if(!strs[0].equals(ch[i]))
				{
					if(num[i]!=0)i=i+1;
					ch[i]=strs[0];
					num[i]++;
				}
				else {
					num[i]++;
				}
								
				if(Double.parseDouble(strs[3])>=Double.parseDouble(args[1])&&Double.parseDouble(strs[3])<=Double.parseDouble(args[2])) {
					line=strs[1]+"\t"+strs[2]+"\t"+strs[3]+"\t T   T   T";
					bw.write(line);	
					bw.newLine();					
				}
				else {
					line=strs[1]+"\t"+strs[2]+"\t"+strs[3]+"\t F   F   F";
					bw.write(line);	
					bw.newLine();
				}				
			}			
		}
		StringBuffer sb1=new StringBuffer();
		for(String c:ch) {
			if(c==null)break;
			sb1.append(c);
			sb1.append("   ");
		}
		bw.write(sb1.toString());
		bw.newLine();
		StringBuffer sb2=new StringBuffer();
		for(int n:num) {
			if(n==0)break;
			sb2.append(n);
			sb2.append("   ");
		}
		bw.write(sb2.toString());
		bw.flush();
		bw.close();
		br.close();

	}

}

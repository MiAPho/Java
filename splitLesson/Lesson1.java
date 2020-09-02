import java.util.*;
public class Lesson1{
	public static void main(String[] args){
		String str="リンゴ,ゴリラ,ラッパ";
		String[] data=str.split(",");
		System.out.println(Arrays.toString(data));
		String str2="リンゴとゴリラとラクダ";
		String[] data2=str2.split("と");
		System.out.println(Arrays.toString(data2));
		String str3="Mac,Win、Linux";
		String[] data3=str3.split("[,、]");
		System.out.println(Arrays.toString(data3));
		
		System.out.print("カンマ区切りで数字いれてね>");
		String str4=new Scanner(System.in).nextLine();
		String[] data4=str4.split(",");
		int[] dataI=new int[data4.length];
		int sum=0;
		for(int i=0;i<data4.length;i++){
			dataI[i]=Integer.parseInt(data4[i]);
			sum+=dataI[i];
		}
		System.out.printf("合計は%d",sum);
	}
}

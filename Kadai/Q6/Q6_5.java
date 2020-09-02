import java.util.*;
public class Q6_5{
	public static void numOf(int num,String mark){
		char c=mark.charAt(0);
		for(int i=0;i<num;i++){
			for(int j=0;j<i+1;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		System.out.print("数値>");
		int num=new Scanner(System.in).nextInt();
		System.out.print("文字>");
		String mark=new Scanner(System.in).nextLine();
		numOf(num,mark);
	}
}

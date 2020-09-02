import java.util.*;
public class Q6_4{
	public static void numOf(int num){
		for(int i=0;i<num;i++){
			for(int j=0;j<i+1;j++){
				System.out.print("$");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		System.out.print("数値>");
		int num=new Scanner(System.in).nextInt();
		numOf(num);
	}
}

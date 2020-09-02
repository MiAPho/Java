import java.util.*;
public class Q5_3{
	public static void main(String[] args){
			int[] num=new int [10];
		for(int i=0;i<10;i++){
			System.out.print("数値>");
			int input=new Scanner(System.in).nextInt();
			num[i]=input;
		}
			System.out.print("偶数:");
		for(int i=0;i<10;i++){
			if(num[i]%2==0){
				System.out.print(num[i]);
				System.out.print(" ");
			}
		}
		System.out.println();
		System.out.print("奇数:");
		for(int i=0;i<10;i++){
			if(num[i]%2!=0){
				System.out.print(num[i]);
				System.out.print(" ");
			}
		}
	}
}

import java.util.*;
public class Q5_2{
	public static void main(String[] args){
			int[] num=new int [10];
		for(int i=0;i<10;i++){
			System.out.print("数値>");
			int input=new Scanner(System.in).nextInt();
			num[i]=input;
		}
		for(int i=0;i<10;i++){
			System.out.printf("%d%n",num[9-i]);
		}
	}
}

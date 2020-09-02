import java.util.*;
public class Q6_1{
	public static int numOf(int x){
		return x*x;
	}
	public static void main(String[] args){
		System.out.print("数値>");
		int num=new Scanner(System.in).nextInt();
		System.out.print(numOf(num));
	}
}

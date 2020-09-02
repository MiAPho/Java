import java.util.*;
public class Q6_2{
	public static int numOf(int num1,int num2){
		return (num1+num2)/2;
	}
	public static void main(String[] args){
		System.out.print("数値1>");
		int num1=new Scanner(System.in).nextInt();
		System.out.print("数値2>");
		int num2=new Scanner(System.in).nextInt();
		System.out.print(numOf(num1,num2));
	}
}

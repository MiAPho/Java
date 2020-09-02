import java.util.*;
public class Q6_3{
	public static int numOf(int num1,int num2){
		if(num1>=num2){
			return num1;
		}else{
			return num2;
		}
	}
	public static int max(int x){
		System.out.print("数値y>");
		int y=new Scanner(System.in).nextInt();
		System.out.print("数値z>");
		int z=new Scanner(System.in).nextInt();
		if(x>numOf(y,z)){
			return x;
		}else{
			return numOf(y,z);
		}
	}
	public static void main(String[] args){
		System.out.print("数値1>");
		int num1=new Scanner(System.in).nextInt();
		System.out.print("数値2>");
		int num2=new Scanner(System.in).nextInt();
		System.out.printf("%d%n",numOf(num1,num2));
		System.out.print("数値x>");
		int x=new Scanner(System.in).nextInt();
		System.out.print(max(x));
	}
}

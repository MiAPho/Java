import java.util.*;
public class Q5_5{
	public static void main(String[] args){
		System.out.print("数値>");
		int num=new Scanner(System.in).nextInt();
		int binary[]=new int[16];
		for(int i=15;i>=0;i--,num/=2){
			binary[i]=num%2;
		}
		for(int i=0;i<16;i++){
			System.out.print(binary[i]);
		}
	}
}

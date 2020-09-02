import java.util.*;
public class Q5_7{
	public static void main(String[] args){
		int kuku[][]=new int[9][];
		for(int i=0;i<9;i++){
			kuku[i]=new int[9];
			for(int j=0;j<9;j++){
				kuku[i][j]=(i+1)*(j+1);
			}
		}
		System.out.print("数値>");
		int num1=new Scanner(System.in).nextInt();	
		System.out.print("数値>");
		int num2=new Scanner(System.in).nextInt();	
		System.out.println(kuku[num1-1][num2-1]);
	}
}

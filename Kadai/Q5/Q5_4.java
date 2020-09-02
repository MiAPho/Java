import java.util.*;
public class Q5_4{
	public static void main(String[] args){
		int count=0;
		int sum=0;
		while(count<10){
			System.out.print("数値>");
			int num=new Scanner(System.in).nextInt();
			sum+=num;
			if(sum>100){
				break;
			}
			count++;
		}
		System.out.print(sum);
	}
}

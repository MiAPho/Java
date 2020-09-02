import java.util.*;
public class Q6_7{
	public static void numOf(int num){
		if(num==3 || num==2){
			System.out.print(num);
		}
		int i;
		for(i=2;i<num;i++){
			if(num%i==0){
				break;
			}
		}
		if(i==num){
			System.out.println(num);
		}
	}
	public static void main(String[] args){
		for(int i=10000;i<10100;i++){
			numOf(i);
		}
	}
}

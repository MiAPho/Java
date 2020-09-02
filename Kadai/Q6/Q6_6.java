import java.util.*;
public class Q6_6{
	public static void numOf(int num){
		for(int i=1;i<10;i++){
			System.out.printf("%3d",num*i);
		}
		System.out.println();
	}
	public static void main(String[] args){
		for(int i=1;i<10;i++){
			numOf(i);
		}
	}
}

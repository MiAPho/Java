import java.util.*;
public class Pair{
	public static void main(String[] args){
		System.out.print("文を入れてください>");
		String input=new Scanner(System.in).nextLine();
		String[] data=input.split("");
		if(judge(data)){
			System.out.printf("「%s」は回文です!%n",input);
		}else{
			System.out.printf("「%s」は回文ではありません。%n",input);
		}
	}
	public static boolean judge(String[] data){
		int i;
		for(i=0;i<data.length/2;i++){
			if(!data[i].equals(data[data.length-1-i])){
				break;
			}
		}
		if(i==data.length/2){
			return true;
		}else{
			return false;
		}
	}
}	

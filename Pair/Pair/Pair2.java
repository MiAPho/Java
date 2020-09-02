import java.util.*;
public class Pair2{
	public static void main(String[] args){
		boolean binary;
		boolean dec;
		int count=10;
		int ans=0;
		while(true){
			String convert=Integer.toBinaryString(count);
			String[] data=convert.split("");
			if(judge(data)){
				binary=true;
			}else{
				binary=false;
			}
			if(judge(count)){
				dec=true;
			}else{
				dec=false;
			}
			if(dec && binary){
				ans++;
				System.out.printf("%d ",count);
				if(ans==5){
					break;
				}
			}
			count++;
		}
		System.out.println();
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
	public static boolean judge(int count){
		int sum=0;
		int temp=count;
		while(temp>0){
			temp/=10;
			sum++;
		}
		int[] data=new int[sum];
		for(int j=0;j<sum;j++){
			data[j]=count%10;
			count/=10;
		}
		int i;
		for(i=0;i<data.length/2;i++){
			if(data[i]!=data[data.length-1-i]){
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

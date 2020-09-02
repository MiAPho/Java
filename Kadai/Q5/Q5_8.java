import java.util.*;
public class Q5_8{
	public static void main(String[] args){
		int[] nums=new int[10];
		for(int i=0;i<nums.length;i++){
			System.out.print("数値>");
			nums[i]=new Scanner(System.in).nextInt();
		}
		for(int i=0;i<nums.length-1;i++){
			for(int j=0;j<nums.length-i;j++){
				if(nums[i]>nums[nums.length-1-j]){
					int temp=nums[i];
					nums[i]=nums[nums.length-1-j];
					nums[nums.length-1-j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}

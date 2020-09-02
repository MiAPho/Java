import java.util.*;
public class MethodLesson100{
	public static int[] cloneArr(int[] arr){
		int[] clone=new int[arr.length];
		for(int i=0;i<clone.length;i++){
			clone[i]=arr[i];
		}
		return clone;
	}
	public static void sortArr(int[] arr){
		int[] clone=cloneArr(arr);
		for(int i=0;i<clone.length-1;i++){
			for(int j=i+1;j<clone.length;j++){
				if(clone[i]>clone[j]){
					int temp=clone[i];
					clone[i]=clone[j];
					clone[j]=temp;
				}
			}
		}
		printArr(clone);
	}
	public static void sortArr(int[] arr,boolean isDesc){
		if(isDesc){
			int[] clone=cloneArr(arr);
			for(int i=0;i<clone.length-1;i++){
				for(int j=i+1;j<clone.length;j++){
					if(clone[i]<clone[j]){
						int temp=clone[i];
						clone[i]=clone[j];
						clone[j]=temp;
					}
				}
			}
			printArr(clone);
		}
	}
	public static void printArr(int[] arr){
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args){
		System.out.print("配列の要素数を入力してください>");
		int num=new Scanner(System.in).nextInt();
		int[] nums=new int[num];
		for(int i=0;i<num;i++){
			nums[i]=new Random().nextInt(20)-10;
		}
		System.out.print("配列を生成しました。");
		System.out.println(Arrays.toString(nums));
		int judge;
		do{
			System.out.print("1...元の配列を表示,2...配列を昇順ソート,3...配列を降順にソート,4...終了>");
			judge=new Scanner(System.in).nextInt();
			if(judge==1){
				System.out.println(Arrays.toString(nums));
			}else if(judge==2){
				sortArr(nums);
			}else if(judge==3){
				sortArr(nums,true);
			}
		}while(judge!=4);
	}
}

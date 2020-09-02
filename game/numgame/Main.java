import java.util.*;
public class Main{
	static final int MIN_NUM=1,MAX_NUM=5;
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int[] comNums=new int[MAX_NUM-MIN_NUM+1];
		init(comNums);
		List<Integer>playerNums=new ArrayList<>();
		int win=0,lose=0;
		for(int i=0;i<comNums.length;i++){
			while(true){
				System.out.printf("%d開戦目。%d~%dの数字を入力>",i+1,MIN_NUM,MAX_NUM);
				int num=scan.nextInt();
				if(checkNum(playerNums,num)){
					playerNums.add(num);
					break;
				}
			}
			System.out.println("PCの数字:"+comNums[i]);
			if(playerNums.get(i)>comNums[i]){
				System.out.println("貴方の勝ち");
			}else if(playerNums.get(i)<comNums[i]){
				System.out.println("貴方の負け");
			}else{
				System.out.println("引き分け");
			}
		}
		String result;
		if(win>lose){
				result="貴方の勝ち";
		}else if(win<lose){
				result="貴方の負け";
		}else{
				result="引き分け";
		}
	}
	static void shuffleArr(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int index=new Random().nextInt(arr.length-i);
			int temp=arr[index];
			arr[index]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
	static void init(int[] comsNum){
		for(int i=0;i<MAX_NUM-MIN_NUM+1;i++){
			comsNum[i]=MIN_NUM+i;
		}
		shuffleArr(comsNum);
	}
	static boolean checkNum(List<Integer>list,int num){
		if(num<MIN_NUM || num>MAX_NUM){
			System.out.printf("%d~%dの数字を入力して下さい%n",MIN_NUM,MAX_NUM);
			return false;
		}
		if(list.contains(num)){
			System.out.println("一度使った数字は使えません");
			return false;
		}
		return true;
	}
}

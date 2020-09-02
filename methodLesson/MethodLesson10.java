import java.util.*;
public class MethodLesson10{
	public static int ansManey(int zeikin,int sumManey){
		int ans=sumManey*(zeikin+100)/100;
		return ans;
	}
	public static void main(String[] args){
		System.out.print("消費税は何%ですか>");
		int zeikin=new Scanner(System.in).nextInt();
		int maneySum=0;
		while(true){
			System.out.print("価格を入力(0でお会計)>");
			int maney=new Scanner(System.in).nextInt();
			maneySum+=maney;
			if(maney==0){
				break;
			}
		}
		System.out.printf("お買い物合計金額は%d円(税込み)です。",ansManey(zeikin,maneySum));
	}
}

import java.util.*;
public class CardGame2{
	public static void main(String[] args){
		String[] suits={"♠︎","♦︎","❤︎","♣︎"};
		String[] nums={"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] cards=new String[52];
		makeDek(cards,suits,nums);
		int count=0;
		while(true){
		dekShuffle(cards);
		//print(cards);
		String[] ans=sort(cards);
		//System.out.println(Arrays.toString(ans));
		//String[] test={"♠︎1","♠︎10","♠︎J","♠︎Q","♠︎K"};
		//String[] test={"❤︎1","❤︎10","❤︎J","❤︎Q","❤︎K"};
			if(judgeFrush(ans) && judgeNum(ans)){
				System.out.println("ロイヤルストレートフラッシュです");
				System.out.printf("%d回目でロイヤルストレートフラッシュが出ました",count);
				break;
			}else{
				//System.out.println("ロイヤルストレートフラッシュではありません");
			}
			count++;
		}
	}
	public static void makeDek(String[] cards,String[] suits,String[] nums){
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				cards[(13*i)+j]=suits[i]+nums[j];
			}
		}
	}
	public static void print(String[] cards){
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				System.out.printf("%s ",cards[(13*i)+j]);
			}
			System.out.println();
		}
	}
	public static void dekShuffle(String[] cards){
		Random ran=new Random();
		for(int i=0;i<cards.length-1;i++){
			int index=ran.nextInt(cards.length-i);
			String temp=cards[index];
			cards[index]=cards[cards.length-1-i];
			cards[cards.length-1-i]=temp;
		}
	}
	public static String[] sort(String[] shuffleCards){
		String[] ans=new String[5];
		for(int i=0;i<ans.length;i++){
			ans[i]=shuffleCards[i];
		}
		for(int i=0;i<ans.length-1;i++){
			for(int j=0;j<ans.length-1-i;j++){
				String cardsNum=ans[i].substring(2);
				String cardsNum2=ans[j+1+i].substring(2);
				if(ab(cardsNum)>ab(cardsNum2)){
					String temp=ans[i];
					ans[i]=ans[j+1+i];
					ans[j+1+i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(ans));
		return ans;
	}
	public static int ab(String cardsNum){
		switch(cardsNum){
			case "J":
				cardsNum="11";
				break;
			case "Q":
				cardsNum="12";
				break;
			case "K":
				cardsNum="13";
				break;
		}
		return Integer.parseInt(cardsNum);
	}
	public static boolean judgeFrush(String[] ans){
		int i;
		for(i=1;i<ans.length-1;i++){
			if(!ans[0].substring(0,2).equals(ans[i].substring(0,2))){
				break;
			}
		}
		if(i==ans.length-1){
			return true;
		}else{
			return false;
		}
	}
	public static boolean judgeNum(String[] ans){
		String num="";
		for(int i=0;i<ans.length;i++){
			num+=ans[i].substring(2);
		}
		if(num.equals("110JQK")){
			return true;
		}else{
			return false;
		}
	}
}

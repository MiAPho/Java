import java.util.*;
public class CardGame{
	public static void main(String[] args){
		String[] suits={"♠︎","♦︎","❤︎","♣︎"};
		String[] nums={"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] cards=new String[52];
		makeDek(cards,suits,nums);
		print(cards);
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
}

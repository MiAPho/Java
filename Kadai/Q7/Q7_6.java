import java.util.*;
public class Q7_6{
	public static void main(String[] args){
		CoinCase c=new CoinCase();
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<10;i++){
			System.out.print("なんの硬貨>");
			int num=scan.nextInt();
			System.out.print("何枚>");
			int count=scan.nextInt();
			c.addCoins(num,count);
		}
		System.out.println("500円"+c.yen500+"枚:総額"+c.getAmount(500));
		System.out.println("100円"+c.getCount(100)+"枚:総額"+c.getAmount(100));
		System.out.println("50円"+c.getCount(50)+"枚:総額"+c.getAmount(50));
		System.out.println("10円"+c.getCount(10)+"枚:総額"+c.getAmount(10));
		System.out.println("5円"+c.getCount(5)+"枚:総額"+c.getAmount(5));
		System.out.println("1円"+c.getCount(1)+"枚:総額"+c.getAmount(1));
		System.out.println("枚数合計"+c.getCount());
		System.out.println("合計金額"+c.getAmount());
	}
}

class CoinCase{
	int yen500;
	int yen100;
	int yen50;
	int yen10;
	int yen5;
	int yen1;
	void addCoins(int yen,int count){
		switch(yen){
			case 500:
				this.yen500+=count;
				break;
			case 100:
				this.yen100+=count;
				break;
			case 50:
				this.yen50+=count;
				break;
			case 10:
				this.yen10+=count;
				break;
			case 5:
				this.yen5+=count;
				break;
			case 1:
				this.yen1+=count;
				break;
		}
	}
	int getCount(){
		return this.yen500+this.yen100+this.yen50+this.yen5+this.yen1;
	}
	int getCount(int yen){
		switch(yen){
			case 500:
				return this.yen500;
			case 100:
				return this.yen100;
			case 50:
				return this.yen50;
			case 10:
				return this.yen10;
			case 5:
				return this.yen5;
			case 1:
				return this.yen1;
			default :
				return 0;
		}
	}
	int getAmount(int yen){
		switch(yen){
			case 500:
				return this.yen500*500;
			case 100:
				return this.yen100*100;
			case 50:
				return this.yen50*50;
			case 10:
				return this.yen10*10;
			case 5:
				return this.yen5*5;
			case 1:
				return this.yen1*1;
			default :
				return 0;
		}
	}
	int getAmount(){
		int amount=500*this.yen500+100*this.yen100+50*this.yen50+10*this.yen5+5*yen5+this.yen1;
		return amount;
	}
}

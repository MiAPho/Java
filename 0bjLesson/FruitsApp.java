import java.util.*;
public class FruitsApp{
	public static void main(String[] args){
		Fruits f1=new Fruits();
		System.out.println(f1.name);
		System.out.println(f1.price);
		f1.name="バナナ";
		f1.price=50;
		f1.showInfo();
		Fruits f2=new Fruits("リンゴ");
		f2.price=120;
		f2.showInfo();
		Fruits f3=new Fruits("イチゴ",400);
		f3.showInfo();
		Fruits f4=new Fruits("ナシ",100);
		Fruits f5=new Fruits("みかん",50);
		Fruits[] fruitsArr={f1,f2,f3,f4,f5};
		for(Fruits n:fruitsArr){
			n.showInfo();
		}
		Fruits[] fa2=new Fruits[]{f1,f2,f3};
		for(Fruits n:fa2){
			n.showInfo();
		}
		Fruits[] fa3={
			new Fruits("パイン",200),
			new Fruits("スイカ",240)
		};
		for(Fruits n:fa3){
			n.showInfo();
		}
	}
}

class Fruits extends Object{
	String name;
	int price;
	public Fruits(){
		super();
	}
	Fruits(String name){
		this.name=name;
	}
	Fruits(String name,int price){
		this(name);
		this.price=price;
	}
	void showInfo(){
		System.out.printf("%-10s...¥%4d%n",this.name,this.price);
	}
}

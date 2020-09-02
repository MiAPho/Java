import java.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		Monkey m=new Monkey();
		System.out.print("おさるの名前を決めてください:>");
		m.name=scan.nextLine();
		System.out.print("おさるの歳を決めてください:>");
		m.age=scan.nextInt();
		outer:while(true){
			System.out.print("おさるに何をさせますか?1...挨拶、2...竹馬、3...逆立ち、4...終了>");
			int	input=scan.nextInt();
			switch(input){
				case 1:
					m.aisatu();
					break;
				case 2:
					m.takeuma();
					break;
				case 3:
					m.sakadati();
					break;
				case 4:
					m.appEnd();
				break outer;
			}
		}
	}
}

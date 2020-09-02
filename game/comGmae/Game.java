import java.util.*;
public class Game{
	public static void main(String[] args){
		String[] gameBord=new String[9];
		for(int i=0;i<gameBord.length;i++){
			gameBord[i]=""+(i+1);
		}
		System.out.println("○×ゲーム!!");
		System.out.print("代表者がEnterキーを押してプレイヤーの順番を決めます>");
		Scanner scan=new Scanner(System.in);
		scan.nextLine();
		int order=new Random().nextInt(2);
		if(order==0){
			System.out.println("貴方が先行(○)です!");
		}else{
			System.out.println("貴方の対戦相手が先行(○)です!");
		}
		System.out.println("***試合開始***");
		int i;
		for(i=0;i<9;i++){
			bord(gameBord);
			if(i%2==0){
				System.out.print("○を置く位置を番号で選択して下さい>");
				int place=scan.nextInt();
				if(!gameBord[place-1].equals("○") && !gameBord[place-1].equals("×")){
					gameBord[place-1]="○";
				}else{
					System.out.println("入力できません");
					i--;
				}
			}else{
				System.out.print("×を置く位置を番号で選択して下さい>");
				int place=scan.nextInt();
				if(!gameBord[place-1].equals("○") && !gameBord[place-1].equals("×")){
					gameBord[place-1]="×";
				}else{
					System.out.println("入力できません");
					i--;
				}
			}
			if(clear(gameBord) && i%2==0){
				System.out.println("******************");
				System.out.println("*○(先攻)の勝ち!!!*");
				System.out.println("******************");
				break;
			}else if(clear(gameBord) && i%2!=0){
				System.out.println("******************");
				System.out.println("*×(後攻)の勝ち!!!*");
				System.out.println("******************");
				break;
			}
		}
		if(i==9){
				System.out.println("******************");
				System.out.println("*この勝負引き分け*");
				System.out.println("******************");
		}
		System.out.println("結果");
		bord(gameBord);
	}
	public static void bord(String[] gameBord){
				System.out.println("*********");
		for(int i=0;i<3;i++){
			System.out.println("-------");
			System.out.print("|");
			for(int j=0;j<3;j++){
				System.out.print(gameBord[i*3+j]);
				System.out.print("|");
			}
			System.out.println();
		}
			System.out.println("-------");
				System.out.println("*********");
	}
	public static boolean clear(String[] gameBord){
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				if(gameBord[j*3].equals(gameBord[j*3+1]) && gameBord[j*3+1].equals(gameBord[j*3+2])){
					return true;
				}else if(gameBord[j].equals(gameBord[j+3]) && gameBord[j+3].equals(gameBord[j+6])){
					return true;
				}
			}
			if(gameBord[0].equals(gameBord[4]) && gameBord[4].equals(gameBord[8])){
				return true;
			}else if(gameBord[2].equals(gameBord[4]) && gameBord[4].equals(gameBord[6])){
				return true;
			}
			for(String s:gameBord){
				if(s.equals("○")){
					s="×";
				}else if(s.equals("×")){
					s="○";
				}
			}
		}
		return false;
	}
}

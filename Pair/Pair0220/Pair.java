import java.util.*;
public class Pair{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    List<String> cardDate=new ArrayList<>();
    while(true){
      sop("操作を入力：1.入力,2.一覧,3.検索,4.終了>");
      int select=scan.nextInt();
      scan.nextLine();
      switch(select){
        case 1:
          sop("カード番号を入力(xxxx-xxxx)>");
          String cardNumber=scan.nextLine();
          if(judge(cardNumber)){
            if(!cardNumber.contains("-")){
							cardNumber=cardNumber.substring(0,4)+"-"+cardNumber.substring(4,8);
            }
            cardDate.add(cardNumber);
          }
          break;
        case 2:
          if(cardDate.isEmpty()){
            sopln("まだ登録されていません");
          }else{
            for(String s:cardDate){
              sopln(s);
            }
          }
          break;
        case 3:
          if(cardDate.isEmpty()){
            sopln("まだ登録されていません");
            break;
          }
          sop("検索する最初の数字を何桁か入れてください>");
          String searchNum=scan.nextLine();
          int count=0;
          for(String s:cardDate){
            if(s.startsWith(searchNum)){
              sopln(s);
              count++;
            }
          }
          sopln(count+"件");
          break;
        case 4:
          sopln("終了");
          return;
      }
    }
  }
  static boolean judge(String cardNumber){
    if(cardNumber.matches("[0-9]{4}-?[0-9]{4}")){
      return true;
    }else{
      sopln("番号が不正です。");
      return false;
    }
  }
	static void sop(Object o){
		System.out.print(o);
	}
	static void sopln(Object o){
		System.out.println(o);
	}
}

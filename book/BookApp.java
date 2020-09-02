import java.util.*;
public class BookApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("本のページ数を入力してください>");
		int bookPage=scan.nextInt();
		System.out.print("本の価格を入力してください>");
		int price=scan.nextInt();
		Book b=new Book(bookPage,price);
		System.out.print("ノートのページ数を入力してください>");
		bookPage=scan.nextInt();
		System.out.print("ノートの価格を入力してください>");
		price=scan.nextInt();
		NoteBook n=new NoteBook(bookPage,price);
		while(true){
			System.out.print("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>");
			int input=scan.nextInt();
			switch(input){
				case 1:
					b.print();
					break;
				case 2:
					n.print();
					break;
				case 3:
					System.out.print("書き込む内容を入力して下さい>");
					scan.nextLine();
					String content=scan.nextLine();
					n.content(content);
					break;
				case 4:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}

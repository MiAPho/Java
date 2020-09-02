public class Book{
	String title;
	int price;
	public Book(){
		this("未定");
	}
	public Book(String title){
		this.title=title;
	}
	public Book(String title,int price){
		this(title);
		this.price=price;
	}
	public void showStatus(){
		System.out.printf("タイトル:%s,価格:%d%n",this.title,this.price);
	}
}

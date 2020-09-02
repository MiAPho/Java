public class Book{
	int bookPage;
	int price;
	public Book(int bookPage,int price){
		this.bookPage=bookPage;
		this.price=price;
	}
	public void print(){
		System.out.printf("ページ数:%d%n",this.bookPage);
		System.out.printf("価格:%d%n",this.price);
	}
}
